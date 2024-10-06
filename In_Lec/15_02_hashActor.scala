import akka.actor._

case class Msg(algo:String,msg:String)

object Main extends App {
    val system = ActorSystem("HashSystem")
    system.actorOf(Props[HashSystem],name = "HashSystem")
    system.actorOf(Props[Hash], name = "MD5")
    system.actorOf(Props[Hash], name = "SHA1")
    system.actorOf(Props[PrintHash], name = "PrintHash")
}

class HashSystem extends Actor {
    override def preStart()= {
        val md5: ActorSelection = context.actorSelection("/user/MD5")
        val sha1: ActorSelection = context.actorSelection("/user/SHA1")
        while(true){
            var s:String=scala.io.StdIn.readLine("Enter a Message> ")
            md5!Msg("MD5",s)
            sha1!Msg("SHA1",s)
            Thread.sleep(1000)
        }
    }
    def receive = Actor.emptyBehavior
}

class Hash extends Actor {
    val p: ActorSelection =
    context.actorSelection("/user/PrintHash")
    
    def receive = {
        case Msg(algo,msg) =>
            val hash = 
                MessageDigest.getInstance(algo).digest(msg.getBytes)
        p!Msg(algo,hash.map("%02X" format _).mkString)
    }
}

class PrintHash extends Actor {
    def receive = {
        case Msg(algo,hash) =>
            printf("%s sends %s , %s\n", sender.path.toString,algo,hash)
    }
}

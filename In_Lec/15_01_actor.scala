import akka.actor._

class HelloAkka extends Actor {
    def receive = {
        case "Hello" => println("Hello Akka!!")
        case "Kasun" => println("Hello Kasun!!")
        case _ => println("Known?")
    }
}

object Main extends App {
    val system = ActorSystem("HelloSystem")
    val actor1 =     system.actorOf(Props[HelloAkka], name = "HelloAkka")
    actor1 ! "Hello"
    actor1 ! "Kasun"
}

///////////////////////////

case class Message(op:String,x:Int,y:Int)

class MsgSystem extends Actor {
    def receive = {
        case Message("+",x:Int,y:Int)=> sender!x+y
        case Message("*",x:Int,y:Int) => sender!x*y
        case _ => println("Known Message?")
    }
}

object Main extends App {
    val system = ActorSystem("MsgSystem")
    val actor1 = system.actorOf(Props[MsgSystem],name = "MsgSystem1")
    val actor2 = system.actorOf(Props[MsgSystem],name = "MsgSystem2")
    
    implicit val timeout = Timeout(5 seconds)
    val result1 = actor1 ? Message("+",4,5)
    val answer1 = Await.result(result1,timeout.duration)
    println(answer1)
}
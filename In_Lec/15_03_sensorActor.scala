import akka.actor._

object Main extends App {
    val system = ActorSystem("SensorSystem")
    system.actorOf(Props[Average], name = "avg")
    system.actorOf(Props[Printing], name = "Printing")

    val sensors = List("Sensor1","Sensor2","Sensor3")
    val actors = 
    sensors.map((s)=>system.actorOf(Props[Sensor], name = s))
    actors.map(_ ! scala.util.Random.nextInt(10000))
}

class Sensor extends Actor {
    val readSensor= ()=>
    scala.util.Random.nextInt(100)
    val avg : ActorSelection = context.actorSelection("/user/avg")
    
    def receive = {
        case x:Int=>Thread.sleep(x)
        avg!readSensor()
    }
}

class Average extends Actor {
    val printing : ActorSelection = context.actorSelection("/user/Printing")
    var sum: Double=0
    var c:Int=0
    def receive = {
        case x:Int =>
        printf("Received from %s value %d\n",sender.path.name,x)
        sum+=x; c+=1
        printing!sum/c
        sender!scala.util.Random.nextInt(10000)
    }
}

class Printing extends Actor {
    def receive = {
        case x:Double =>
        printf("Average Value %.2f \n",x)
    }
}


// Output
// Received from Sensor1 value 0
// Average Value 0.00
// Received from Sensor2 value 0
// Average Value 0.00
// Received from Sensor3 value 0
// Average Value 0.00
// Received from Sensor1 value 0
// Average Value 0.00



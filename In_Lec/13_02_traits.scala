// Traits

// operator trait
trait operators{
    def +(p:Point)
    def -(p:Point)
}

// color trait
trait color {
    var color:Int=0
    def setColor(x:Int)
    def printColor= color match {
        case 1 =>"RED"
        case 2 =>"BLUE"
        case 3 =>"GREEN"
    }
}

// print trait
trait print {
    def printIt
}

// Point class
case class Point(a:Int, b:Int) extends operators with color with print{
    override def +(p:Point)=Point(a+p.a,b+p.b)
    override def -(p:Point)=Point(a-p.a,b-p.b)
    override def setColor(x: Int)=color=x
    override def printIt= println("x="+a+" y="+b)
}

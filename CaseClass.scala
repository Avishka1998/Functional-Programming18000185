case class Point(x:Int, y:Int){

  def add(a:Point) = Point(x+a.x, y+a.y)

  def move(b:Int, c:Int) = Point(x+b, y+c)

  def distance(r:Point) = {
    var p = x - r.x
    var q = y - r.y

    if(p<0){
      p = p*(-1)
      println(s"dx = $p")
    }
    else{
      println(s"dx = $p")
    }

    if(q<0){
      q = q*(-1)
      println(s"dy = $q")
    }
    else{
      println(s"dy = $q")
    }
  }

  def invert() = Point(y,x)
}

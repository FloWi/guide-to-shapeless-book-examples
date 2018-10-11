object ShapelessPlaygroundChapter2_1 extends App {

  sealed trait Shape
  final case class Rectangle(width: Double, height: Double) extends Shape
  final case class Circle(radius: Double) extends Shape

  val rect: Shape = Rectangle(3.0, 4.0)
  val circ: Shape = Circle(1.0)

  def area(shape: Shape): Double = {
    shape match {
      case Rectangle(width, height) => width * height
      case Circle(radius) => math.Pi * radius * radius
    }
  }

  println(area(rect))
  println(area(circ))

}

object ShapelessPlaygroundChapter2_1_1 extends App {

  //alternative encoding
  type Rectangle2 = (Double, Double)
  type Circle2 = Double
  type Shape2 = Either[Rectangle2, Circle2]

  val rect2: Shape2 = Left((3.0, 4.0))
  val circ2: Shape2 = Right(1.0)

  def area2(shape: Shape2): Double = {
    shape match {
      case Left((width, height)) => width * height
      case Right(radius) => math.Pi * radius * radius
    }
  }

  println(area2(rect2))
  println(area2(circ2))
}

object ShapelessPlaygroundChapter2_2 extends App {
  //generic product encodings



}
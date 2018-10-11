object ShapelessPlaygroundChapter1_1 extends App {

  case class Employee(name: String, number: Int, manager: Boolean)
  case class IceCream(name: String, numCherries: Int, inCone: Boolean)

  import shapeless._

  val genericEmployee = Generic[Employee].to(Employee("Dave", 123, manager = false))
  val genericIceCream= Generic[IceCream].to(IceCream("Sundae", 1, inCone = false))

  def genericCsv(gen:String :: Int :: Boolean :: HNil): List[String] = {
    List(gen(0), gen(1).toString, gen(2).toString)
  }

  println(genericCsv(genericEmployee))
  println(genericCsv(genericIceCream))
}
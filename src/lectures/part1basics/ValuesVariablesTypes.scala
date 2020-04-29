package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  val aString: String = "Hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4615
  val aLong: Long = 122222222222L
  val aFloat: Float = 2.0f
  val aDouble: Double = 2.9

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects
}

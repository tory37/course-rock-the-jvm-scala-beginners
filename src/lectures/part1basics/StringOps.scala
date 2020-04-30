package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  // In Java
  println(str.charAt(2))
  println(str.substring(3, 9))
  println(str.split(" "))
  println(str.startsWith("Hello"))
  println(str.replace("ello", "firPlace!"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  // Scala Utils
  var aNumberString = "45"
  var aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)

  // Scala- specific: String interpolartors.

  // S-interpolartors
  val name = "David"
  var age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting =
    s"Hello, my name is $name and I will be turning ${age + 1} years old."

  println(anotherGreeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}

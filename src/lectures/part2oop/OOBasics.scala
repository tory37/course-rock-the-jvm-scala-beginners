package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Timmy", 42)
  println(person.age);
  person.greet("Daniel")
}

class Person(name: String, val age: Int) {
  // body
  val x = 2

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // multiple constructors
  def this(name: String) = this(name, 0);
}

// class parameters are NOT fields

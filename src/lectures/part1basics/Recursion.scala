package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial (n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n)
      var result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }
  }

  println(factorial(10))

  def tailFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //TAIL RECURSION = use recursive call as the LAST expression

    factHelper(n, 1)
  }

  println(tailFactorial(5000))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION
  @tailrec
  def nStringConcat(x: String, n: Int, result: String): String = {
    if (n == 0) result
    else nStringConcat(x, n - 1, result + x + "/n")
  }

  println(nStringConcat("Bobby said what?", 10, ""))

  def runTailFibonacci(x: Int) = {
    @tailrec
    def tailFibonacci(current: Int, lastSum: BigInt, lastLastSum: BigInt): BigInt = {
      if (current == x) lastSum + lastLastSum
      else tailFibonacci(x, current + 1, lastSum + lastLastSum, lastSum)
    }

    if (x <= 2) 1
    else tailFibonacci(3, 1, 1)
  }

  println(runTailFibonacci(6))

  def isPrime(n: Int) = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailRec(n / 2, true)
  }

  println(isPrime(1))
  println(isPrime(2))
  println(isPrime(3))
  println(isPrime(10))
  println(isPrime(27))
}

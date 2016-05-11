package easy

import easy.Problem002.evenFibonacciNumbers
import org.scalatest.{FlatSpec, FunSuite, Matchers}

class Problem002Test extends FlatSpec with Matchers {

  "Event Fibonacci numbers" should "sum even-valued terms below given limit" in {
    evenFibonacciNumbers(100) should equal(2 + 8 + 34)
    evenFibonacciNumbers(4000000) should equal(4613732)
  }

}

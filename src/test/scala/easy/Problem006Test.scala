package easy

import org.scalatest.{FlatSpec, Matchers}

class Problem006Test extends FlatSpec with Matchers {

  "SumSquareDifference" should "compute the difference between the sum of the square and the square of the sum" in {
    Problem006.sumSquareDifference(1 to 10) should equal(2640)
    Problem006.sumSquareDifference(1 to 100) should equal(25164150)
  }

}

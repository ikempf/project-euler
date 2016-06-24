package easy

import easy.Problem005.smallestMultiple
import org.scalatest.{FlatSpec, Matchers}

class Problem005Test extends FlatSpec with Matchers {

  "Smallest multiple" should "find the smallest multiple evenly through given range" in {
    smallestMultiple(1 to 10) should equal (2520)
    smallestMultiple(1 to 20) should equal (232792560)
  }

}

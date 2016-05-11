package easy

import easy.Problem003.largestPrimeFactor
import org.scalatest.{FlatSpec, Matchers}

class Problem003Test extends FlatSpec with Matchers {

  "Largest prime factor" should "return largest prime factor of given number" in {
    largestPrimeFactor(13195) should equal(29)
    largestPrimeFactor(600851475143l) should equal(6857)
  }

}

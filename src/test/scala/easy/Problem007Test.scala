package easy

import easy.Problem007.nthPrime
import org.scalatest.{FlatSpec, Matchers}

class Problem007Test extends FlatSpec with Matchers {

  "10001st prime" should "find 10001st prime" in {
    nthPrime(6) should equal(13)
    nthPrime(10001) should equal(104743)
  }


}

package easy

import easy.Problem001.multiplesOf3And5
import org.scalatest.{FlatSpec, Matchers}

class Problem001Test extends FlatSpec with Matchers {

  "Multiples of 3 and 5" should "sum multiples of 3 and 5 below given limit" in {
    multiplesOf3And5(10) should equal(23)
    multiplesOf3And5(1000) should equal(233168)
  }

}

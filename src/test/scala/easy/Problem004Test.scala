package easy

import easy.Problem004.{isPalindrome, largestPalindrome}
import org.scalatest.{FlatSpec, Matchers}

class Problem004Test extends FlatSpec with Matchers {

  "Is Palindrome" should "find true for palidrome number" in {
    isPalindrome(9999) should be (true)
    isPalindrome(777) should be (true)
    isPalindrome(12344321) should be (true)
    isPalindrome(1234321) should be (true)
    isPalindrome(787) should be (true)

    isPalindrome(12341234) should be (false)
    isPalindrome(123) should be (false)
    isPalindrome(12211) should be (false)
  }

  "Largest palindrome product" should "find the largest palindrome for given length" in {
    largestPalindrome(2).get should equal(9009)
    largestPalindrome(3).get should equal(906609)
  }

}

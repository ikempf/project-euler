package easy

object Problem004 {

  def largestPalindrome(length: Int): Option[Int] = {
    val largestFactor = Math.pow(10, length).toInt - 1
    val largestNumber = Math.pow(largestFactor, 2).toInt

    def loop(number: Int, factor: Int): Option[Int] = {
      if (number < largestFactor)
        None

      if (isPalindrome(number) && hasFactors(number, factor, factor))
        return Some(number)

      loop(number - 1, factor)
    }

    loop(largestNumber, largestFactor)
  }

  def hasFactors(number: Int, factor1: Int, factor2: Int): Boolean = {
    if (factor1 * factor1 < number)
      return false

    if (factor1 * factor2 == number)
      return true

    if (factor1 * factor2 < number)
      return hasFactors(number, factor1 - 1, factor1 - 1)

    hasFactors(number, factor1, factor2 - 1)
  }

  def isPalindrome(n: Int): Boolean = {
    val nStr = n.toString
    val range = 0 until nStr.length / 2

    range.forall(i =>
      nStr.charAt(i) == nStr.charAt(nStr.length - i - 1)
    )
  }

}

package easy

object Problem006 {

  def sumSquareDifference(range: Range): Int = {
    squareOfSums(range) - sumOfSquares(range)
  }

  private def sumOfSquares(range: Range): Int = {
    range
      .map(Math.pow(_, 2).toInt)
      .sum
  }

  private def squareOfSums(range:Range): Int = {
    Math.pow(range.sum, 2).toInt
  }

}

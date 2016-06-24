package easy

object Problem008 {

  def largestAdjacentDigits(n: Int, numbers: Array[Int]): Long = {
    val adjacentProducts =
      range(numbers, n)
        .foldLeft(Nil: List[Long])((l, i) => {
          adjacentProduct(numbers, n, i) :: l
        })

    adjacentProducts.sorted.reverse.head
  }

  private def adjacentProduct(numbers: Array[Int], n: Int, i: Int): Long = {
    (i until i + n)
      .map(j => numbers(j).toLong)
      .product
  }

  private def range(numbers: Array[Int], n: Int): Range =
    0 until numbers.length - n

}

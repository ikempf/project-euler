package easy

import scala.annotation.tailrec

object Problem005 {

  def smallestMultiple(range: Range): Int =
    smallestMultipleBis(1, range)

  @tailrec
  private def smallestMultipleBis(n: Int, range: Range): Int = {
    val maybeRemainder = findRemainder(n, range)

    if (maybeRemainder.isEmpty)
      n
    else
      smallestMultipleBis(n + maybeRemainder.get, range)

    // Needs to be tailrec
    //    findRemainder(n, range)
    //        .map(remainder => smallestMultipleBis(n + remainder, range))
    //        .getOrElse(n)
  }

  private def findRemainder(n: Int, range: Range): Option[Int] =
    range
      .find(i => n % i != 0)
      .map(i => n % i)

}

object Problem005Naive {
  def smallestMultiple(range: Range): Int = {
    Stream.from(1)
      .find(i => {
        println("Testing " + i)
        isDivisible(i, range)
      })
      .get
  }

  private def isDivisible(n: Int, range: Range): Boolean = {
    range.forall(i => {
      n % i == 0
    })
  }
}

package easy

object Problem002 {

  def evenFibonacciNumbers(limit: Int): Int =
    fib
      .takeWhile(_ < limit)
      .filter(_ % 2 == 0)
      .sum

  private def fib: Stream[Int] =
    Stream.iterate((1, 1))(fib => (fib._2, fib._1 + fib._2))
      .map(_._2)

}

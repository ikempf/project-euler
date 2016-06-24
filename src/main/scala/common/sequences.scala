package common

object Sequences {

  val primes: Stream[Int] = Stream.from(2).filter(isPrime)

  def isPrime(n: Int): Boolean = {
    val limit = Math.sqrt(n).toInt

    for (i <- 2 to limit if n % i == 0)
      return false

    true
  }

}

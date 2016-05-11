package easy

object Problem003 {

  def largestPrimeFactor(n: Long): Int =
    primeFactorization(primes, n).head

  def primeFactorization(primes: Stream[Int], rest: Long): List[Int] = {
    def loop(primes: Stream[Int], rest: Long, factors: List[Int]): List[Int] = {
      if (primes.head > rest)
        return factors

      if (rest % primes.head == 0)
        return loop(primes, rest / primes.head, primes.head :: factors)

      loop(primes.tail, rest, factors)
    }

    loop(primes, rest, Nil)
  }

  val primes: Stream[Int] = Stream.from(2).filter(isPrime)

  def isPrime(n: Int): Boolean = {
    val limit = Math.sqrt(n).toInt

    for (i <- 2 to limit if n % i == 0)
      return false

    true
  }

}

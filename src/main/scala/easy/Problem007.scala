package easy

import common.Sequences.primes

object Problem007 {

  def nthPrime(n: Int): Int =
    primes.drop(n - 1).head

}

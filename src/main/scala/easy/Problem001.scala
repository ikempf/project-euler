package easy

object Problem001 {

  def multiplesOf3And5(limit: Int): Int =
    (Stream.range(0, limit, 3) ++ Stream.range(0, limit, 5)).distinct.sum

}

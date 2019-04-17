package com.atguigu.enhance

/**
  * @author zyt
  * @date 2018/12/14 - 9:40
  */
object View {
  def main(args: Array[String]): Unit = {
  viewTest()
  }

  def viewTest()={

    val palindromicSquares = (1 to 100).view.map(x => {print(x) ; x*x})

    //println(palindromicSquares)
    val view01 = palindromicSquares.take(10)
    println("---")
    print(view01)

    val pa = squares(0)
    println(pa)
  }
  def squares(x: Int): Stream[Int] = { println(x) ; x * x } #:: squares(x + 1)
}

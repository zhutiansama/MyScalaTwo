package com.atguigu.enhance

/**
  * @author zyt
  * @date 2018/12/14 - 9:23
  */
object Stream {
  def main(args: Array[String]): Unit = {

    StreamTest()
  }

  def StreamTest()={
      val tenOrMore = numsForm(10)
      println(tenOrMore.head)
      println(tenOrMore.tail)
      println(tenOrMore.tail.tail)

    var squares = numsForm(5).map(x => x * x)
    println(squares)

    println(squares.take(5).force)

  }

  def numsForm(n : BigInt): Stream[BigInt] = n #:: numsForm(n+1)



}

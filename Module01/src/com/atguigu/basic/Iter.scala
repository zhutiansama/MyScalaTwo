package com.atguigu.basic

/**
  * @author zyt
  * @date 2018/12/14 - 9:09
  */
object Iter {
  def main(args: Array[String]): Unit = {
    iterTest()
  }

  def iterTest()={
      var iter = "zhutianlove".sliding(4)
      /*while(iter.hasNext){
        println(iter.next())

      }*/




//    println(iter.length)
//    for (elem <- iter)
//      println(elem)

    val iterArray = iter.toList
    for (elem <- iterArray)
      println(elem)


  }
}

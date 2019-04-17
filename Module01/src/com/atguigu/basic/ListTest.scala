package com.atguigu.basic

import scala.collection.mutable._

/**
  * @author zyt
  * @date 2018/12/13 - 11:45
  */
object ListTest {
  def main(args: Array[String]): Unit = {
    List01()
    //List02()
   // List03()
  }
  def List03()={
    val numList = List(1,2,3,4).reduceLeft(_ - _)
    println(numList)

    //操作：统计字符串中字符出现的频率
    val freq = scala.collection.mutable.Map[Char,Int]()
    for(c <- "Mississippi")
      freq(c) = freq.getOrElse(c,0) + 1
    println(freq)




  }


  def List02() = {
    val names = List("zhutian", "shulan")

    val new_names = names.map(_.toUpperCase())
    //println(new_names)

    val new_names01 = for (name <- names) yield name.toUpperCase()
    //println(new_names01)

    def ulcase(str: String) = Vector(str.toUpperCase(), str.toLowerCase())

    val new_name02 = names.map(ulcase)
   // println(new_name02)

    val new_name03 = names.flatMap(ulcase)
    //println(new_name03)

    //操作：对每一个元素都使用传进去的函数
    names.foreach(println)
   names.map(println)
    println(names)
  }


  def List01() = {
    val boyList = List("zhutian", "shulan")

    boyList.+("shenmiren")
    var new02 = boyList.+("lurenjia")
    var new03 = boyList+("huwuque")
    println(new02)
    var newboyList = "wudi" :: boyList

    println(newboyList.tail)
    println(newboyList)

    val listNum = List(9, 8, 3)
    //操作：递归列表
    println(sum(listNum))

  }

  def sum(lst: List[Int]): Int = {
    if (lst == Nil)
      return 0
    else
      return lst.head + sum(lst.tail)


  }

}

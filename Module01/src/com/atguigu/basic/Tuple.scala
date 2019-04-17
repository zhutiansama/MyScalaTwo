package com.atguigu.basic

/**
  * @author zyt
  * @date 2018/12/13 - 11:13
  */
object Tuple {
  def main(args: Array[String]): Unit = {
    tuple01()
  }

  def tuple01()={
    val t = (1,5,"zhutian")
    val name = t._3
    println(name)

    //操作：通过元组给变量赋值
    val (first,second,third) = t
    println(first)

    val (first2,second2,_) = t

    //操作：拉链操作
    val symbols = Array("<","-",">")
    val counts = Array(2,10,2)
    val pairs = symbols.zip(counts)

    //println(pairs(2))
    //for ((s,n) <- pairs)println(s+" "+n)

    //操作：将元组数组变成映射
    val map01 = pairs.toMap
    for ((k,v) <- map01)
      println(k+" "+v)


  }
}



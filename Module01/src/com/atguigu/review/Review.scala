package com.atguigu.review

import scala.collection.mutable

/**
  * @author zyt
  * @date 2019/1/17 - 9:40
  */
object Review {

  def main(args: Array[String]): Unit = {
    var boyList = List("zhutian","shulan","xiaofei");
    var iter = boyList.toIterator;

    while(iter.hasNext){
        println(iter.next())
    }


    /*println(1.toString)
    println("hellloo".distinct)

    val str = "hello";
    var freq = mutable.Map[Char,Int] ()
    for(c <- str){
        freq(c) = freq.getOrElse(c,0)+1
    }
    println(freq)*/

  /*  var num = numForms(10);
    num.take(20).force
    println(num)*/
  var newlist = boyList.flatMap(ulcase)
    println(newlist)


  }

  def ulcase(str:String) = {
    List(str.toUpperCase)
  }

  def iterTest() = {
  var iter = "zhutianlove".sliding(4)

  }
  def numForms(n1:Int):Stream[Int] = {
      if(n1 == 20)
        return Stream();
    (n1)#::numForms(n1+1);

  }


  def sum(args: Int*): Int = {
    var result = 0;
    for (arg <- args) {
      result += arg;
    }
    return result;
  }

  def recursive(str: String): Long = {
    if (str.length == 1)
      return str.charAt(0).toLong
    else
      str.take(1).charAt(0).toLong * recursive(str.drop(1))


  }

}

package com.atguigu.basic

import scala.collection.mutable.ArrayBuffer
import scala.math._

/**
  * @author zyt
  * @date 2018/12/12 - 18:22
  */
object TestArray {
  def main(args: Array[String]): Unit = {
    // calculateTest();
    arrayStudy();


  }

  def arrayStudy(): Unit = {
    /* val nums = new Array[Int](10)

     //这是可变数组
     val s = Array("hello","world")
     s(0)="hi"
     println(s(0)+s(1))

     //操作：数组缓冲,变长数组,数组从零开始
     val b = ArrayBuffer[Int]();
     b += 1
     b += (2,3,4)
     b ++=Array(5,6,7)
     println(b)

     //b.remove(2,3)
    // println(b)
     //索引下标之前，插在什么后面其实都是看长度后面索引+1
     b.insert(2,250)
     println(b)

     //删除最后5个元素
     b.trimEnd(3)
     println(b)
     //加入789,
     b.insert(5,7,8,9)
     println(b)*/


    //操作：变与不变
    /*val a1 = b.toArray
    a1.toBuffer

    val a = new Array[Int](10)
    for(i <- 0 to 9){
      a(i) = i
    }
    //有木有方法直接打印数组的
    for(i <- 0 to 9){
      print(a(i))
    }
    println()
    for(i <- 0 until a.length){
      print(a(i))
    }
    println(a.length)
*/
    //产生一个Range
    val a = new Array[Int](10)
    for (i <- 0 to 9) {
      a(i) = i
    }
    0 until a.length
    //操作：跳着索引
    for (i <- 0 until(a.length, 2))
      print(a(i))
    println()
    //操作：倒转索引
    for (i <- 0 until a.length reverse)
      print(a(i))
    println()
    //操作：增强循环
    for(elem <- a)
    print(elem)
    //索引
    println()
    for(i <- a.indices)
      print(i)

  }


  def calculateTest() = {
    try {
      println(calculate(-1));
    } catch {
      //更加友好的异常提示
      case e: Exception => println(e.getMessage)
    } finally {
      println("i am finally")
    }
  }

  def calculate(num: Int) = {
    if (num > 0) {
      sqrt(num);
    } else {
      throw new IllegalArgumentException("can not be negative");
    }

  }


}

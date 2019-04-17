package com.atguigu.basic

import scala.collection.mutable

/**
  * @author zyt
  * @date 2018/12/13 - 11:32
  */
object Queue {
  def main(args: Array[String]): Unit = {
queue01()
  }

  def queue01()={
    val boysQueue = new mutable.Queue[String]()
    //追加元素
    boysQueue += "zhutian"
    boysQueue += "shulan"

    boysQueue ++= List("lurenjia","shenmiren")

   // val name = boysQueue.dequeue()
    //println(name)

   /* for (boy <- boysQueue)
      println(boy)*/
    //println(boysQueue)

    println(boysQueue.head)
    println(boysQueue.tail)

  }
}

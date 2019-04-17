package com.atguigu.basic

/**
  * @author zyt
  * @date 2018/12/13 - 15:57
  */
object ZipTest {
  def main(args: Array[String]): Unit = {
    zipTest()
  }

  def zipTest() = {
    var teacherList = List("zhutian", "shulan", "xuting")
    var studentList = List("xiaofei", "lurenjia", "xujiao")

    var allList = teacherList zip studentList
   // println(allList)

    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(10, 2, 1)

    // 拉链后执行map操作
    val mapPrint = ((prices zip quantities) map { p => p._1 * p._2 }) sum

    val list01 = List(5,6,7,8).zipAll(List(7,8),0,1)
    val list02 = List(10,11).zipAll(List(12,13,14,15),0,250)
   // println(list02)

    val list03 = "scala".zipWithIndex
    //println(list03)

    val list04 = "scala".zipWithIndex
    println(list04)

    val list05 = "scala".zipWithIndex.max._2
    println(list05)

    val list06 = "scala".zipWithIndex.unzip
    println(list06)

    val list07 = "scala".zipWithIndex.unzip._1
    println(list07)

    val list08 = list07.toBuffer
    println(list08)






  }
}

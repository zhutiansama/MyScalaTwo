package com.atguigu.basic

/**
  * @author zyt
  * @date 2018/12/12 - 19:21
  */
object TestArray01 {

  def main(args: Array[String]): Unit = {
    //arrayTest()
    //ofDemTest()
    asJavaAndasScala()
  }

  def asJavaAndasScala()={
    import scala.collection.JavaConverters._
    import scala.collection.mutable
    import scala.collection.mutable.ArrayBuffer

    val command = ArrayBuffer("ls","-al","/")
    val pb = new ProcessBuilder(command.asJava)
    val cmd: mutable.Buffer[String] = pb.command().asScala
    if(cmd == command)
        println("you win")


  }


  def ofDemTest() = {
    //操作：声明二维数组
    val matrix = Array.ofDim[Int](3, 3)
//    matrix(0)(0) = "zhutian"
//    println(matrix(0)(0))

    for (i <- 0 to 2; j <- 0 to 2)
      matrix(i)(j) = j+1

    for (i <- 0 to 2; j <- 0 to 2){
      print(matrix(i)(j))
      if(j==2)
        println()
    }
    //操作：二维数组赋值
    val triangle = new Array[Array[Int]](10)
    for(i <- triangle.indices)
      triangle(i) = new Array[Int](i+1)

    for (i <- 0 until triangle.length){
      for (j <- 0 to i){
          triangle(i)(j) = j+1
      }
    }
    for(row <- triangle){
      for (elem <- row)print(elem+" ")
      println()
    }


  }


  def arrayTest() = {
    //操作：yield的使用
    /*val a = Array(250, 260, 270, 280, 290, 301, 303);
    val result = for (elem <- a) yield elem / 10
    for (elem <- result)
      print(elem + " ")
    println()
    val salary = for (elem <- result if elem % 3 == 0) yield elem + 250
    for (elem <- salary)
      print(elem + " ")
    println()
    val num = a.filter(_ % 2 == 0).map(2 * _)
    for(elem <- num)
      print(elem+" ")*/

    import scala.collection.mutable.ArrayBuffer

    //操作：求数组的最大值
    val num1 = Array(10, 12, 12, 13).sum
    print(num1)

    //最大排序
    val array1 = ArrayBuffer("zhutian", "love", "xiao", "fei").max
    print(array1)
    println()
    //操作：对数值数组排序
    val b = ArrayBuffer(1, 3, 5, 11, 9, 7)
    var bsorted = b.sorted
    for (elem <- bsorted)
      print(elem + " ")

    println()
    //操作:快速排序
    val c = Array(2, 3, 5, 9, 6, 8, 4)
    scala.util.Sorting.quickSort(c)
    for (elem <- c)
      print(elem + "")
    println()
    //操作：数组变成字符串的方式
    val cString = c.mkString(" and ")
    println(cString)

    val cString2 = c.mkString("<", ",", ">")
    println(cString2)

    val cString3 = c.toString
    print(cString3)
  }

}

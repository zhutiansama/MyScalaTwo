package com.atguigu.enhance

/**
  * @author zyt
  * @date 2018/12/14 - 10:51
  */
object Match {
  def main(args: Array[String]): Unit = {
    // matchTest()
    //matchTest01()
    matchTest02()
  }

  def matchTest02() = {
      for(obj <- Array(Map("zhutian"-> 100),Map(99 -> "shulan"),Array(250),Array("shenmiren"))){
        var result = obj match {
          case x:Map[String,Int] => "It is a Map[String,Int]"
          case y:Map[_,_] => "It is a any map"
          case z:Array[Int] => "It is a Array[Int]"
          case z:Array[_] => "It is any Array"
          case _:String => "It is anything"

        }

println(result)
      }

  }

  def matchTest01() = {
    var boyList = List("zhutian", "shulan", "sihaisha")
    var boyScore = 0
    for (boy <- boyList) {

      boy match {
        case "zhutian" => boyScore = 100
        case "shulan" => boyScore = 99
        case "sihaisha" => boyScore = 88
        case _ => println("please write correctly")
      }
      //println(boyScore)
    }

    var differentInt = Array(250, "249", BigInt(520), BigInt)

    for (dif <- differentInt) {
      var result = dif match {
        case x:Int => x
        case y:String => y.toInt
        case _:BigInt => Int.MaxValue
        case BigInt => -1
        case _ => println("different data")
      }
      println(result)

    }


  }


  def matchTest() = {
    var sign = 0
    for (ch <- "ab!") {

      sign = ch match {
        case 'a' => 1
        case 'b' => 0
        case _ => -1
      }

      println(sign)

    }
    //----
    import java.awt._

    val color = SystemColor.textText
    val str = color match {
      case Color.RED => "Text is red"
      case Color.BLACK => "Text is black"
      case _ => "Not red or black"
    }
    println(str)

  }

}


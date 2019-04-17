package com.atguigu.review

/**
  * @author zyt
  * @date 2019/1/18 - 10:32
  */
object Review2 {

  def main(args: Array[String]): Unit = {
    //      matchTest("linhunyongshi")
    //    guardTest()
    //    typeMatchTest()
    //typeMatchTest03()
    typeMatchTest04()
    for((k,v)<- Map("zhutian"->15))
        println(k+"+"+v)
  }

  def typeMatchTest04()={
    for(pair<- Array((0,1),(1,0),(1,1))){
      var result = pair match {
        case (0,_) => println("(0,1)")
        case (y,0) => println("(1,0)")
        case _ => println("(1,1)")
      }
    }
  }

  def typeMatchTest03() = {

      for (lst <- Array(List(0),List(1,0),List(0,0,0),List(1,0,0))){
          lst match {
            case s::Nil => println(s)
            case x::y::Nil => println(x+","+y)
            case 0::tail => println("0::tail")
            case _ => println("1,0,0")

          }



      }




  }

  def typeMatchTest02() = {

     for (arr <- Array(Array(0),Array(1,0),Array(0,1,0),Array(1,1,0))){
        val result = arr match{
          case Array(0)=> println("0")
          case Array(x,y) => println("("+x+","+y+")")
          case Array(0,_*) => println("0,_*")
          case Array(_*) => println("_*")
        }

     }


  }

  def typeMatchTest01() = {

    for (obj <- List(Array(1,2,3),Map("zhutian"->15),Map("zhutian"-> "xiaofei"),Array("shulan"))){
      var result = obj match{
        case array01:Array[Int] => println("Array[Int]")
        case map01: Map[String,Int] => println("Map[String,Int]")
        case map02: Map[_,_] => println("Map[_,_]")
        case array02: Array[_] => println("Array[_]")
        case _ => println("error")
      }

    }


  }


  def typeMatchTest() = {

    for (obj <- Array(250, "500", BigInt(666), BigInt, 48.0)) {
      var result = obj match {
        case x: Int => println(x)
        case s: String => println(s.toInt)
        case _: BigInt => println("BigInt01")
        case BigInt => println("BigInt02")
        case _ => println(0)
      }

    }


  }


  def matchTest(product: String) = {

    var painter = product match {

      case "linhunyongshi" => "zhutian"
      case "yellow" => "shulan"
      case "girl" => "xiaofei"
      case _ => "No this Product"

    }
    println(painter)
  }

  def guardTest() = {
    for (ch <- "+-9") {
      var num = ch match {
        case '+' => 1
        case '-' => -1
        case _ if ch > 100 => println(ch)
        case _ => 0
      }
      println(num)
    }


  }

}

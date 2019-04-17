package com.atguigu.enhance

/**
  * @author zyt
  * @date 2018/12/14 - 14:30
  */
object Bind {
  def main(args: Array[String]): Unit = {
    bindTest()
  }

  def bindTest() = {

    for (arr <- Array(Array(1), Array(1, 2), Array(1, 2, 3), Array(1, 2, 3, 4))) {
      var result = arr match {
        case Array(1) => "zero"
        case Array(x, y) => "x" + " " + "y"
        case Array(1, _*) => "1 any"
        case _ => "other"
      }
     // println(result)


    }

    //---------------------
    //列表的数组
    for (arr <- Array(List(1), List(1, 2), List(1, 2, 3), List(1, 2, 3, 4))) {
      var result = arr match {
        case 1 :: Nil => "1"
        case x :: y :: Nil => x + " " + y
        case 1 :: tail => "1..."
        case _ => "other"

      }
     // println(result)


    }

    for (pair <- Array(("zhutian","man"),("shulan","man"),("xiaofei","women"))){
        var result = pair match{
          case (x,"man") => "i am" + x
          case (_,"women") => "i am women"
          case _ => "i am other"

        }
      println(result)
    }





  }
}

package com.atguigu.enhance

/**
  * @author zyt
  * @date 2018/12/14 - 16:18
  */
object Case {
  def main(args: Array[String]): Unit = {
    //caseTest()
    caseTest01()
  }

  def caseTest01() = {
    abstract class Amount
    case class Dollar(value: Double, str: String) extends Amount

    val dollar = Dollar(250, "zhutian")
    val newDollar = dollar.copy(value = 249)
    println(newDollar)
    val newDollar01 = newDollar.copy(str = "shulan")
    println(newDollar01)

  }

  def caseTest() = {
    abstract class Amount
    case class Dollar(value: Double) extends Amount
    case class Currency(value: Double, value1: String) extends Amount

    case object Nothing extends Amount

    val dollar = Dollar(200)
    // println(dollar.value)
    // println(dollar.toString)

    for (amt <- Array(Dollar(250), Currency(200, "zhutian"), Nothing)) {
      var result = amt match {
        case Dollar(v) => "my earn:" + v
        case Currency(_, name) => name
        case Nothing => "Nothing"
      }

      println(amt + " : " + result)


    }


  }
}

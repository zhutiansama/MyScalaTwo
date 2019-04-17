package com.atguigu.enhance

/**
  * @author zyt
  * @date 2018/12/14 - 16:40
  */
object Mvalue {
  def main(args: Array[String]): Unit = {
    //MvalueTest()
    MvalueTest01()
  }

  def MvalueTest01() = {
    case object +: {
      def unapply[T](input:List[T]):Option[(T,List[T])] =
        if (input.isEmpty) None else Some((input.head,input.tail))


    }

    1 +: 7 +: 2 +: 9 +: Nil match {
      case first +: second +: rest => println(first);println(second);println(rest)

    }


  }
  def MvalueTest() = {
    case class Dollar(value : Double, unit : String)

    val amt = Dollar(20,"zhutian")

    val result = amt match { case a Dollar u => a+" "+u}
    //println(result)


    //------------------------------------
    List(1, 7, 2, 9) match {
      case first :: second :: rest => println(first); println(second); println(rest)
      case _ => 0
    }

    List(1, 7, 2, 9) match {
      case ::(first, ::(second, rest)) => println(first); println(second); println(rest)
      case _ => 0
    }

    List(List(1, 7), List(2, 9)) match {
      case (first :: second) :: rest1 => println(first); println(second); println(rest1)
      case _ => 0
    }

  }

}

package com.atguigu.enhance

/**
  * @author zyt
  * @date 2018/12/14 - 14:50
  */
object Unapply {
  def main(args: Array[String]): Unit = {
    //unapplyTest()
    unapplyTest01()
  }

  def unapplyTest01() = {

    object Name {
      def unapply(input: String): Option[(String, String)] = {
        val pos = input.indexOf(" ")
        if (pos == -1) None
        else
          Some(input.substring(0, pos), input.substring(pos))
      }

    }
    val author = "zhu tian"
    val Name(first, last) = author

    println(first, last)

    //就是提取对象，返回值罢了
    val flag = Name.unapply(author)
    println(flag)
    val flag01 = Name.unapply("zhutian")
    println(flag01)

    //写一个单个提取器，将String变成Int
    object Numbers {
      def unapply(str: String): Option[Int] = {

        try {
          Some(str.trim.toInt)
        } catch {
          case e: NumberFormatException => None
        }
      }
    }
    val num = "2500"
    val Numbers(newNum) = num
    val flag02 = newNum.isInstanceOf[Int]
    println(newNum+" "+flag02)

    //booleanTest
    object IsCompound{
      def unapply(input: String): Boolean = {println(input);!input.contains(" ")}
    }

   // val test01 = "xiaofei"
    //val IsCompound() = test01
    author match {
      case Name(first,IsCompound()) => println("compound")
      case Name(first,last) => println("simple")

    }









  }

  def unapplyTest() = {
    val arr = Array(0, 1)
    val Array(x, y) = arr
    val Array(z, _*) = arr


    val i = Array.unapplySeq(arr)
    println(i)


  }
}

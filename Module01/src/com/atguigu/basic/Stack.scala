package com.atguigu.basic


/**
  * @author zyt
  * @date 2018/12/13 - 11:41
  */
object Stack {
  def main(args: Array[String]): Unit = {
    Stack01()
  }

  def Stack01() = {
    val boyStack = new scala.collection.mutable.Stack[String]();
    boyStack.push("zhutian")
    boyStack.push("shulan")

    val top = boyStack.top
    println(top)

    val name = boyStack.pop()
    println(name)

    val name1 = boyStack.pop()
    println(name1)

  }
}

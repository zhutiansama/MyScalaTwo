package com.atguigu.basic

/**
  * @author zyt
  * @date 2018/12/12 - 15:24
  */
object HelloWorld {

  def main(args: Array[String]) {

    println("Hello, world!")
    var sum2 = sum(5,5,5,5)
    println(sum2)

    var leijia = recursive("Hello")
    println(leijia)
  }

  def sum(args:Int*): Int ={
    var result=0;
    for(arg<-args)
      result+=arg;
    //容易忘记返回
    return result
  }

  def recursive(str:String):Long={
    if(str.length == 1)
      return str.charAt(0).toLong
    else
      str.take(1).charAt(0).toLong*recursive(str.drop(1))

  }


}

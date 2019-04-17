package com.atguigu.basic

/**
  * @author zyt
  * @date 2018/12/13 - 13:08
  */
object SetTest {
  def main(args: Array[String]): Unit = {
    setTest01()
  }

  def setTest01() = {
    var boySet = Set("zhutian", "lurenjia", "shenmiren")
    boySet += "wudi"
    boySet -= "lurenjia"

    boySet - "wudi"
    println(boySet)

    for (boy <- boySet)
      println(boy)
  }

}

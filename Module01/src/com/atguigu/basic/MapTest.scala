package com.atguigu.basic

import scala.collection.mutable

/**
  * @author zyt
  * @date 2018/12/13 - 10:18
  */
object MapTest {
  def main(args: Array[String]): Unit = {
    //mapTest01()
    mapTest02()

  }
  def mapTest02()={
    import scala.collection.JavaConverters._
    val ids = java.time.ZoneId.SHORT_IDS.asScala
    val props = System.getProperties().asScala

    import java.awt.font.TextAttribute._
    var attrs = Map(FAMILY -> "Serif",SIZE -> 12)
    val font = new java.awt.Font(attrs.asJava)







  }



  def mapTest01() = {
    //操作：映射的构建
    //immutable map
    val yanzhi_boy = Map("zhutian" -> 99, "shulan" -> 60, "shenmiren" -> 100)

    //mutable map
    val yanzhi_girl = scala.collection.mutable.Map("xiaofei" -> 100, "xujiao" -> 99, "xuting" -> 99)
    //empty map
    val yanzhi_enemy = new mutable.HashMap[String, Int]
    yanzhi_enemy += "baikaixin" -> 60
    yanzhi_enemy += "fulushou" -> 80

    val enemy1 = yanzhi_enemy("baikaixin")
    println(enemy1)

    //操作：构建对偶元组
    val yanzhi_family = Map(("HongHong", 60), ("zhenzhen", 80), ("yuyu", 100))

    //操作：contains的应用
    val zhutian_yanzhi
    = if (yanzhi_boy.contains("zhu")) yanzhi_boy("zhutian") else 0
    println(zhutian_yanzhi)

    //操作：getOrElse()+map映射
    val flag = yanzhi_boy.getOrElse("zhu",250)
    println(flag)

    val boy01 = yanzhi_boy.get("zhutia")
    println(boy01)

    yanzhi_girl += ("wudi"->100,"wufa"->150)
    println(yanzhi_girl("wudi"))

    //操作：不可变映射不能修改，但能产生新的映射
    val yanzhi_new_boy = yanzhi_boy + ("haisha"->250,"lurenjia"->60)
    println(yanzhi_new_boy("haisha"))

    //操作：遍历映射(k,v)
    for ((k,v)<-yanzhi_boy)
      println(k+"----"+v)

    //操作：获得key的set集合
    val girl_set = yanzhi_girl.keySet
    println(girl_set)

    //操作：遍历value
    for(value <- yanzhi_enemy.values)
      println(value)

    for(k <- yanzhi_enemy.keySet)
      println(k)

    //操作：映射中的kv对互换
    val new_family = for((k,v)<- yanzhi_family)yield (v,k)
    for ((k,v)<- new_family)
      println(k+"---"+v)
  }


}

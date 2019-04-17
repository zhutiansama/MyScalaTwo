package com.atguigu.enhance

/**
  * @author zyt
  * @date 2018/12/14 - 18:31
  */
object Nest {
  def main(args: Array[String]): Unit = {
  NestTest()
  }

  def NestTest()={

    abstract class Item
    case class Article(description: String, price: Double) extends Item
    case class Bundle(description: String, discount: Double, items: Item*) extends Item

    val special = Bundle("Father's day special", 20.0,
      Article("Scala for the you", 39.95),
      Bundle("Anchor Distillery Sampler", 10.0,
        Article("Old Potrero Straight Rye Whiskey", 79.95),
        Article("Junípero Gin", 32.95)))

    var result = special match {
      case Bundle(_, _, Article(descr, _), _*) => descr
    }

    println(result)

    val result01 = special match{
      case Bundle(_,_,art @ Article(_,_),rest @ _*) => (art,rest)
    }
    println(result01)


    val result02 = special match{
      case Bundle(_,_, art @ Article(_,_),rest) => (art,rest)

    }
    println(result02)

    // caozuo
    def price(it:Item):Double = it match{
      case Article(_,p) => p
      case Bundle(_,disc,its @ _*) => its.map(price _).sum - disc
    }

    val result04 = price(special)
    println(result04)


  }
}

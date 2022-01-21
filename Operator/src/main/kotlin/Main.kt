fun main() {
    val r11 : Int = 10+3
    val r12 : Int = 10-3
    val r13 : Int = 10*3
    val r14 : Int = 10/3
    val r15 : Int = 10%3

    println("$r11,$r12,$r13,$r14,$r15")

    val r16:IntRange = 10..20 // 10부터 20까지 관리를 하는 요소
    println("r16 : $r16")

    println("---------------------------------")
    var a9:Int = 10
    var a10: Int = 10
    var a11: Int = 10
    var a12: Int = 10
    var a13: Int = 10

    a9 +=3
    a10 +=3
    a11 *=3
    a12 /=3
    a13 %=3

    val a14:Int = 10
    val r17:Boolean = a14 == 10
    val r18 :Boolean = a14 !=10

    println("$r17,$r18")

    val r19:Boolean = a14 ==20
    val r20:Boolean = a14 !=20

    println("$r19,$r20")

    println("--------------------")

    val a15:Int =10

    val r21 : Boolean = a15 < 20
    val r22 : Boolean = a15 > 20
    val r23 : Boolean = a15 <= 20
    val r24 : Boolean = a15 >= 20

    println("$r21,$r22,$r23,$r24")

}
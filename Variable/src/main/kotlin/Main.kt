fun main() {


    //정수 리터럴
    println(100)
    println(100000000000)
    println(938_492_9232_23)
    // 자바에선 21억이 넘어가면 뒤에다가 l을 붙이지만 코틀린은 붙이지 않아도 된다.

    //실수 리터럴
    println(11.11)
    println(22.22F)

    //문자 리터럴
    println('A')
    println('가')
    //문자열 리터럴
    println("문자열")

    //논리 리터럴
    println(true)
    println(false)

    //Raw String
    println("동해물과 백두산이 \n 마르고 닳도록 \n 하느님이 보우하사 \n 우리나라 만세")

    println("""동해물과
        |백두산이 마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세
    """.trimMargin())

    println("----------------------------")

    val a1:Int = 100
    // 변수 선언시 자료형을 생략하면 저장하는 값에 따라 자동으로 결정된다.
    val a2 = 100
    println("a2 : $a2")
    println("a1 : ${a1}")
    // 중괄호 안에 수식이나 연산자가 없이 변수의 이름만 있을 땐 생략가능
    println("a1 : $a1")
    println("----------------------------")

    var a3:Int = 100

    val a4:Int = 100
    println("a3: $a3")
    println("a4: $a4")

    a3 = 200
    println("a4: $a4")

    //val 변수는 값을 다시 저장하지 못한다.
    // a4= 200
    println("----------------------------")

    // var a5:Int = null

    var a5:Int = 100
    var a6:Int? = null
    println("a5:$a5")
    println("a5:$a6")

    var a7:Int?=a5
    println("a7:$a7")

    var a8:Int = a6!!

}
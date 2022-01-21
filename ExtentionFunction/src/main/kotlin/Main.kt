    /*
        확장함수
         - 기존 클래스에 새로운 함수,메서드를 추가하는 개념이다.
         - Kotlin 코드에서는 기존 클래스에 메서드를 추가해 사용 하는 것처럼 보이지만
           사실 객체의 주소 값을 받은 함수가 만들어지고 그 함수를 호출하는 방식으로 동작한다.
        Infix함수
         - 함수를 연산자처럼 사용할 수 있는 함수이다.
         - 보통 연산과 관련된 메서드를 정의할 때 많이 사용한다.


     */

    fun main() {
        //확장함수
        val str1 = "abcd"
        println(str1.getUpperString()) // String 클래스에 getUpperString가 추가되는 것은 아님

        //InfixFunction
        val v1 =100
        val r1 = v1.add2(50)
  //    val r1 = 100 add 50 // add라는 메서드가 호출 이때 100은 메서드의 객체가 되기 때문에
                            // this = 100, a1 = 50 (둘다 사용가능)
        println("r2:$r1")

   /*
        //Inline 로 만들경우
        val v1 = 100
        val r1 = v1.100(50)
        */

        val r2 = v1 add2 50
        println("r2 : $r2")

        val r3 = v1.minus2(30)
        println("r3 : $r3")

        val r4 = v1 minus2 44
        println("r4 : $r4")
    }

    //확장함수
    fun String.getUpperString() : String {
        return  this.toUpperCase()
    }
    //InfixFunction

    infix fun Int.add2(a1:Int) : Int{
        return  this + a1
    }
/*
    //inlin으로 만들경우
    inline fun Int.add(a1:Int) : Int{
        return  this + a1
    }
 */

    infix fun Int.minus2(a1:Int): Int{
        return this -a1
    }

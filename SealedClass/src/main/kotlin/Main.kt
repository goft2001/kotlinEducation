    /*
        Sealed Class
         - 열거형은 특정 값을 의미하는 상수들을 모아 관리하는 개념 이라면
           Sealed Class 는 객체를 모아 관리하는 개념이다.
         - 열거형의 경우 상수에 지정된 값은 절대로 변경이 불가능 하지만 Sealed Class 는
           객체를 관리하는 개념이므로 객체가 가지고 있는 변수에 값을 설정하여 지정된 값을 변경하는 것이 가능하다.
         - 열거형 사용 시 상수가 의미하는 값을 수시로 변경하거나 다양한 형태로 사용하고자 할 때 사용한다.
         - 클래스들을 하나로 모아 관리하는 클래스이다.
     */


fun main() {
    val v1 = Number.Two

    checkNumber(v1)  // 무조건 2입니다가 출력!

    val v2 =Number2.SealedTwo(1)
    val v3 = Number2.SealedTwo(2)
    println("---------------------------------------------")
    checkNumber2(v2)
    checkNumber2(v3)
}


    //열거형의 경우 값을 미리 정함
    enum class Number(var num:Int){
        One(1), Two(2),Three(3)
    }

    fun checkNumber(a1:Number){
        when(a1){
            Number.One ->println("1입니다.")
            Number.Two ->println("2입니다.")
            Number.Three ->println("3입니다.")
        }

        when(a1.num){
            1->println("1입니다.")
            2->println("2입니다.")
            3->println("3입니다.")
        }
    }
    //실드형 같은 경우에는 클래스 타입만 지정
    sealed class  Number2{
        class SealedOne(val a1: Int) : Number2()
        class SealedTwo(val a1:Int) : Number2()
        class SealedThree(val a1:Int) : Number2()
    }

    fun checkNumber2(obj:Number2){
        when(obj){
            is Number2.SealedOne -> {
                println("One 입니다.")
                println(obj.a1)
            }
            is Number2.SealedTwo -> {
                println("Two 입니다.")
                println(obj.a1)
                when(obj.a1){
                    1->println("1입니다.")
                    2->println("2입니다.")
                }
            }
            is Number2.SealedThree -> {
                println("Three 입니다.")
                println(obj.a1)
            }

        }

    }
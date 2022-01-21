import java.lang.ArithmeticException
import java.lang.NullPointerException

/*
        예외
         - 프로그램 실행 중 예측이 가능한 오류들을 예외라고 부른다.
         - 예외가 발생하면 코드의 수행이 중단된다.
         - 예외 처리는 예외가 발생했을 때 프로그램이 수행되는 것을 막고 예외 발생시 동작
           되어야 하는 코드를 수행시켜 프로그램이 문제없이 동작하게 하기 위한 목적을 갖고있다.

        예외 처리 방법 (java와 비슷)
         - Try {
                    예외가 발생할 가능성이 있는 코드
            catch(e.예외클래스){
                    예외가 발생했을 때 수행할 코드
            }finally{
                    예외 발생 여부에 관계없이 수행해야 하는 코드드
           }

     */

fun main() {
    // 예외처리 예제 1
    try {
        val a1 = 10 / 0 //0으로 나눌시 수학적 오류 발생
    }catch (e:ArithmeticException){
        println("수학적 오류가 발생하였습니다.")
    }
    println("이 부분이 수행될까요?")

    //예외처리 예제 2
    try {
        val str:String?=null
        println(str!!.length)

    }catch (e:NullPointerException){
        println("Null 오류가 발생하였습니다.")
    }
    println("이 부분이 수행될까요?")


    try {
    val str2 = "안녕하세요"
    val a2:Int = str2.toInt()
    println("a2:$a2")
    }catch (e:NullPointerException){
        println("Null 오류가 발생하였습니다.")
    }catch (e:Exception){ //오류의 클래스를 전부 찾을 수 없으니 모두를 상속받는
                          // Exception을 적어준다.
        println("예외 발생")
    }
    println("이 부분이 수행될까요?")
}


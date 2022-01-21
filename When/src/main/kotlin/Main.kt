    /*
        when
        when은 java에서의 switch case 와 비슷하다.
        수식이나 값의 결과에 따라 수행될 부분을 결정하게 되며 자바와 다르게 정수 뿐만
        아니라 다양한 타입의 값을 비교할 수 있다.

        when(변수 or 수식) {
        값1 -> 코드
        값2 -> 코드

        }
     */

fun main() {
    val a1 = 2

    when(a1){
        1 -> println("a1은 1 입니다.")

        2 -> { //여러줄 일 경우
            println("수행되는 코드")
            println("a1은 2 입니다.")
        }
        3 -> println("a1은 3 입니다.")
        else  -> println("a1은 1,2,3이 아닙니다.")
    }

    val a2 = 3
    when(a2){
        1,2 ->println("a1은 1이거나 2 입니다.")
        3,4 ->println("a1은 3이거나 4 입니다.")
        5,6 ->println("a1은 5이거나 6 입니다.")
        //1~ 6 이 아닐경우에 수행될 부분이 필요할 때 else 사용 (필요시)
        else -> println("a2는 1,2,3,4,5,6 이 아닙니다.")
    }

    val a3 = 55.55
    when(a3){
        33.33 ->println("a3은 33.33 입니다.")
        55.55 ->println("a3은 55.55 입니다.")
        77.77 ->println("a3은 33.33,55,55 가 아닙니다.")
    }

    val a4 = "문자열 2"

    when (a4) {
        "문자열 2" -> println("문자열 2 입니다.")
        "문자열 3" -> println("문자열 3 입니다.")
        "문자열 4" -> println("문자열 4 입니다.")

        else -> println("문자열 2, 3, 4 가 아닙니다.")
    }

    val a5 = 5
    when(a5){
        in 1..3  ->println("a5는 1~3 사이의 숫자입니다.")
        // a5 안에 포함되어 있는지 물어보는 연산자 'in'
        in 4..6  ->println("a5는 4~6 사이의 숫자입니다.")
        in 1..6  ->println("a5는 1~6 사이의 숫자입니다.")
        // 조건 2,3 모두 해당 되나 순서상 조건 2만 실행되고 탈출하므로 출력안됨
        else -> println("a5는 1~6사이의 숫자가 아닙니다. ")
    }

    val str1 = setValue(1)
    val str2 = setValue(2)
    val str3 = setValue(3)

    println("str1 : $str1")
    println("str2 : $str2")
    println("str3 : $str3")
}
    //조건에 따라 값을 셋팅하는 방법
    fun setValue(a1:Int) = when(a1){

        1->"문자열1"
        2->{
            println("두 번째 경우의 수")
            "문자열2"
        }
        else ->"그 외의 문자열"
        //값을 셋팅하는 용도로 사용할 땐 반드시 else가 있어야함
    }
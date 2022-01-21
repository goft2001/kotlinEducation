/*
   if 문
   주어진 조건에 따라 작성된 코드 수행 여부를 결정하는 구문

   if (조건식){
       코드
   } else {
       코드
   }

    */
//기본 if문 : if 문의 조건식(변수의값) 이 true 인 경우에만 내부의 코드가 실행


fun main() {

    val a1 : Int = 10 //변수 선언


    if(a1==10){
        println("a1은 10입니다.")
    }

    if(a1 !=10){
        println("a1은 10이 아닙니다.")
    } // 조건식이 false 이기 때문에 실행되지 않는다.

    //else문 : 조건식이 만족하지 않을 경우 수행될 부분
    if(a1==10){
        println("a1은 10입니다")
    } else {
        println("a1은 10이 아닙니다.")
    }

    if(a1==20){
        println("a1은 20입니다")
    } else {
        println("a1은 20이 아닙니다.")
    }

    //else if 문
    /*
        if(조건식){
        코드
        }else if(조건식){
        코드
        }else if(조건식){
        코드
        }else{
        코드
        }
     */

    if(a1==5){
        println("a1은 5입니다")
    }else if (a1==10){
        println("a1은 10입니다.")
    }else if(a1==20){
        println("a1은 20입니다.")
    }else {
        println("a1은 5,10,20이 아닙니다.")
    }

    //모든 조건을 만족해야할 경우
    val a2: Int = 10
    val a3: Int = 20

    if(a2==10&&a3==20){
        println("a2은 10이고 a3은 20입니다.")
    }

    if(a2==10&&a3==30){
        println("a2은 10이고 a3은 30입니다.")
    } // 조건이 만족하지 않아 실행 안됨

    //주어진 조건 중 하나만 만족하면 될 경우
    if(a2 == 10 ||a3== 30){
        println("a2가 10이거나 a3이 30입니다.")
    } //a2 = 10은 참이기에 실행됨

    if(a2 == 20 ||a3== 30){
        println("a2가 10이거나 a3이 30입니다.")
    } //둘다 거짓이기에 실행되지 않음

    println("------------------------------")
    /*
        if 문을 활용한 변수 값 설정

        val a3 : String = if(a2>50) "50보다 큽니다" else "50보다 크지 않습니다"

        의 형태로 작성 가능


     */

    var a4:String =""
    val a5:Int = 10
    if(a5 ==10){
        a4 = "10입니다."
    }else {
        a4= "10이 아닙니다."
    }
    println("a4:$a4")
    val a6:String = if(a5==10) "10입니다" else "10이 아닙니다."

    println("a6 :$a6")

    //만약 처리해야할 코드가 한줄이 아니라 여러줄일 경우

    val a7 : String = if(a5==10){
        println("블록1 수행")
        "10입니다."//변수에 담을 값을 작성
    }else{
        println("블록 2 수행")
        "10이 아닙니다."
    }
    println("a7:$a7")

    //if 문은 조건식이 참일 경우 수행될 수 있도록 코드를 분기하는 제어문이다.
}
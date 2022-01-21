        /*
            Ruturn
            - 현재 수행 중인 함수를 종료하는 구문이다.
            - 함수에 수행할 코드가 남아 있더라도 함수를 종료하고 함수를 호출 한 쪽으로 되돌아 간다.(중요)
            - 반환 값이 있을 경우 return 문 다음에 반환 값을 작성한다.
            - 변수값의 유효성 검사할때 많이 쓰인다.

           break
           - 가장 가까운 반복문을 종료한다.
           - 반복 횟수가 남아 있더라도 종료된다.

            continue
            - 반복문에서 continue 이후에 코드가 더 있더라도 다시 위로 올라가는 구문이다.
            - continue 이후의 코드를 무시하고 다음 반복으로 진행되도록 하는 구문이다.
         */
fun main() {
    val r1 = testFun1(100)
    println("r1 : $r1")

    var r2 = testFun2(2)
    println("r2 : $r2")

    var r3 = testFun2(0) //0으로 나누면 수학적 오류이기 때문에 따로 지정해주지 않으면 오류가 발생한다.
    println("r3 : $r3")

    testFun3(100) // 100출력
    testFun3(0) // if 문이 실행 되었고 return에서 되돌아 오기에 아무것도 출력되지 않음



    println("---------------break-----------------------")

    for(item in 1..10){
        if(item>5){
            break
        }
        println("item : $item")
    }


    println("---------------continue-----------------------")

    for(item in 1..10){

        if(item%2 ==0 ){ //짝수이면 continue를 하겠다.
            continue
        }

        println("item : $item") //무시됨

    }
}

fun testFun1(a1:Int) : Int{
    println("testFun1")
    return a1 +100
}

fun testFun2(a1:Int) : Int{
    println("testFun2")

    if(a1==0) {
        return -1
    }

    println("이 부분이 수행될까요?") // 위에 리턴값이 있기때문에 수행되지 않음 : 나를 호출했던 쪽으로 되돌아간다는 의미
    //return문을 만나서 되돌아가게 되면 아래에 코드가 있어도 실행되지 않음

    return 100/a1

}
fun testFun3(a1:Int){
    if(a1==0){
        return //아랫구문은 실행되지 않음
    }
    println("a1은 0이 아닙니다.")
}


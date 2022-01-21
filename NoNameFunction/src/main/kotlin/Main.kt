fun main() {
    testFunction1()

    //val testFunction2 =testFunction1 // 함수의 이름만으로 변수에 담을 순없다.

    val testFunction2 = fun(){ //이름이 없는 함수를 만들 수 있다.
                                // 직접적으로 접근할 수는 없고 함수의 주소값을 가지고 있는
                                // 반드시 변수를 선언해서 접근할 수 있다.
       println("testFunction2입니다. ")
    }
}


fun testFunction1(){
    println("testFunction1 입니다.")
}


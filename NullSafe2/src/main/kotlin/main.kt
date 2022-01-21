    /*
      null 타입의 형 변환
        - null 값이 담긴 객체에 대해 보다 안전한 형 변환 방법을 제공하고 있다.

        - null을 허용하는 변수가 null 값이 들어있지 않다는 것을 보장해 주면 null을 허용하지
          않는 타입으로 스마트 캐스팅이 발생한다.
          즉, String? 의 경우 null이 들어있지 않다고 보장하면 자동으로 형변환! : if ( a is T ){   }

      if 문 사용
        - if 문을 통해 null허용 변수에 null 값이 아닌 객체의 주소 값이 들어 있음을 검사해 주면
        - if 문 내부에서는 null을 허용하지 않는 변수로 변환되어 사용할 수 있다.
        - if 문이 종료되면 다시 null 허용 변수가 된다.
        - 이 때 비교 연산자 보다는 is 연산자를 추천한다.
        - 비교 연산자로 검사할 경우 타입이 Any 인 경우 컴파일 오류가 발생한다.
        - if 문을 활용하여 null 여부를 검사하면 스마트 캐스팅이 발생한다.

    */

fun main() {
    testMethod1("안녕하세요")
    println("------------------------------------------")
    testMethod1(null)
    println("------------------------------------------")
    testMethod2("안녕하세요")
    testMethod2(null) //null 값은 조건에 만족하지 않기에 아무것도 출력하지 않는다.

}

    fun testMethod1(str:String?){
        println(str?.length)

        if(str is String){ // str 변수는 null을 허용하지 않는 스트링 객체가 들어가 있는지?
                           // string 객체가 들어있으면 자동 형 변환
            // 스마트 캐스팅 발생
            println(str.length)
        }

        if(str != null){
            println(str.length)
        }


    }
    fun testMethod2(str:Any?){
        if(str is String){  //null이 아닌지, 스트링 타입인지 검사를 같이 수행 (is를 사용하는 것이 편리)
            println(str.length)
        }
//        if(str !=null){
//            println(str.length) // null을 허용하지 않기는 하지만 스트링 타입인지 검사를 할 수 없기에 오류발생
//        }

    }


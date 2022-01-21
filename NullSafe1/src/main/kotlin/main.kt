    /*
        NullPointerException
         - Java 언어로 소프트웨어를 개발하다 보면 NPE라는 오류를 많이 많나게 된다.
         - 이는 객체의 주소 값이 담겨져 있지 않은(null 값이 들어있는) 참조 변수를
           통해 객체 접근을 시도하면 발생되는 오류이다.

        null safe
         - kotlin은 개발자가 null이 담겨 있는 참조변수를 통해 객체 접근을 시도할 때
           오류가 발생되는 것을 방지하고자 다양한 방법을 제공하고 있다.
         - 이를 통해 null 값에 대한 안정성을 확보(null safe) 할 수 있다.

        !!연산자
         - !!연산자는 null을 허용하는 변수에 담긴 객체의 주소 값을 null을 허용하지 않는
           형태의 값으로 변환하는 연산자이다.
         - null을 허용하는 변수에 담긴 값을 null을 허용하지 않는 형태의 변수에 담을 경우
           사용한다.
         - 변환 과정에서 null 값이 들어 있을 경우 오류가 발생한다.
         - null에 대한 안정성을 보장하지 못하기 때문에 이 연산자의 사용은 권장하지 않는다.

        ?:연산자
         - ?:연산자는 참조변수에 null 이 들어있으면 지정된 기본값을 반환한다.
         - 참조변수를 통해 메서드를 호출하거나 멤버 변수를 사용할 때 참조변수에 객체의 주소값이
           들어있다면 객체에 접근해서 메서드나 변수를 사용한다.
         - 만약 참조변수에 null 이 들어 있다면 오류가 발생하지 않고 null 을 반환한다.
    */

fun main() {
    // !!
    testFun1("문자")
   // testFun1(null) // 변수에 들어는 가지만 !! 연산자를 사용해 null 을
                      // 허용하지 않는 변수로 변환했기에 실행시 오류발생

    println("---------------------------------------")
    // ?:
    testFun2("문자열")
    testFun2(null) // 널이기때문에 기본 문자열 출력

    testFun3(null) //null이 있을 경우 null 반환
    testFun3("친구") //str값이 있으면 property 동작
}

    // 함수

    // null 허용 변수사용 & !! 연산자 지정
    fun testFun1(str : String?) // String? : null 을 허용하는 변수
    {
        val value1 : String = str!! // 해당 String 타입은 null 을 허용하지 않는 변수이기에 !! 연산자 사용
        println("value1 : $value1")
    }
    // null 허용 변수사용 & ?: 연산자 지정
    fun testFun2(str:String?){
        val value:String= str?: "기본 문자열"    // ?: "기본값" ->> null 이면 해당 기본값을 출력
        println("value : $value")
    }
    // null 허용 변수만 사용
    fun testFun3(str:String?){
        println("str : $str")

        //?.
        println("str length : ${str?.length}")
        //str?.length : null 값이 없으면 property 정상 작동,
        //str 에 null 이 들어있으면 전체를 null 로 지정하여 NPE 발생하지 않고 null 값을 반환
    }


    /*
        !! : null 을 허용하지 않는 형태로 반환 (웬만하면 사용 x )
        ?: : null 이라면 지정된 기본값이 반환  (변수의 값을 다른변수에 담을 때 사용 )
        ?. : 메서드 호출 시 null 이라면 메서드가 호출되지 않고 null 을 반환 (method 나 property 에 담을 때 사용 )

     */
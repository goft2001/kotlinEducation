    /*
       캡슐화
         - 객체가 가지고 있는 변수는 메서드에 구현한 코드가 정상적으로 동작하기 위한 데이터를 담고있다.
         - 만약 이 변수에 엉뚱한 데이터가 담긴다면 구현한 코드가 정상적으로 동작한다고
           하더라도 정상적인 결과가 나올 수 없다.
         - 이에 변수의 직접적인 접근을 차단하여 외부에서 값을 변경하지 못하도록 막는 것을 캡슐화라한다.
         - 접근제한자를 통해 외부에서 접근할 수 있는 자격을 제어하는 것을 캡슐화라고 한다.

       Property
         - 캡슐화가 적용된 변수는 외부에서의 접근이 차단된다.
         - 캡슐화가 적용된 변수에 대해 메서드를 통해 값을 설정하거나 가져다 사용할 수 있도록
           구성한 것을 Property 라고 부른다.
           (즉, 캡슐화가 적용된 변수하나, 쌍으로 이루는 setter,getter 으로 구성된 것을 property라고 부른다.)
         - 변수에 값을 넣는 메서드를 setter라고 부른다.
         - 변수가 가지고 있는 값을 반환하는 메서드를 getter이라고 한다.
         - 자바같은 경우에는 개발자가 직접 private를 설정하고 getter, setter을 만들어줘야 하지만
           코틀린의 경우 멤버변수를 설정해주면 getter,setter이 자동으로 설정된다.

       Property 작성 방법
        - private 키워드를 변수에 설정하여 외부에서 접근하지 못하도록 막는다.
        - 변수들 중에 외부에 공개하고자 하는 변수에 대해 setter와 getter를 지정한다.
          *(kotlin에서는 멤버변수를 설정하면 자동으로 setter와 getter이 만들어 진다.)

       주 생성자 사용하여 Property 만들기
        - 주 생성자의 매개 변수를 정의할 때 var,val를 지정하면 Property로 작성된다.
        - var는 getter,setter 모두 작성된다(변수)
        - val은 getter 만 작성된다(상수 : 변경불가)
     */

fun main() {

    val obj1 = TestClass1(100,200)
    println("obj1.a1 : ${obj1.a1}") //getter,setter 모두 있는 경우 언더바가 붙음
    println("obj1.a2 : ${obj1.a2}")

    obj1.a1 = 1000
    println("obj1.a1 : ${obj1.a1}")

    println("--------------------------------")

    val obj2 = TestClass2()
    obj2.v1=100 // 값 변경
    //obj2.v2=200 val이기때문에 setter이 설정되어있지 않아 오류발생

    println("obj2.v1 : ${obj2.v1}")
    println("obj2.v2 : ${obj2.v2}")

    obj2.v3=5000
    println("obj2.v3 : ${obj2.v3}")

}

    class TestClass1 constructor(var a1:Int, val a2:Int) // 주생성자 설정
    {
        // constructor(var a1:Int, val a2:Int, var a3:Int) : this(a1,a2)
        // 보조생성자 오류
        // var나 val 키워드는 주생성자에만 붙일 수 있고, 보조 생성자에는 붙일 수 없다.
    }


    class TestClass2 {
        var v1:Int=0
        val v2:Int=0
        var v3:Int=100
            // get()=field //field는 v3변수를 의미함
            //코틀린은 개발자가 getter와 setter를 생성할 수 있는 기능도 제공함(아래)
            get(){
                println("get 호출")
                return field //v3가 가지고 있는 값을 리턴하는 코드
            }
            set(value){
                println("set 호출")
                field = value // v3에다가 매개변수로 들어오는 값(value)을 넣어주겠다.
            }

    }

    /*
        최종 정리
         - 외부에서 변수에 대해 직접적인 접근을 차단하는 것을 캡슐화라고 부른다.
         - 캡슐화를 적용한 변수에 값을 넣거나 가져다 사용할 수 있도록 setter/getter를
           설정한 것을 Property라고 부른다.
    */
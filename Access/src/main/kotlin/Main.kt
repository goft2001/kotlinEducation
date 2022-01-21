import kr.co.softcampus.module.pkg2.PublicClass3
import kr.co.softcampus.module.pkg2.TestClass3
import kr.co.softcampus.pkg1.InternalClass2
import kr.co.softcampus.pkg1.PublicClass2
import kr.co.softcampus.pkg1.TestClass2

/*
        접근 제한자
         - 객체가 가지고 있는 변수는 .연산자를 통해 자유롭게 접근이 가능하다.
         - 만약 변수에 담기는 값이 어떠한 조건이 있을 경우 외부에서 자유롭게 접근할 수
           있다면 엉뚱한 값이 저장될 가능성이 있다.
         - 이에 변수나 메서드의 접근 권한을 설정할 수 있는 접근 제한자를 제공하고 있으며
           클래스를 설계하는 개발자가 각 변수나 메서드의 접근 권한을 설정해 오동작 하는 것을
           사전에 막을 수 있게 한다.
         - kotlin은 클래스의 정의한 모든 변수가 java 코드로 변경될 때 private 설정되어
           모든 변수는 직접적인 접근이 불가능하도록 설정되어있다.
         - 접근 제한자의 종류에 따라 java 코드로 변경될 때 getter,setter 메서드 추가 여부가 결정된다.

        Class
         - private : 외부에서 객체를 생성하거나 상속을 받을 수 없다.
         - public : 외부에서 객체를 생성하거나 상속을 받을 수 있다.(기본)
         - protected : 클래스에 지정할 수 없다. 클래스에 지정시 오류가 발생(java와 다름)
         - internal : 모듈 같은 경우에만 객체를 생성할 수 있다.

         변수, 메서드
          - 변수와 메서드는 동일하게 적용된다.
          - private : 외부에서 접근할 수 없다.
          - public : 외부에서 접근이 자유롭다.
          - protected : 상속관계일 경우에만 접근이 가능하다. (class와 다른부분)
          - internal : 묘듈이 같을 경우에만 접근이 가능하다.

*/


fun main() {
    //Class 접근제한자 (protected는 class에 사용불가로 생략)
    //같은 패키지의 경우
    val obj1 = PrivateClass1()
    //private class는 외부에서 사용이 불가능하다.
    val obj2 =PublicClass1()
    val obj3 = InternalClass1() //같은 모듈이라면 사용이 가능하다.

    //다른 패키지의 경우
    val obj4 = PrivateClass2()
    //private class는 외부에서 사용할 수 없다.
    val obj5 = PublicClass2()
    val obj6 = InternalClass2()

    //모듈이 다른 경우
    val obj7 = PrivateClass3()
    //private class 는 외부에서 사용할 수 없다.
    val obj8 = PublicClass3()
    val obj9 = InternalClass3()
    // Internal 클래스는 다른 모듈에선 사용할 수 없다.
// ----------------------------------------------------------------
    // 생성자
    // 같은 패키지일 경우
    val t1 = TestClass()
    println("t1.private1 : ${t1.private1}")
    // private 접근 불가
    println("t1.public1 : ${t1.public1}")
    println("t1.protected1 : ${t1.protected1}")
    // protected 멤버는 상속관계가 아니므로 사용할 수 없다.
    println("t1.internal1 : ${t1.internal1}")

    //다른 패키지일 경우
    val t2 = TestClass2()
    println("t2.priavate : ${t2.private2}") //private 멤버는 사용 불가
    println("t2.public2 : ${t2.public2}")
    println("t2.protected2 : ${t2.protected2}") // 상속관계가 아니기에 사용 불가
    println("t2.internal2 : ${t2.internal2}")

    //다른 모듈일 경우
    val t3 = TestClass3()
    println("t3.private3 : ${t3.private3}")
    println("t3.public3 : ${t3.public3}")
    println("t3. protected3 : ${t3.protected3}") // 상속관계가 아니기에 사용 불가
    println("t3.internal3 : ${t3.internal3}") //같은 모듈이 아니기 때문에 사용 불가

}

        //상속관계일 경우 (같은 패키지)
        class SubClass1 : TestClass(){

        fun SubMethod1() {
            // private 멤버 사용 불가
            println("t1.private1 : $private1")
            // private 접근 불가
            println("t1.public1 : $public1")
            println("t1.protected1 : $protected1")
            println("t1.internal1 : $internal1")
            }
        }
        //상속관계일 경우 (다른패키지)
        class SublClass2 : TestClass2(){

        fun SubMethod2(){
            //priavate 멤버 사용 불가
            println("private2 : $private2")
            println("public2 : $public2")
            println("protected : $protected2")
            println("internal : $internal2")
            }
        }

        //상속관계일 경우 (다른 모듈)
        class SublClass3 : TestClass3(){

        fun SublMethod3(){
            println("private3 : $private3") // private 사용불가
            println("public3 : $public3")
            println("protected : $protected3")
            println("internal : $internal3") //같은 모듈이 아니기 때문에 사용 불가
            }
        }


    /* 최종 정리
        private  : 같은 패키지, 모듈, 상속관계 모두 사용 불가
        public : 외부에서 사용이 자유롭다. 모두 사용가능
        protected : class에 지정할 수 없고, 상속관계의 변수나 메서드에만 적용가능
        internal  : 모듈이 같을 경우에 모두 사용가능. 모듈이 다르면 사용할 수 없다.
     */




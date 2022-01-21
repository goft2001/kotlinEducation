import kr.co.softcampus.pkg1.TestClass2
import kr.co.softcampus.pkg1.testFunction2
import kr.co.softcampus.pkg2.*
// pkg2의 클레스들은 패키지 명을 생략하고 쓰겠다.
// 다른 클래스의 이름과 같으면 안됨
// 가장 좋은 방법은 패키지가 다를때 같은 이름을 사용하지 않으면 됨


/*
    패키지
     - 소프트웨어를 개발하다 보면 클래스도 많이 만들게 되고 kt 파일도 많이 만들게 된다.
     - 파일이 많아지면 관리가 불편하고 배포가 힘들기 때문에 특정 기준을 세워 파일을 폴더별로
       나누어 관리하면 파일 관리가 용이 해진다.
     - kotlin에서 kt 파일들을 폴더 별로 나누어 관리하는 개념을 패키지 라고 부른다.
     - 패키지는 폴더로 구분하면 된다. (java와 동일)

 */
// 패키지 내에 있는 클래스 등을 사용할 때는 반드시 패키지명을 명시해야한다.
fun main() {
    val obj1:kr.co.softcampus.pkg1.TestClass1 = kr.co.softcampus.pkg1.TestClass1() //객체 생성
    obj1.testmethod1()

    kr.co.softcampus.pkg1.testFunction() //함수 사용

    //import를 사용하면 패키지를 명시하면 코드 내에서 패키지를 생략할 수 있다.

    val obj2: TestClass2 =TestClass2()
    obj2.testMethod2()

    testFunction2()

    val obj3 = TestClass3()
    val obj4 = TestClass4()

    obj3.testMethod3()
    obj4.testMethod4()
}


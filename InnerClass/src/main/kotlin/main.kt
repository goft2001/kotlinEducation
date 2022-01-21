        /*
            InnerClass
             - 클래스 안에 만드는 클래스를 중첩 클래스라고 부른다.
             - 중첩 클래스에서는 각 클래스에 정의한 멤버를 사용할 수 있는가를 숙지해야 한다.
             - 내부 클래스는 외부 클래스로부터 생성된 객체를 통해서만 객체 생성이 가능하다.
             - 외부 클래스는 내부 클래스의 멤버를 자유롭게 사용할 수 없지만 내부 클래스는 외부 클래스의
               멤버를 자유롭게 사용할 수 있다.

            익명 중첩 클래스
             - 이름이 없는 클래스를 익명 중첩 클래스라고 부른다.
             - 인터페이스나 추상클래스를 사용할 때 이용한다.
             - 1)인터페이스를 구현한 클래스나 추상 클래스를 상속받은 클래스를 2)만듦과 동시에
               3)메서드를 Overriding하고 4)객체를 생성하는 것 까지 수행된다.
             - 이름이 없으므로 다시는 객체를 생성할 수 없다.(딱 한번 사용할 떄)

         */

    fun main() {
        val obj1 = Outer()
        val obj2= obj1.Inner1()  // 외부클래스의 객체를 가지고 이너클래스 객체를 생성 수 있음.

        obj2.innerMethod1()

        obj1.outerMethod1()

        println("---------------------------------------")

        //추상 기본 형태
        val t1 =TestClass2()
            t1.TestMethod1()

        //인터페이스 기본 형태
        val t2 = TestClass3()
            t2.interMethod1()

        // 익명 중첩클래스 기본 사용 : 이름이 없기 때문에 딱 한번 사용가능하며, 보통 어딘가 한번 넘겨줄 때 사용
        val t3 = object : TestClass1(){
            override fun TestMethod1() {
                println("익명 중첩 클래스의 testMethod1")
            }
        }

        val t4 = object  : TestInter1{
            override fun interMethod1() {
                println("익명 중첩 클래스의 interMethod1")
            }
        }
        t4.interMethod1()


    }

        // outer class
        class Outer{
            val outerMember1 = 100
            fun outerMethod1(){
                println("Outer Method")
            }

            fun outerMethod2(){
        //        println("innerMember1 : $innerMember1")
        //        innerMethod1()

                //객체를 만들어 주면 내부클래스의 메서드와 변수를 사용할 수 있음
                val obj3 = Inner1()
                println("obj3.innerMethod1 : ${obj3.innerMember1}")
                obj3.innerMethod1()
            }

        // inner class
        inner class Inner1{
                val innerMember1 = 200
                fun innerMethod1(){
                    println("Inner Method")
                }
                fun innerMethod2(){
                    // 내부 클래스에서 외부클래스의 변수와 메서드 호출 가능
                    // why? 기본적으로 객체를 생성해야 사용할 수 있고 내부클래스가 만들어 졌다는 건 외부클래스의 객체
                    // 또한 만들어졌음을 의미하지만 그 반대의 경우 내부클래스 객체 생성 유무를 알 수 없기에 외부클래스에선 호출불가
                  println("outerMethod1 : $outerMember1")
                    outerMethod1()
                }

            } // inner class

        } //outer class

       abstract class TestClass1 {
           abstract fun TestMethod1()
       }
        interface TestInter1{
            fun interMethod1()
        }

        class TestClass2 : TestClass1(){
            override fun TestMethod1() {
                println("테스트클래스2 의 테스트메서드 1 ")
            }
        }

        class TestClass3 : TestInter1{
            override fun interMethod1() {
                println("테스트클래스3 의 인터메서드 1 ")
            }
        }
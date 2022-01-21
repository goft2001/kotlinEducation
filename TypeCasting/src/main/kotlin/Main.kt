    /*
        형변환
          - 변수에 담긴 값이나 객체를 다른 형태로 변환하는 것을 의미한다.
          - Kotlin은 모든 값을 객체로 관리하기 때문에 Kotlin에서의 형변환은 다른 클래스
            타입의 객체로 변환하는 것을 의미한다.
          - 자식 클래스 타입으로의 변환
          - 부모 클래스 타입으로의 변환
          - 다른 자료형 타입으로의 변환
          - null 허용과 null불허용 간의 변환

        스마트 캐스팅
         - 코틀린은 자바보다 더 많은 조건에서 자동으로 형변환이 발생한다.
         - 특정 조건을 만족하면 자동으로 형변환이 발생하는 개념이다.
         - kotlin은 스마트 캐스팅 기능 덕분에 형변환에 대해 개발자가 크게 신경쓰지 않아도 된다.
         - 형 변환은 객체의 클래스 타입이 아닌 객체의 주소 값을 가지고 있는 참조 변수의 타입이
           변경되는 것이다.

        조건.
          객체 타입의 변환
           - 객체 타입 변환은 상속관계나 구현한 인터페이스 타입에 해당한다.
           - 부모 클래스 타입으로의 형 변환
           - 자식 클래스 타입으로의 형 변환
           - 구현한 인터페이스 타입으로의 형 변환
           - 인터페이스를 구현한 클래스 타입으로의 형 변환

        as 연산자
         - 객체를 지정된 클래스 타입으로 변환하는 연산자이다.
         - 참조변수 as 클래스 타입
         - 만약 객체가 지정된 클래스타입과 관계가 없을 경우 오류가 발생한다.
         - 형 변환이 발생한 참조 변수는 변환된 타입을 유지한다.

        is 연산자
         - 형 변환이 가능하면 변환을 하고 true를 반환한다.
         - if 문으로 구성하여 사용하며 if문 내에서만 반환된 타입을 사용하고 if 문을 나가게 되면
           반환되기 전의 타입으로 다시 변경된다.

        Any 타입
         - Kotlin 은 모든 클래스가 직접 혹은 간접적으로 Any 클래스를 상속받는다.
         - 따라서 모든 객체의 주소 값은 Any 타입 참조 변수에 담을 수 있다.
         - Any 타입과 is 연산자를 활용하여 다양한 타입의 객체에 대응할 수 있는 코드를 만들 수 있다.

        기본 타입의 형 변환
         - kotlin 에서는 기본 타입을 관리하는 객체의 타입을 변경하는 메서드를 제공한다.
         - 참조 변수의 타입이 변경되는 것이 아닌 새로운 객체가 생성되어 반환된다.
         - toByte(),toShort(),toInt(),toLing(),toFloat(),toDouble(),toChar() 등
         - 변환이 불가능 할 땐 오류가 발생
     */

   fun main() {
      //객체 생성
      val obj1 : SubClass1 = SubClass1()
      val obj2 : SubClass2 = SubClass2()

      //부모 클래스 타입 참조변수에 담는다.(o)
      val super1:SuperClass1 =obj1        //스마트 캐스팅 발생
      //구현한 인터페이스 타입의 참조변수에 담는다.(o)
      val inter1 : Inter1 = obj2          //스마트 캐스팅 발생

//      val obj3:SubClass1 = super1 불가능
//      val obj4:SubClass2 = inter1
       println("---------------------------------------")
       //as : 지정된 클래스 타입으로 강제 변환하는 연산자
       super1 as SubClass1
       inter1 as SubClass2

        //inter1 as SubClass1
        // subclass1은 inter1 과는 아무런 연관이 없기에 강제 변환시 오류발생

       super1.subMethod1()
       inter1.subMethod2()

       println("---------------------------------------")

       val obj3:SubClass1 = SubClass1()
       val chk1 = obj3 is SuperClass1 //부모타입인 superClass1 타입으로 변환 가능
       println("chk1 $chk1")          //변환가능하면 true 반환

       //val chk2 = obj3 is Inter1 오류발생 변환 불가

       val super3:SuperClass1 = obj3
       val chk3 = super3 is SubClass1
       println("chk3 : $chk3") //true

       if(super3 is SubClass1){
           super3 as SubClass1
           // is 연산자 : 값이 true 라면 형변환이 가능한 상황이므로 스마트 캐스팅 발생!!
           super3.subMethod1()
       }
       //super3.subMethod1()

       println("----------------------------------------")

       val abj10 : SubClass1 = SubClass1()
       val abj11 : SubClass2 = SubClass2()

       anyMethod(abj10)
       anyMethod(abj11)
       anyMethod(100)
       anyMethod("문자열")

       println("----------------------------------------")

       val number1:Int =100
       val number2:Long = number1.toLong()
       println("number2 : $number2"  )

       val str1:String ="100"
       val number3:Int =str1.toInt() // 문자열이지만 정수로 변환
       println("number3 : $number3")

//       val str2 : String="안녕하세요!!"
//       val number4:Int =str2.toInt()
//       println("number4 : $number4") // 문자열 안의 값이 정수가 아니기에 변환이 불가능!

    }

    open class SuperClass1

    interface Inter1

    class SubClass1 : SuperClass1(){
        fun subMethod1(){
            println("SubClass1의 subMethod1입니다.")
        }


    }
    class  SubClass2 : Inter1{
        fun subMethod2(){
            println("SublClass2의 subMethod2입니다.")
        }
    }

    //anyMethod 를 이용해 분개하여 사용해보기
    fun anyMethod(obj:Any){
        if(obj is SubClass1){
            obj.subMethod1()
        }else if(obj is SubClass2){
            obj.subMethod2()
        }else if(obj is Int){
            println("정수입니다.")
        }else if(obj is String){
            println("문자열입니다.")
        }

    }
    /*
        문자열의 인덱스
         - kotlin은 문자열을 배열 형태로 관리한다.
         - 문자열의 글자를 0부터 시작하는 인덱스 번호로 관리할 수 있어 Java 보다 편리하게
           사용할 수 있다.
         - 문자열은 불변형으로 가져다 사용하는 것만 가능하다.

        제공 메서드
         - substring : 지정된 범위의 문자열을 반환한다.
         - compareTo : 문자열을 비교한다. 같으면 0, 음수나 양수면 다른 문자열이다.
                       두 번째 값으로 true를 넣어주면 대소문자를 무시하고 비교한다.
         - spit : 문자열을 지정된 구분자를 이용해 잘라낸다.

        StringBuffer
         - 문자열은 불변형이므로 + 연산자를 통해 문자열을 합치면 문자열 객체가 계속 생성된다.
         - StringBuffer를 사용하면 관리하는 문자열을 직접 조작할 수 있다.
         - String은 지속적인 문자열 연산을 수행하면 메모리를 많이 사용하지만 원본이 유지된다.
         - StringBuffer는 메모리를 직접조작하기에 메모리를 절약할 수 있지만 원본을 유지할 순 없다.
     */


fun main() {
    val str1 = "안녕하세요"
    println("str1[0] : ${str1[0]}")
    println("str1[1] : ${str1[1]}")

    //새롭게 setting은 불가능 :
    // str[0] ='A'

    println("-------------substring--------------------")

    val str2 =str1.substring(1..3)
    println("str2 : $str2")
    println("---------------compareTo------------------")
    val str3 = "Hello World"
    val str4 = "Hello World"

    println(str3.compareTo(str4))
    println(str3.compareTo(str4,true))
    println(str3.contentEquals(str4)) // 동일하게 사용가능

    println("---------------split------------------")

    val str5 ="ab cd ef gh"
    val r1 = str5.split("")
    println("r1:$r1")

    println("----------------- +연산과 StringBuffer----------------------")

    val str6 = "abc"
    val str7 = str6+"가나다"
    println("str6 : $str6")
    println("str7 : $str7")

    val buffer1 = StringBuffer()
    buffer1.append("abc") //append 메소드를 쓰면 추가가능(자료형별로 오버로딩되어있음)
    buffer1.append(100)
    buffer1.append(40.44)
    buffer1.append("가나다+\n")
    buffer1.append("ni hao")

    println("buffer1 : $buffer1")
    
    //만약에 중간에 삽입을 할 경우 insert 사용
    buffer1.insert(3,"테스트")
    println("buffer1 : $buffer1")
    //delete도 가능
    buffer1.delete(3,6)
    println("buffer1 : $buffer1")

}
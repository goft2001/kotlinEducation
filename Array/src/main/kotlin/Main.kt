    /*
        배열(Array)
         - 연속된 기억공간을 확보하여 값 들을 저장하고 관리하는 자료 구조를 의미한다.
         - 코틀린에서는 객체를 만들어서 객체로 관리한다.(java와 동일하지만 많은 메서드 제공)
         - 배열의 인덱스는 0부터 시작
         - kotlin에서는 다양한 타입의 값을 배열에 담을 수 있으며 한 가지 타입으로 제한하여
           값을 담을 수도 있다. (java는 여러타입 자체가 불가능하다!)
         - 인덱스로 관리하기위해선 가급적 한가지 타입만 담는 것이 프로그래밍에 있어 편리하다.

        배열 생성하기
         - 배열을 생성할 때는 arrayOf(값들) 함수를 이용한다.
         - arrayOf는 다양한 값을 담을 수 있다.
         - 담을 값의 자료형을 제한하고 싶다면 자료형 + arrayOf 형태의 함수를 사용한다.
         - arrayOf<제너릭타입>도 가능하다.
         - arrayOf함수가 아닌 Array 클래스를 통해 직접 객체를 생성할 수도 있다.
            > Array(개수,{람다식})
        for 문 사용하기
         - for 문을 통해 배열이 가지고 있는 값의 수 만큼 반복하여 값을 사용할 수 있다.

         배열 요소의 개수
          - size 프로퍼티를 사용하면 배열이 관리하는 요소의 개수를 파악할 수있다.

         * 기본 제공 메서드들
              - plus : 요소를 추가하여 새로운 배열을 만들어낸다.
              - sliceArray : 지정된 범위의 요소를 추출해서 관리하는 배열을 만들어 반환한다.
              - first : 제일 앞의 값을 반환한다.
              - last : 제일 마지막 값을 반환한다.
              - indexOf : 지정된 값의 index 를 반환한다.
              - average : 평균 값을 반환한다.
              - count : 요소의 개수를 반환
              - contains : 지정된 값이 포함되어 있는지 반환한다.
              - sortedArray : 오름 차순 정렬된 배열을 반환한다.
              - sortedArrayDescending : 내림 차순 정렬된 배열을 반환한다.


     */

fun main() {
    //배열 생성
    val array1 =arrayOf(10,20,30,40,50)
    println("array : $array1") //반환값 : array : [Ljava.lang.Integer;@330bedb4
    println("arrary1 :  ${array1.contentToString()}") // 값을 출력하기

    // 다양한 타입의 배열 담아보기
    val array2 = arrayOf(100,11.11,"문자열",true)
    println("array2 : ${array2.contentToString()}")
    println("----------------각 타입의 배열------------------")
    // 각 타입의 배열 만들기
    val array3 = intArrayOf(10,20,30,40,50)
    val array4 = doubleArrayOf(11.11,22.22,33.33,44.44)
    val array5 = arrayOf<String>("문자열","문자열2","문자열3")
    println("array3 : ${array3.contentToString()}")
    println("array4 : ${array4.contentToString()}")
    println("array5 : ${array5.contentToString()}")

    println("-------------------Class----------------------")

    //Array 클래스를 통해 객체생성해보기(수식을 가지고 있는 배열)
    val array6 = Array(5,{0})
    println("array6 : ${array6.contentToString()}")

    val array7 = Array(5){it*2}
    println("array7 : ${array7.contentToString()}")

    println("-------------------For----------------------")

    //For 문을 이용해 반복해보기
    for(item in array1){
        println("array1: $item")
    }

    println("----------------배열을 가진 배열(다차원배열)---------------------")
    val array8 =arrayOf(arrayOf(10,20,30),arrayOf(11,21,31),arrayOf(12,22,32))
    println("array8 : $array8")
    println("array8 : ${array8.contentToString()}")
    println("array8 : ${array8.contentDeepToString()}")
    //다차원 배열의 경우 DeepToString을 사용해야함

    // 다차원 배열의 경우 중첩 for문을 사용하여 끄집어 낼수 있음
    for (item in array8){
        for(item2 in item){
            println("item2 : $item2")
        }
    }
    println("-------------배열 get-----------------")
    println("array1 0 : ${array1[0]}")
    println("array1 1 : ${array1[1]}")
    //get을 지원하기도 하지만 그냥 위처럼 사용하면된다
    println("array1 2 : ${array1.get(2)}")
    println("array1 3 : ${array1.get(3)}")
    println("--------------배열 set----------------")
    println("array1 : ${array1.contentToString()}")
    array1[0] = 100
    //set도 지원하지만 사용을 권장하지 않는다. 위처럼 하면된다.
    array1.set(1,200)
    println("array1 : ${array1.contentToString()}")
    println("----------------size------------------")
    println("array1 size : ${array1.size}")

    println("-----------------각종 메서드-----------------------")
    //plus
    println("array1 : ${array1.contentToString()}")
    val array10 = array1.plus(60)
    println("array10 : ${array10.contentToString()}")
    //slice
    val array11 = array1.sliceArray(1..3)
    println("array11 : ${array11.contentToString()}")
    //first,last,indexOf,average,sum...
    println("첫 번째 값 : ${array1.first()}")
    println("마지막 값 : ${array1.last()}")
    println("30의 위치 : ${array1.indexOf(30)}")
    println("평균 : ${array1.average()}")
    println("합 : ${array1.sum()}")
    println("개수 : ${array1.count()}") //size를 써도 되지만 count에는 다른 기능이 있음
    println("개수 : ${array1.size}")
    println("30을 포함하는가? : ${array1.contains(30)}")
    println("1000을 포함하는가 : ${array1.contains(1000)}")
    println("30을 포함하는가 ? : ${30 in array1}") // 이렇게 해도 가능
    println("최대 : ${array1.max()}")
    println("최초 : ${array1.min()}")

    //오름차순, 내림차순
    var array12 =arrayOf(5,1,3,6,10,4)
    val array13 = array12.sortedArray()
    val array14 = array12.sortedArrayDescending()
    println("array13 : ${array13.contentToString()}")
    println("array14 : ${array14.contentToString()}")




}


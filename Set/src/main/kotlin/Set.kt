    /*
        Set
         - 객체를 이름(Map)이나 순서(List) 등으로 관리하는 주체가 없는 컬렉션이다.
         - 중복된 객체를 담을 수 없다.
         - 순서에 관계 없고 중복된 객체를 담지 않을 경우 사용한다.
         - 무조건 반복문을 통해 다 가져와서 순회하는 정도로만 사용한다.
        Set 생성
         - setOf : 불변형 Set 생성
         - mutableSetof : 가변형 set을 생성한다.
        객체 가져오기
         - set은 관리 주체가 없으므로 객체를 직접 가져오는 메서드는 제공되지 않는다.
         - 반드시 for 문을 통해 객체를 순회해야 한다.

         set과 list의 상호 변환이 가능하다.
         list에 값을 막 담고 set으로 바꾸면 중복값이 없어지고 다시 list로 바꿀 수 있다.
     */

fun main() {
    //불변형 Set
    val set1 = setOf(1,5,10,1,5,10)
    println("set1 : $set1") //중복된 값을 넣었지만 중복값은 제외하고 가져온다.
    //가변형 Set
    val set2 = mutableSetOf<Int>()
    println("set2 : $set2")

    println("-----------------for----------------")

    // println("set1 0 : ${set1.get(0)}") //불가능
    // println("set1 0 : ${set1[1]}") //불가능

    for(item in set1){
        println("set1 :$item")
    }

    //기타메서드 size
    println("----------------size----------------")
    println("set1 size : ${set1.size}")

    println("----------------가변형----------------")

    println("set2 : $set2") // 비어있는 가변형 set

    set2.add(10)
    set2.add(20)
    set2.addAll(listOf(30,40,50,60))
    println("set2 : $set2")

    set2.add(20)
    println("set2 : $set2")

    set2.addAll(listOf(40,50,60,70  ))
    println("set2 :$set2") //중복된 값은 추가가 안됨

    set2.remove(30) // 인덱스값이 없기에 직접적인 값만 입력하여 제거한다.
    println("set2 :$set2")
}


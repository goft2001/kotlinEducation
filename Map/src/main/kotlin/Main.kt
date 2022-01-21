    /*
        Map
         - 객체를 이름을 통해 관리하는 컬렉션이다.
         - mapOf : 불변형 Map을 생성한다.
         - mutableMapOf : 가변형 Map를 생성한다.

        기타 메서드
         - size : 관리하는 요소의 개수
         - keys : key 를 배열로 반환
         - values : 객체들을 배열로 반환
         - containKey : 지정된 이름으로 저장된 객체가 있는지 확인한다.
         - containValue : 지정된 값으로 저장된 객체가 있는지 확인한다.

        가변형 Map의 메서드
         - put : 객체를 추가한다. 기존 이름과 동일할 경우 덮어씌운다.
         - remove : 주어진 이름으로 저장된 객체를 제거한다.

        Map 상호 변경
         - toMap : 불변형 Map을 생성해 반환한다.
         - toMutableMap : 가변형 Map를 생성해 반환한다.


     */
fun main() {
    val map1 = mapOf<String,Int >("key1" to 10,"key2" to 20,"key3" to 30)
    println("map1:$map1")

    //가변형 Map
    val map2 = mutableMapOf<String,Int>()
    println("map2 : $map2")
    //불변형 Map
    val map3 = mapOf<String,Any>("key1" to 10, "key2" to 20,"key3" to true)
    println("map3 : $map3")

    println("----------------------------------")

    println("map1 key1 : ${map1.get("key1")}") // get 사용
    println("map1 key1 : ${map1["key2"]}") // [] 사용

    println("----------------------------------")

    println("map1 size : ${map1.size}") //개수
    println("map1 keys : ${map1.keys}") //이름들
    println("map1 keys : ${map1.values}")//값

    println("map1 contains key1 : ${map1.containsKey("key1")}")
    println("map1 contains key100 : ${map1.containsKey("key100")}") // 없는 키

    println("map1 contains value 10 : ${map1.containsValue(10)}")
    println("map1 contains value 100 : ${map1.containsValue(100)}") //없는 값

    println("------------------가변형 Map 메서드 -----------------------")

    println("map2: $map2")

    map2.put("key1", 100) // 키, 값 추가
    println("map2 : $map2")

    map2["key2"] =200
    println("map2 : $map2")

    map2.put("key1", 1000)  //put
    map2["key2"] =2000      //대괄호 많이 사용
    println("map2 : $map2") //값이 덮어씌워짐

    map2.remove("key1")
    println("map2 : $map2")

    println("---------------------------------")

    val map100 = map1.toMutableMap()
    // 가변형으로 맵을 다시 추출해서 만듦
    map100["key100"] = 1000
    println("map100 : $map100")

    val map200 = map100.toMap()
    // 불변형 으로 다시 맵을 만듦
}




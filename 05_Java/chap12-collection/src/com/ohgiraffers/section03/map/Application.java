package com.ohgiraffers.section03.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        // Key - value
        // ID - 회원
        // Map은 이름표인 키랑 실제 값인 value를 쌍으로 저장함
        // 하나의 키는 하나의 값만 가짐

        /*
        * [Map]
        * - key와 value를 하나의 쌍(Entry)로 묶어서 관리한다.
        * - key와 중복 저장을 허용하지 않는다.
        * - value는 중복 저장을 허용한다.
        * - 저장 순서를 유지하지 않는다 (HashMap의 경우)
        * */

        Map<String, String> hmap = new HashMap<>(); // 쌍으로 저장하기 때문에 Key,와 value의 제너릭 모두 지정, Map이라는 상위타입사용

        hmap.put("one", "java");
        hmap.put("two", "jdbc");
        hmap.put("three", "mysql");
        hmap.put("two", "html");    // 키 값 중복해서 넣음
        hmap.put("four", "java");   // "java"라는 value값 중복해서 넣음

        System.out.println(hmap);   // {four=java, one=java, two=html, three=mysql}
        // 저장 순서 보장하지 않음.
        // value값 중복은 허용("java" 두번 저장)
        // 중복 허용하지 않음 - two-jdbc를 저장하고 two-html이 덮어씌워짐 => 최종적으로 two - html 만 남음

        System.out.println(hmap.get("one"));    // java // map에서의 get은 key를 전달해서 value값 찾음
        System.out.println(hmap.get("five"));   // 없는 key는 null 반환
        System.out.println(hmap.containsKey("two")); // key값이 있는지 없는지 boolean값으로 반환

        hmap.remove("four");
        System.out.println(hmap);

        // 키만 필요하다면
        // keySet() : 모든 키를 Set으로 받아, 키로 값을 다시 조회한다.
        System.out.println("keySet() 이용");
        Set<String> keys = hmap.keySet();   // hashmap은 Iterable을 구현하지 않아서 향상된 for문 바로 사용 불가능
        for (String key : keys) {
            String value = hmap.get(key);
            System.out.println(key + " = " + value);
        }

        // 벨류만 필요하다면
        // values() : 모든 값들만 Collection으로 반환받아 순회하는 방법 - key값은 모름
        // Collection - list, set, que의 상위 인터페이스
        Collection<String> values = hmap.values();
        for(String value : values) {
            System.out.println(value);
        }

        // 키와 벨류 다 필요하면
        // entrySet() : 모든 키-값 쌍(Entry)를 Set으로 반환한다.
        // Key와 value 모두 필요할 때는 key로 다시 조회하지 않는 이 방식이 가장 직접적이다.
        System.out.println("entrySet() 이용");
        Set<Map.Entry<String, String>> entrySet = hmap.entrySet();
        for(Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }



    }
}

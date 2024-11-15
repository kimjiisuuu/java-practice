package ex1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity19 {
    public static void main(String[] args) {
        System.out.println("[program Start!]");
        System.out.println("");
        /**
         * [요약 설명]
         * 1. List : 배열 형태로 [1, 2, 3, 4 ...] 형태로 데이터가 저장된다
         * 2. Map : {key=value} 형태로 데이터가 저장된다.
         * 3. 데이터 삽입 : List Map에 데이터를 삽입하기 위해서는 Map 형태 데이터를 생성한 후 List에 삽입해야 한다.
         * 4. 데이터 파싱 : List Map에 담긴 데이터를 >> for 문을 돌면서 List 데이터를 개별로 출력
         * >> Map 객체를 생성해  List 개별 데이터 삽입 및 파싱
         */


        // [List Map 객체 선언]
        List<Map<String, Object>> listMapInsert = new ArrayList<Map<String, Object>>();

        // [for 반복문을 순회하면서 데이터 삽입 실시]
        for (int i = 0; i <= 3; i++) {
            // [Map 객체 생성 및 데이터 생성]
            Map<String, Object> map = new HashMap<String, Object>();
            map.put(String.valueOf(i), i + "value");

            // [List Map 에 배열 데이터 삽입 실시]
            listMapInsert.add(map);
        }

        //[List Map 결과 출력 실시]
        System.out.println("List Map Insert : " + listMapInsert.toString());
        System.out.println("");





        //[List Map 파싱 수행 실시]
        List<Map<String, Object>> listMapSelect = listMapInsert; // [1번 방법]
        // List<Map<String, Object>> listMapSelect = new ArrayList<Map<String, Object>> (listMapInsert); // [2번 방법]
        System.out.println("List Map Select: " + listMapSelect.toString());
        System.out.println("");


        // [for 문을 돌면서 List 배열 데이터 (Map) 출력 실시]
        for (int i = 0; i < listMapSelect.size(); i++) {
            // [hashmap 객체 선언 및 데이터 삽입]
            HashMap<String, Object> hashMap = new HashMap<String ,Object>(listMapSelect.get(i));
            System.out.println("Map : " + hashMap.toString());

            //방법 [1] : hashmap key 확인 >> key 데이터로 value 출력]
            /*for (Map.Entry<String, Object> elem : hashMap.entrySet()){
                System.out.println("key : "+elem.getKey());
                System.out.println("value : " +elem.getValue());
                System.out.println("");
            }*/

            //
        }
























    }

}


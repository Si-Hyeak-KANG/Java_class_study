package collection;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("피카츄",85);
        map.put("파이리",17);
        map.put("꼬부기",49);
        map.put("피존투",63);

        System.out.println(map.size());
        System.out.println(map.get("파이리"));

        Set<String> keySet = map.keySet();

        Iterator<String> keyIterator = keySet.iterator();

        while(keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }

        map.remove("피존투");
        System.out.println();

        System.out.println(map.size());

        // 객체를 하나씩 처리
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        // Set 컬렉션 Map.Entry 얻기
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()) {
            Map.Entry<String,Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " : " + value);
        }

        // 객체 전체 삭제
        map.clear();
    }
}

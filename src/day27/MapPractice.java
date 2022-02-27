package day27;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
//    {
//        "name" : "Alex",
//        "age" : 28,
//        "phone": "123469875",
//        "isLoggedIn": true
//    }
    public static void main(String[] args) {
        Map<String, Object> userMap = new LinkedHashMap<>();
        userMap.put("name", "Alex");
        userMap.put("age", 28);
        userMap.put("phone", "12548654");
        userMap.put("isLoggedIn", true);

        System.out.println(userMap); // {name=Alex, age=28, phone=12548654, isLoggedIn=true}

        System.out.println(userMap.get("name")); // Alex

        System.out.println(userMap.containsKey("nameee")); // false

        userMap.forEach((key, value) ->{
            System.out.println(value); // all values one by one
        });

        System.out.println(userMap.keySet()); // [name, age, phone, isLoggedIn]
        System.out.println(userMap.values()); // [Alex, 28, 12548654, true]


    }
}

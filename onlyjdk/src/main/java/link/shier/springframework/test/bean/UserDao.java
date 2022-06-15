package link.shier.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-14 19:59
 **/
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小黄");
        hashMap.put("10002", "小绿");
        hashMap.put("10003", "小紫");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}

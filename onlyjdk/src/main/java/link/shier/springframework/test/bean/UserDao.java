package link.shier.springframework.test.bean;

import link.shier.springframework.beans.BeansException;
import link.shier.springframework.beans.factory.DisposableBean;
import link.shier.springframework.beans.factory.InitializingBean;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-14 19:59
 **/
public class UserDao implements InitializingBean, DisposableBean {

    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod(){
        System.out.println("UserDao执行：init-method");
        hashMap.put("10001", "小黄");
        hashMap.put("10002", "小红");
        hashMap.put("10003", "小兰");
    }

    public void destroyDataMethod(){
        System.out.println("UserDao执行：destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws BeansException {

    }
}

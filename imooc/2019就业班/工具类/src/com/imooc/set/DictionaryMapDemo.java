package com.imooc.set;

import java.util.*;

/**
 * @author hjy
 * @create 2020/11/6 2:26 下午
 */
public class DictionaryMapDemo {
    public static void main(String[] args) {
//        <String,String> 泛型
        Map<String, String> map = new HashMap<String, String>();
//        System.out.print("请输入三组单词对应的注释，并存放到HashMap中：");
//        Scanner info = new Scanner(System.in);
//        int i = 0;
//        while (i < 3) {
//            System.out.print("请输入key值（单词）：");
//            String key = info.next();
//            System.out.print("请输入value值（注释）：");
//            String value = info.next();
//            map.put(key, value);
//            i++;
//        }

        map.put("monkey", "猴子");
        map.put("cat", "猫");
        map.put("dog", "狗");
        // 打印输出value的值
        // 方式一：迭代器
        System.out.println("************************************");
        System.out.println("所有value的值");
//        Iterator<String> it = map.values().iterator(); // 获取value的迭代器
//        while(it.hasNext()){
//            System.out.print(it.next() + " ");
//        }

        // 方式二：foreach
        for (String s : map.values()) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("**************************************");

        // 打印输出key和value的值
        // 通过entrySet
        System.out.println("通过entrySet方法得到key-value");
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            System.out.print("key：" + entry.getKey() + " ");
            System.out.println("value：" + entry.getValue());
        }

        System.out.println("**************************************");

        // 通过单词找到注释并输出
        // 使用keySet方法
        Set<String> keys = map.keySet();
        Set<String> nothingness = new HashSet<String>();
        // 循环
        for (String key : keys) {
            if (key.equals("cat")) {
                System.out.println("找到的键值对为：" + key + "-" + map.get(key));
            } else {
                nothingness.add(key);
            }
        }
        for (String key : nothingness) {
            System.out.println("没有找到的键值对为：" + key + "-" + map.get(key));
        }
    }
}

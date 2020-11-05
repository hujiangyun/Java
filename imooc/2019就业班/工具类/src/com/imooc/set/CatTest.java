package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author hjy
 * @create 2020/11/5 3:39 下午
 */
public class CatTest {
    public static void main(String[] args) {
        // 添加和显示宠物猫
        Cat c1 = new Cat("花花", 12, "英国短毛猫");
        Cat c2 = new Cat("凡凡", 8, "中华田园猫");

        // 将宠物猫添加到集合中
//        Set set = new HashSet();
//        set.add(c1);
//        set.add(c2);

        // 显示宠物猫信息（通过迭代器）
//        Iterator it = set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//
//
//        // 再添加一个与花花属性一样的猫
//        Cat c3 = new Cat("花花", 12, "英国短毛猫");
//        set.add(c3);
//        System.out.println("这是新增之后的集：");
//        it = set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
////
//        System.out.println("******************");
//        // 重新插入一个新宠物猫
//        Cat c4 = new Cat("花花二代", 7, "英国短毛猫");
//        set.add(c4);
//        System.out.println("添加花花二代后的宠物信息");
//        it = set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        System.out.println("******************");
//        System.out.println("查找花花：");
        // 在集合中查找花花的信息并输出
        // 方式1：通过contains，已知整个对象
//        if(set.contains(c1)){
//            System.out.println("花花找到了");
//            System.out.println(c1);
//        }

        Set set = new HashSet();
        set.add(c1);
        set.add(c2);
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

//        Set set2 = new HashSet();
//        set2.add(c1);
//        set2.add(c2);

        // 显示宠物猫信息（通过迭代器）
        System.out.println("******************");
        // 重新插入一个新宠物猫
        Cat c4 = new Cat("花花二代", 7, "英国短毛猫");
        set.add(c4);

//        while (it.hasNext()){
//            System.out.println(c4);
//            System.out.println(it.next());
//        }

//        方式二：通过遍历对比，已知名称
        it = set.iterator();
        boolean flag = false;
        Cat c = null;
        while(it.hasNext()){
            c = (Cat)it.next();
            if(c.getName().equals("花花")){
                flag = true; // 找到了
                break;
            }
        }
        if(flag == true){
            System.out.println("花花找到了");
            System.out.println(c);
        } else {
            System.out.println("花花没找到");
        }

    }
}

package com.imooc.set;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author hjy
 * @create 2020/11/5 11:00 上午
 */
public class NoticeTestArrayList {
    public static void main(String[] args) {
        // 创建Notice对象，生成三条公告
        Notice n1 = new Notice(1, "欢迎来到慕课网!", "管理员", new Date());
        Notice n2 = new Notice(2, "同学们交作业了!", "老师", new Date());
        Notice n3 = new Notice(3, "考勤通知!", "老师", new Date());
        ArrayList noticeList = new ArrayList();

        // 添加公告
        noticeList.add(n1);
        noticeList.add(n2);
        noticeList.add(n3);


        // 显示公告
        System.out.println("公告的内容为：");
        for (Object o : noticeList) {
            // o返回的是一个Object类
            // 强制类型转换（Notice）o
            Notice instance = ((Notice) o);
            System.out.print(instance.getId() + ":" + instance.getTitle() + " ");
        }

        // 在第一条公告后面添加一条新的公告
        Notice n4 = new Notice(4, "在线编辑器可以使用了!", "管理员", new Date());
        noticeList.add(1,n4); // 在下标为1的位置添加一条数据
        System.out.println();

        for (Object o : noticeList) {
            Notice instance = ((Notice) o);
            System.out.print(instance.getId() + ":" + instance.getTitle() + " ");
        }

        // 删除 "同学们交作业了";
//        noticeList.remove(2); // 通过下标删除公告
        noticeList.remove(n2); // 通过对象删除公告

        System.out.println();
        System.out.println("删除公告后的内容为：");

        for (Object o : noticeList) {
            Notice instance = ((Notice) o);
            System.out.print(instance.getId() + ":" + instance.getTitle() + " ");
        }

        // 将第二条公告改为"JAVA在线编辑器可以使用了!"

        System.out.println();
        System.out.println("修改公告后的内容为：");
        n4.setTitle("JAVA在线编辑器可以使用了!");
        noticeList.set(1,n4); // 设置（修改）

        for (Object o : noticeList) {
            Notice instance = ((Notice) o);
            System.out.print(instance.getId() + ":" + instance.getTitle() + " ");
        }


    }
}

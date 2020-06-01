package com.bean;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author qby
 * @date 2020/6/1 15:21
 */
public class Templates {

    private static final String s = "";
    public static final String Sddd= "";
    public static final Customer a = new Customer();



    // 模版1 psvm
    public static void main(String[] args) {
        System.out.println("helloworld");
//        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Templates.main");
        System.out.println("true = " + true);

        System.out.println("helloworld");

        int num1 =1;
        System.out.println(num1);

        String[] s = new String[] {"1", "2", "3"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (String s1 : s) {
            System.out.println(s1);
        }

        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            System.out.println(s1);

        }

        ArrayList<Object> list = new ArrayList<>();
        list.add(111);
        list.add(2222);
        list.add(21313);
        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i = list.size() - 1; i >= 0; i--) {

        }

        if (list == null) {

        }
        if (list != null) {

        }

        if (list == null) {

        }
        if (list != null) {

        }

    }
}

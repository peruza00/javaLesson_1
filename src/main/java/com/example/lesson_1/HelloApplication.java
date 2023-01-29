package com.example.javalesson_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

class HelloApplication{

    public static void main(String[] args){
        String a = "4893520617";
        int b = a.indexOf("4");
        int c = a.indexOf("8");
        int d = a.indexOf("9");
        int e = a.indexOf("3");
        int f = a.indexOf("5");
        int g = a.indexOf("2");
        int h = a.indexOf("0");
        int i = a.indexOf("6");
        int j = a.indexOf("1");
        int k = a.indexOf("7");
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
        System.out.print(e);
        System.out.print(f);
        System.out.print(g);
        System.out.print(h);
        System.out.print(i);
        System.out.print(j);
        System.out.println(k);

        String l = "Kazakhstan";
        int m = l.indexOf("K");
        int n = l.indexOf("a");
        int o = l.indexOf("z");
        int p = l.indexOf('a', 2);
        int q = l.indexOf('k', 3);
        int r = l.indexOf("h");
        int s = l.indexOf("s");
        int t = l.indexOf("t");
        int w = l.lastIndexOf("a");
        int v = l.indexOf("n");
        System.out.print(m);
        System.out.print(n);
        System.out.print(o);
        System.out.print(p);
        System.out.print(q);
        System.out.print(r);
        System.out.print(s);
        System.out.print(t);
        System.out.print(w);
        System.out.println(v);
        //1
        System.out.println("4893520617" + " = " + a.length());
        System.out.println("Kazakhstan" + " = " + l.length());
        //2
        System.out.println(a.substring(0,1)+a.substring(3,5)+a.substring(7));
        //3
        String shykkan_san = "435617";
        int nom_1 = Integer.parseInt(shykkan_san);
        System.out.println(shykkan_san.substring(0,1));
        int nom_2 = Integer.parseInt(shykkan_san);
        System.out.println(shykkan_san.substring(1,2));
        int nom_3 = Integer.parseInt(shykkan_san);
        System.out.println(shykkan_san.substring(2,3));
        int nom_4 = Integer.parseInt(shykkan_san);
        System.out.println(shykkan_san.substring(3,4));
        int nom_5 = Integer.parseInt(shykkan_san);
        System.out.println(shykkan_san.substring(4,5));
        int nom_6 = Integer.parseInt(shykkan_san);
        System.out.println(shykkan_san.substring(5,6));

        //4
        //String shykkan_san = "435617"; String l = "Kazakhstan";
        System.out.println(shykkan_san.charAt(0)+"="+l.charAt(4));
        System.out.println(shykkan_san.charAt(1)+"="+l.charAt(3));
        System.out.println(shykkan_san.charAt(2)+"="+l.charAt(5));
        System.out.println(shykkan_san.charAt(3)+"="+l.charAt(6));
        System.out.println(shykkan_san.charAt(4)+"="+l.charAt(1));
        System.out.println(shykkan_san.charAt(5)+"="+l.charAt(7));

        //5
        System.out.println(l.charAt(1)+""+l.charAt(6)+""+l.charAt(4));

        //6
        System.out.println(l.substring(4,5)+""+l.substring(2,3)+""
                +a.substring(6,7).repeat(2)+""+a.substring(8,9)+""
                +l.substring(1,2).toUpperCase()+""+l.substring(6,7).toUpperCase()+""+l.substring(4,5).toUpperCase()+"-->"
                +l.substring(1,2).toUpperCase()+""+l.substring(6,7)+""+l.substring(4,5)+l.substring(5,6)+""+l.substring(1,2)+""+l.substring(7,8));
    }
}
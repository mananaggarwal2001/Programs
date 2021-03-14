package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(String.valueOf(new MyRegex().pattern)));
        }
    }
}

 class MyRegex {
    protected Pattern pattern;

    public MyRegex() {
        this.pattern = Pattern.compile("([0-1]{0,1}[0-9]{1,2}\\.|[2][0-4][0-9]\\.|[2][5][0-5]\\.)([0-1]{0,1}[0-9]{1,2}\\.|[2][0-4][0-9]\\.|[2][5][0-5]\\.)([0-1]{0,1}[0-9]{1,2}\\.|[2][0-4][0-9]\\.|[2][5][0-5]\\.)([0-1]{0,1}[0-9]{1,2}|[2][0-4][0-9]|[2][5][0-5])?");
    }

}

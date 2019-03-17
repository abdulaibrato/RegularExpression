package com.company;

public class Main {

    public static void main(String[] args) {
	String string = " I am a Sierra Leonean";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You are");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhhiiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(",","Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));
    }
}

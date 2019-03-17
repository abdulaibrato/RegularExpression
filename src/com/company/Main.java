package com.company;

public class Main {

    public static void main(String[] args) {
	String string = " I am a Sierra Leonean";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You are");
        System.out.println(yourString);
    }
}

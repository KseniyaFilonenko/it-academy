package com.itacademy.hometask8.Exc;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        printException(6);
    }
    public static void printException (int a) {
        if (a > 1) {
            try {
                FileReader file = new FileReader("abc");
                throw new Exc2("Exception");
            } catch (Exc2 | FileNotFoundException e) {
                System.out.println("FileNotFoundException");;
            } catch (Exception c) {
                System.out.println("404 Not Found");
            }
        }
    }
}
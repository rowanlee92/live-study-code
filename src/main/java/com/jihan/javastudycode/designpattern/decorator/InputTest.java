package com.jihan.javastudycode.designpattern.decorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try (LowerCaseInputStream in =
                     new LowerCaseInputStream(
                        new BufferedInputStream(
                            new FileInputStream("test.txt")))) {

            while((c = in.read()) != -1) {
                System.out.print((char)c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

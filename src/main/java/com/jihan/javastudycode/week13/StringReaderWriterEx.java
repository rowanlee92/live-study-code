package com.jihan.javastudycode.week13;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterEx {
    public static void main(String[] args) {

        String inputData = "ABCD";
        StringReader input = new StringReader(inputData);
        StringWriter output = new StringWriter();

        int data;

        try {
            while((data = input.read()) != -1) {
                output.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Input Data : " + inputData);
        System.out.println("Output Data : " + output.toString());
    }
}

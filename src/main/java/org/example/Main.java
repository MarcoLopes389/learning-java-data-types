package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tipos primitivos:");
        int integer = 30;
        double doubleNumber = 3.5;
        float floatNumber = 5.7F;
        short shortNumber = 10;
        long longNumber = 1;
        byte byteNumber = 35;
        char charValue = 'T';
        boolean booleanValue = true;

        Double otherDoubleNumber = 3.5;
        Float otherFloatNumber = 5.7F;
        Short otherShortNumber = 10;
        Long otherLongNumber = 1L;
        Byte otherByteNumber = 35;
        Character otherCharValue = 'T';
        Boolean otherBooleanValue = true;

        System.out.println("Tipos não primitivos:");
        String stringValue = "Um teste qualquer";
        int[] numbers = {1,2,3,4,5};
        ArrayList<String> names = new ArrayList<>();
        names.add("Lucas");
        names.add("João");
    }
}
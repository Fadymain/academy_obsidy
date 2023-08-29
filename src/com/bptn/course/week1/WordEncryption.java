package com.bptn.course.week1;

import java.util.Scanner;

public class WordEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        char swap;
        String key ="";
        int asciiValue;
        input = scanner.nextLine();
        char[] stringArray = input.toCharArray();
        for(int i = 0; i< stringArray.length; i++){
            asciiValue = stringArray[i];
            if(asciiValue >= 65 && asciiValue <= 89 ){
               swap = (char) (asciiValue + 1);
               stringArray[i] = swap;
            }else if (asciiValue == 90) {
                swap =(char)65;
                stringArray[i] = swap;
            } else if (asciiValue >= 97 && asciiValue <= 121 ) {
                swap = (char) (asciiValue + 1);
                stringArray[i] = swap;
            }  else if (asciiValue == 122) {
                swap =(char)97;
                stringArray[i] = swap;
            }
            key += stringArray[i];
        }

        System.out.println("Encrypted word: " + key);

        scanner.close();
    }
}
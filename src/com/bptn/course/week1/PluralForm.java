package com.bptn.course.week1;
import java.util.Scanner;

public class PluralForm {
    public static String pluralizer(String word){

    	char [] wordChar = word.toCharArray();
        int length = wordChar.length -1;
        String output ="";
        
        if(word.endsWith("fe")){
            for (int i = 0; i< length -1; i++){
                output += wordChar[i];
            }
            output += "ves";
        } else if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("oy") && !word.endsWith("ey") && !word.endsWith("uy") ) {
            for (int i = 0; i< length; i++){
                output += wordChar[i];
            }
            output += "ies";
        } else if (word.endsWith("sh") || word.endsWith("ch")) {
            for (int i = 0; i<= length; i++){
                output += wordChar[i];
            }
            output += "es";
        } else if (word.endsWith("us")) {
            for (int i = 0; i< length-1; i++){
                output += wordChar[i];
            }
            output += "i";
        }else {
            for (int i = 0; i<= length; i++){
                output += wordChar[i];
            }
            output += "s";
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:
        if(amt ==0 || amt > 1){
            word = pluralizer(word);
        }
        System.out.println(amt + " " + word);
        inp.close();
    }
}
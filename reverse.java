// java program to reverse a word

import java.io.*;
import java.util.Scanner;

class reverse {
    public static void main (String[] args) {

        String str= "Atharv", newstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Atharv"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            newstr= ch+newstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ newstr);
    }
}


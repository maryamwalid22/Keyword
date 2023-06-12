 
package com.mycompany.keyword;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author maryam
 */
public class KeyWord {
   static char[] word = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k','l', 'm',
    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
static char[] keyalpha =new char[word.length];
static Scanner in= new Scanner(System.in);

    public void word(String keyword){
   char[] keychar=keyword.toCharArray();
   
   int count=0;

        for (int i = 0; i < keychar.length; i++) {
            keyalpha[count++]=keychar[i];
                  }
        
        
        for (int i = 0; i < word.length; i++) {
            boolean x=false;
            for (int j = 0; j < keychar.length; j++) {
                if (word[i] == keyalpha[j]  ) {
                
                    x=true;
                }   }
            if (x == false) {
                
                keyalpha[count++]=word[i];
               
            }
        }
        System.out.println(Arrays.toString(word));
        System.out.println(Arrays.toString(keyalpha));
    }
 public static String enc(String Plain){
       char[] charPlain=Plain.toCharArray();
       String cipher="";
     //  String c="";
        for (int i = 0; i < charPlain.length; i++) {
            for (int j = 0; j < word.length; j++) {
                if (charPlain[i] == word[j]) {
                    cipher+=keyalpha[j];

                }
               // cipher=c;
            }
        }
        return cipher;
    }

    public static String dec(String cipher){
       char[] charcipher=cipher.toCharArray();
       String Plaintext="";
     //  String p="";
        for (int i = 0; i < charcipher.length; i++) {
            for (int j = 0; j < keyalpha.length; j++) {
                if (charcipher[i] == keyalpha[j]) {
                     
                    Plaintext+=word[j];
                }
                
              //  Plaintext=p;
            }
        } 
        return Plaintext;
    }

    public static void main(String[] args) {
         KeyWord k=new KeyWord();
         System.out.println("Enter the keyword");
         String keyword=in.nextLine();
         k.word(keyword);
         System.out.println("Enter The Plain Text ,please : ");
        String PlainText = in.nextLine();
        String cipher = enc(PlainText);
        System.out.println("The Chipher Text : " + enc(PlainText));
        dec(cipher);
        System.out.println("The Plain Text : " + dec(cipher));
        System.out.println(dec(cipher));
         
    }
}

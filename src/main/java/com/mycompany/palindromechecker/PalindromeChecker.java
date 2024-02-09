/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromechecker;

/**
 *
 * @author Ribaration
 * A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
 */
import java.util.*;
public class PalindromeChecker {

    public static void main(String[] args) {
        int a,num, comp;
      int sum = 0;
      Scanner scan = new Scanner(System.in);
     
      System.out.println("Please enter a number");
      num = scan.nextInt();
     
      comp = num;
      while(num !=0)
      {
         a = num % 10;
         sum = (sum*10)+ a;
         num = num/10;
      }
      if(comp == sum)
      {
          System.out.println("The number entered is a Palindrome");
      }
       else
      {
          System.out.println("The number entered is not a Palindrome");
    }
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/**
 *
 * @author Ratna
 */
public class Problem1 {
    
    public static String Problem1(String s) {
        if(s.isEmpty()) {
            return "";
        } else {
            if(s.length() > 1 && s.charAt(0) == s.charAt(1)) {
                return s.substring(0, 2) + Problem1(s.substring(2));
            }
            return "" + s.charAt(0) + s.charAt(0) + Problem1(s.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        System.out.println(Problem1(in.nextLine()));
    }

}

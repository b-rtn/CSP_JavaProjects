/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PairFruits;

import java.util.ArrayList;

/**
 *
 * @author Ratna
 */
public class PairFruits {
   
    public static void main(String[] args) {
        ArrayList<Pair<String, Integer>> fruits = new ArrayList<>();
        fruits.add(new PairImpl<String, Integer>("apple", 20));
        fruits.add(new PairImpl<String, Integer>("banana", 10));
        fruits.add(new PairImpl<String, Integer>("orang", 50));
  
  
        fruits.forEach((p) -> {
            System.out.println(p.getFirst() + ":" + p.getSecond());
        });
    }
}

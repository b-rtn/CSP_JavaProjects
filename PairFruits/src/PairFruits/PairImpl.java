/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PairFruits;

/**
 *
 * @author Ratna
 */
public class PairImpl<E, T> implements Pair<E, T>{
    
    private E first;
    private T second;
    
    public PairImpl(E first, T second) {
        this.first =first;
        this.second = second;
    }

    @Override
    public E getFirst() {
        return first;
    }

    @Override
    public T getSecond() {
        return second;
    }
    
    public String toString(){
    return first.toString() + ":" + second.toString();
    } 
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masasdani.genericcollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author xbadak
 */
public class lisdanlinklist {
    
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for(String s : list){
            System.out.println(s);
        }
        
        System.out.println(list.size());
        
        list.set(1, "ddd");
        for(String s : list){
            System.out.println(s);
        }
        
        list.remove("ddd");
        for(String s : list){
            System.out.println(s);
        }
        
        LinkedList<Integer> linkedList =new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        
        for(int p : linkedList){
            System.out.println(p);
        }
        
        linkedList.set(2, 100);
        
        for(int p : linkedList){
            System.out.println(p);
        }
        
        linkedList.remove(2);
        for(int p : linkedList){
            System.out.println(p);
        }
        
        linkedList.remove(new Integer(1));
        for(int p : linkedList){
            System.out.println(p);
        }
            
    }
}

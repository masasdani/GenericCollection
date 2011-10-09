/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masasdani.genericcollection;

import java.util.TreeSet;

/**
 *
 * @author xbadak
 */
public class CobaMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m=new Mahasiswa();
        m.setNim("a11.2008.04599");
        m.setNama("masas");
        Mahasiswa m2=new Mahasiswa();
        m2.setNim("a11.2008.04499");
        m2.setNama("budi");
        System.out.println(m.equals(m2));
        
        PembandingMhs pembandingMhs=new PembandingMhs();
        TreeSet<Mahasiswa> treeSet=new TreeSet<Mahasiswa>(pembandingMhs);
        treeSet.add(m);
        treeSet.add(m2);
        
        for(Mahasiswa mhs : treeSet){
            System.out.println("Nim :" + mhs.getNim());
            System.out.println("Nama : " + mhs.getNama());
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masasdani.genericcollection.crud;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xbadak
 */
public class MahasiswaController {

    List<Mahasiswa2> list=new ArrayList<Mahasiswa2>();

    public MahasiswaController(List<Mahasiswa2> list) {
        this.list=list;
    }
    
    
    public void add(Mahasiswa2 m){
        list.add(m);
    }
    
    public void edit(int i, Mahasiswa2 m){
        list.set(i, m);
    }
    
    public void remove(Mahasiswa2 m){
        list.remove(m);
    }
}

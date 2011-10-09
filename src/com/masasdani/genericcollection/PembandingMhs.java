/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masasdani.genericcollection;

import java.util.Comparator;

/**
 *
 * @author xbadak
 */
public class PembandingMhs implements Comparator<Mahasiswa> {

    @Override
    public int compare(Mahasiswa t, Mahasiswa t1) {
        return t.getNim().compareTo(t1.getNim());
    }
    
}

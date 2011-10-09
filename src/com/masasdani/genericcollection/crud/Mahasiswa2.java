/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masasdani.genericcollection.crud;

/**
 *
 * @author xbadak
 */
public class Mahasiswa2 {
    String nim;
    String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String toString() {
        return this.nim;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Mahasiswa2 m= (Mahasiswa2) obj;
        if(this.nim != m.nim && (this.nim == null || !this.nim.equals(m.nim))){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash=7;
        return 53 * hash + (this.nim!=null ? this.nim.hashCode() : 0); 
    }
    
    
}

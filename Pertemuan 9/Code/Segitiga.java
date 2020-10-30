/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.over.Tugas;

/**
 *
 * @author USER
 */
public class Segitiga {
    
    private int sudut;
    
    public int totalSudut(int sudutA){
        return this.sudut = 180 - sudutA;
    }
    
    public int totalSudut(int sudutA, int sudutB){
        return this.sudut = 180 - (sudutA + sudutB);
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    
    public double keliling(int sisiA, int sisiB){
        return Math.sqrt(sisiA) + Math.sqrt(sisiB); 
    }
}

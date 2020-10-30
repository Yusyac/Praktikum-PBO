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
public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        System.out.println("Sudut       : " + sgt.totalSudut(10));
        System.out.println("Sudut       : " + sgt.totalSudut(10, 10));
        System.out.println("Keliling    : " + sgt.keliling(10, 10, 10));
        System.out.println("Keliling    : " + sgt.keliling(10, 10));
    }
}

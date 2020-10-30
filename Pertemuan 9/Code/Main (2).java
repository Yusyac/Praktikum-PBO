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
public class Main {

    public static void main(String[] args) {

        System.out.println("Manusia");
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();
        System.out.println();

        System.out.println("Dosen");
        Manusia dsn = new Dosen();
        dsn.bernafas();
        dsn.makan();
        System.out.println();

        System.out.println("Mahasiswa");
        Manusia mhs = new Mahasiswa();
        mhs.bernafas();
        mhs.makan();

    }
}

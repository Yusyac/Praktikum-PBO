/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.videogame;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner rose = new Scanner(System.in);
        RumusLingkaran rms = new RumusLingkaran();
        
        System.out.println("Hitung Luas Dan Keliling Lingkaran");
        System.out.print("Masukkan Panjang Jari jari : ");
        rms.r = rose.nextDouble();
        rms.luasLingkaran();
        rms.kelilingLingkaran();
        System.out.println("Luas Lingkaran : " + rms.luasLingkaran());
        System.out.println("Keliling Lingkaran : " + rms.kelilingLingkaran());
    }
}

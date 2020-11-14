/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interface.Tugas;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Singa singa = new Singa("Cinga", 4, "Roar Roar", "Coklat");
        Keledai keledai = new Keledai("Keledai", 4, "Hehe", "Abu Abu");
        Gorilla gorilla = new Gorilla("Gorilla", 4, "Haum Haum", "Black Sweet");
        
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        System.out.println();
        gorilla.displayBinatang();
        gorilla.displayMakan();
        gorilla.displayData();
        System.out.println();
        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
    }
}

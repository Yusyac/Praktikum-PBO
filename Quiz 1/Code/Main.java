/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapitulation.Model;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Manusia p = new Manusia(25, "Jumiyanto", true);
        Manusia w = new Manusia(22, "Juminten", true);
        Pria p1 = new Pria();
        p1.setNama("Jumiyanto");
        p1.setUmur(25);
        p1.setDewasa(true);
        Wanita w1 = new Wanita();
        w1.setNama("Juminten");
        w1.setUmur(22);
        w1.setDewasa(true);
        
        p1.info();
        w1.info();
    }
}

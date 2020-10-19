/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.UTS;

/**
 *
 * @author USER
 */
public class DemoQuiz {
    public static void main(String[] args) {
        SepedaMotor honda = new SepedaMotor("Vario", "Honda");
        System.out.println(honda.getMerkMotor());
        System.out.println(honda.getMerekMesin());
        honda.tambahKecepatanMotor();
        honda.tambahKecepatanMotor();
        honda.kurangKecepatanMotor();
        
        SepedaMotor yamaha = new SepedaMotor("NMax", "Yamaha");
        System.out.println(yamaha.getMerkMotor());
        System.out.println(yamaha.getMerekMesin());
        yamaha.tambahKecepatanMotor();
        yamaha.tambahKecepatanMotor();
        yamaha.kurangKecepatanMotor();
    }
}

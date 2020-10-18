/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Inheritance.Tugas;

/**
 *
 * @author USER
 */

public class MainInheritance {
    
    public static void main(String[] args) {
        
        Windows ws = new Windows("Lenovo Yoga 900 13", (int) 2.50, 8, "Intel Core i5", "Lithium Polymer", "TouchScreen");
        ws.tampilWindows();
        
        Mac mc = new Mac("MacBook Pro 13.3 MXK32ID", (int) 1.4, 8, "Intel Core i5", "Lithium Polymer", "Finger Scanner TouchID");
        mc.tampilMac();
        
        PC pc = new PC("ASRock Z490 Extreme4", (int) 3.60, 32, "Intel Core i9 10850k", 27);
        pc.tampilPc();
    }
}

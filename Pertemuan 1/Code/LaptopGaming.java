/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemograman.berbasis.objek;

/**
 *
 * @author user
 */
public class LaptopGaming extends Laptop{
    
     private String Vga;
     
     public void VgaLaptop (String newValue){
         Vga = newValue;
     }
     
     public void cetakInfo(){
         
         super.cetakInfo();
         System.out.println("VGA : " + Vga);
     }
}

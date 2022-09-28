/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Games;

public class Minigame {
    public static void main(String[] args) {
        Pemain newbie = new Pemain();
         newbie.Nama = "Super Dragon Destroyer and Killer";
         newbie.Kecepatan = 40.3;
         newbie.Kesehatan = 0;
         newbie.Vitalitas = 75;
         
         newbie.Berlari();
         if(newbie.mati()) {
             System.out.println("Permainan Selesai");
         }
    }
}

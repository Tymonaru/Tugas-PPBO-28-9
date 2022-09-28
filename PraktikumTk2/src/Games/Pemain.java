/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Games;

public class Pemain {
    public String Nama;
    public double Kecepatan;
    public int Kesehatan;
    public int Vitalitas;
    
    public void Berlari() {
        System.out.println("Nama Pemain    :"+Nama +" sedang berlari ");
        System.out.println("Kecepatan Pemain:"+Kecepatan);
        System.out.println("Vitalitas       :"+Vitalitas);
    }
        
        public boolean mati(){
            if(Kesehatan <=0) {
                return true;
            } else {
                System.out.println(Nama+" Masih melanjutkan permainan ");
            }
            return false;
        } 
}

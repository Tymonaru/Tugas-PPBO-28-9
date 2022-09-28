/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

public class Dealer {
    public static void main(String[] args) {
        Motor honda = new Motor();
        honda.tipeMesin = "4 Langkah, 4-Valve, eSP+";
        honda.merek = "Vario 160";
        honda.sistemPengapian = "PGM-FI (Programmed Fuel Injection)";
        honda.volumeLangkah = 156.9;
        honda.dayaMaksimum = 11.3;
        honda.torsiMaksimum = 13.8;
        System.out.println("=========================");
        System.out.println("DEALER MOTOR TEKNOLOGI INFORMASI");
        System.out.println("================================");
        System.out.println("Tipe Mesin      :"+honda.tipeMesin);
        System.out.println("Merek           :"+honda.merek);
        System.out.println("Sist. Pengapian :"+honda.sistemPengapian);
        System.out.println("Akselerasi      :"+honda.akselerasi()+(" Rpm "));
        System.out.println("Top Speed       :"+honda.topSpeed()+(" Km/Jam "));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

public class Motor {
    public String tipeMesin;
    public String merek;
    public String sistemPengapian;
    public double volumeLangkah;
    public double dayaMaksimum;
    public double torsiMaksimum;
    
    public double akselerasi(){
        double aksel;
        aksel = (dayaMaksimum + torsiMaksimum)*1000;
        return aksel;
    }
    
    public double topSpeed(){
        double topS;
        topS = volumeLangkah + dayaMaksimum + torsiMaksimum;
        return topS;
    }
}

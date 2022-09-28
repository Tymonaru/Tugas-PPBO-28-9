/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan04.komposisi;

/**
 *
 * @author HP
 */
public class Kecamatan {
    private String nama;
    private double luasWilayah;
    
    public Kecamatan(String nm, double ls){
        this.nama = nm;
        this.luasWilayah = ls;
    }
    
    public double getLuasWilayah(){
        return luasWilayah;
    }
    
    public String getNama(){
        return nama;
    }
}

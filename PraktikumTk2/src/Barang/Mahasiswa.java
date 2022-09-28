/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barang;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String email;
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "2131740025";
        mhs.nama = "Setiawan Primadillah N";
        mhs.email = "vianbmx10@gmail.com";
        System.out.println(mhs.biodata());
    }
    
    public String biodata(){
        String bio;
        bio =   "Nim mahasiswa    :"+this.nim+"\n"+
                "Nama mahasiswa   :"+this.nama+"\n"+
                "Email mahasiswa  :"+this.email+"\n";
        return bio;
    }
}

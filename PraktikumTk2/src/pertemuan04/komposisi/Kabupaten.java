/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan04.komposisi;
import java.util.*;
public class Kabupaten {
    private String namaKabupaten;
    private List<Kecamatan> kecamatan;
    
    public Kabupaten(String nm, List<Kecamatan> kc){
        this.namaKabupaten = nm;
        this.kecamatan = kc;
    }
    
    public static void main(String[] args) {
        Kecamatan kcmt1 = new Kecamatan("Jatiroto", 1000);
        Kecamatan kcmt2 = new Kecamatan("Candipuro", 2000);
        Kecamatan kcmt3 = new Kecamatan("Klakah", 700);
        
        List<Kecamatan> kc = new ArrayList<Kecamatan>();
        kc.add(kcmt1);
        kc.add(kcmt2);
        kc.add(kcmt3);
        
        Kabupaten kbpt = new Kabupaten("Lumajang", kc);
        System.out.println("Kab. "+kbpt.namaKabupaten+" :");
        
        List<Kecamatan> dataKec = kbpt.getKecamatan();
        
        for(Kecamatan kec : dataKec){
            System.out.println("Nama Kecamatan : "+kec.getNama()+", Luas Wilayah :"+kec.getLuasWilayah());
        }
    }

    public List<Kecamatan> getKecamatan() {
        return kecamatan;
    }
    
    
}

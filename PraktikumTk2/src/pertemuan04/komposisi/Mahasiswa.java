/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan04.komposisi;

/**
 *
 * @author HP
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private Kelas kelas;
    private Jurusan jurusan;
    
    public Mahasiswa(String nama, Jurusan jrs, Kelas kls){
        this.nama = nama;
        this.jurusan = jrs;
        this.kelas = kls;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String jrs(Jurusan js){
        String a;
        a = js.getNamaJurusan();
        return a;
    }
    
    public String kls(Kelas kl){
        String a;
        a = kl.getNamaKelas();
        return a;
    }
    
    public static void main(String[] args) {
        Jurusan jrs = new Jurusan();
        jrs.setNamaJurusan("Teknologi Informasi");
        
        Kelas kls = new Kelas();
        kls.setNamaKelas("2A");
        
        Mahasiswa mhs = new Mahasiswa("Setiawan", jrs, kls);
        
        System.out.println("Nama Mahasiswa  : "+mhs.nama);
        System.out.println("Jurusan         : "+jrs.getNamaJurusan());
        System.out.println("Kelas           : "+kls.getNamaKelas());
    }
}

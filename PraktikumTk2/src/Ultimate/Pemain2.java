/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ultimate;


public class Pemain2 {
    public String nama;
    public int basicPower;
    private Senjata sjt;
    
    public double totalPower(Senjata s){
        this.sjt = s;
        double totalPower;
        totalPower = basicPower + s.dayaHancur();
        
        return totalPower;
    }
}

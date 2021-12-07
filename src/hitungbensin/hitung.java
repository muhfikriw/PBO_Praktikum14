/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbensin;

/**
 *
 * @author Asus
 */
public class hitung {
    //attribut
    private double bensin, time;

    // method
    public void bensin
        (double jarak, double jarakperliter){
        this.bensin = jarak / jarakperliter;
    }
    public void time
        (double jarak, double kecepatan){
        this.time = jarak / kecepatan;    
    }
    
    //output hitung
    public void outputhitung(){
        System.out.println("Jumlah Minimal Bensin : " + this.bensin + " Liter");
        System.out.println("Lama Waktu Perjalanan : " + this.time + " Jam");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbensin;
import hitungbensin.Input;
import packcar.MPV;
import packcar.Sedan;
import packcar.SUV;
/**
 *
 * @author Asus
 */
public class MainClass {
    // main method
    public static void main(String[] args){
        //attribute
        double  jarak = 0,kecepatan = 0,jarakperliter = 0;
        
        // input
        Input di = new Input();
        di.inputJenis();
        di.inputKota();
        di.inputKecepatan();

        // pengecekan jenis mobil
        switch(di.jenis.toLowerCase()){
            case "sedan":
                Sedan s = new Sedan();
                s.setPerjalanan(di.perjalanan.toLowerCase() );
                s.setKecepatan(di.kecepatan );

                jarak = s.getJarakPerjalanan();
                jarakperliter = s.getJarakperliter();
                kecepatan = s.getKecepatan(); 
                System.out.println();
                break;
                
            case "suv" :
                SUV suv = new SUV();
                suv.setPerjalanan(di.perjalanan.toLowerCase() );
                suv.setKecepatan(di.kecepatan );
                
                jarak = suv.getJarakPerjalanan();
                jarakperliter = suv.getJarakperliter();
                kecepatan = suv.getKecepatan();
                break;
                
            case "mpv" : 
                MPV mpv = new MPV();
                mpv.setPerjalanan(di.perjalanan.toLowerCase() );
                mpv.setKecepatan(di.kecepatan );

                jarak = mpv.getJarakPerjalanan();
                jarakperliter = mpv.getJarakperliter();
                kecepatan = mpv.getKecepatan();
                break;
                
            default: 
                System.out.println("JENIS MOBIL TIDAK ADA");
                System.exit(0);
        }
        
        // hitung bensin dan waktu perjalanan
        hitung hit = new hitung();
        hit.bensin(jarak, jarakperliter);
        hit.time(jarak, kecepatan);
        
        // output
        System.out.println("\n");
        System.out.println("---- OUTPUT ----");
        System.out.println("Jenis Mobil           : " + di.jenis);
        System.out.println("Perjalanan            : " + di.perjalanan);
        hit.outputhitung();
    }
}

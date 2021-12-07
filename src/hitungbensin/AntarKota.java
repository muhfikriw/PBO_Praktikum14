/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbensin;
import java.util.HashMap;
/**
 *
 * @author Asus
 */
public class AntarKota {
    // constructor
    public AntarKota(){
        this.antarkota = new HashMap<String, Integer>();
        this.antarkota.put("a", 108);
        this.antarkota.put("b", 540);
        this.antarkota.put("c", 663);
        this.antarkota.put("d", 534);
        this.antarkota.put("e", 540);
        this.antarkota.put("f", 430);
    }
    private HashMap<String, Integer> antarkota;
    
    //get
    public double getAntarKota(String perjalanan){
        return this.antarkota.get(perjalanan);
    }
}

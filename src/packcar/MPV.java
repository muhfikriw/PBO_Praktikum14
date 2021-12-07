/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packcar;
import hitungbensin.AntarKota;
import packcar.abstrak;

/**
 *
 * @author Asus
 */
public class MPV extends abstrak{
    // construct
    public MPV(){
        super.setJenis("MPV");
        super.setJarakperliter(10);
    }
    
    
    // method 
    public void setPerjalanan(String perjalanan){
        this.perjalanan = perjalanan;
    }
    
    @Override
    public double getJarakPerjalanan(){
        AntarKota a = new AntarKota();
        double jarak = a.getAntarKota(this.perjalanan);
        return jarak;
    }
}

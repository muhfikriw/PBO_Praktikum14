/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packcar;

/**
 *
 * @author Asus
 */
public abstract class abstrak {  
    // attribute
    private String nama, jenis;
    protected String perjalanan;
    private double kecepatan, jarakperliter;

    // abstract method
    public abstract double getJarakPerjalanan();
    
    // method
    //set
    public void setJenis(String nama){
        this.jenis = jenis;
    }
    public void setKecepatan(double v){
        this.kecepatan = v;
    }
    public void setJarakperliter(double s){
        this.jarakperliter = s;
    }
    
    //get
    public String getJenis(){
        return this.jenis;
    }
    public double getKecepatan(){
        return this.kecepatan;
    }
    public double getJarakperliter(){
        return this.jarakperliter;
    }
}

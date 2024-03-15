/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KOMPUTER JARKOM 22
 */
public class PersegiPanjang extends BangunDatar{
    
    public PersegiPanjang(int p, int l){
        super(p, l);
    }
    
    int hitungLuas (){
        int p = super.getS();
        int l = super.getS();
        return p * l;
    }
    
    int hitungKeliling(){
        int p = super.getS();
        int l = super.getS();
        return 2*(p+1);
    }
    
    public String toString(){
        return "Luas Bujur sangkar:" + hitungLuas() + "\n" +
            "Keliling Bujur Sangkar:" + hitungKeliling();
    }
}

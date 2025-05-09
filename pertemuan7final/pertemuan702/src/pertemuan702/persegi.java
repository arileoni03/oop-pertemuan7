/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan702;

/**
 *
 * @author arile
 * TGL 9 MAY 2025
 */
public class persegi extends bangunruang {
    private int panjang, lebar;
    
    public void setpanjang(int pj){
        this.panjang = pj;
    }
    
    public void setlebar(int lb){
        this.lebar = lb;
    }
    
    @Override
    public void hitungluas(){
        this.luas = this.panjang * this.lebar;
        
        System.out.printf("Hitung luas persegi panjang\n");
        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.printf("Luas = panjang X lebar\n");
        System.out.printf("     = %d X %d\n", this.panjang, this.lebar);
        System.out.printf("     = %.2f\n", this.luas);
        
    }
}

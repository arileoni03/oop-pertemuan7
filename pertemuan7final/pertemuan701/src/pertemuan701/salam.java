/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan701;

/**
 *
 * @author arile
 * TGL 9 MAY 2025
 */
public class salam {
    private String tx = "Selamat datang di indomaret, selamat belanja";
    
    public void tulispesan(){
        System.out.println(this.tx);
    }
    
    public void tulispesan(String txt1){
        System.out.println(txt1);
    }
    
    public void tulispesan(String tes, String txt2){
        System.out.println("Pesan tes isinya adalah " +tes+ " pesan txt2 isinya adalah " +txt2 );
    }
}

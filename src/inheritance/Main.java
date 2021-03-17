/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author MOKLET-1
 */
public class Main {

    
    public static void main(String[] args) {
        
        //Membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        //Membuat objek persegi panjang dan mengisi nilai
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.panjang = 5;
        persegipanjang.lebar = 8;
        
        //Membuat objek segitiga dan mengisi nilai
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;
        
        //Memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class Overloading {

    /*Selamat Pagi bu*/
    public void persegipanjang() {
        int alas = 15, tinggi = 5;
        System.out.println("Luas Persegi Panjang = " + alas * tinggi);

    }

    public void persegipanjang1(int a, int b) {
        System.out.println("Luas Persegi 1 = " + a * b);

    }
    public static void main(String [] args){
        Overloading PersegiPanjang2;
        PersegiPanjang2 = new Overloading();
        PersegiPanjang2.persegipanjang();
        PersegiPanjang2.persegipanjang1(45, 18);
    }
}

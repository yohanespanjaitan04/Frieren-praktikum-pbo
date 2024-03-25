/*File : PersegiPanjang.java
 *Nama : Yohanes Panjaitan
  NIM : 24060122140108
 */
package direktori_anda.org.bangundatar;

import direktori_anda.org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return this.panjang * this.lebar;
    }

    public void printInfo(){
        System.out.println("Persegi Panjang");
        System.out.println("Panjang Persegi panjang: " + this.panjang);
        System.out.println("Lebar Persegi panjang: " + this.lebar);
        System.out.println("Jumlah Sisi Persegi panjang: " + this.jumlahSisi);
        System.out.println("Luas Persegi panjang: " + this.hitungLuas());
        System.out.println("Bangun persegi panjang bersisi " + this.getJumlahSisi());
    }
}
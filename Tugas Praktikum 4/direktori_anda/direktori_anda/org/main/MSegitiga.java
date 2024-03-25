/*File : MSegitiga.java
 *Nama : Yohanes Panjaitan
  NIM : 24060122140108
 */
package direktori_anda.org.main;

public class MSegitiga {
    public static void main(String[] args) {
        // alas dan tinggi segitiga
        double tinggi = 5;
        double alas = 3;
        // Menghitung luas dan keliling
        double luas = (alas * tinggi) / 2;
        double keliling = alas + Math.sqrt(Math.pow(alas/2, 2) + Math.pow(tinggi, 2)) * 2;

        System.out.println("Alas segitiga: " + alas);
        System.out.println("Tinggi segitiga: " + tinggi);
        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);

    }
}
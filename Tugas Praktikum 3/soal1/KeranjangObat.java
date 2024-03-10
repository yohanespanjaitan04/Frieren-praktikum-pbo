/* File : KeranjangObat.java */
/* Deskripsi : Program  asersi */
/* Nama/Nim : Yohanes Panjaitan /24060122140108 */

public class KeranjangObat {
    private String[] keranjang;
    private int kapasitas;
    private int jumlahObat;

    public KeranjangObat() {
        keranjang = new String[5];
        kapasitas = 5;
        jumlahObat = 0;
    }

    public void tambahObat(String obat) {
        // Tambahkan obat ke dalam keranjang jika masih ada kapasitas
        if (jumlahObat < kapasitas) {
            keranjang[jumlahObat] = obat;
            jumlahObat++;
        } else {
            throw new AssertionError("Keranjang sudah penuh!");
        }
    }

    public void tampilkanObat() {
        for (int i = 0; i < jumlahObat; i++) {
            System.out.println(keranjang[i]);
        }
    }
}

/* File : Pembeli.java */
/* Deskripsi : Program untuk menunjukkan Exception */
/* Nama/Nim : Yohanes Panjaitan /24060122140108 */

public class Pembeli {
    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;

    public Pembeli(String nama) {
        this.nama = nama;
        keranjangObat = new Obat[5];
        jumlahObat = 0;
    }

    public String getNama() {
        return nama;
    }

    public Obat[] getKeranjangObat() {
        return keranjangObat;
    }

    public int getJumlahObat() {
        return jumlahObat;
    }

    public void beliObat(Obat obat) {
        try {
            if (jumlahObat >= keranjangObat.length) {
                throw new BatasObatPenuhException("Keranjang obat sudah penuh.");
            }
            if (!obat.isTersedia()) {
                throw new ObatTidakTersediaException("Obat " + obat.getNama() + " tidak tersedia.");
            }
            obat.setTersedia(false);
            keranjangObat[jumlahObat] = obat;
            jumlahObat++;
        } catch (BatasObatPenuhException e) {
            System.out.println(e.getMessage());
        } catch (ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

/* File : Main.java */
/* Deskripsi : Program Exception */
/* Nama/Nim : Yohanes Panjaitan /24060122140108 */

public class Main {
    public static void main(String[] args) throws BatasObatPenuhException, ObatTidakTersediaException {
        Pembeli pembeli = new Pembeli("Yohanes");
        Obat obat1 = new Obat("Etanercept");
        Obat obat2 = new Obat("Atorvastatin");
        Obat obat3 = new Obat("Rituximab");
        Obat obat4 = new Obat("Paracetamol");
        Obat obat5 = new Obat("Ibuprofen");


        pembeli.beliObat(obat1);
        pembeli.beliObat(obat2);
        pembeli.beliObat(obat3);
        pembeli.beliObat(obat4);
        pembeli.beliObat(obat5);
        System.out.println("Pembelian obat berhasil.");
    }
}


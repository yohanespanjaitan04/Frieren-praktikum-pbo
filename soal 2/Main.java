public class Main {
    public static void main(String[] args) {
        // Membuat objek penjual
        Penjual penjual1 = new Penjual("Budi", "Jl. Merdeka No. 123", "081234567890");

        // Membuat objek produk
        Produk produk1 = new Produk("Laptop", 15000000, 10, "Laptop gaming terbaru", penjual1);

        // Mencetak informasi produk
        System.out.println("Nama Produk: " + produk1.getNama());
        System.out.println("Harga: " + produk1.getHarga());
        System.out.println("Stok: " + produk1.getStok());
        System.out.println("Deskripsi: " + produk1.getDeskripsi());

        // Mencetak informasi penjual dari produk
        System.out.println("\nInformasi Penjual:");
        System.out.println("Nama: " + produk1.getPenjual().getNama());
        System.out.println("Alamat: " + produk1.getPenjual().getAlamat());
        System.out.println("No Telepon: " + produk1.getPenjual().getNoTelepon());
    }
}

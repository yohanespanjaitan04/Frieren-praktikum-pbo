// Yohanes Panjaitan
// 24060122140108

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Membuat HashMap untuk menyimpan NIM dan nama mahasiswa
        Map<String, String> mahasiswa = new HashMap<>();
        
        // Menambahkan beberapa entri ke dalam HashMap
        mahasiswa.put("123456", "Ahmad");
        mahasiswa.put("234567", "Budi");
        mahasiswa.put("345678", "Citra");
        mahasiswa.put("456789", "Dewi");
        mahasiswa.put("567890", "Eko");
        
        // Menggunakan ekspresi lambda untuk menampilkan key dan value dari HashMap
        mahasiswa.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}

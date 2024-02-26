public class MTitik {
    public static void main(String[] args) {
        Titik titik = new Titik(9, 16);
        System.out.println("Koordinat awal:");
        System.out.println("X: " + titik.getX());
        System.out.println("Y: " + titik.getY());
        Titik titikRefleksiX = titik.refleksiSumbuX();
        System.out.println("\nSetelah refleksi sumbu X:");
        System.out.println("X: " + titikRefleksiX.getX());
        System.out.println("Y: " + titikRefleksiX.getY());
        Titik titikRefleksiY = titik.refleksiSumbuY();
        System.out.println("\nSetelah refleksi sumbu Y:");
        System.out.println("X: " + titikRefleksiY.getX());
        System.out.println("Y: " + titikRefleksiY.getY());
    }
}

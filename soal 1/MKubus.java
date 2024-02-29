public class MKubus {
    public static void main(String[] args) {
        Kubus kubus1 = new Kubus(3.0);

        double volume = kubus1.hitungVolume();
        System.out.println("Volume kubus1: " + volume);

        double luasPermukaan = kubus1.hitungLuasPermukaan();
        System.out.println("Luas permukaan kubus1: " + luasPermukaan);
    }
}

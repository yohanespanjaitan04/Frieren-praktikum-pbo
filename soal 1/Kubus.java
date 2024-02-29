public class Kubus {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(this.sisi, 3);
    }

    public double hitungLuasPermukaan() {
        return 6 * Math.pow(this.sisi, 2);
    }
}

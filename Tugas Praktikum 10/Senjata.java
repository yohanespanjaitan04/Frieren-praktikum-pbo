/*File : Senjata.java
 *Nama : Yohanes Panjaitan
  NIM : 24060122140108
 */

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void menembak() {
        if (getPeluru() > 0) {
            System.out.println(getBunyi());
            peluru--;
            System.out.println("Sisa Peluru: " + getPeluru());
        } else {
            System.out.println("Tidak ada peluru!");
        }
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void isiUlangPeluru(int peluru) {
        this.peluru = peluru;
    }
}

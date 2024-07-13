public class Lemari {
    // Atribut
    private String warna;
    private int jumlahPintu;
    private boolean terbuka;

    // Constructor
    public Lemari(String warna, int jumlahPintu) {
        this.warna = warna;
        this.jumlahPintu = jumlahPintu;
        this.terbuka = false; // Saat awal, lemari tertutup
    }

    // Method untuk membuka lemari
    public void bukaLemari() {
        if (!terbuka) {
            System.out.println("Lemari dibuka.");
            terbuka = true;
        } else {
            System.out.println("Lemari sudah terbuka.");
        }
    }

    // Method untuk menutup lemari
    public void tutupLemari() {
        if (terbuka) {
            System.out.println("Lemari ditutup.");
            terbuka = false;
        } else {
            System.out.println("Lemari sudah tertutup.");
        }
    }

    // Getter untuk warna lemari
    public String getWarna() {
        return warna;
    }

    // Getter untuk jumlah pintu
    public int getJumlahPintu() {
        return jumlahPintu;
    }

    // Getter untuk status lemari (terbuka atau tidak)
    public boolean isTerbuka() {
        return terbuka;
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        // Membuat objek lemari
        Lemari lemari = new Lemari("Putih", 2);

        // Mengakses dan menggunakan method dari objek lemari
        System.out.println("Warna lemari: " + lemari.getWarna());
        System.out.println("Jumlah pintu: " + lemari.getJumlahPintu());

        lemari.bukaLemari();
        lemari.bukaLemari(); // Mencoba membuka lemari yang sudah terbuka

        lemari.tutupLemari();
        lemari.tutupLemari(); // Mencoba menutup lemari yang sudah tertutup
    }
}
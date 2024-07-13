public class Komik extends Buku {
    private int volume; // Atribut tambahan untuk Komik

    // Constructor Komik dengan parameter
    public Komik(String judul, String pengarang, int tahunTerbit, int volume, double harga) {
        super(judul, pengarang, tahunTerbit, harga); // Memanggil constructor superclass
        this.volume = volume;
    }

    // Getter untuk volume
    public int getVolume() {
        return volume;
    }

    // Overloading method naikkanHarga tanpa parameter (10%)
    public void naikkanHarga() {
        setHarga(getHarga() * 1.1); // Menaikkan harga buku sebesar 10%
    }

    // Overloading method naikkanHarga dengan parameter kenaikan
    public void naikkanHarga(double kenaikan) {
        setHarga(getHarga() + kenaikan);
    }

    // Metode untuk menampilkan informasi komik
    public void displayInfo() {
        super.displayInfo(); // Memanggil method displayInfo dari superclass
        System.out.println("Volume: " + volume);
    }
}
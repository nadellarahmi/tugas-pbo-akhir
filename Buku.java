public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private double harga;

    // Constructor dengan parameter
    public Buku(String judul, String pengarang, int tahunTerbit, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    // Getter dan setter untuk judul, pengarang, tahunTerbit, dan harga
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method naikkanHarga tanpa parameter
    public void naikkanHarga() {
        this.harga *= 1.1; // Menaikkan harga sebesar 10%
    }

    // Overloading method naikkanHarga dengan parameter kenaikan
    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
    }

    // Metode untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Harga: " + harga);
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Buku
        Buku buku1 = new Buku("Belajar Java", "John Doe", 2021, 150000);
        buku1.displayInfo();
        
        System.out.println("\nMenaikkan harga sebesar 10%:");
        buku1.naikkanHarga();
        buku1.displayInfo();
        
        System.out.println("\nMenaikkan harga dengan kenaikan 20000:");
        buku1.naikkanHarga(20000);
        buku1.displayInfo();
    }
}
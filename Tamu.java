public class Tamu extends Pengguna {
    private int sisaMasaAktif; // Atribut tambahan untuk Tamu

    // Constructor Tamu
    public Tamu(int id, String username, String password, int sisaMasaAktif) {
        super(id, username, password); // Memanggil constructor superclass
        this.sisaMasaAktif = sisaMasaAktif;
    }

    // Method tambahan untuk Tamu
    public void menambahMasaAktif(int tambahan) {
        this.sisaMasaAktif += tambahan;
    }

    // Override method displayInfo untuk menampilkan informasi Tamu
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil method displayInfo dari superclass
        System.out.println("Sisa Masa Aktif: " + sisaMasaAktif);
    }
}
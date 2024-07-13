public class Main {
    public static void main(String[] args) {
        // Membuat objek Komik
        Komik komik1 = new Komik("Naruto", "Masashi Kishimoto", 2000, 1, 50000);
        Komik komik2 = new Komik("One Piece", "Eiichiro Oda", 1997, 100, 75000);

        // Menampilkan informasi Komik sebelum kenaikan harga
        System.out.println("Informasi Komik 1 sebelum kenaikan harga:");
        komik1.displayInfo();

        System.out.println("\nInformasi Komik 2 sebelum kenaikan harga:");
        komik2.displayInfo();

        // Melakukan kenaikan harga tanpa parameter (10%)
        komik1.naikkanHarga();

        // Menampilkan informasi Komik setelah kenaikan harga 10%
        System.out.println("\nInformasi Komik 1 setelah kenaikan harga 10%:");
        komik1.displayInfo();

        // Melakukan kenaikan harga dengan parameter (25.000)
        komik2.naikkanHarga(25000);

        // Menampilkan informasi Komik setelah kenaikan harga 25.000
        System.out.println("\nInformasi Komik 2 setelah kenaikan harga 25.000:");
        komik2.displayInfo();
    }
}
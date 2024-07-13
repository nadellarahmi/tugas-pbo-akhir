public class Pengguna {
    private int id;
    private String username;
    private String password;

    // Constructor dengan parameter
    public Pengguna(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    // Getter dan setter untuk id, username, dan password
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Metode displayInfo untuk menampilkan informasi pengguna
    public void displayInfo() {
        System.out.println("ID Pengguna: " + id);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    // Overloading methods for hapus
    public void hapus() {
        System.out.println("DELETE FROM pengguna");
    }

    public void hapus(int id) {
        System.out.println("DELETE FROM pengguna WHERE id=" + id);
    }

    public void hapus(String username) {
        System.out.println("DELETE FROM pengguna WHERE username='" + username + "'");
    }

    // Overloading methods for login
    public void login() {
        System.out.println("Ini method untuk Login");
    }

    public void login(String tokenGoogle) {
        System.out.println("Ini Login menggunakan Google dengan token: " + tokenGoogle);
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Pengguna
        Pengguna pengguna1 = new Pengguna(1, "user1", "password1");
        pengguna1.displayInfo();
        
        System.out.println("\nMenghapus pengguna dengan id:");
        pengguna1.hapus(1);
        
        System.out.println("\nMenghapus pengguna dengan username:");
        pengguna1.hapus("user1");
        
        System.out.println("\nLogin dengan metode default:");
        pengguna1.login();
        
        System.out.println("\nLogin dengan Google:");
        pengguna1.login("tokenGoogle123");
    }
}
// Class Character untuk merepresentasikan karakter
class Character {
    // Variabel-variabel untuk karakter
    private String name;
    private double health;
    private String weapon;
    private double attack;
    private String armor;
    private double defence;

    // Constructor untuk menginisialisasi karakter
    public Character(String name, double health, String weapon, double attack, String armor, double defence) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.attack = attack;
        this.armor = armor;
        this.defence = defence;
    }

    // Method untuk menampilkan informasi karakter
    public void displayInfo() {
        System.out.println("===============================================");
        System.out.println("Name\t: " + name);
        System.out.println("Health\t: " + health + " hp");
        System.out.println("Weapon\t: " + weapon + "\t, Attack\t: " + attack);
        System.out.println("Armor\t: " + armor + "\t, Defence\t: " + defence);
        System.out.println("===============================================");
    }
}

// Class utama untuk menjalankan program
public class MainCharacter {
    public static void main(String[] args) {
        // Membuat objek karakter Ucup
        Character ucup = new Character("Ucup", 100.0, "Pedang", 15.0, "Baju Besi", 10.0);
        // Menampilkan informasi karakter Ucup
        ucup.displayInfo();

        // Membuat objek karakter Otong
        Character otong = new Character("Otong", 50.0, "Ketapel", 1.0, "Kaos Partai", 0.0);
        // Menampilkan informasi karakter Otong
        otong.displayInfo();
    }
}

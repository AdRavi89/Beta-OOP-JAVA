// Class Fruit untuk merepresentasikan buah
class Fruit {
    // Variabel-variabel untuk buah
    private String name;
    private double weight;
    private String color;

    // Constructor untuk menginisialisasi buah
    public Fruit(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    // Method untuk menampilkan informasi buah
    public void displayInfo() {
        System.out.println("===============================================");
        System.out.println("Name\t: " + name);
        System.out.println("Weight\t: " + weight + " grams");
        System.out.println("Color\t: " + color);
        System.out.println("===============================================");
    }
}

// Class utama untuk menjalankan program
public class MainFruit {
    public static void main(String[] args) {
        // Membuat objek buah apel
        Fruit apple = new Fruit("Apple", 150.0, "Red");
        // Menampilkan informasi buah apel
        apple.displayInfo();

        // Membuat objek buah pisang
        Fruit banana = new Fruit("Banana", 120.0, "Yellow");
        // Menampilkan informasi buah pisang
        banana.displayInfo();
    }
}

// Class Vehicle untuk merepresentasikan kendaraan
class Vehicle {
    // Variabel-variabel untuk kendaraan
    private String brand;
    private String model;
    private int year;

    // Constructor untuk menginisialisasi kendaraan
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method untuk menampilkan informasi kendaraan
    public void displayInfo() {
        System.out.println("===============================================");
        System.out.println("Brand\t: " + brand);
        System.out.println("Model\t: " + model);
        System.out.println("Year\t: " + year);
        System.out.println("===============================================");
    }
}

// Class utama untuk menjalankan program
public class MainVehicle {
    public static void main(String[] args) {
        // Membuat objek kendaraan pertama
        Vehicle car1 = new Vehicle("Toyota", "Camry", 2020);
        // Menampilkan informasi kendaraan pertama
        car1.displayInfo();

        // Membuat objek kendaraan kedua
        Vehicle car2 = new Vehicle("Honda", "Accord", 2022);
        // Menampilkan informasi kendaraan kedua
        car2.displayInfo();
    }
}

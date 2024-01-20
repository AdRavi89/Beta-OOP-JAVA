import java.util.Scanner;

public class ATMProgram {
    // Variabel untuk menyimpan saldo akun pengguna
    private static double saldo = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Loop utama program ATM
        do {
            tampilkanMenu();
            System.out.print("Pilihan Anda : ");
            pilihan = scanner.nextInt();

            // Switch case untuk memproses pilihan pengguna
            switch (pilihan) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    tarikTunai(scanner);
                    break;
                case 4:
                    keluar();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (pilihan != 4);

        scanner.close();
    }

    // Metode untuk menampilkan menu ATM
    private static void tampilkanMenu() {
        System.out.println("====================");
        System.out.println("Menu :");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Deposit");
        System.out.println("3. Tarik Tunai");
        System.out.println("4. Keluar");
        System.out.println("====================");
    }

    // Metode untuk menampilkan saldo akun pengguna
    private static void cekSaldo() {
        System.out.println("Saldo Anda sekarang : $" + saldo);
    }

    // Metode untuk melakukan deposit ke akun pengguna
    private static void deposit(Scanner scanner) {
        System.out.println("====================");
        System.out.print("Masukkan Jumlah Deposit : ");
        double jumlahDeposit = scanner.nextDouble();
        saldo += jumlahDeposit;
        System.out.println("Deposit sejumlah $" + jumlahDeposit + " telah berhasil. Saldo Anda sekarang : $" + saldo);
        System.out.println("====================");
    }

    // Metode untuk melakukan penarikan tunai dari akun pengguna
    private static void tarikTunai(Scanner scanner) {
        System.out.println("====================");
        System.out.print("Masukkan Jumlah Penarikan : ");
        double jumlahPenarikan = scanner.nextDouble();
        // Memeriksa apakah saldo mencukupi sebelum melakukan penarikan
        if (jumlahPenarikan <= saldo) {
            saldo -= jumlahPenarikan;
            System.out.println("Penarikan sejumlah $" + jumlahPenarikan + " telah berhasil. Sisa Saldo Anda sekarang : $" + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan ini.");
        }
        System.out.println("====================");
    }

    // Metode untuk keluar dari program ATM
    private static void keluar() {
        System.out.println("====================");
        System.out.println("Terima kasih telah menggunakan ATM. Sampai Jumpa !");
        System.out.println("====================");
    }
}

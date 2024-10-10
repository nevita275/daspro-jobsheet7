import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double harga = 50000, totalHarga = 0, diskon = 0;
        int totalTiket = 0, jumlahPelanggan, jumlahTiket;

        System.out.print("Masukkan jumlah pelanggan = ");
        jumlahPelanggan = sc.nextInt();

        for (int i = 0; i < jumlahPelanggan; i++) {
            while (true) {
                System.out.print("Masukkan jumlah tiket untuk pelanggan " + (i + 1) + ": ");
                jumlahTiket = sc.nextInt();
                
                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid. Masukkan lagi.");
                } else {
                    break;
                }
            } if (jumlahTiket > 10) {
                diskon = (jumlahTiket * harga) * 0.15;
            } else if (jumlahTiket > 4) {
                diskon = (jumlahTiket * harga) * 0.10;
            }
            totalTiket += jumlahTiket;
            totalHarga = (harga * jumlahTiket) - diskon;
        }
        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total harga penjualan tiket: Rp " + totalHarga);

        
    }
    
}

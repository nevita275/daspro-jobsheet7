import java.util.Scanner;
public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi,total = 0;
        double tarifMobil = 3000, tarifMotor = 2000, totalPembayaran = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 untuk Mobil, 2 untuk Motor, 0 untuk keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
                
            }
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;

            } else {
                if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                    
                } else {
                    System.out.println("Jenis kendaraan tidak valid.");
                    continue;
                }
            }
            totalPembayaran += total;
            System.out.println("Pembayaran untuk kendaraan: Rp " + total);

            System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
        }

    }
}

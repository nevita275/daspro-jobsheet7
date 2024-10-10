import java.util.InputMismatchException;
import java.util.Scanner;

public class SiakadFor22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah = 100;
        int mhs = 10, lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= mhs; i++) {
            while (true) {
                try {
                    System.out.print("Masukkan nilai mahasiswa " + i + ": ");
                    nilai = sc.nextDouble();

                    // Update nilai tertinggi dan terendah
                    if (nilai > tertinggi) {
                        tertinggi = nilai;
                    }
                    if (nilai < terendah) {
                        terendah = nilai;
                    }

                    // Hitung lulus dan tidak lulus dengan batas kelulusan 60
                    if (nilai >= 60) {
                        lulus++;
                    } else {
                        tidakLulus++;
                    }

                    // Keluar dari loop jika input valid
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid! Silakan masukkan angka.");
                    sc.next(); // Membersihkan input yang tidak valid
                }
            }
        }

        // Output hasil
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Banyaknya mahasiswa lulus: " + lulus);
        System.out.println("Banyaknya mahasiswa tidak lulus: " + tidakLulus);
    }
}

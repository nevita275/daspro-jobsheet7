import java.util.Scanner;
public class SiakadFor22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        double nilai, tertinggi = 0, terendah = 100;
        int mhs = 10, lulus = 0, tidakLulus = 0, i;

        for (i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa " + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
             if (nilai >= 60) {
                lulus++;
             } else {
                tidakLulus++;
             }
        

        }

        
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        System.out.println("Banyaknya mahasiswa lulus: " + lulus);
        System.out.println("Banyaknya mahasiswa tidak lulus: " + tidakLulus);

    }
    
}

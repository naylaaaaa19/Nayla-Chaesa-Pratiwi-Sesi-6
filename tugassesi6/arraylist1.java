import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int numData = scanner.nextInt();

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<Integer> nilai = new ArrayList<>();

        for (int i = 0; i < numData; i++) {
            System.out.println("Mahasiswa Ke: " + (i + 1));
            System.out.print("Nama: ");
            nama.add(scanner.next()); 
            System.out.print("Nilai: ");
            nilai.add(scanner.nextInt()); 
        }
        
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("No\tNama\tNilai\tStatus");

        int totalnilai = 0;
        int siswalulus = 0;

        for (int i = 0; i < nama.size(); i++) {
            System.out.print((i + 1) + "\t" + nama.get(i) + "\t" + nilai.get(i) + "\t");

            if (nilai.get(i) >= 60) {
                System.out.println("Lulus");
                siswalulus++;  
            } else {
                System.out.println("Tidak Lulus");
            }
            totalnilai += nilai.get(i); 
        }

        scanner.close();

        double ratanilai = (double) totalnilai / nama.size();

        System.out.println("\nJumlah: " + totalnilai);
        System.out.println("Nilai Rata-rata: " + ratanilai);
        System.out.println("Jumlah Lulus: " + siswalulus);
    }
}
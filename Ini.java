
import java.util.Scanner;

public class Ini {

    static Scanner sc = new Scanner(System.in);
    static String mahasiswa[][] = new String[50][2];
    static String matkul[][] = new String[50][50];

    static void tambahKrs() {
        int totalSKS[] = new int[50];
        int i = 0;
        
        boolean tambahMahasiswa = true;
        while (tambahMahasiswa) { 
            System.out.print("\nNIM : ");
            mahasiswa[i][0] = sc.next();
            System.out.print("Nama : ");
            mahasiswa[i][1] = sc.next();

            boolean tambahMataKuliah = true;
            while (tambahMataKuliah) { 
                System.out.print("\nKode Mata Kuliah : ");
                matkul[i][0] = sc.next();
                System.out.print("Nama Mata Kuliah : ");
                sc.nextLine();
                matkul[i][1] = sc.nextLine();

                System.out.print("Jumlah SKS (1-3) : ");
                matkul[i][2] = sc.next();
                if (matkul[i][2].equals("1") || matkul[i][2].equals("2") || matkul[i][2].equals("3")) {
                    totalSKS[i] += Integer.valueOf(matkul[i][2]);
                } else {
                    System.out.println("Jumlah SKS tidak valid!");
                    continue;
                }

                System.out.print("\nTambah mata kuliah lagi? (y/t): ");
                String lanjutMataKuliah = sc.next();
                if (lanjutMataKuliah.equalsIgnoreCase("t")) {
                    tambahMataKuliah = false;
                }
            }

            System.out.println("Total SKS yang diambil: " + totalSKS[i]);

            System.out.print("\nTambah mahasiswa lain? (y/t): ");
            String lanjutMahasiswa = sc.next();
            if (lanjutMahasiswa.equalsIgnoreCase("t")) {
                tambahMahasiswa = false;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int menu;

        System.out.println("=== Sistem Pemantauan KRS Mahasiswa ===");
        System.out.println("1. Tambah Data KRS");
        System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
        System.out.println("3. Analisis Data KRS");
        System.out.println("4. Keluar");
        System.out.print("\nPilih menu : ");
        menu = sc.nextInt();

        if (menu == 1) {
            tambahKrs();
            

            
        }
    }
}

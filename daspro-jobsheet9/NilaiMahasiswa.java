import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int n = scanner.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }
    
        double rataRata = hitungRataRata(nilai);

        int nilaiTertinggi = cariNilaiTertinggi(nilai);
        int nilaiTerendah = cariNilaiTerendah(nilai);

        System.out.println("\nSemua nilai mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nNilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.printf("Rata-rata nilai: %.2f\n", rataRata);

        scanner.close();
    }

    public static double hitungRataRata(int[] nilai) {
        int total = 0;
        for (int nilaiMahasiswa : nilai) {
            total += nilaiMahasiswa;
        }
        return (double) total / nilai.length;
    }

    public static int cariNilaiTertinggi(int[] nilai) {
        int tertinggi = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
        }
        return tertinggi;
    }

    public static int cariNilaiTerendah(int[] nilai) {
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        return terendah;
    }
}

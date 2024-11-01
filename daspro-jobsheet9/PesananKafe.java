import java.util.Scanner;
public class PesananKafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = scanner.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        double totalBiaya = hitungTotalBiaya(hargaPesanan);

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }

        System.out.printf("Total Biaya: Rp%.2f\n", totalBiaya);

        scanner.close();
    }

    public static double hitungTotalBiaya(double[] hargaPesanan) {
        double total = 0;
        for (double harga : hargaPesanan) {
            total += harga;
        }
        return total;
    }
}
    


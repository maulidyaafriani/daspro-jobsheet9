
    import java.util.Scanner;

public class PencarianMenuKafe {
    public static void main(String[] args) {
        
        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappuccino",
            "Chocolate Ice"
        };

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = scanner.nextLine();

        boolean ditemukan = linearSearch(menu, makananDicari);

        if (ditemukan) {
            System.out.println(makananDicari + " tersedia di menu.");
        } else {
            System.out.println(makananDicari + " tidak ada di menu.");
        }

        scanner.close();
    }

    public static boolean linearSearch(String[] menu, String makananDicari) {
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(makananDicari)) {
                return true; 
            }
        }
        return false; 
    }
}

    


import java.util.Scanner; // Improt library untuk membaca input dari user 

public class Soal5 {
    //mengubah huruf pertama String menjadi kapital
    private static String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // unutk membaca input dari console 

        String A = sc.nextLine().trim();
        String B = sc.nextLine().trim();

        // panjang A dan B
        int sumLen = A.length() + B.length();
        System.out.println(sumLen);
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        // kapitalisasi huruf pertama A dan B lalu gabungkan dengan spasi
        System.out.println(capitalize(A) + " " + capitalize(B));

        sc.close();
    }
}


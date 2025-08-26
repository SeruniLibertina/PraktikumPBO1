/*
Soal 1 Data Types 
Nama : Seruni Libertina Islami
Kelas : 2B - D3 
NIM : 241511064 
*/

import java.util.*;               // Scanner untuk input
import java.math.BigInteger;      // Untuk angka besar 

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Scanner untuk membaca input

        int T = sc.nextInt();   // Jumlah test case yang akan diuji

        // Definisi batas tiap tipe data 
        final BigInteger BYTE_MIN  = BigInteger.valueOf(Byte.MIN_VALUE);       
        final BigInteger BYTE_MAX  = BigInteger.valueOf(Byte.MAX_VALUE);       
        final BigInteger SHORT_MIN = BigInteger.valueOf(Short.MIN_VALUE);      
        final BigInteger SHORT_MAX = BigInteger.valueOf(Short.MAX_VALUE);      
        final BigInteger INT_MIN   = BigInteger.valueOf(Integer.MIN_VALUE);   
        final BigInteger INT_MAX   = BigInteger.valueOf(Integer.MAX_VALUE);   
        final BigInteger LONG_MIN  = BigInteger.valueOf(Long.MIN_VALUE);       
        final BigInteger LONG_MAX  = BigInteger.valueOf(Long.MAX_VALUE);   

        while (T-- > 0) {
            String s = sc.next();  // Baca input sebagai string biar bisa menampung angka besar sekali

            try {
                BigInteger n = new BigInteger(s);  // Konversi string ke BigInteger

                // Cek apakah angka muat di tipe long
                if (n.compareTo(LONG_MIN) >= 0 && n.compareTo(LONG_MAX) <= 0) {
                    System.out.println(s + " can be fitted in:");

                    // Cek apakah muat dalam byte
                    if (n.compareTo(BYTE_MIN) >= 0 && n.compareTo(BYTE_MAX) <= 0) {
                        System.out.println("* byte");
                    }
                    // Cek apakah muat dalam short
                    if (n.compareTo(SHORT_MIN) >= 0 && n.compareTo(SHORT_MAX) <= 0) {
                        System.out.println("* short");
                    }
                    // Cek apakah muat dalam int
                    if (n.compareTo(INT_MIN) >= 0 && n.compareTo(INT_MAX) <= 0) {
                        System.out.println("* int");
                    }
                    // Karena sudah dipastikan muat di long, otomatis bisa dicetak
                    System.out.println("* long");
                } else {
                    // Jika lebih besar dari long (tidak muat di tipe data manapun)
                    System.out.println(s + " can't be fitted anywhere.");
                }
            } catch (NumberFormatException e) {
                // Jika input bukan angka valid
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
        sc.close();  
    }
}

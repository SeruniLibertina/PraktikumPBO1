/*
Soal 2 Constants
Nama : Seruni Libertina Islami
Kelas : 2B - D3 
NIM : 241511064 
*/

public class Soal2Constants {
    public static void main(String[] args) {
        // Deklarasi konstanta lokal 
        // 1 inch = 2.54 cm
        final double CM_PER_INCH = 2.54;   
        
        // Ukuran kertas dalam satuan inch 
        double paperWidth = 8.5;  
        double paperHeight = 11; 
        // Cetak ukuran kertas dalam centimeter
        // Lebar = 8.5 inch × 2.54
        // Tinggi = 11 inch × 2.54
        System.out.println("Paper size in centimeters: "
                + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

    }
}


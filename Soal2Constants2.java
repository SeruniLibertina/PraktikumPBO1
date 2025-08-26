/*
Soal 2 Constants 2
Nama : Seruni Libertina Islami
Kelas : 2B - D3 
NIM : 241511064 
*/


public class Soal2Constants2 {
    
    public static final double CM_PER_INCH = 2.54;  

    public static void main(String[] args) {
        // Ukuran kertas dalam inch
        double paperWidth = 8.5;   
        double paperHeight = 11;   

        // Konversi: inch × 2.54 
        System.out.println("Paper size in centimeters: "
                + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}


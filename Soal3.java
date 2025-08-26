/*
Soal 3 Operators
Nama : Seruni Libertina Islami
Kelas : 2B - D3 
NIM : 241511064 
*/

public class Soal3 {
    public static void main(String[] args) {
        double x = 92.98;

        // Math.round(double) mengembalikan long
        long rounded = Math.round(x); // membulatkan angka double ke bilangan bulat, hasil = 93
        int nx = (int) rounded;       // cast ke int

        System.out.println("x = " + x);
        System.out.println("Math.round(x) = " + rounded); // menapilkan hasil pembulatan (tipe long)
        System.out.println("nx = " + nx);
    }

}

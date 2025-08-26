/*
Soal 4 Operators 1
Nama : Seruni Libertina Islami
Kelas : 2B - D3 
NIM : 241511064 
*/


public class Soal4 {
    // methodOne menerima long
    static short methodOne(long l) {
        int i = (int) l;     // narrowing: long = int (butuh cast)
        return (short) i;    // narrowing: int = short (butuh cast)
    }

    public static void main(String[] args) {
        double d = 10.25;                // 64-bit floating
        float f = (float) d;             // narrowing: double = float
        byte b = (byte) methodOne((long) f); // float = long (pecahan dibuang)kemudian long,int,short,byte
        System.out.println(b);           // output: 10
    }
}


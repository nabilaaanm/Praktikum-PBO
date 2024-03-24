// MBangunDatar.java 23/03/24
// Penulis   : Nabila Najma Manika
// NIM       : 24060122140172
// Deskripsi : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar 


import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();

        System.out.println("Luas bujur sangkar dengan sisi " +sisi+ " satuan adalah " + bs.hitungLuas(sisi));

        scan.close();
    }
}

// Error , karena harus mengimplementasikan method hitungLuas yang ada di BangunDatar tujuan metode abstrak subclass 

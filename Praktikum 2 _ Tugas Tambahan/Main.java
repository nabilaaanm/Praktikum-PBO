// Nama : Nabila Najma Manika
// NIM : 24060122140172
// Tanggal : 03 Maret 2024
// Deskripsi : Kelas yang berisi program utama untuk mengaplikasikan kelas Mahasiswa dan WaliMahasiswa

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa wali1 = new WaliMahasiswa("Pak Sandy Kurniawan", "087882144114", "Jl. Seturan Raya no 23");
        Mahasiswa mahasiswa1 = new Mahasiswa("Nabila Najma Manika", "24060122140172", "Informatika", wali1);

        mahasiswa1.cetak();
    }
}


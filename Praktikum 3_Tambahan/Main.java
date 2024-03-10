// Nama : Nabila Najma Manika
// NIM : 24060122140172
// Tanggal : 08 Maret 2024
// Deskripsi : Kelas yang berisi program class Main

public class Main {
    public static void main(String[] args) {
        Anggota member1 = new Anggota("Nabila Najma");
        Anggota member2 = new Anggota("Sulthan Azzam");
        Buku buku1 = new Buku("Hujan");
        Buku buku2 = new Buku("Pulang");
        Buku buku3 = new Buku("Komet");

        try {
            member1.pinjamBuku(buku1);
            member1.pinjamBuku(buku2);
            member1.pinjamBuku(buku3);
            member1.pinjamBuku(new Buku("Mariposa"));
            member2.pinjamBuku(buku1);
            member2.pinjamBuku(buku2);
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
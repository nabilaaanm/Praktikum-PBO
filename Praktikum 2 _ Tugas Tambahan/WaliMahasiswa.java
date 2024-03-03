// Nama : Nabila Najma Manika
// NIM : 24060122140172
// Tanggal : 03 Maret 2024
// Deskripsi : Kelas yang berisi program class WaliMahasiswa

public class WaliMahasiswa {
    private String nama;
    private String nomorHP;
    private String alamat;

    public WaliMahasiswa(String nama, String nomorHP, String alamat) {
        this.nama = nama;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorHp() {
        return nomorHP;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorHp(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
/* File         : WaliMahasiswa.java
 * Penulis      : Nabila Najma Manika
 * NIM          : 24060122140172
 * Tanggal      : 22 Maret 2024
 * Deskripsi    : Representasi dasar dari objek wali mahasiswa 
 */

 package org.walimahasiswa;

 import org.orang.Orang;
 
 public class WaliMahasiswa extends Orang{
     private String nomorHp, alamat;
 
     public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat){
         super(nama, nik);
         this.nomorHp = nomorHp;
         this.alamat = alamat;
     }
     public String getNomorHp(){
         return nomorHp;
     }
     public String getAlamat(){
         return alamat;
     }
     public void setNomorHp (String nomorHp){
         this.nomorHp = nomorHp;
     }
     public void setAlamat (String alamat){
         this.alamat = alamat;
     }
     public void cetak(){
         System.out.println("--- Data Wali Mahasiswa ---");
         super.cetak();
         System.out.println("Nomor Hp \t: " +getNomorHp());
         System.out.println("Alamat \t\t: " +getAlamat());
     }
 }
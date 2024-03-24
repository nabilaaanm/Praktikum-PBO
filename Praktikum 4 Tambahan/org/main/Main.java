/* File         : Main.java
 * Penulis      : Nabila Najma Manika
 * NIM          : 24060122140172
 * Tanggal      : 22 Maret 2024
 * Deskripsi    : Driver class untuk orang, mahasiswa, dan wali mahasiswa
 */

 package org.main;

 import org.walimahasiswa.*;
 import org.mahasiswa.*;
 
 
 public class Main {
     public static void main(String[] args){
         // Data Wali Mahasiswa
         WaliMahasiswa Sulthan = new WaliMahasiswa("Sulthan Ajjam", "331810001", "085123", "Maguwo No 12, Yogyakarta");
         WaliMahasiswa Nabila = new WaliMahasiswa("Nabila Manika", "3318150001", "0854652", "Jalan Bulusan No 21, Semarang");
         
         // Data Mahasiswa
         Mahasiswa Azzam = new Mahasiswa("Al Azzam", "3318140002", "24060122140172", "Informatika", Nabila);
         Mahasiswa  Najma = new Mahasiswa("Najma Najmia", "3318140003", "24060122140127", "Sistem Informasi", Sulthan);
 
         Azzam.cetak();
         Najma.cetak();
     }
 }
 
// Nama : Nabila Najma Manika
// NIM  : 24060122140172

public class main {
    public static void main(String[] args) {
      ulat K = new ulat();
      Data<kupu> anu = new Data<>();
      anu.setIsi(K);
      anu.getIsi().gerak();
      anu.setIsi(new kepompong());
      anu.getIsi().gerak();
      anu.setIsi(new kupuDewasa());
      anu.getIsi().gerak();
    }
  }
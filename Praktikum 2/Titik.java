// Nama : Nabila Najma Manika
// NIM : 24060122140172
// Tanggal : 28 Februari 2024
// Deskripsi : Kelas yang berisi program utama untuk mengaplikasikan kelas Titik

public class Titik{
    private float absis;
    private float ordinat;
    private static float counterTitik;

    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik (float a, float o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    public void setAbsis(float a){
        absis = a;
    }

    public void setOrdinat(float o){
        ordinat = o;
    }

    public float getAbsis(){
        return absis;
    }

    public float getOrdinat(){
        return ordinat;
    }

    public static float getCounterTitik(){
        return counterTitik;
    }

    public float getJarakPusat(){
        return (float) Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    public void refleksiX(){
        ordinat = -(ordinat);
    }

    public void refleksiY(){
        absis = -(absis);
    }

    public Titik getRefleksiX(){
        return new Titik(this.absis, -(this.ordinat));
    }
    
    public Titik getRefleksiY(){
        Titik t = new Titik(-(this.absis), this.ordinat);
        return t;
    }
}
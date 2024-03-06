// Nama : Nabila Najma Manika
// NIM  : 24060122140172

public class ExceptionOnArray {
    public static void main (String[] args){
        Integer[] arrayIntegers = new Integer[4];
        try {
            arrayIntegers [2] = 11;
            arrayIntegers [4] = 10;
            System.out.println(arrayIntegers[2]);
        }catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            exception.getMessage();
            System.out.println("Index error");
        }finally{
            System.out.println("clean up code...");
        }
    }
}
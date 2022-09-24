/*Created by 21343077_Glody Syah Rabbynawa
*/
import java.util.Scanner;

public class Scanner1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = in.nextLine();

        System.out.print("Masukkan NIM: ");
        int nim = in.nextInt();

        System.out.print("Masukkan Nilai: ");
        float nilai = in.nextFloat();

        System.out.println( "\n Nama : " +nama+ 
                            "\n NIM : " +nim+ 
                            "\n Nilai : "+nilai);
    }
}
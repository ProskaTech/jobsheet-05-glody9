/*Created by 21343077_Glody Syah Rabbynawa
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class tugas1 {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

        String word1="";
        String word2="";
        String word3="";

        try{
            System.out.print("enter word1 : ");
            word1 = dataIn.readLine();
            System.out.print("enter word2 :");
            word2 = dataIn.readLine();
            System.out.print("enter word3 :");
            word3 = dataIn.readLine();
        }
        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }
        System.out.print(word1);
        System.out.print(" "+word2);
        System.out.print(" "+word3);
    }
}

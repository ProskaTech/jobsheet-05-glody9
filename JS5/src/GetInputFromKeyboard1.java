/*Created by 21343077_Glody Syah Rabbynawa
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard1 {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

        String name = "", hoby = "";

        try{
            System.out.print("Nama Anda : ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda :");
            hoby = dataIn.readLine();
        }

        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }

        System.out.println("Jadi Hobi anda "+hoby+". hobi yang bagus "+name);
    }
}

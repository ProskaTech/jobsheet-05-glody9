/*Created by 21343077_Glody Syah Rabbynawa
*/
import java.util.Scanner;

public class tugas1Scanner {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("enter word1: ");
        String word1 = in.nextLine();

        System.out.print("enter word2: ");
        String word2 = in.nextLine();

        System.out.print("enter word3: ");
        String word3 = in.nextLine();

        System.out.print(word1);
        System.out.print(" "+word2);
        System.out.print(" "+word3);
    }
}
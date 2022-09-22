/*Created by 21343077_Glody Syah Rabbynawa
*/
import javax.swing.JOptionPane;

public class tugas2 {
    public static void main(String args[]){
        String word1 ="", word2="";

        word1 = JOptionPane.showInputDialog("enter word 1");
        word2 = JOptionPane.showInputDialog("enter word 2");

        String msg = " "+word1+" and "+word2;

        JOptionPane.showMessageDialog(null, msg);
    }
}
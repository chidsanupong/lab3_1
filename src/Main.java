import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Main {
    public static  void main(String[] args) {
       // String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1ต ัว","0");
 //       JOptionPane.showMessageDialog(null, "message","title", JOptionPane.INFORMATION_MESSAGE);
      int ans =  JOptionPane.showConfirmDialog(null,"รักหรือป่าว","ถามเธอ",JOptionPane.YES_NO_OPTION);
     if(ans==JOptionPane.YES_OPTION){
         JOptionPane.showMessageDialog(null,"รักนะ");
     }else{
         JOptionPane.showMessageDialog(null,"เสียใจ");
     }
    }
}


package snake;

import java.awt.EventQueue;
import javax.swing.JFrame;



public class Snake extends JFrame{
    
    
  
public Snake() {

        add(new Board());
        
        pack();
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }





    
    public static void main(String[] args) {
        
      
        
                JFrame frame = new Snake();
                frame.setVisible(true);
            
        
    
    }
    
    
    
}

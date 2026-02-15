import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class UserLogin extends JFrame {
    private Container c;
    UserLogin(){
    method();
    setVisible(true);
    setBounds(600,400,500,500);
    
    setResizable(false);
    setTitle("User Login Page");
    setResizable(false);
   
    }
    public void method() 
    {
    c = getContentPane();
    c.setLayout(null);
    c.setBackground(Color.RED);
    
    }
    
    public static void main(String[] args) {
    UserLogin frame = new UserLogin();
  }
}
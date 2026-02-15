import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class AdminLogin extends JFrame {
    private Container c;
    AdminLogin(){
    method();
    setVisible(true);
    setBounds(600,400,500,500);
    
    setResizable(false);
    setTitle("Admin Login Page");
    setResizable(false);
   
    }
    public void method() 
    {
    c = getContentPane();
    c.setLayout(null);
    c.setBackground(Color.BLACK);
    
    }
    
    public static void main(String[] args) {
    AdminLogin frame = new AdminLogin();
  }
}
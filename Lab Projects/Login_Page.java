import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Login_Page extends JFrame {
    private Container c;
     private JLabel lb1,lb11,lb12;
     private Font f;
     private JComboBox cb;
     
    Login_Page(){
    method();
    setVisible(true);
    setBounds(600,400,500,500);
    
    setResizable(false);
    setTitle("Login Page");
    setResizable(false);
   
    }
    public void method() 
    {
    c = getContentPane();
    c.setLayout(null);
    c.setBackground(Color.BLACK);
    f = new Font("Arial", Font.BOLD+Font.ITALIC, 20);
        Font f1 = new Font("Arial", Font.BOLD+Font.ITALIC, 20);
    
    lb1 = new JLabel();
    lb1.setText("Student Managment System");
    lb1.setBounds(120,50,300,30);
    lb1.setForeground(Color.WHITE);
    lb1.setFont(f);
    c.add(lb1);
    
    lb11 = new JLabel();
    lb11.setText("SELECT ADMIN OR USER:");
    lb11.setBounds(180,180,300,30);
    lb11.setForeground(Color.WHITE);
    lb1.setFont(f1);
    c.add(lb11);
    
    cb = new JComboBox();
    cb.setBounds(360,250,100,30);
    cb.setFont(f1);
    c.add(cb);
    }
    
    public static void main(String[] args) {
    Login_Page frame = new Login_Page();
  }

}
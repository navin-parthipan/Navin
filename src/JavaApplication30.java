import java.awt.Color;
import javax.swing.*;
public class JavaApplication30
{
public static void main(String args[])
{
JFrame ob=new JFrame();   //creating object for frame
        JButton d=new JButton("BIT Camps");
        d.setBounds(250,250,200,40);
        ob.add(d);
        JTextField a=new JTextField("user id");
        a.setBounds(250,300,200,40);
        ob.add(a);
        JTextField b=new JTextField("password");
        b.setBounds(250,350,200,40);
        ob.add(b);
        JButton c=new JButton("Login In");
        c.setBounds(250,400,200,40);
        ob.add(c);
       
ob.setSize(1100,1000);
ob.setLayout(null);
ob.setVisible(true);  
ob.getContentPane().setBackground(Color.ORANGE);
}
}
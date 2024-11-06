import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class test implements ActionListener
{
    JLabel l;
    JTextField t;
    JButton b;
     
    test()
    {
     
         JFrame f=new JFrame("textfield");
         l=new JLabel("Nothing Entered");
         t=new JTextField(16);
         b=new JButton("Submit");
         JPanel P=new JPanel(new GridLayout(3,1));
         
         P.add(l);
         P.add(t);
         P.add(b);
         
         b.addActionListener(this);
  
         f.add(P);
         f.setSize(300,300);
         f.show();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equals("Submit"));
        {
            l.setText(t.getText());
            t.setText(" ");
        }
    }
  public static void main(String args[])
  {
   test t=new test();
   }
   }       
         
	




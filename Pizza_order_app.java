import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Pizza extends JFrame implements ActionListener {
    
    JPanel pi;
    JLabel top1, top2, cheese, price;
    Choice t1, t2, che;
    JButton sub;
    JTextField pri;

    Pizza()
    {
        pi= new JPanel(new FlowLayout());
        setTitle("PIZZA TIME");
        add(pi, BorderLayout.CENTER);

        price= new JLabel("Final Price: ");
        top1= new JLabel("Topping-1");
        top2= new JLabel("Topping-2");
        cheese= new JLabel("Cheese");

        sub=new JButton("Submit");
        sub.addActionListener(this);

        t1= new Choice();
        t1.add("Pepperoni - 100");
        t1.add("Mushrooms - 60");
        t1.add("Tomato- 110");
        t1.add("Onion - 70");

        t2= new Choice();
        t2.add("Pepperoni - 100");
        t2.add("Mushrooms - 60");
        t2.add("Tomato- 110");
        t2.add("Onion - 70");

        che=new Choice();
        
        che.add("Cottage:-200");
        che.add("Parmesan:-210");
        che.add("Burrata:-150");
        che.add("Goat cheese:-250");

        pri= new JTextField(15);

        pi.add(top1);
        pi.add(t1);
        pi.add(top2);
        pi.add(t2);
        pi.add(cheese);
        pi.add(che);
        pi.add(price);
        pi.add(pri);
        pi.add(sub);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String top1,top2,c;
        top1=t1.getSelectedItem();
        top2=t2.getSelectedItem();
        c=che.getSelectedItem();
        int sum=0;
        if(top1.charAt(0)=='P')
            sum+=100;
        else if (top1.charAt(0)=='M')
        {
            sum+=60;
        }
        else if (top1.charAt(0)=='T')
        {
            sum+=110;
        } else if (top1.charAt(0)=='O')
        {
            sum+=70;
        }

        if(top2.charAt(0)=='P')
            sum+=100;
        else if (top2.charAt(0)=='M')
        {
            sum+=60;
        }
        else if (top2.charAt(0)=='T')
        {
            sum+=110;
        } else if (top2.charAt(0)=='O')
        {
            sum+=70;
        }


        if(c.charAt(0)=='C')
            sum+=200;
        else if (c.charAt(0)=='P')
        {
            sum+=210;
        }
        else if (c.charAt(0)=='B')
        {
            sum+=150;
        } else if (c.charAt(0)=='G')
        {
            sum+=250;
        }
        pri.setText(String.valueOf(sum));
    }
}
public class PizzaTime
{
    public static void main(String args[])
    {
        Pizza p=new Pizza();
        p.setBounds(700,350,225,200);
        p.setVisible(true);
    }
}

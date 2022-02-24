import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab5Barro_Resto extends JFrame implements ActionListener {
  static JLabel l;
  static JTextField num, cName, qty, rate, amnt, toppings;
  static JRadioButton pan, stuf, reg;
  static JCheckBox onion, cheese, tomato, corn;
  static JTextArea result;
  static JButton button, clrbtn;

  public static void main (String[] args) {
    new Lab5Barro_Resto();
  }

  public static void uiView (boolean visible) {
    JFrame f = new JFrame();
    f.setSize(600, 600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocationRelativeTo(null);
    f.setVisible(visible);
    
    JPanel p = new JPanel();
    f.add(p);
    p.setLayout(null);


    l = new JLabel("Papa Pizzeria Resto");
    l.setBounds(200,20,240,30);
    l.setFont(new Font("Arial", Font.BOLD,20));
    p.add(l);

    l = new JLabel("Order No.:");
    l.setBounds(20,60,80,25);
    p.add(l);
    
    num = new JTextField(50);
    num.setBounds(120,60,120,25);
    p.add(num);

    l = new JLabel("Customer Name:");
    l.setBounds(20,100,120,25);
    p.add(l);

    cName = new JTextField();
    cName.setBounds(120,100,120,25);
    p.add(cName);

    l = new JLabel("Quantity:");
    l.setBounds(20,140,100,25);
    p.add(l);

    qty = new JTextField();
    qty.setBounds(120,140,120,25);
    p.add(qty);

    l = new JLabel("Rate: ");
    l.setBounds(270,60,80,25);
    p.add(l);

    rate = new JTextField();
    rate.setBounds(380,60,120,25);
    p.add(rate);

    l = new JLabel("Amount:");
    l.setBounds(270,100,80,25);
    p.add(l);

    amnt = new JTextField();
    amnt.setBounds(380,100,120,25);
    p.add(amnt);

    l = new JLabel("Cost of toppings: ");
    l.setBounds(270,140,120,25);
    p.add(l);

    toppings = new JTextField();
    toppings.setBounds(380,140,120,25);
    p.add(toppings);

    //checkbox
    l = new JLabel("Pizza Type");
    l.setBounds(20,185,200,25);
    l.setFont(new Font("",Font.BOLD,15));
    p.add(l);

    pan = new JRadioButton("Pan Pizza");
    pan.setBounds(50, 220, 150, 20);
    stuf = new JRadioButton("Stuffed Crust");
    stuf.setBounds(50,240,150,20);
    reg = new JRadioButton("Regular");
    reg.setBounds(50,260,150,20);

    p.add(pan);
    p.add(stuf);
    p.add(reg);

    l = new JLabel("Toppings");
    l.setBounds(320,185,200,25);
    l.setFont(new Font("",Font.BOLD,15));
    p.add(l);

    onion = new JCheckBox("Onion @20.00");
    onion.setBounds(330,220,150,20);
    cheese = new JCheckBox("Cheese @40.00");
    cheese.setBounds(330,240,150,20);
    tomato = new JCheckBox("Tomato @30.00");
    tomato.setBounds(330,260,150,20);
    corn = new JCheckBox("Baby Corn @40.00");
    corn.setBounds(330,280,150,20);

    p.add(onion);
    p.add(cheese);
    p.add(tomato);
    p.add(corn);

    result = new JTextArea("");
    result.setBounds(30,350,500,200);
    p.add(result);

    button = new JButton("Generate Bill");
    button.setBounds(50,320,120,25);
    p.add(button);

    button.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        //pizza type
        double totRate = 0, topCost = 0;
        if (pan.isSelected()){
          totRate = 300.00;
        }
        if (stuf.isSelected()){
          totRate += 300.00;
        }
        if (reg.isSelected()){
          totRate += 300.00;
        }
        
        //Toppings
        if (onion.isSelected()){  
          topCost = 20.0;
        }
        if (cheese.isSelected()){   
          topCost += 40.0;
        }
        if (tomato.isSelected()){ 
          topCost += 30.0;
        }
        if (corn.isSelected()){   
          topCost += 40.0;
        }
        String orderNo,cusName;
        double qnty,totalAmount;
        orderNo = num.getText();
        cusName = cName.getText();
        qnty = Double.parseDouble(qty.getText());
        totalAmount = (totRate * qnty) + topCost;
        


        amnt.setText(""+totalAmount);
        rate.setText(""+totRate);
        toppings.setText("" + topCost);
        result.setText("Hello, you Order ID. is "+ orderNo +"\nName:  " + cusName + "\nAmount Payable is: " + totalAmount);
      }
    });

    clrbtn = new JButton("Clear");
    clrbtn.setBounds(330,320,120,25);
    p.add(clrbtn);

    clrbtn.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        num.setText("");
        cName.setText("");
        qty.setText("");

        pan.setSelected(false);
        stuf.setSelected(false);
        reg.setSelected(false);
        onion.setSelected(false);
        cheese.setSelected(false);
        tomato.setSelected(false);
        corn.setSelected(false);

        amnt.setText(" ");
        rate.setText(" ");
        toppings.setText(" ");
        result.setText(" ");
      }
    });
  }

  @Override
  public void setVisible(boolean e) {
    Lab5Barro_Resto.uiView(true);
	}
  
  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    
  }
}

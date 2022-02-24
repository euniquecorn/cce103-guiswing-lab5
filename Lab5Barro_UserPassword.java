
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
// import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Lab5Barro_UserPassword implements ActionListener {
	private static JLabel user;
	private static JLabel pass;
	private static JLabel check;
	private static JTextField tf;
	private static JPasswordField pw;
	private static JButton btn;

	public static void main(String[] args) {
		
		//JFrame
	
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		// f.setVisible(true);
		f.setTitle("LOG IN");
		
		//JPanel
		JPanel p = new JPanel();
		f.add(p);
		p.setLayout(null);

		//Username
		 user = new JLabel("Username");
		 user.setBounds(10, 20, 80, 25);
		 p.add(user);

		//Username JTextField		 
		tf = new JTextField();
		tf.setBounds(90, 20, 150, 25);
		p.add(tf);

		//Password
		pass = new JLabel("Password");
		pass.setBounds(10, 50, 80, 25);
		p.add(pass);

		//Password JPasswordField
		pw = new JPasswordField();
		pw.setBounds(90, 50, 150, 25);
		p.add(pw);

		//Button Login
		btn = new JButton("login");
		btn.setBounds(70, 100, 200, 25);
		btn.addActionListener(new Lab5Barro_UserPassword());
		p.add(btn);

		check = new JLabel("");
		check.setBounds(10, 130, 300, 25);
		p.add(check);

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		String uname_input = tf.getText();
		String pword_input = pw.getText();

		//  System.out.println(uname_input  + " " + pword_input);

		if(uname_input .equals("yummy") && pword_input.equals("pizza")){
			check.setText("Login Sucessful...");
			new Lab5Barro_Resto().setVisible(true);
		} else{
				JOptionPane.showMessageDialog(null, "Incorrect Username or Password \n" + "Try Again!" ); {
					tf.setText("");
					pw.setText("");
					
				}
			}
	}
	
}
package gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import jdbc.NewDatabase;
import jdbc.User;

public class Login {
	JFrame frame;
	JLabel lbl_1, lbl_2;
	JTextField txt_1, txt_2;
	JButton btn_login, btn_close;
	User user=new User();
	
	public Login() {
		frame = new JFrame("Login Window");
		frame.setSize(new Dimension(250, 250));		
		
		lbl_1= new JLabel("Login Name : ");
		lbl_2= new JLabel("Login Pass : ");
		
		txt_1= new JTextField(10);
		txt_2= new JTextField(10);
		
		btn_login=new JButton("Login");
		btn_login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				user.setLoginName(txt_1.getText());
				user.setLoginPass(txt_2.getText());
				NewDatabase ndb= new NewDatabase ();
				user = ndb.login(user);
				if (user.getId()!=0) {
					System.out.println("Login success!");
				}
				else {
					System.out.println("Error to login");
				}
	        }
		});
		
		btn_close=new JButton("Close");
		btn_close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {	
				System.exit(0);
	        }
		});		
		
		frame.setLayout(new GridLayout(3, 2));
		frame.add(lbl_1);
		frame.add(txt_1);
		frame.add(lbl_2);
		frame.add(txt_2);
		frame.add(btn_login);
		frame.add(btn_close);		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Login();
	}
}



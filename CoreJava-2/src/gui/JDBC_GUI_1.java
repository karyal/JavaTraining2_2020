package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import jdbc.NewDatabase;
import jdbc.Person;

public class JDBC_GUI_1 extends JFrame implements ActionListener{
	JLabel lbl1, lbl2, lbl3;
	JTextField txt_1, txt_2, txt_3;
	JButton btn_save;
	
	public JDBC_GUI_1(){
		setTitle("JDBC");
		setSize(225, 175);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl1=new JLabel("PERSON ID : ");
		lbl2=new JLabel("NAME : ");
		lbl3=new JLabel("ADDRESS : ");
		
		txt_1=new JTextField(10);
		txt_2=new JTextField(10);
		txt_3=new JTextField(10);
		
		btn_save=new JButton("SAVE");
		btn_save.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(lbl1);
		add(txt_1);
		add(lbl2);
		add(txt_2);
		add(lbl3);
		add(txt_3);
		add(btn_save);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn_save) {
			int id = Integer.parseInt(txt_1.getText());
			String fullname= txt_2.getText();
			String address= txt_3.getText();
			Person p = new Person(id, fullname, address);
			NewDatabase ndb = new NewDatabase(); 
			boolean result = ndb.insert(p);
			if (result) {
				System.out.println("Save Record Successfully");
			}
			else {
				System.out.println("Error :  to save record");
			}
		}
	}
	
	public static void main(String[] args) {
		new JDBC_GUI_1();
	}	
}

package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import jdbc.NewDatabase;
import jdbc.Person;

public class JDBC_GUI_1 extends JFrame implements ActionListener{
	JLabel lbl1, lbl2, lbl3, lbl4;
	JTextField txt_1, txt_2, txt_3;
	JButton btn_save, btn_search;

	public JDBC_GUI_1(){
		setTitle("JDBC");
		setSize(225, 175);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lbl1=new JLabel("PERSON ID : ");
		lbl2=new JLabel("NAME : ");
		lbl3=new JLabel("ADDRESS : ");
		lbl4=new JLabel("");

		txt_1=new JTextField(10);
		txt_2=new JTextField(10);
		txt_3=new JTextField(10);

		btn_save=new JButton("SAVE");
		btn_search=new JButton("SEARCH");

		btn_save.addActionListener(this);
		btn_search.addActionListener(this);

		setLayout(new FlowLayout());
		add(lbl1);
		add(txt_1);
		add(lbl2);
		add(txt_2);
		add(lbl3);
		add(txt_3);
		add(btn_save);
		add(btn_search);
		add(lbl4);

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
				// Display message on MessageBox
				// Add Label on JFrame and display Message on that Label.
				JOptionPane.showMessageDialog(this,"Save Record Successfully");  
				lbl4.setText("Save Record Successfully");
			}
			else {
				System.out.println("Error :  to save record");
			}
		}		
		else if (e.getSource() == btn_search) {
			int id = Integer.parseInt(txt_1.getText());
			NewDatabase ndb = new NewDatabase(); 
			Person p = ndb.search(id);
			if(p.getPID()>0) {
				txt_1.setText(Integer.toString(p.getPID()));
				txt_2.setText(p.getFullName());
				txt_3.setText(p.getContactAddress());
				System.out.println("Record foud and display");
				JOptionPane.showMessageDialog(this,"Record foud and display");
				lbl4.setText("Record foud and display");
			}
			else {
				System.out.println("Record not found");
				JOptionPane.showMessageDialog(this,"Record not found");
				lbl4.setText("Record not found");
			}
		}
	}

	public static void main(String[] args) {
		new JDBC_GUI_1();
	}	
	//Search record and display based on id.
}
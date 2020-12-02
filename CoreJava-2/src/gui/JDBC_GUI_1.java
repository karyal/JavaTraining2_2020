package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import jdbc.NewDatabase;
import jdbc.Person;

public class JDBC_GUI_1 extends JFrame implements ActionListener{
	JLabel lbl1, lbl2, lbl3, lbl4;
	JTextField txt_1, txt_2, txt_3;
	JButton btn_save, btn_search, btn_edit, btn_delete;
	
	//JTable
	DefaultTableModel tmodel = new DefaultTableModel();
	JTable table1;

	public JDBC_GUI_1() {
		setTitle("JDBC");
		setSize(550, 350);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lbl1=new JLabel("PERSON ID : ");
		lbl2=new JLabel("NAME : ");
		lbl3=new JLabel("ADDRESS : ");
		lbl4=new JLabel("");

		txt_1=new JTextField(10);
		txt_2=new JTextField(10);
		txt_3=new JTextField(10);

		table1 = new JTable(tmodel);
		tmodel.addColumn("SN");
		tmodel.addColumn("NAME");
		tmodel.addColumn("ADDRESS");		

		btn_save=new JButton("SAVE");
		btn_search=new JButton("SEARCH");
		btn_edit = new JButton("EDIT");
		btn_delete = new JButton("DELETE");

		btn_save.addActionListener(this);
		btn_search.addActionListener(this);
		btn_edit.addActionListener(this);
		btn_delete.addActionListener(this);

		setLayout(new FlowLayout());
		add(lbl1);
		add(txt_1);
		add(lbl2);
		add(txt_2);
		add(lbl3);
		add(txt_3);
		add(btn_save);
		add(btn_search);
		add(btn_edit);
		add(btn_delete);
		add(lbl4);
		add(new JScrollPane(table1));
		setVisible(true);
		displayAll();
	}

	public void displayAll() {
		while(tmodel.getRowCount()>1) {
			tmodel.removeRow(0);
		}		
		NewDatabase ndb = new NewDatabase();
		List persons = ndb.select_all();
		for(Object obj : persons) {
			//System.out.println((Person)obj);
			Person p = (Person) obj;
			tmodel.addRow(new Object[] {p.getPID(), p.getFullName(), p.getContactAddress()});
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn_save) { //Save
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
			displayAll();
		}
		else if (e.getSource() == btn_search) { //Search
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
				txt_2.setText("");
				txt_3.setText("");
				System.out.println("Record not found");
				JOptionPane.showMessageDialog(this,"Record not found");
				lbl4.setText("Record not found");
			}
		}
		else if (e.getSource() == btn_edit) { //Edit
			Person p = new Person();
			p.setPID(Integer.parseInt(txt_1.getText()));
			p.setFullName(txt_2.getText());
			p.setContactAddress(txt_3.getText());		
			NewDatabase ndb = new NewDatabase();
			boolean result = ndb.edit(p);
			if (result) {
				System.out.println("Record update");
				JOptionPane.showMessageDialog(this,"Record update");
				lbl4.setText("Record update");
			}
			else {
				System.out.println("Error: to update record");
				JOptionPane.showMessageDialog(this,"Error: to update record");
				lbl4.setText("Error: to update record");
			}
			displayAll();
		}
		else if (e.getSource() == btn_delete) { //Delete
			int id = Integer.parseInt(this.txt_1.getText());
			NewDatabase ndb = new NewDatabase();
			boolean result = ndb.delete(id);
			if (result) {
				System.out.println("Record deleted!");
				JOptionPane.showMessageDialog(this,"Record deleted!");
				lbl4.setText("Record deleted!");
				txt_1.setText("");
				txt_2.setText("");
				txt_3.setText("");
			}
			else {
				System.out.println("Error: to delete record");
				JOptionPane.showMessageDialog(this,"Error: to delete record");
				lbl4.setText("Error: to delete record");
			}
			displayAll();
		}
	}

	public static void main(String[] args) {
		new JDBC_GUI_1();
	}	
	//Search record and display based on id.
}
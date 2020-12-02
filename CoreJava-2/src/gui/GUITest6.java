package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GUITest6 {
	public GUITest6() {
		DefaultTableModel model = new DefaultTableModel();
		JTable table = new JTable(model);

		model.addColumn("Col1");
		model.addColumn("Col2");

		// Create the first row
		model.insertRow(0, new Object[] { "r1" });


		// Append a row
		model.insertRow(model.getRowCount(), new Object[] { "r5" });

		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.add(new JScrollPane(table));
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new GUITest6();
	}
}

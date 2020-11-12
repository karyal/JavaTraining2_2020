package gui;

import javax.swing.JFrame;

class MyWindow extends JFrame{
	public MyWindow(String title) {
		super(title);
		setSize(250, 200);
		setVisible(true);
	}	
}

//Create GUI to input, process, and display output of NewStudent3 Class.

public class GUITest5{
	public static void main(String[] args) {
		MyWindow obj1= new MyWindow("My Test Window");
	}
	
}
package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class GuestBook implements ActionListener {
JFrame frame;
JPanel panel;
JButton addName;
JButton viewNames;
ArrayList<String> list = new ArrayList<String>();
	public void run() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		panel = new JPanel();
		addName = new JButton();
		viewNames = new JButton();
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource() == addName) {
	String add	= JOptionPane.showInputDialog("What is your name");
	list.add(add);	
	}
	if(e.getSource() == viewNames) {
 JOptionPane.showMessageDialog(null, "The name u added was " + list);
		
	}
	}
}

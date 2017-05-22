package section07_SwingAndEventHandling.BasicGuiApplication;
import java.awt.Color;

import javax.swing.*;

public class AssesmentGUI extends JFrame{
	//Declare object 
	private JPanel p;
	private JLabel titleLbl;
	private JLabel nameLbl;
	private JLabel typeLbl;
	private JLabel weightingLbl;
	private JTextField nameTf;
	private JTextField typeTf;
	private JTextField weightingTf;
	private JButton addBtn;
	
	public AssesmentGUI(){
		//set size and location
		setSize(500,500);
		setLocation(10,10);
		//create panel
		p = new JPanel();
		//set panel layout
		p.setLayout(null);
		//set background colour of panel
		p.setBackground(Color.WHITE);
		//add panel to JFrame
		add(p);
		
		//create objects
		titleLbl = new JLabel ("Assesment Application");
		nameLbl = new JLabel ("Assesment Name");
		typeLbl = new JLabel("Assesmenet Type");
		weightingLbl = new JLabel("Assesmetn Weighting");
		
		nameTf = new JTextField();
		typeTf = new JTextField();
		weightingTf = new JTextField();
		
		addBtn = new JButton("Add Assesment");
		
		//set bounds of object (x, y, width, height)
		titleLbl.setBounds(10, 10, 200, 30);
		nameLbl.setBounds(10, 50, 200, 30);
		typeLbl.setBounds(10, 100, 200, 30);
		weightingLbl.setBounds(10, 150, 200, 30);
		
		nameTf.setBounds(230, 50, 200, 30);
		typeTf.setBounds(230, 100, 200, 30);
		weightingTf.setBounds(230, 150, 200, 30);
		addBtn.setBounds(10, 200, 150, 30);
		
		p.add(titleLbl);
		p.add(nameLbl);
		p.add(typeLbl);
		p.add(weightingLbl);
		p.add(nameTf);
		p.add(typeTf);
		p.add(weightingTf);
		p.add(addBtn);
				
	}
}

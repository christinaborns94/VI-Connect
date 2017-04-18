import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class selectModel {
		static int oldmodelID = -1;
public static void displayModelList(String makeName) {


    int makeid = databaseTest.getMakeID(makeName);
        JFrame myJFrame = new JFrame();
        myJFrame.setTitle("Select Model");
        myJFrame.setSize(300, 300);
        JPanel panel = new JPanel();
 
        JLabel question = new JLabel("Please select a model that you want the VIN for: ");
        panel.add(question);

        String[] models = databaseTest.getModels(makeid);
     
        JList choice = new JList(models);
        choice.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   
        panel.add(choice);
        choice.addListSelectionListener(
        	new ListSelectionListener() {
        			public void valueChanged(ListSelectionEvent listevent) {
        				String modelName = (String) choice.getSelectedValue();
        				int modelid = databaseTest.getModelID(modelName);
        				
        				if(modelid != oldmodelID) {
        					displayInfo(modelid);
        					oldmodelID = modelid;
        				}
        			}
        		}
        		);
        myJFrame.add(panel);
        myJFrame.setVisible(true);
        
    }
public static void displayInfo(int modelid) {
	modelInfo modelinfo = databaseTest.getInfo(modelid);
	JFrame imJFrame = new JFrame();
	imJFrame.setTitle("Model Info");
	imJFrame.getContentPane().setLayout(new BorderLayout());
	imJFrame.setSize(400,400);
	BufferedImage img = null;
	if (modelinfo.image != null) {
		try {
			img = ImageIO.read(modelinfo.image);
		} catch (Exception e) {
				System.out.println("Mir egal");
		}
	} else  {
		try {
		img = ImageIO.read(new File("C:\\Users\\chris\\Desktop\\Viconnect\\default.jpg"));
		} catch (Exception e) {
			System.out.println("Mir egal");
		}
	}

	JPanel impanel = new JPanel();
	JLabel modelimg = new JLabel(new ImageIcon(img));
	impanel.add(modelimg);
	JPanel namepanel = new JPanel();
	JLabel name = new JLabel("Model: "+modelinfo.modelName);
	namepanel.add(name);
	JPanel descrpanel = new JPanel();
	JTextArea descr = new JTextArea("Location: " + modelinfo.modelDescription);
	descrpanel.add(descr);
	
	imJFrame.getContentPane().add(namepanel, BorderLayout.NORTH);
	imJFrame.getContentPane().add(impanel, BorderLayout.CENTER);
	imJFrame.getContentPane().add(descrpanel, BorderLayout.SOUTH);
	imJFrame.setVisible(true);
	
}
	
}

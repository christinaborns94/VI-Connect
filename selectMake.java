import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class selectMake extends JFrame implements ActionListener
{

    public selectMake()
    {
       super("Select A Car Make:");

         Container contentPane = getContentPane();
         JPanel Vin = new JPanel();

        //Create Label
         JLabel label = new JLabel("Please select Car Make:");



		 //create fields in buttons for all makes
		 JButton AstonMartin = new JButton("Aston Martin");
		 JButton AlfaRomeo = new JButton("Alfa Romeo");
		 JButton Audi = new JButton("Audi");
		 JButton Bentley = new JButton("Bentley");
		 JButton BMW = new JButton("BMW");
		 JButton Citroen = new JButton("Citroen");
		 JButton Chrysler = new JButton("Chrysler");
         JButton Cherokee = new JButton("Cherokee");
         JButton Chevrolet = new JButton("Chevrolet");
         JButton Daewoo = new JButton("Daewoo");
         JButton Dodge = new JButton("Dodge");
         JButton Daihatsu = new JButton("Daihatsu");
         //JButton DeLorean = new JButton("DeLorean");
         JButton Fiat = new JButton("Fiat");
         JButton Ford = new JButton("Ford");
         JButton Hyundai = new JButton("Hyundai");
         JButton Ferrari = new JButton("Ferrari");
         JButton Honda = new JButton("Honda");
         JButton Jeep06 = new JButton("Jeep 06");
         JButton Jeep03 = new JButton("Jeep 03");
         JButton Isuzu = new JButton("Isuzu");
         JButton Jaguar = new JButton("Jaguar");
         JButton Kia = new JButton("Kia");
         JButton Landrover = new JButton("Landrover");
         JButton Lexus = new JButton("Lexus");
         JButton Maserati = new JButton("Maserati");
         JButton MG = new JButton("MG");
         JButton Mazda = new JButton("Mazda");
         JButton Mercedes = new JButton("Mercedes");
         JButton Mitsubishi = new JButton("Mitsubishi");
         JButton Nissan = new JButton("Nissan");
         JButton Opel = new JButton("Opel");
         JButton Peugeot = new JButton("Peugeot");
         JButton Porsche = new JButton("Porsche");
         JButton Renault = new JButton("Renault");
         JButton Rover = new JButton("Rover");
         JButton Saab = new JButton("Saab");
         JButton Seat = new JButton("Seat");
         JButton Smart = new JButton("Smart");
         JButton Sangyong = new JButton("Sangyong");
         JButton Skoda = new JButton("Skoda");
         JButton Suzuki = new JButton("Suzuki");
         JButton Subaru = new JButton("Subaru");
         JButton Toyota = new JButton("Toyota");
         JButton Volkswagen = new JButton("Volkswagen");
         JButton Volvo = new JButton("Volvo");




		//Assign Buttons to panel
		 Vin.add(AstonMartin);
		 Vin.add(AlfaRomeo);
		 Vin.add(Audi);
		 Vin.add(Bentley);
		 Vin.add(BMW);
		 Vin.add(Citroen);
		 Vin.add(Chrysler);
		 Vin.add(Cherokee);
		 Vin.add(Chevrolet);
		 Vin.add(Daewoo);
		 Vin.add(Dodge);
		 Vin.add(Daihatsu);
		// Vin.add(DeLorean);
		 Vin.add(Fiat);
		 Vin.add(Ford);
		 Vin.add(Hyundai);
		 Vin.add(Ferrari);
		 Vin.add(Honda);
		 Vin.add(Jeep06);
		 Vin.add(Jeep03);
		 Vin.add(Isuzu);
		 Vin.add(Jaguar);
		 Vin.add(Kia);
		 Vin.add(Landrover);
		 Vin.add(Lexus);
		 Vin.add(Maserati);
		 Vin.add(MG);
		 Vin.add(Mazda);
		 Vin.add(Mercedes);
		 Vin.add(Mitsubishi);
		 Vin.add(Nissan);
		 Vin.add(Opel);
		 Vin.add(Peugeot);
		 Vin.add(Porsche);
		 Vin.add(Renault);
		 Vin.add(Rover);
		 Vin.add(Saab);
		 Vin.add(Seat);
		 Vin.add(Smart);
		 Vin.add(Sangyong);
		 Vin.add(Skoda);
		 Vin.add(Suzuki);
		 Vin.add(Subaru);
		 Vin.add(Toyota);
		 Vin.add(Volkswagen);
		 Vin.add(Volvo);
		 Vin.add(label);
		 contentPane.add(Vin);
		// label.setLayout(new GridLayout(1,1));
		 Vin.setLayout(new GridLayout(10,5));

		 contentPane.add(label,BorderLayout.NORTH);
         //contentPane.add(Vin,BorderLayout.CENTER);



		//Add listener
		 AstonMartin.addActionListener(this);
		 AlfaRomeo.addActionListener(this);
		 Audi.addActionListener(this);
		 Bentley.addActionListener(this);
		 BMW.addActionListener(this);
		 Citroen.addActionListener(this);
		 Chrysler.addActionListener(this);
		 Cherokee.addActionListener(this);
		 Chevrolet.addActionListener(this);
		 Daewoo.addActionListener(this);
		 Dodge.addActionListener(this);
		 Daihatsu.addActionListener(this);
		// DeLorean.addActionListener(this);
		 Fiat.addActionListener(this);
		 Ford.addActionListener(this);
		 Hyundai.addActionListener(this);
		 Ferrari.addActionListener(this);
		 Honda.addActionListener(this);
		 Jeep06.addActionListener(this);
		 Jeep03.addActionListener(this);
		 Isuzu.addActionListener(this);
		 Jaguar.addActionListener(this);
		 Kia.addActionListener(this);
		 Landrover.addActionListener(this);
		 Lexus.addActionListener(this);
		 Maserati.addActionListener(this);
		 MG.addActionListener(this);
		 Mazda.addActionListener(this);
		 Mercedes.addActionListener(this);
		 Mitsubishi.addActionListener(this);
		 Nissan.addActionListener(this);
		 Opel.addActionListener(this);
		 Peugeot.addActionListener(this);
		 Porsche.addActionListener(this);
		 Renault.addActionListener(this);
		 Rover.addActionListener(this);
		 Saab.addActionListener(this);
		 Seat.addActionListener(this);
		 Smart.addActionListener(this);
		 Sangyong.addActionListener(this);
		 Skoda.addActionListener(this);
		 Suzuki.addActionListener(this);
		 Subaru.addActionListener(this);
		 Toyota.addActionListener(this);
		 Volkswagen.addActionListener(this);
		 Volvo.addActionListener(this);

		 setTitle("Select Car Make");//set the title
         setSize(700,600);//set the size of the gui
    }
    public static void main(String[] args)
    {
        selectMake frame = new selectMake();
        frame.setVisible(true);


    }//end main
      //perform action
            public void actionPerformed(ActionEvent e)
		    {
            	selectModel.displayModelList(e.getActionCommand());
            
				  // String model="";


              /* if (e.getActionCommand().equals("Aston Martin") ) selectModel.displayModelList("Aston Martin");

		       if (e.getActionCommand().equals("Alfa Romeo") )model ="156";

		       if (e.getActionCommand().equals("Audi") )selectModel.displayModelList("Audi");

		       if (e.getActionCommand().equals("Bentley") )model ="A4";

		       if (e.getActionCommand().equals("BMW") )model ="3 Series";

		       if (e.getActionCommand().equals("Citreon") )model ="C4";

		       if (e.getActionCommand().equals("Chrysler") )model ="A4";

		       if (e.getActionCommand().equals("Cherokee") )model ="A4";

		       if (e.getActionCommand().equals("Daewoo") )model ="A4";

		       if (e.getActionCommand().equals("Dodge") )model ="A4";

		       if (e.getActionCommand().equals("Daihatsu") )model ="A4";

		       if (e.getActionCommand().equals("DeLorean") )model ="A4";

		       if (e.getActionCommand().equals("Fiat") )model ="A4";

		       if (e.getActionCommand().equals("Ford") )model ="A4";

		       if (e.getActionCommand().equals("Hyundai") )model ="A4";

		       if (e.getActionCommand().equals("Ferrari") )model ="A4";

		       if (e.getActionCommand().equals("Honda") )model ="A4";

		       if (e.getActionCommand().equals("Jeep") )model ="A4";

		       if (e.getActionCommand().equals("Isuzu") )model ="A4";

		       if (e.getActionCommand().equals("Jaguar") )model ="A4";

		       if (e.getActionCommand().equals("Kai") )model ="A4";

		       if (e.getActionCommand().equals("Landrover") )model ="A4";

		       if (e.getActionCommand().equals("Lexus") )model ="A4";

		       if (e.getActionCommand().equals("Maserati") )model ="A4";

		       if (e.getActionCommand().equals("MG") )model ="A4";

		       if (e.getActionCommand().equals("Mazda") )model ="A4";

		       if (e.getActionCommand().equals("Mercedes") )model ="A4";

		       if (e.getActionCommand().equals("Mitsubishi") )model ="A4";

		       if (e.getActionCommand().equals("Nissan") )model ="A4";

		       if (e.getActionCommand().equals("Opel") )model ="A4";

		       if (e.getActionCommand().equals("Peugeot") )model ="A4";

		       if (e.getActionCommand().equals("Porsche") )model ="A4";

		       if (e.getActionCommand().equals("Renault") )model ="A4";

		       if (e.getActionCommand().equals("Rover") )model ="A4";

		       if (e.getActionCommand().equals("Saab") )model ="A4";

		       if (e.getActionCommand().equals("Seat") )model ="A4";

		       if (e.getActionCommand().equals("Smart") )model ="A4";

		       if (e.getActionCommand().equals("Sangyong") )model ="A4";

		       if (e.getActionCommand().equals("Skoda") )model ="A4";

		       if (e.getActionCommand().equals("Suzuki") )model ="A4";

		       if (e.getActionCommand().equals("Subaru") )model ="A4";

		       if (e.getActionCommand().equals("Toyota") )model ="A4";

		       if (e.getActionCommand().equals("Volkswagan") )model ="A4";

		       if (e.getActionCommand().equals("Volvo") )model ="A4";
*/


			   //   JOptionPane.showMessageDialog(null, model);

			     // System.out.println("Test It");

    }//end method action listener

}//end class VIN
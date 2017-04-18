import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;   // Use 'Connection', 'Statement' and 'ResultSet' classes in java.sql package

import javax.imageio.ImageIO;
public class databaseTest {
	private static String databaseName = "jdbc:mysql://localhost:3306/viconnect";
	private static String databaseUser = "root";
	public static void main(String[] args) {
	      try {
	         // Step 1: Allocate a database 'Connection' object
	         Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/viconnect", "root", "");
	               // MySQL: "jdbc:mysql://hostname:port/databaseName", "username", "password"
	    	String makeName = "Audi";
	         int makeid = getMakeID(makeName);
	         String[] models = getModels(makeid);
	    		  
	         // Step 2: Allocate a 'Statement' object in the Connection
	       /*  Statement stmt = conn.createStatement();
	      ) {
	         // Step 3: Execute a SQL SELECT query, the query result
	         //  is returned in a 'ResultSet' object.
	         String strSelect = "select Name from make";
	         System.out.println("The SQL query is: " + strSelect); // Echo For debugging
	         System.out.println();
	 
	         ResultSet rset = stmt.executeQuery(strSelect);
	 
	         
	         // Step 4: Process the ResultSet by scrolling the cursor forward via next().
	         //  For each row, retrieve the contents of the cells with getXxx(columnName).
	         System.out.println("The records selected are:");
	         int rowCount = 0;
	         while(rset.next()) {   // Move the cursor to the next row, return false if no more row
	          String title = rset.getString("Name");
	    //        double price = rset.getDouble("price");
	      //      int    qty   = rset.getInt("qty");
	            System.out.println(title);
	            ++rowCount;
	         }
	         System.out.println("Total number of records = " + rowCount);
	 */
	      } catch(SQLException ex) {
	         ex.printStackTrace();
	      }
	}
	      // Step 5: Close the resources - Done automatically by try-with-resources
	      
	public static int getMakeID (String makeName) {
	try { Statement stmt = DriverManager.getConnection( databaseName, databaseUser, "").createStatement();
	String strSelect = "select MakeID from make where Name = '"+makeName+"'";
	ResultSet rset = stmt.executeQuery(strSelect);
	int makeid = -1;
	if (rset.next()) {
		makeid = rset.getInt("MakeID"); 
	}
	System.out.println(makeid);
	return makeid;
	} catch(SQLException ex) {
		ex.printStackTrace();
		int makeid= -1;
		return makeid;
	}
	}
	public static String[] getModels (int makeid) {
	try { Statement stmt = DriverManager.getConnection( databaseName, databaseUser, "").createStatement();
	String strSelect = "select ModelName from model where MakeID = "+makeid+"";
	ResultSet rset = stmt.executeQuery(strSelect);
	int size = 0;
	if(rset.last()) {
		size = rset.getRow();
		rset.beforeFirst();
	}
	String[] models = new String[size];
	int counter = 0;
	while (rset.next()) {
		models[counter] = rset.getString("ModelName"); 
	counter++;
	}
	System.out.println("models:");
	for (int i = 0; i< models.length; i++ ) {
	System.out.println(models[i]);
	}
	return models;
	} catch(SQLException ex) {
		ex.printStackTrace();
		return null;
	}
}

	
	public static int getModelID (String modelName) {
	try { Statement stmt = DriverManager.getConnection( databaseName, databaseUser, "").createStatement();
	String strSelect = "select ModelID from model where ModelName = '"+modelName+"'";
	ResultSet rset = stmt.executeQuery(strSelect);
	int modelid = -1;
	if (rset.next()) {
		modelid = rset.getInt("ModelID"); 
	}
	System.out.println(modelid);
	return modelid;
	} catch(SQLException ex) {
		ex.printStackTrace();
		int modelid= -1;
		return modelid;
	}
}
	
	public static modelInfo getInfo(int modelid) {
		try { Statement stmt = DriverManager.getConnection( databaseName, databaseUser, "").createStatement();
		String strSelect = "select ModelName, Description, Image from model where ModelID = "+modelid+"";
		ResultSet rset = stmt.executeQuery(strSelect);
		modelInfo info = new modelInfo();
		int counter = 0;
		while (rset.next()) {
			info.modelName = rset.getString("ModelName"); 
			info.modelDescription = rset.getString("Description");
			info.image = rset.getBinaryStream("Image"); 
			
		counter++;
		}
		
		System.out.println("info: " + info.modelName);
	
		return info;
		} catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

}	


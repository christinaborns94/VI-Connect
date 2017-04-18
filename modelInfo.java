import java.io.*;
public class modelInfo {
	String modelName;
	String modelDescription;
	InputStream image;
	public modelInfo(String name, String desc, InputStream img) {
	modelName = name;
	modelDescription = desc;
	image = img;
	}
	public modelInfo() {
	modelName = "Missing";
	modelDescription = "Missing";
	// default image
	}
}
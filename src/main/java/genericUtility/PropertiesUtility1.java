package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility1 {
public static String main(String[] args) throws Exception{
	FileInputStream fis = new FileInputStream("D:\\E1SeleniumBatch/DataDriven.properties");
	   PropertiesUtility prop=new PropertiesUtility();
	   String URL=prop.getDataFromPropertiesFile("url");
	   String UN=prop.getDataFromPropertiesFile("username");
	   System.out.println(URL);
	   System.out.println(UN);
	   return UN;
}




}


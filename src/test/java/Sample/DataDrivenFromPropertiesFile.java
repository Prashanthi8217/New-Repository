package Sample;
	import java.io.FileInputStream;
     import java.util.Properties;
     import genericUtility.IpathConstant;
	  public class DataDrivenFromPropertiesFile {
		public static void main (String []args)throws Exception
		{
			FileInputStream fis=new FileInputStream(IpathConstant.excelPath);
			Properties prop=new Properties();
			prop.load(fis);
			String value=prop.getProperty("UserName");
			System.out.println(value);
		
		}
	}

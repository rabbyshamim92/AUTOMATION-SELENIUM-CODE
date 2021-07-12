import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class readProperties {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	File srcf = new File("src/environment.properties");
	FileInputStream SrcIS = new FileInputStream(srcf);
	Properties pro = new Properties();
	try {
		pro.load(SrcIS);
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println(pro.get("username"));
	System.out.println(pro.get("password"));
	System.out.println(pro.get("url"));
	

	}

}

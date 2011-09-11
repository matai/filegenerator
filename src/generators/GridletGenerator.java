package generators;

import generators.config.Config;
import generators.generated.templates.EntityAttributeUiXml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridletGenerator
{
	public static void main(String[] args) 
	{
		try
		{
			//1. Alter the configuration output path (optional)
			Config.outputPath = "C:\\Workworkspace\\filegenerator\\src\\generators\\output\\";
			
			File outPutDirectory = new File(Config.outputPath);
			
			File[] files = outPutDirectory.listFiles();
			List<File> listFiles = Arrays.asList(files);
			
			for(File file : listFiles)
			{
				file.delete();
			}
			
			//2. Alter entity type here
			String entity = "Person";
			
			//3. Add attribute types here
			ArrayList<String> attributes = new ArrayList<String>();
			attributes.add("Contact");
			
			for(String attribute : attributes)
			{
				EntityAttributeUiXml uiTemplate = new EntityAttributeUiXml();
				String result = uiTemplate.generate(attribute);
				
				FileOutputStream newOut = new FileOutputStream(Config.outputPath + 
						entity + attribute + ".ui.xml");  
				    
				newOut.write(result.getBytes());  
				newOut.close();
			}
		}
		catch (Exception e)
		{
			System.err.println("Error: " + e.getMessage());
		}
	}
}

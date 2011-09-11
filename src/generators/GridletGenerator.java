package generators;

import generators.config.Config;
import generators.generated.templates.EntityAttributeGridletUiXml;
import generators.generated.templates.EntityAttributeGridletView;
import generators.generated.templates.EntityAttributeGridletViewImpl;

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
			
			String output;
			FileOutputStream newOut;
			
			//End config, begin generation
			for(String attribute : attributes)
			{
				//Gridlet ui.xml
				EntityAttributeGridletUiXml gridletUiTemplate = new EntityAttributeGridletUiXml();
				output = gridletUiTemplate.generate(entity, attribute);
				
				newOut = new FileOutputStream(Config.outputPath + 
						entity + attribute + "Gridlet.ui.xml");  
				    
				newOut.write(output.getBytes());  
				newOut.close();
				
				//Gridlet view
				EntityAttributeGridletView gridletView = new EntityAttributeGridletView();
				output = gridletView.generate(entity, attribute);
				
				newOut = new FileOutputStream(Config.outputPath + 
						entity + attribute + "GridletView.java");  
				    
				newOut.write(output.getBytes());  
				newOut.close();
				
				//Gridlet viewImpl
				EntityAttributeGridletViewImpl gridletViewImpl = new EntityAttributeGridletViewImpl();
				output = gridletViewImpl.generate(entity, attribute);
				
				newOut = new FileOutputStream(Config.outputPath + 
						entity + attribute + "GridletViewImpl.java");  
				    
				newOut.write(output.getBytes());  
				newOut.close();
			}
		}
		catch (Exception e)
		{
			System.err.println("Error: " + e.getMessage());
		}
	}
}

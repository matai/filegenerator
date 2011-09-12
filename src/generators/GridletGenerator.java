package generators;

import generators.config.Config;
import generators.generated.templates.EntityAttributeGridletPresenter;
import generators.generated.templates.EntityAttributeGridletUiXml;
import generators.generated.templates.EntityAttributeGridletView;
import generators.generated.templates.EntityAttributeGridletViewImpl;
import generators.generated.templates.EntityAttributePopupPresenter;
import generators.generated.templates.EntityAttributePopupUiXml;
import generators.generated.templates.EntityAttributePopupView;
import generators.generated.templates.EntityAttributePopupViewImpl;
import generators.generated.templates.IExplorerTemplate;

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
			//Alter the configuration output path (optional)
			Config.outputPath = "C:\\WorkspaceHot\\filegenerator\\src\\generators\\output\\";
			
			File outPutDirectory = new File(Config.outputPath);
			
			//Clear output directory
			File[] files = outPutDirectory.listFiles();
			List<File> listFiles = Arrays.asList(files);
			
			for(File file : listFiles)
			{
				file.delete();
			}
			
			//Alter entity type here
			String entity = "Person";
			
			//Add attribute types here
			ArrayList<String> attributes = new ArrayList<String>();
			attributes.add("Contact");
			
			//End config, begin generation
			ArrayList<IExplorerTemplate> templateList = new ArrayList<IExplorerTemplate>();

			templateList.add(new EntityAttributePopupUiXml());
			templateList.add(new EntityAttributePopupView());
			templateList.add(new EntityAttributePopupViewImpl());
			templateList.add(new EntityAttributePopupPresenter());
			templateList.add(new EntityAttributeGridletUiXml());
			templateList.add(new EntityAttributeGridletView());
			templateList.add(new EntityAttributeGridletViewImpl());
			templateList.add(new EntityAttributeGridletPresenter());
			
			String output;
			FileOutputStream fileOut;
			
			for(String attribute : attributes)
			{			
				for(IExplorerTemplate template : templateList)
				{
					output = template.generate(entity, attribute);
					
					fileOut = new FileOutputStream(Config.outputPath + 
							entity + attribute + template.getFileName());  
					
					fileOut.write(output.getBytes());  
					fileOut.close();
				}
			}
		}
		catch (Exception e)
		{
			System.err.println("Error: " + e.getMessage());
		}
	}
}

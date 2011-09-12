package generators.generated.templates;

public interface IExplorerTemplate 
{
	public String getFileName() ;

	public void setFileName(String fileName) ;

	public String generate(String entity, String attribute);
}

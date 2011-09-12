package generators.generated.templates;

public class EntityAttributeGridletView extends AbstractExplorerTemplate implements IExplorerTemplate
{
  protected static String nl;
  public static synchronized EntityAttributeGridletView create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityAttributeGridletView result = new EntityAttributeGridletView();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package au.com.arclight.sag.client.domain.mvp.view.explorer.";
  protected final String TEXT_2 = ".gridlet;" + NL + "" + NL + "import au.com.arclight.sag.client.domain.mvp.view.explorer.ExplorerGridletPresenter;" + NL + "import au.com.arclight.sag.client.domain.mvp.view.explorer.ExplorerGridletView;" + NL + "" + NL + "public interface I";
  protected final String TEXT_3 = "GridletView extends ExplorerGridletView" + NL + "{" + NL + "\tpublic interface Presenter extends ExplorerGridletPresenter" + NL + "\t{" + NL + "" + NL + "\t}" + NL + "\t" + NL + "\tpublic void setPresenter(Presenter presenter);" + NL + "}";

	public String generate(String Entity, String Attribute)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    fileName = "GridletView.java";
    String entity = Entity.toLowerCase();
    String EntityAttribute = Entity + Attribute;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
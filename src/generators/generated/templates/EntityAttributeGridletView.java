package generators.generated.templates;

public class EntityAttributeGridletView
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
  protected final String TEXT_1 = "package au.com.arclight.sag.client.domain.mvp.view.explorer.person.gridlet;" + NL + "" + NL + "import au.com.arclight.sag.client.domain.mvp.view.explorer.ExplorerGridletPresenter;" + NL + "import au.com.arclight.sag.client.domain.mvp.view.explorer.ExplorerGridletView;" + NL + "" + NL + "public interface I";
  protected final String TEXT_2 = "GridletView extends ExplorerGridletView" + NL + "{" + NL + "\tpublic interface Presenter extends ExplorerGridletPresenter" + NL + "\t{" + NL + "" + NL + "\t}" + NL + "\t" + NL + "\tpublic void setPresenter(Presenter presenter);" + NL + "}";

	public String generate(String entity, String attribute)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    String entityAttribute = entity + attribute;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(entityAttribute);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
package generators.generated.templates;

public class EntityAttributePopupView extends AbstractExplorerTemplate implements IExplorerTemplate
{
  protected static String nl;
  public static synchronized EntityAttributePopupView create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityAttributePopupView result = new EntityAttributePopupView();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package au.com.arclight.sag.client.domain.mvp.view.explorer.person.popup;" + NL + "" + NL + "import au.com.arclight.sag.client.domain.mvp.presenter.explorer.ExplorerPopupPresenter;" + NL + "import au.com.arclight.sag.client.domain.mvp.view.explorer.ExplorerPopupView;" + NL + "" + NL + "public interface I";
  protected final String TEXT_2 = "PopupView extends ExplorerPopupView " + NL + "{" + NL + "\tpublic interface Presenter extends ExplorerPopupPresenter" + NL + "\t{" + NL + "\t}" + NL + "\t" + NL + "\tpublic void setPresenter(Presenter presenter);" + NL + "}";

	public String generate(String Entity, String Attribute)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    fileName = "PopupView.java";
    String EntityAttribute = Entity + Attribute;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
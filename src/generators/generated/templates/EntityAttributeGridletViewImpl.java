package generators.generated.templates;

public class EntityAttributeGridletViewImpl
{
  protected static String nl;
  public static synchronized EntityAttributeGridletViewImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityAttributeGridletViewImpl result = new EntityAttributeGridletViewImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package au.com.arclight.sag.client.domain.mvp.view.explorer.person.gridlet;" + NL + "" + NL + "import au.com.arclight.sag.client.domain.mvp.view.explorer.AbstractGridletViewImpl;" + NL + "" + NL + "import com.google.gwt.core.client.GWT;" + NL + "import com.google.gwt.uibinder.client.UiBinder;" + NL + "import com.google.gwt.uibinder.client.UiTemplate;" + NL + "import com.google.gwt.user.client.ui.Widget;" + NL + "import com.google.inject.Inject;" + NL + "" + NL + "public class ";
  protected final String TEXT_2 = "GridletViewImpl extends AbstractGridletViewImpl " + NL + "implements I";
  protected final String TEXT_3 = "GridletView" + NL + "{" + NL + "\tprivate Presenter presenter;" + NL + "\t" + NL + "\t@UiTemplate( \"template/";
  protected final String TEXT_4 = "Gridlet.ui.xml\" ) " + NL + "\tpublic interface WidgetUiBinder extends UiBinder< Widget, ";
  protected final String TEXT_5 = "GridletViewImpl >{}" + NL + "\tprivate static WidgetUiBinder uiBinder = GWT.create(WidgetUiBinder.class);" + NL + "" + NL + "\t@Inject" + NL + "\tpublic ";
  protected final String TEXT_6 = "GridletViewImpl()" + NL + "\t{" + NL + "\t\tsuper();" + NL + "\t\t" + NL + "\t\tinitWidget(uiBinder.createAndBindUi(this));" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic void setPresenter(Presenter presenter) " + NL + "\t{" + NL + "\t\tthis.presenter = presenter;" + NL + "\t}" + NL + "}";

	public String generate(String entity, String attribute)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    String entityAttribute = entity + attribute;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(entityAttribute);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(entityAttribute);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(entityAttribute);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(entityAttribute);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(entityAttribute);
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
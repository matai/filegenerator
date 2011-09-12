package generators.generated.templates;

public class EntityAttributePopupViewImpl extends AbstractExplorerTemplate implements IExplorerTemplate
{
  protected static String nl;
  public static synchronized EntityAttributePopupViewImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityAttributePopupViewImpl result = new EntityAttributePopupViewImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package au.com.arclight.sag.client.domain.mvp.view.explorer.";
  protected final String TEXT_2 = ".popup;" + NL + "" + NL + "import au.com.arclight.sag.client.domain.mvp.view.explorer.AbstractExplorerPopupViewImpl;" + NL + "import au.com.arclight.sag.client.node.application.resource.Resources;" + NL + "" + NL + "import com.google.gwt.core.client.GWT;" + NL + "import com.google.gwt.dom.client.DivElement;" + NL + "import com.google.gwt.event.dom.client.ClickEvent;" + NL + "import com.google.gwt.event.dom.client.ClickHandler;" + NL + "import com.google.gwt.uibinder.client.UiBinder;" + NL + "import com.google.gwt.uibinder.client.UiField;" + NL + "import com.google.gwt.uibinder.client.UiTemplate;" + NL + "import com.google.gwt.user.client.ui.Widget;" + NL + "import com.google.inject.Inject;" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = "PopupViewImpl extends AbstractExplorerPopupViewImpl " + NL + "\timplements I";
  protected final String TEXT_4 = "PopupView" + NL + "{" + NL + "\t@UiTemplate( \"template/";
  protected final String TEXT_5 = "Popup.ui.xml\" ) " + NL + "\tpublic interface WidgetUiBinder extends UiBinder< Widget, ";
  protected final String TEXT_6 = "PopupViewImpl >{}" + NL + "\tprivate static WidgetUiBinder uiBinder = GWT.create(WidgetUiBinder.class);" + NL + "" + NL + "\t@UiField DivElement noItemsLabel;" + NL + "\t" + NL + "\tprivate Presenter presenter;" + NL + "" + NL + "\tprivate String STYLE_HIDDEN = Resources.INSTANCE.style().hidden();" + NL + "\t" + NL + "\t@Inject" + NL + "\tpublic ";
  protected final String TEXT_7 = "PopupViewImpl()" + NL + "\t{" + NL + "\t\tinitWidget(uiBinder.createAndBindUi(this));" + NL + "" + NL + "\t\taddSaveHandler();" + NL + "\t\taddCancelHandler();" + NL + "\t}" + NL + "\t" + NL + "\tpublic void setPresenter(Presenter presenter) " + NL + "\t{" + NL + "\t\tthis.presenter = presenter;" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tprotected void cancelButtonClicked() " + NL + "\t{" + NL + "\t\tpresenter.buttonCancelClicked();" + NL + "\t}" + NL + "\t" + NL + "\tprotected void saveButtonClicked() " + NL + "\t{" + NL + "\t\t//TODO : Your save implementation here" + NL + "\t\t" + NL + "\t\tpresenter.buttonSaveClicked();" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic void hideNoItemsLabel() " + NL + "\t{" + NL + "\t\tnoItemsLabel.addClassName(STYLE_HIDDEN);" + NL + "\t}" + NL + "}";
  protected final String TEXT_8 = NL;

	public String generate(String Entity, String Attribute)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    fileName = "PopupViewImpl.java";
    String entity = Entity.toLowerCase();
    String entityAttribute = entity + Attribute;
    String EntityAttribute = Entity + Attribute;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
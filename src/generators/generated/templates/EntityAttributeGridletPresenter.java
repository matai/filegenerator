package generators.generated.templates;

public class EntityAttributeGridletPresenter extends AbstractExplorerTemplate implements IExplorerTemplate
{
  protected static String nl;
  public static synchronized EntityAttributeGridletPresenter create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityAttributeGridletPresenter result = new EntityAttributeGridletPresenter();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package au.com.arclight.sag.client.domain.mvp.presenter.explorer.";
  protected final String TEXT_2 = ".gridlet;" + NL + "" + NL + "import net.customware.gwt.presenter.client.EventBus;" + NL + "import au.com.arclight.sag.client.domain.model.";
  protected final String TEXT_3 = ".";
  protected final String TEXT_4 = ";" + NL + "import au.com.arclight.sag.client.domain.mvp.presenter.explorer.AbstractGridletPresenter;" + NL + "import au.com.arclight.sag.client.domain.mvp.presenter.explorer.IExplorerPopupHandler;" + NL + "import au.com.arclight.sag.client.domain.mvp.presenter.explorer.IQueryCompleteCallback;" + NL + "import au.com.arclight.sag.client.domain.mvp.presenter.explorer.";
  protected final String TEXT_5 = ".Explorer";
  protected final String TEXT_6 = "DataService;" + NL + "import au.com.arclight.sag.client.domain.mvp.presenter.explorer.";
  protected final String TEXT_7 = ".popup.";
  protected final String TEXT_8 = "PopupPresenter;" + NL + "import au.com.arclight.sag.client.domain.mvp.view.explorer.";
  protected final String TEXT_9 = ".gridlet.I";
  protected final String TEXT_10 = "GridletView;" + NL + "" + NL + "import com.google.inject.Inject;" + NL + "" + NL + "public class ";
  protected final String TEXT_11 = "GridletPresenter extends AbstractGridletPresenter " + NL + "\timplements I";
  protected final String TEXT_12 = "GridletView.Presenter" + NL + "{" + NL + "\t@Inject private ";
  protected final String TEXT_13 = "PopupPresenter ";
  protected final String TEXT_14 = "Popup;" + NL + "\t@Inject private Explorer";
  protected final String TEXT_15 = "DataService ";
  protected final String TEXT_16 = "QueryService;" + NL + "\t" + NL + "\tprivate I";
  protected final String TEXT_17 = "GridletView view;" + NL + "\t" + NL + "\tprivate ";
  protected final String TEXT_18 = " ";
  protected final String TEXT_19 = ";" + NL + "\tprivate ";
  protected final String TEXT_20 = " old";
  protected final String TEXT_21 = ";" + NL + "\t" + NL + "\t@Inject" + NL + "\tpublic ";
  protected final String TEXT_22 = "GridletPresenter(EventBus eventBus, I";
  protected final String TEXT_23 = "GridletView view)" + NL + "\t{" + NL + "\t\tsuper(eventBus, view);" + NL + "\t\tthis.view = view;" + NL + "\t\t" + NL + "\t\tview.setPresenter(this);" + NL + "\t}" + NL + "" + NL + "\tpublic void init() " + NL + "\t{" + NL + "\t\tregisterExplorerEditClickHandler();" + NL + "\t\tregisterExplorerDoneClickHandler();" + NL + "\t\tregisterEditClickedHandler();" + NL + "\t\tregisterEditCancelHandler(";
  protected final String TEXT_24 = "Popup);" + NL + "\t\tregisterEditSaveHandler();" + NL + "\t\t" + NL + "\t\tisLoaded = false;" + NL + "\t\t";
  protected final String TEXT_25 = " = ";
  protected final String TEXT_26 = "QueryService.get";
  protected final String TEXT_27 = "();" + NL + "\t\told";
  protected final String TEXT_28 = " = ";
  protected final String TEXT_29 = "QueryService.getOld";
  protected final String TEXT_30 = "();" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tprotected void registerEditSaveHandler() " + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_31 = "Popup.setSaveHandler(new IExplorerPopupHandler()" + NL + "\t\t{" + NL + "\t\t\t@Override" + NL + "\t\t\tpublic void handleEvent() " + NL + "\t\t\t{" + NL + "\t\t\t\tview.hidePopup();" + NL + "\t\t\t\t" + NL + "\t\t\t\t//TODO : Your implementation to save the object here" + NL + "\t\t\t}" + NL + "\t\t});" + NL + "\t}" + NL + "}";

	public String generate(String Entity, String Attribute)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    fileName = "GridletPresenter.java";
    String entity = Entity.toLowerCase();
    String entityAttribute = entity + Attribute;
    String EntityAttribute = Entity + Attribute;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(Entity);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(Entity);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(entityAttribute);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(Entity);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(Entity);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(Entity);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(Entity);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(EntityAttribute);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(entityAttribute);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(Entity);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(Entity);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(entity);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(Entity);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(entityAttribute);
    stringBuffer.append(TEXT_31);
    return stringBuffer.toString();
  }
}
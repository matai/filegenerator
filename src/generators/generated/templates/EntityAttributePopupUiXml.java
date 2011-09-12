package generators.generated.templates;

public class EntityAttributePopupUiXml extends AbstractExplorerTemplate implements IExplorerTemplate
{
  protected static String nl;
  public static synchronized EntityAttributePopupUiXml create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityAttributePopupUiXml result = new EntityAttributePopupUiXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<!DOCTYPE ui:UiBinder SYSTEM \"http://dl.google.com/gwt/DTD/xhtml.ent\">" + NL + "<ui:UiBinder" + NL + "        xmlns:ui='urn:ui:com.google.gwt.uibinder'" + NL + "        xmlns:g='urn:import:com.google.gwt.user.client.ui'" + NL + "        xmlns:a='urn:import:au.com.arclight.sag.client.domain.mvp.view.explorer'" + NL + ">" + NL + "<ui:style>\t" + NL + "</ui:style>" + NL + "<ui:with field=\"resources\" type=\"au.com.arclight.sag.client.node.application.resource.Resources\"/>" + NL + "\t<a:ExplorerDetailsPopup ui:field=\"basePanel\" displayTitle=\"";
  protected final String TEXT_2 = " Details\">" + NL + "\t\t<a:child>" + NL + "\t\t\t<g:HTMLPanel>" + NL + "\t\t\t\t<div ui:field=\"noItemsLabel\" class=\"{resources.style.hidden}\">" + NL + "\t\t\t\t\tAll ";
  protected final String TEXT_3 = " details have been removed." + NL + "\t\t\t\t</div>" + NL + "\t\t\t</g:HTMLPanel>" + NL + "\t\t</a:child>" + NL + "\t</a:ExplorerDetailsPopup>" + NL + "</ui:UiBinder>";

	public String generate(String Entity, String Attribute)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    fileName = "Popup.ui.xml";
    String attribute = Attribute.toLowerCase();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(Attribute);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(attribute);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
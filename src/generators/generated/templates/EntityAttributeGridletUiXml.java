package generators.generated.templates;

public class EntityAttributeGridletUiXml
{
  protected static String nl;
  public static synchronized EntityAttributeGridletUiXml create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityAttributeGridletUiXml result = new EntityAttributeGridletUiXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<!DOCTYPE ui:UiBinder SYSTEM \"http://dl.google.com/gwt/DTD/xhtml.ent\">" + NL + "<ui:UiBinder" + NL + "        xmlns:ui='urn:ui:com.google.gwt.uibinder'" + NL + "        xmlns:g='urn:import:com.google.gwt.user.client.ui'" + NL + "        xmlns:sag='urn:import:au.com.arclight.sag.client.domain.mvp.widget.ui'" + NL + "\t\txmlns:a='urn:import:au.com.arclight.sag.client.domain.mvp.view.explorer'" + NL + "\t\txmlns:d=\"urn:import:com.google.gwt.dom.client\">" + NL + "    <ui:style>\t" + NL + "\t</ui:style>" + NL + "\t<ui:with field=\"resources\" type=\"au.com.arclight.sag.client.node.application.resource.Resources\"/>" + NL + "\t<a:ExplorerGridlet ui:field=\"basePanel\" " + NL + "\t\tdisplayTitle=\"";
  protected final String TEXT_2 = " Details\" " + NL + "\t\tnoItemLabel=\"No ";
  protected final String TEXT_3 = " details have been entered.\">" + NL + "\t\t<a:child>" + NL + "\t\t\t<g:HTMLPanel>" + NL + "\t\t\t</g:HTMLPanel>" + NL + "\t\t</a:child>" + NL + "\t</a:ExplorerGridlet>" + NL + "</ui:UiBinder>";

	public String generate(String entity, String attribute)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(attribute);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(attribute);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
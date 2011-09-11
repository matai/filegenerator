package au.com.arclight.sag.client.domain.mvp.view.explorer.person.gridlet;

import au.com.arclight.sag.client.domain.mvp.view.explorer.AbstractGridletViewImpl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class PersonContactGridletViewImpl extends AbstractGridletViewImpl 
implements IPersonContactGridletView
{
	private Presenter presenter;
	
	@UiTemplate( "template/PersonContactGridlet.ui.xml" ) 
	public interface WidgetUiBinder extends UiBinder< Widget, PersonContactGridletViewImpl >{}
	private static WidgetUiBinder uiBinder = GWT.create(WidgetUiBinder.class);

	@Inject
	public PersonContactGridletViewImpl()
	{
		super();
		
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter presenter) 
	{
		this.presenter = presenter;
	}
}
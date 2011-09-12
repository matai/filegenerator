package au.com.arclight.sag.client.domain.mvp.view.explorer.person.gridlet;

import au.com.arclight.sag.client.domain.mvp.view.explorer.AbstractGridletViewImpl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class EntityAttributeGridletViewImpl extends AbstractGridletViewImpl 
implements IEntityAttributeGridletView
{
	private Presenter presenter;
	
	@UiTemplate( "template/EntityAttributeGridlet.ui.xml" ) 
	public interface WidgetUiBinder extends UiBinder< Widget, EntityAttributeGridletViewImpl >{}
	private static WidgetUiBinder uiBinder = GWT.create(WidgetUiBinder.class);

	@Inject
	public EntityAttributeGridletViewImpl()
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

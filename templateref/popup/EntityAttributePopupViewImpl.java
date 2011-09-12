package au.com.arclight.sag.client.domain.mvp.view.explorer.person.popup;

import au.com.arclight.sag.client.domain.mvp.view.explorer.AbstractExplorerPopupViewImpl;
import au.com.arclight.sag.client.node.application.resource.Resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class EntityAttributePopupViewImpl extends AbstractExplorerPopupViewImpl 
	implements IEntityAttributePopupView
{
	@UiTemplate( "template/EntityAttributePopup.ui.xml" ) 
	public interface WidgetUiBinder extends UiBinder< Widget, EntityAttributePopupViewImpl >{}
	private static WidgetUiBinder uiBinder = GWT.create(WidgetUiBinder.class);

	@UiField DivElement noItemsLabel;
	
	private Presenter presenter;

	private String STYLE_HIDDEN = Resources.INSTANCE.style().hidden();
	
	@Inject
	public EntityAttributePopupViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));

		addSaveHandler();
		addCancelHandler();
	}
	
	public void setPresenter(Presenter presenter) 
	{
		this.presenter = presenter;
	}
	
	@Override
	protected void cancelButtonClicked() 
	{
		presenter.buttonCancelClicked();
	}
	
	protected void saveButtonClicked() 
	{
		//TODO : Your save implementation here
		
		presenter.buttonSaveClicked();
	}

	@Override
	public void hideNoItemsLabel() 
	{
		noItemsLabel.addClassName(STYLE_HIDDEN);
	}
}

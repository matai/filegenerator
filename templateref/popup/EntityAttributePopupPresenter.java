package au.com.arclight.sag.client.domain.mvp.presenter.explorer.person.popup;

import java.util.List;

import au.com.arclight.sag.client.domain.model.people.Entity;
import au.com.arclight.sag.client.domain.mvp.presenter.explorer.AbstractExplorerPopupPresenter;
import au.com.arclight.sag.client.domain.mvp.view.explorer.person.popup.IEntityAttributePopupView;

import com.google.gwt.user.client.ui.HasOneWidget;
import com.google.inject.Inject;

public class EntityAttributePopupPresenter extends AbstractExplorerPopupPresenter<Entity>
	implements IEntityAttributePopupView.Presenter
{
	private IEntityAttributePopupView view;
	private Entity model;

	@Inject
	public EntityAttributePopupPresenter(IEntityAttributePopupView view)
	{
		this.view = view;
		view.setPresenter(this);
	}

	@Override
	public void go(HasOneWidget container) 
	{
		container.setWidget(view.asWidget());
	}
	
	@Override
	public void init(Entity model) 
	{
		this.model = model;
	}

	@Override
	public void buttonSaveClicked() 
	{
		//TODO : Your implementation here to set model results
		saveHandler.handleEvent();
	}
}

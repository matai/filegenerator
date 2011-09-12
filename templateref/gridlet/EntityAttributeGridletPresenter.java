package au.com.arclight.sag.client.domain.mvp.presenter.explorer.entity.gridlet;

import net.customware.gwt.presenter.client.EventBus;
import au.com.arclight.sag.client.domain.model.entity.Entity;
import au.com.arclight.sag.client.domain.mvp.presenter.explorer.AbstractGridletPresenter;
import au.com.arclight.sag.client.domain.mvp.presenter.explorer.IExplorerPopupHandler;
import au.com.arclight.sag.client.domain.mvp.presenter.explorer.IQueryCompleteCallback;
import au.com.arclight.sag.client.domain.mvp.presenter.explorer.entity.ExplorerEntityDataService;
import au.com.arclight.sag.client.domain.mvp.presenter.explorer.entity.popup.EntityAttributePopupPresenter;
import au.com.arclight.sag.client.domain.mvp.view.explorer.entity.gridlet.IEntityAttributeGridletView;

import com.google.inject.Inject;

public class EntityAttributeGridletPresenter extends AbstractGridletPresenter 
	implements IEntityAttributeGridletView.Presenter
{
	@Inject private EntityAttributePopupPresenter entityAttributePopup;
	@Inject private ExplorerEntityDataService entityQueryService;
	
	private IEntityAttributeGridletView view;
	
	private Entity entity;
	private Entity oldEntity;
	
	@Inject
	public EntityAttributeGridletPresenter(EventBus eventBus, IEntityAttributeGridletView view)
	{
		super(eventBus, view);
		this.view = view;
		
		view.setPresenter(this);
	}

	public void init() 
	{
		registerExplorerEditClickHandler();
		registerExplorerDoneClickHandler();
		registerEditClickedHandler();
		registerEditCancelHandler(entityAttributePopup);
		registerEditSaveHandler();
		
		isLoaded = false;
		entity = entityQueryService.getEntity();
		oldEntity = entityQueryService.getOldEntity();
	}

	@Override
	protected void registerEditSaveHandler() 
	{
		entityAttributePopup.setSaveHandler(new IExplorerPopupHandler()
		{
			@Override
			public void handleEvent() 
			{
				view.hidePopup();
				
				//TODO : Your implementation to save the object here
			}
		});
	}
}
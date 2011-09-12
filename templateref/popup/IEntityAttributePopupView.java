package au.com.arclight.sag.client.domain.mvp.view.explorer.person.popup;

import au.com.arclight.sag.client.domain.mvp.presenter.explorer.ExplorerPopupPresenter;
import au.com.arclight.sag.client.domain.mvp.view.explorer.ExplorerPopupView;

public interface IEntityAttributePopupView extends ExplorerPopupView 
{
	public interface Presenter extends ExplorerPopupPresenter
	{
	}
	
	public void setPresenter(Presenter presenter);
}

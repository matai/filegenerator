package au.com.arclight.sag.client.domain.mvp.view.explorer.person.gridlet;

import au.com.arclight.sag.client.domain.mvp.view.explorer.ExplorerGridletPresenter;
import au.com.arclight.sag.client.domain.mvp.view.explorer.ExplorerGridletView;

public interface IPersonContactGridletView extends ExplorerGridletView
{
	public interface Presenter extends ExplorerGridletPresenter
	{

	}
	
	public void setPresenter(Presenter presenter);
}
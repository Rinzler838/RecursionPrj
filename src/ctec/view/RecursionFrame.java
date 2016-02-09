package ctec.view;

import javax.swing.*;
import ctec.view.RecursionPanel;
import ctec.controller.RecursionController;

public class RecursionFrame extends JFrame
{
	private RecursionController basicController;
	private RecursionPanel basePanel;
	
	public RecursionFrame(RecursionController baseController)
	{
		this.basicController = baseController;
		basePanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);	//Must be first
		this.setVisible(true);	//Must be last
	}
	
	public RecursionController getBaseController()
	{
		return basicController;
	}
}

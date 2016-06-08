package com.thom.thgui;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;

@SuppressWarnings("serial")
/**
 * @author Thomas Boel Micheelsen
 * @since 7th of June, 2016
 */
public abstract class GuiScreen extends JFrame
{
	public GuiScreen INSTANCE = this;
	
	// List of all buttons added to the current GUI, remember to clear the buttonList for new GUI's.
	public List<GuiButton> buttonList = new ArrayList<GuiButton>();
	// Mapping of buttons and their respective ID's, remember to clear the buttonMap for new GUI's.
	public HashMap<GuiButton, Integer> buttonMap = new HashMap<GuiButton, Integer>();
	
	/**
	 * Initializes the building stones of the GUI. Define size, panels and other trivial things here.
	 * @author Thomas Boel Micheelsen
	 * @since 7th of June, 2016
	 */
	public abstract void initGui();
	
	/** 
	 * Draws the screen, call this from your constructor with getWidth() and getHeight(). 
	 * @author Thomas Boel Micheelsen
	 * @since 7th of June, 2016
	 */
	public abstract void drawScreen(int width, int height);
	
	/**
	 * Initializes a new GuiButton, draws it on screen by adding it to a panel, and returns the button for further customization. 
	 * @author Thomas Boel Micheelsen
	 * @since 8th of June, 2016
	 * @param id The button id.
	 * @param x Start location on the x-axis.
	 * @param y Start location on the y-axis.
	 * @param width Button width.
	 * @param height Button height.
	 * @param text Contents of the button.
	 * @param panel The JPanel which the button should be added to.
	 * @return Returns the GuiButton for further customization.
	 */
	public GuiButton addButton(int id, int x, int y, int width, int height, String text, JPanel panel)
	{
		GuiButton button = new GuiButton(id, x, y, width, height, text);
		panel.add(button);
		button.setVisible(true);
		buttonList.add(button);
		buttonMap.put(button, button.id);
		button.setFocusable(false);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				INSTANCE.actionPerformed((GuiButton)event.getSource());
			}	
		});
		
		return button;
	}
	
	/**
	 * Initializes a new GuiButton, draws it on screen by adding it to a panel, and returns the button for further customization. 
	 * @author Thomas Boel Micheelsen
	 * @since 8th of June, 2016
	 * @param id The button id.
	 * @param x Start location on the x-axis.
	 * @param y Start location on the y-axis.
	 * @param text Contents of the button.
	 * @param panel The JPanel which the button should be added to.
	 * @return Returns the GuiButton for further customization.
	 */
	public GuiButton addButton(int id, int x, int y, String text, JPanel panel)
	{
		return addButton(id, x, y, 200, 20, text, panel);
	}
	
	/**
	 * This method is called when a GuiButton is pressed, use this to determine what happens upon button clicks.
	 * @author Thomas Boel Micheelsen
	 * @since 8th of June, 2016
	 * @param button
	 */
	public void actionPerformed(GuiButton button) {}
	
	/**
	 * @author Thomas Boel Micheelsen
	 * @since 9th of June, 2016
	 * @param x Start location on the x-axis.
	 * @param y Start location on the y-axis.
	 * @param width TextField width.
	 * @param height TextField height.
	 * @param text The contents of the TextField on startup.
	 * @param panel The JPanel which the TextField should be added to.
	 * @return Returns the GuiTextField for further customization.
	 */
	public GuiTextField addTextField(int x, int y, int width, int height, String text, JPanel panel)
	{
		GuiTextField textField = new GuiTextField(x, y, width, height, text);
		panel.add(textField);
		textField.setVisible(true);
		return textField;
	}
	
	/**
	 * @author Thomas Boel Micheelsen
	 * @since 7th of June, 2016
	 * @param x Start location on the x-axis.
	 * @param y Start location on the y-axis.
	 * @param width
	 * @param height
	 * @param text Contents of the JLabel.
	 * @param panel The JPanel which the JLabel should be added to.
	 * @return Returns the JLabel for further customization.
	 */
	public JLabel drawString(int x, int y, int width, int height, String text, JPanel panel)
	{
		JLabel label = new JLabel(text);
		label.setBounds(x, y, width, height);
		panel.add(label);
		label.setVisible(true);
		return label;
	}
}
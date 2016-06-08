package com.thom.thgui;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GuiTextField extends JTextField
{
	public GuiTextField(int x, int y, int width, int height, String text)
	{
		setBounds(x, y, width, height);
		setText(text);
	}
	
	public GuiTextField(int x, int y, String text)
	{
		this(x, y, 200, 20, text);
	}
}
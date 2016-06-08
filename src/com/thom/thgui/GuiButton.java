package com.thom.thgui;

import java.awt.Color;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class GuiButton extends JButton
{
	public int id;
	
	public GuiButton(int id, int x, int y, int btnWidth, int btnHeight, String text) 
	{
		setBounds(x, y, btnWidth, btnHeight);
		setText(text);
		setFrontColor(Color.darkGray);
		setBackColor(Color.white);
	}
	
	public GuiButton(int id, int x, int y, String text) 
	{
		this(id, x, y, 200, 20, text);
	}
	
	public void setFrontColor(Color color)
	{
		setForeground(color);
	}
	
	public void setBackColor(Color color)
	{
		setBackground(color);
	}
}
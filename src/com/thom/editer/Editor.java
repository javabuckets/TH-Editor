package com.thom.editer;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.thom.thgui.GuiButton;
import com.thom.thgui.GuiScreen;

@SuppressWarnings("serial")
public class Editor extends GuiScreen
{
	JPanel panel;
	
	public Editor() 
	{
		initGui();
		drawScreen(getWidth(), getHeight());
	}

	public void initGui() 
	{
		setTitle("TH-Editor");
		setSize(800, 600);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel(null);
		panel.setBackground(Color.darkGray);
		this.add(panel);
		
		buttonList.clear();
		buttonMap.clear();
	}

	public void drawScreen(int width, int height) 
	{
		addButton(0, 0, 0, 80, 20, "File", panel);
		addButton(1, 80, 0, 80, 20, "Edit", panel);
		addTextField(5, 35, 200, 25, "", panel);
		JLabel ddm = drawString(0, 20, 160, 80, "drop down menu", panel);
		ddm.setBackground(Color.white);
		ddm.setOpaque(true);
		ddm.setFocusable(true);
	}
	
	public void actionPerformed(GuiButton button) 
	{
		switch (button.id) {
		case 0:
			System.out.println("test");
			break;

		default:
			System.out.println("test failed");
			break;
		}
	}
}
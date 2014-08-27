package com.beastlyjman.pdv.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class MainGUI extends Frame {

	/**
	 * JVM wants this...
	 */
	private static final long serialVersionUID = -3141938854074662824L;
	
	Label urlLabel;
	Button activateBtn;
	TextField urlTF;
	
	public MainGUI() {
		this.setSize(800, 600);
		this.setResizable(false);
		this.setTitle("Poll Daddy Voter");
		this.addWindowListener(new GUIWindowListener());
		this.setLayout(new FlowLayout());
		urlLabel = new Label("Url:");
		this.add(urlLabel);
		urlTF = new TextField(60);
		this.add(urlTF);
		activateBtn = new Button("Start");
		this.add(activateBtn);
		this.setVisible(true);
	}
	
}

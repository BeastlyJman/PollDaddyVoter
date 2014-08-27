package com.beastlyjman.pdv;

import com.beastlyjman.pdv.gui.MainGUI;

public class MainPDV {

	public static MainGUI maingui;
	
	public static void main(String[] args) {
		maingui = new MainGUI();
	}
	
	public static MainGUI getMaingui() {
		return maingui;
	}
}

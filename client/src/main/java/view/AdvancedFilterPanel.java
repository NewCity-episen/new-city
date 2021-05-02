package view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import model.Equipment;

public class AdvancedFilterPanel {

	private static JFrame advancedFilterPanel =new JFrame();
	private JButton ok = new JButton("ok");
	
	public AdvancedFilterPanel(ArrayList<String> list) {
		advancedFilterPanel.setVisible(true);
		advancedFilterPanel.setSize(600, 500);
		advancedFilterPanel.setLayout(new BorderLayout());
		advancedFilterPanel.setLocationRelativeTo(null);
		
		for(int i = 0; i < list.size(); i++) {
			advancedFilterPanel.add(new JCheckBox(list.get(i)));
		}
		
		advancedFilterPanel.add("South", ok);
	}

    public static JFrame getJFrame() {
		return advancedFilterPanel;
	}
}

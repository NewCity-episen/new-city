package view;

import java.awt.*;
import javax.swing.*;

public class LocationOfferPanel {
	private static JFrame locationOfferPanel=new JFrame();
	private JLabel noResults = new JLabel("Aucune offre ne correspond a votre recherche");
	private String[] columnNames = {"Numero offre", "Batiment", "Etage", "Prix"};
	private String[][] test = {{"arerzer", "erfer", "fsdfsfddf", "jhv"},
								{"arerzer", "erfer", "fsdfsfddf", "jhv"},
								{"arerzer", "erfer", "fsdfsfddf", "jhv"}};
	
	
	public LocationOfferPanel(String[][] resultsTable){
		private JTable researchResults = new JTable(resultsTable, columnNames);
		locationOfferPanel.setSize(150, 250);
		locationOfferPanel.setLocationRelativeTo(null);
		if(researchResults.getColumnCount() > 0) {
			locationOfferPanel.add(researchResults);
		} else {
			locationOfferPanel.add(noResults);
		}
		
		locationOfferPanel.setVisible(true);
	}
	public static JFrame getJFrame() {
		return locationOfferPanel;
	}

}

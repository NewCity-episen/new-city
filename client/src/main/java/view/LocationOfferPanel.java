package view;

import java.awt.*;
import javax.swing.*;

public class LocationOfferPanel {
<<<<<<< HEAD
	private static JLabel searchResults=new JLabel("Ici seront les résulats des recherches");
	private static JPanel LocationOfferPanel=new JPanel();
	
	public LocationOfferPanel(){
		
		LocationOfferPanel.add(searchResults);
=======
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
>>>>>>> bc08019b18bec6dc8ebcd8e1db221d1f6f3d93ca
	}
	public static JFrame getJFrame() {
		return locationOfferPanel;
	}

}

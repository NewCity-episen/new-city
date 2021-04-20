package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.View;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class FunctionalitiesBarAndPanel{
	    private JPanel functionsAndBarPanel=new JPanel();
		private static CardLayout myFunctionalities=new CardLayout();
		static JPanel functionalitiesPanel=new JPanel(); // The content of this Panel is going to change depending on the functionality that you clicked on.
	    private static JButton firstPageButton=new JButton("Accueil");	
	    private static JButton refreshButton=new JButton("Raffraichir");	
	    private static JButton quitButton=new JButton("Quitter");	
	    private LoanPanel loanPanel=new LoanPanel();
	    private MappingPanel mappingPanel=new MappingPanel();
	    private ConfigurateWindowsPanel configurateWindowPanel=new ConfigurateWindowsPanel();
	    private static JLabel information;
    
	  public FunctionalitiesBarAndPanel() {

     /******************JToolBar Part*************************************************/
		JToolBar functionalitiesBar=new JToolBar();
		functionalitiesBar.setBackground(new Color(100, 149, 237));
		functionalitiesBar.setFloatable(false);
		information=new JLabel();
		functionalitiesBar.add(information);
		firstPageButton.setBackground(new Color(100, 149, 237));
		firstPageButton.setBorderPainted(false);
		firstPageButton.setForeground(new Color(255, 255, 255));
		refreshButton.setBackground(new Color(100, 149, 237));
		refreshButton.setBorderPainted(false);
		refreshButton.setForeground(new Color(255, 255, 255));
		quitButton.setBackground(new Color(100, 149, 237));
		quitButton.setBorderPainted(false);
		quitButton.setForeground(new Color(255, 255, 255));
		functionalitiesBar.addSeparator(new Dimension(25,0));
		functionalitiesBar.addSeparator(new Dimension(400,0));
		functionalitiesBar.add(firstPageButton);
		functionalitiesBar.add(refreshButton);
		functionalitiesBar.add(quitButton);
		functionsAndBarPanel.setLayout(new BorderLayout());
		functionsAndBarPanel.add(functionalitiesBar,BorderLayout.NORTH);
	/*****************End of JToolBar Part***************************************/
		
	/****************JPanel Part that is going to be a CardLayout to switch between each of the functionalities**************/
         functionsAndBarPanel.add(functionalitiesPanel,BorderLayout.CENTER);
		functionalitiesPanel.setBackground(Color.DARK_GRAY);

		functionalitiesPanel.setLayout(myFunctionalities); 
	    functionalitiesPanel.add("Accueil",loanPanel.getJPanel());
	    //functionalitiesPanel.add("Raffraichir",loanPanel.getJPanel()); //will take to the current page
	    myFunctionalities.show(functionalitiesPanel, "Accueil");
   /**********************End of JPanel Part**************************************/
    }
	public static JButton getFirstPageButton() {
		return firstPageButton;
	}
	public static JButton getRefreshButton() {
		return refreshButton;
	}
	public static JButton getQuitButton() {
		return quitButton;
	}
	public static CardLayout getMyFunctionalities() {
		return myFunctionalities;
	}
	public static JPanel getFunctionalitiesPanel() {
		return functionalitiesPanel;
	}
	public static JLabel getInformationLabel() {
		return information;
	}
	public static void setInformationLabel(String companyName, String contact) {
		String selectedCompanyName = (String) Home.getCompanyNameList().getSelectedItem();

		information.setText(selectedCompanyName +" | Contact:"+ contact);
		information.setFont(new Font("Dialog", Font.BOLD, 15));
		information.setForeground(new Color(255, 255, 255));
	}
	public JPanel getFunctionsAndBarPanel() {
		return functionsAndBarPanel;
	}
	
}

package view;

import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class SmartWindowStatusFrame extends JFrame {
	private static JPanel framePanel = new JPanel();
	private static JPanel winPanel =new JPanel();
	private static CardLayout winCard=new CardLayout();
	private JTextField swID;
	private JTextField workSpaceName;
	private JTextField levelOfTeint;
	private JTextField outdoorilluminance;
	private JTextField levelOfBlind;
	private JTextField sunAzimuth;
	private JTextField swOrientation;
	

	




	public SmartWindowStatusFrame() {
		View.getappFrame().setEnabled(false);
		winPanel.setLayout(winCard);
		framePanel.setLayout(null);	
		winPanel.add("configure",framePanel);
		
		JLabel lblNewLabel = new JLabel("Etat actuel de la fenetre :");
		lblNewLabel.setBounds(24, 15, 169, 26);
		framePanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("fenetre id");
		lblNewLabel_1.setBounds(89, 45, 104, 26);
		framePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel("WorkSpace ");
		lblNewLabel_7.setBounds(89, 75, 117, 26);
		framePanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2 = new JLabel("teinte du vitre");
		lblNewLabel_2.setBounds(89, 105, 134, 26);
		framePanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("niveau de fermeture du store");
		lblNewLabel_3.setBounds(89, 135, 229, 26);
		framePanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("niveau d'ensoleillement");
		lblNewLabel_4.setBounds(89, 175, 183, 26);
		framePanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("azimut soleil");
		lblNewLabel_5.setBounds(89, 205, 169, 26);
		framePanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("position de la fenêtre");
		lblNewLabel_6.setBounds(89, 235, 183, 26);
		framePanel.add(lblNewLabel_6);
		
		swID = new JTextField();
		swID.setBounds(301, 45, 130, 26);
		framePanel.add(swID);
		swID.setColumns(10);
		
		workSpaceName = new JTextField();
		workSpaceName.setBounds(301, 75, 130, 26);
		framePanel.add(workSpaceName);
		workSpaceName.setColumns(10);
		
		levelOfTeint = new JTextField();
		levelOfTeint.setBounds(301, 105, 130, 26);
		framePanel.add(levelOfTeint);
		levelOfTeint.setColumns(10);
		
		levelOfBlind = new JTextField();
		levelOfBlind.setBounds(301, 135, 130, 26);
		framePanel.add(levelOfBlind);
		levelOfBlind.setColumns(10);
		
		outdoorilluminance = new JTextField();
		outdoorilluminance.setBounds(301, 175, 130, 26);
		framePanel.add(outdoorilluminance);
		outdoorilluminance.setColumns(10);
		
		 sunAzimuth = new JTextField();
		 sunAzimuth.setBounds(301, 205, 130, 26);
		framePanel.add( sunAzimuth);
		 sunAzimuth.setColumns(10);
		
		
		
		swOrientation = new JTextField();
		swOrientation.setBounds(301, 235, 130, 26);
		framePanel.add(swOrientation);
		swOrientation.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("°");
		lblNewLabel_8.setBounds(443, 210, 61, 16);
		framePanel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Lux");
		lblNewLabel_9.setBounds(443, 180, 61, 16);
		framePanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("%");
		lblNewLabel_10.setBounds(443, 140, 61, 16);
		framePanel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("%");
		lblNewLabel_11.setBounds(443, 110, 61, 16);
		framePanel.add(lblNewLabel_11);
		

		setSize(600, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.setVisible(true);
		getContentPane().add(framePanel);
		
		
		
		
            addWindowListener((WindowListener) new WindowAdapter() {
			
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

				View.getappFrame().setEnabled(true);
				View.getappFrame().setVisible(true);

				}
			});
		
	}







	public JTextField getSwID() {
		return swID;
	}







	public void setSwID(JTextField swID) {
		this.swID = swID;
	}







	public JTextField getWorkSpaceName() {
		return workSpaceName;
	}







	public void setWorkSpaceName(JTextField workSpaceName) {
		this.workSpaceName = workSpaceName;
	}







	public JTextField getLevelOfTeint() {
		return levelOfTeint;
	}







	public void setLevelOfTeint(JTextField levelOfTeint) {
		this.levelOfTeint = levelOfTeint;
	}







	public JTextField getOutdoorilluminance() {
		return outdoorilluminance;
	}







	public void setOutdoorilluminance(JTextField outdoorilluminance) {
		this.outdoorilluminance = outdoorilluminance;
	}







	public JTextField getLevelOfBlind() {
		return levelOfBlind;
	}







	public void setLevelOfBlind(JTextField levelOfBlind) {
		this.levelOfBlind = levelOfBlind;
	}







	public JTextField getSunAzimuth() {
		return sunAzimuth;
	}







	public void setSunAzimuth(JTextField sunAzimuth) {
		this.sunAzimuth = sunAzimuth;
	}







	public JTextField getSwOrientation() {
		return swOrientation;
	}







	public void setSwOrientation(JTextField swOrientation) {
		this.swOrientation = swOrientation;
	}
}

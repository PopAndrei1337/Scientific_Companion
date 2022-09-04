
import java.awt.EventQueue;

import java.math.*;
import java.util.ArrayList;

import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JSplitPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Color;

public class Scientific_Companion_For_EP {
	
	double a,b,r,raza,pi,radical,g;
	String op;
	String rasp;
	private JFrame frmScientificCompanion;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	@SuppressWarnings("unused")
	private JLabel lblNewLabel_5;
	private JLabel rezultat;
	private JButton calcul;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private ImageIcon nul,imgCerc;
	private ImageIcon imgPatrat;
	private JLabel lblNewLabel_9;
	private ImageIcon imgTriunghi;
	private ImageIcon imgDreptunghi;
	private ImageIcon imgCub;
	private ImageIcon imgPiramida;
	private ImageIcon imgSfera;
	private ArrayList<String> collector = new ArrayList<String>();
	private String text;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	
	/*
	btnNewButton = "1" 
	btnNewButton_1 = "2"
	btnNewButton_2 = "3"
	btnNewButton_3 = "4" 
	btnNewButton_4 = "5"
	btnNewButton_5 = "6" 
	btnNewButton_6 = "7"
	btnNewButton_7 = "8"
	btnNewButton_8 = "9"
	btnNewButton_9 = "0"
	btnNewButton_16 = "."
	*/
	private void msgbox(String s){
		   JOptionPane.showMessageDialog(null, s);
		}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific_Companion_For_EP window = new Scientific_Companion_For_EP();
					window.frmScientificCompanion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scientific_Companion_For_EP() {
		initialize(op);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param img2 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize(String img2) {
		frmScientificCompanion = new JFrame();
		frmScientificCompanion.setTitle("Scientific_Companion");
		frmScientificCompanion.setBounds(100, 100, 680, 300);
		frmScientificCompanion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScientificCompanion.getContentPane().setLayout(null);
		@SuppressWarnings("unused")
		JPanel panel = new JPanel();
		
		String [] forme_geometrice_volum = {"","Cub","Piramida","Sfera"};
		String [] forme_geometrice_arie = {"","Cerc","Patrat","Dreptunghi","Triunghi"};
		String [] formule_fizica = {"","Forta de greutate","Viteza","Densitate"};
		
		textField_2 = new JTextField();
		textField_2.setBounds(203, 149, 86, 20);
		frmScientificCompanion.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(203, 106, 86, 20);
		frmScientificCompanion.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(44, 137, 72, 20);
		frmScientificCompanion.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(144, 137, 72, 20);
		frmScientificCompanion.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Lungime");
		lblNewLabel_2.setBounds(226, 93, 57, 14);
		frmScientificCompanion.getContentPane().add(lblNewLabel_2);
		lblNewLabel_1 = new JLabel("Volume");
		lblNewLabel_1.setBounds(163, 40, 45, 22);
		frmScientificCompanion.getContentPane().add(lblNewLabel_1);
		comboBox_1 = new JComboBox(forme_geometrice_volum);
		comboBox_1.setBounds(134, 60, 100, 22);
		frmScientificCompanion.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Arii");
		lblNewLabel.setBounds(56, 40, 45, 22);
		frmScientificCompanion.getContentPane().add(lblNewLabel);
		rezultat = new JLabel("Rezultat:");
		rezultat.setBounds(0, 17, 57, 14);
		frmScientificCompanion.getContentPane().add(rezultat);
		rezultat.setVisible(false);
		lblNewLabel_4 = new JLabel("Baza");
		lblNewLabel_4.setBounds(225, 93, 64, 14);
		frmScientificCompanion.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_6 = new JLabel("Inaltimea");
		lblNewLabel_6.setBounds(226, 137, 72, 14);
		frmScientificCompanion.getContentPane().add(lblNewLabel_6);
		JLabel lblNewLabel_7 = new JLabel("Raza");
		lblNewLabel_7.setBounds(226, 93, 46, 14);
		frmScientificCompanion.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_9 = new JLabel("Latura");
		lblNewLabel_9.setBounds(226, 93, 46, 14);
		frmScientificCompanion.getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_11 = new JLabel("Masa");
		lblNewLabel_11.setBounds(54, 159, 62, 20);
		frmScientificCompanion.getContentPane().add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Distanta");
		lblNewLabel_12.setBounds(54, 159, 62, 20);
		frmScientificCompanion.getContentPane().add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Timp");
		lblNewLabel_13.setBounds(154, 159, 62, 20);
		frmScientificCompanion.getContentPane().add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("Volum");
		lblNewLabel_14.setBounds(154, 159, 62, 20);
		frmScientificCompanion.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_10 = new JLabel("Formule");
		lblNewLabel_10.setBounds(106, 87, 46, 20);
		frmScientificCompanion.getContentPane().add(lblNewLabel_10);
		
		//Sursa imagini
		nul = new ImageIcon(getClass().getResource(""));
		imgCerc = new ImageIcon(getClass().getResource("arie-cerc.png"));
		imgPatrat = new ImageIcon(getClass().getResource("patrat.png"));
		imgDreptunghi = new ImageIcon(getClass().getResource("Dreptunghi.png"));
		imgTriunghi = new ImageIcon(getClass().getResource("triunghi.png"));
		imgCub = new ImageIcon(getClass().getResource("cub.png"));
		imgPiramida = new ImageIcon(getClass().getResource("Piramida.png"));
		imgSfera = new ImageIcon(getClass().getResource("Sphere_and_Ball.png"));

		JLabel lblNewLabel_8 = new JLabel();
		lblNewLabel_8.setBounds(24, 93, 155, 157);
		frmScientificCompanion.getContentPane().add(lblNewLabel_8);
	
		/* Incadrare imagini */
		Image imagine = imgCerc.getImage();
		Image imagine_scalare=imagine.getScaledInstance(lblNewLabel_8.getWidth(), lblNewLabel_8.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon img_0 = new ImageIcon(imagine_scalare); 
		
		Image imagine_0 = imgPatrat.getImage();
		Image imagine_scalare_0=imagine_0.getScaledInstance(lblNewLabel_8.getWidth(), lblNewLabel_8.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon img_1 = new ImageIcon(imagine_scalare_0); 
		
		Image imagine_1 = imgDreptunghi.getImage();
		Image imagine_scalare_1=imagine_1.getScaledInstance(lblNewLabel_8.getWidth(), lblNewLabel_8.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon img_2 = new ImageIcon(imagine_scalare_1);
		
		Image imagine_2 = imgTriunghi.getImage();
		Image imagine_scalare_2=imagine_2.getScaledInstance(lblNewLabel_8.getWidth(), lblNewLabel_8.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon img_3 = new ImageIcon(imagine_scalare_2);
		
		Image imagine_3 = imgCub.getImage();
		Image imagine_scalare_3=imagine_3.getScaledInstance(lblNewLabel_8.getWidth(), lblNewLabel_8.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon img_4 = new ImageIcon(imagine_scalare_3);
		
		Image imagine_4 = imgPiramida.getImage();
		Image imagine_scalare_4=imagine_4.getScaledInstance(lblNewLabel_8.getWidth(), lblNewLabel_8.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon img_5 = new ImageIcon(imagine_scalare_4);
		
		Image imagine_5 = imgSfera.getImage();
		Image imagine_scalare_5=imagine_5.getScaledInstance(lblNewLabel_8.getWidth(), lblNewLabel_8.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon img_6 = new ImageIcon(imagine_scalare_5);
		
		/* Incheiere incadrare imagini */
	
		JComboBox comboBox = new JComboBox(forme_geometrice_arie);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem() !="") {
					comboBox_1.setSelectedIndex(0);
					
					
				}
				if (comboBox.getSelectedItem() == "")
					{textField.setText("");
					rezultat.setVisible(false);
					textField_1.setVisible(false);
					textField_2.setVisible(false);
					lblNewLabel_8.setIcon(nul);}
					
				if (comboBox.getSelectedItem() == "Cerc")
				{lblNewLabel_7.setVisible(true);
				textField_2.setVisible(false);
				textField_1.setText("");
				textField_2.setText("");
				calcul.setVisible(true);
				op="Cerc";
				lblNewLabel_8.setIcon(img_0);
				
				}	
				if(comboBox.getSelectedItem() != "Cerc")
				{
					lblNewLabel_7.setVisible(false);
				}
				if (comboBox.getSelectedItem() == "Patrat")
				{
					lblNewLabel_9.setVisible(true);
					op="Patrat";
					textField_2.setVisible(false);
					textField_1.setText("");
					textField_2.setText("");
					calcul.setVisible(true);
					lblNewLabel_8.setIcon(img_1);
				}
				if(comboBox.getSelectedItem() != "Patrat")
				{
					lblNewLabel_9.setVisible(false);
				}
				if (comboBox.getSelectedItem() == "Dreptunghi" || comboBox.getSelectedItem() == "Triunghi" )
				{
					textField_1.setVisible(true);
					textField_2.setVisible(true);
				}
				if (comboBox.getSelectedItem() == "Cerc" || comboBox.getSelectedItem() == "Patrat" )
				{
					textField_1.setVisible(true);
					
				}
				if(comboBox.getSelectedItem()== "Dreptunghi")
				{lblNewLabel_2.setVisible(true);
				lblNewLabel_3.setVisible(true);
				calcul.setVisible(true);
				textField_2.setVisible(true);
				op="Dreptunghi";
				lblNewLabel_8.setIcon(img_2);
				textField_1.setText("");
				textField_2.setText("");
				}
				if(comboBox.getSelectedItem() != "Dreptunghi")
					{
				lblNewLabel_2.setVisible(false);
				lblNewLabel_3.setVisible(false);
				
				}
				if (comboBox.getSelectedItem() == "Triunghi")
				{
					
					lblNewLabel_4.setVisible(true);
					lblNewLabel_6.setVisible(true);
					calcul.setVisible(true);
					textField_2.setVisible(true);
					op="Triunghi";
					lblNewLabel_8.setIcon(img_3);
					textField_1.setText("");
					textField_2.setText("");
				}
				if(comboBox.getSelectedItem() != "Triunghi")
					{
				lblNewLabel_4.setVisible(false);
				lblNewLabel_6.setVisible(false);
				
				}
			}
				
		});
		comboBox.setBounds(24, 60, 100, 22);
		frmScientificCompanion.getContentPane().add(comboBox);

		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox_1.getSelectedItem() !="") {
					comboBox.setSelectedIndex(0);
				}
				if (comboBox_1.getSelectedItem() =="") {
					textField.setText("");
					rezultat.setVisible(false);
					textField_1.setVisible(false);
					textField_2.setVisible(false);
					lblNewLabel_8.setIcon(nul);
				}
				if (comboBox_1.getSelectedItem() == "Cub")
				{	
				lblNewLabel_9.setVisible(true);
				textField_2.setVisible(false);
				calcul.setVisible(true);
				op="Cub";
				lblNewLabel_8.setIcon(img_4);
				}
				if (comboBox_1.getSelectedItem() == "Sfera")
				{	
				lblNewLabel_9.setVisible(false);
				lblNewLabel_7.setVisible(false);
				textField_2.setVisible(false);
				textField_1.setText("");
				textField_2.setText("");
				calcul.setVisible(true);
				op="Sfera";
				lblNewLabel_8.setIcon(img_6);
				}
				if (comboBox_1.getSelectedItem() == "Piramida")
				{
				lblNewLabel_6.setVisible(true);			
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				calcul.setVisible(true);
				textField_1.setText("");
				textField_2.setText("");
				op="Piramida";
				lblNewLabel_8.setIcon(img_5);
				lblNewLabel_9.setVisible(true);
				}
				if (comboBox_1.getSelectedItem() != "Piramida")
				{
					lblNewLabel_6.setVisible(false);
					lblNewLabel_9.setVisible(false);
				}
				if(comboBox_1.getSelectedItem() != "Cub")
				{
					lblNewLabel_9.setVisible(false);
				}	
				if (comboBox_1.getSelectedItem() == "Piramida")
				{
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					lblNewLabel_9.setVisible(true);
				}
				if (comboBox_1.getSelectedItem() == "Cub")
				{
					textField_1.setVisible(true);
					lblNewLabel_9.setVisible(true);
					textField_1.setText("");
					textField_2.setText("");
				}
				if (comboBox_1.getSelectedItem() == "Sfera")
				{
					textField_1.setVisible(true);
					lblNewLabel_7.setVisible(true);
				}
			}	
		});
			
		JComboBox comboBox_2 = new JComboBox(formule_fizica);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox_2.getSelectedItem() == "")
				{
					textField.setText("");
					textField_3.setText("");
					textField_4.setText("");
					rezultat.setVisible(false);
					textField_3.setVisible(false);
					textField_4.setVisible(false);
					calcul.setVisible(false);
				}
				if (comboBox_2.getSelectedItem() == "Forta de greutate")
				{
					textField.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_3.setVisible(true);
					lblNewLabel_11.setVisible(true);
					calcul.setVisible(true);
					op="Forta_de_greutate";
				}
				if (comboBox_2.getSelectedItem() != "Forta de greutate")
				{
					lblNewLabel_11.setVisible(false);
				}
				if (comboBox_2.getSelectedItem() == "Viteza")
				{
					textField.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_3.setVisible(true);
					textField_4.setVisible(true);
					lblNewLabel_12.setVisible(true);
					lblNewLabel_13.setVisible(true);
					calcul.setVisible(true);
					op="Viteza";
				}
				if (comboBox_2.getSelectedItem() != "Viteza")
				{
					lblNewLabel_12.setVisible(false);
					lblNewLabel_13.setVisible(false);
					textField_4.setVisible(false);
				}
				if (comboBox_2.getSelectedItem() == "Densitate")
				{
					textField.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_3.setVisible(true);
					textField_4.setVisible(true);
					lblNewLabel_11.setVisible(true);
					lblNewLabel_14.setVisible(true);
					calcul.setVisible(true);
					op="Densitate";
				}
				if (comboBox_2.getSelectedItem() != "Densitate")
				{
					
					lblNewLabel_14.setVisible(false);
				}
			}
		});
		comboBox_2.setBounds(44, 105, 172, 22);
		frmScientificCompanion.getContentPane().add(comboBox_2);
		
		calcul = new JButton("Calculeaza");
		calcul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (op=="Dreptunghi") {
				if (textField_1.getText().isBlank())
				{msgbox("Va rugam sa introduceti lungimea!");
				rezultat.setVisible(false);
				}
				if (textField_2.getText().isBlank())
				{msgbox("Va rugam sa introduceti latimea!");
				rezultat.setVisible(false);}
				a=Double.parseDouble(textField_1.getText());
				b=Double.parseDouble(textField_2.getText());
				r=a*b;
				rasp=String.format("%.2f", r);
				
				rasp= rasp.replace(",", ".");
				if (r < 0) {msgbox("Va rugam sa introduceti valori pozitive pentru laturi!");textField.setText("");rezultat.setVisible(false);}else {
				textField.setText(rasp);
				rezultat.setVisible(true);
				text=("Lungimea este: " + textField_1.getText() + " si latimea este: " + textField_2.getText() + ". " + "Aria pentru aceste valori este: " + rasp);
				collector.add(text);
				}}
				
				if (op=="Triunghi") {
					if (textField_1.getText().isBlank())
					{	
						msgbox("Va rugam sa introduceti baza!");
						rezultat.setVisible(false);
					}
					if (textField_2.getText().isBlank())
					{	msgbox("Va rugam sa introduceti inaltimea!");
					rezultat.setVisible(false);}
					a=Double.parseDouble(textField_1.getText());
					b=Double.parseDouble(textField_2.getText());
					r=(a*b)/2;
					rasp=String.format("%.2f", r);
					rasp= rasp.replace(",", ".");
					if (r < 0) 
						{
						msgbox("Va rugam sa introduceti valori pozitive pentru baza si inaltime!");
						textField.setText("");
						rezultat.setVisible(false);
						}
					else 
						{
							textField.setText(rasp);
							rezultat.setVisible(true);
						}
				}
			
			if(op=="Cerc") {
			if (textField_1.getText().isBlank())
			{msgbox("Va rugam sa introduceti raza!");
			rezultat.setVisible(false);}
			pi=Math.PI;
			raza=Double.parseDouble(textField_1.getText());
			r=raza*raza*pi;
			rasp=String.format("%.2f", r);
			rasp= rasp.replace(",", ".");
			textField.setText(rasp);
			rezultat.setVisible(true);
			}
			if(op=="Patrat") {
				if (textField_1.getText().isBlank())
				{msgbox("Va rugam sa introduceti latura!");
				rezultat.setVisible(false);}
				a=Double.parseDouble(textField_1.getText());
				r=a*a;
				rasp=String.format("%.2f", r);
				rasp= rasp.replace(",", ".");
				textField.setText(rasp);
				rezultat.setVisible(true);
				}
			if (op=="Cub") {
				if (textField_1.getText().isBlank())
				{	
					msgbox("Va rugam sa introduceti latura!");
					rezultat.setVisible(false);
				}
			
				a=Double.parseDouble(textField_1.getText());
				
				r=a*a*a;
				rasp=String.format("%f", r);
				rasp= rasp.replace(",", ".");
				if (r < 0) 
					{
					msgbox("Va rugam sa introduceti valori pozitive pentru latura!");
					textField.setText("");
					rezultat.setVisible(false);
					}
				else 
					{
						textField.setText(rasp);
						rezultat.setVisible(true);
					}
			}
			if (op=="Piramida") {
				if (textField_1.getText().isBlank())
				{	
					msgbox("Va rugam sa introduceti latura de baza!");
					rezultat.setVisible(false);
				}
				if (textField_2.getText().isBlank())
				{	
					msgbox("Va rugam sa introduceti inaltimea!");
					rezultat.setVisible(false);
				}
				a=Double.parseDouble(textField_1.getText());
				b=Double.parseDouble(textField_2.getText());  
				r=(a*a*b)/3;
				rasp=String.format("%f", r);
				rasp= rasp.replace(",", ".");
				if (r < 0) 
					{
					msgbox("Va rugam sa introduceti valori pozitive!");
					textField.setText("");
					rezultat.setVisible(false);
					}
				else 
					{
						textField.setText(rasp);
						rezultat.setVisible(true);
					}
			}
			if(op=="Sfera") {
				if (textField_1.getText().isBlank())
				{msgbox("Va rugam sa introduceti raza!");
				rezultat.setVisible(false);}
				pi=Math.PI;
				raza=Double.parseDouble(textField_1.getText());
				r=raza*raza*pi*4;
				rasp=String.format("%.2f", r);
				rasp= rasp.replace(",", ".");
				textField.setText(rasp);
				rezultat.setVisible(true);
				}
			if(op=="Forta_de_greutate")
			{
				if(textField_3.getText().isBlank())
				{
					msgbox("Va rugam sa introduceti masa!");
					rezultat.setVisible(false);
				}
				g=9.8;
				a=Double.parseDouble(textField_3.getText());
				r=a*g;
				rasp=String.format("%.2f", r);
				rasp=rasp.replace(",", ".");
				textField.setText(rasp + "N");
				rezultat.setVisible(true);
			}
			if(op=="Viteza")
			{
				if(textField_3.getText().isBlank())
				{
					msgbox("Va rugam sa introduceti distanta!");
					rezultat.setVisible(false);
				}
				if(textField_4.getText().isBlank())
				{
					msgbox("Va rugam sa introduceti durata!");
					rezultat.setVisible(false);
				}		
				a=Double.parseDouble(textField_3.getText());
				b=Double.parseDouble(textField_4.getText());
				r=a/b;
				rasp=String.format("%.2f", r);
				rasp=rasp.replace(",", ".");
				textField.setText(rasp + "m/s");
				rezultat.setVisible(true);
			}
			if(op=="Densitate")
			{
				if(textField_3.getText().isBlank())
				{
					msgbox("Va rugam sa introduceti masa!");
					rezultat.setVisible(false);
				}
				if(textField_4.getText().isBlank())
				{
					msgbox("Va rugam sa introduceti volumul!");
					rezultat.setVisible(false);
				}		
				a=Double.parseDouble(textField_3.getText());
				b=Double.parseDouble(textField_4.getText());
				r=a/b;
				rasp=String.format("%.2f", r);
				rasp=rasp.replace(",", ".");
				textField.setText(rasp + "kg/m^3");
				rezultat.setVisible(true);
			}
		}});
		calcul.setBounds(361, 161, 143, 23);
		frmScientificCompanion.getContentPane().add(calcul);
		calcul.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(53, 11, 545, 26);
		frmScientificCompanion.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				
				String EnterNumber = textField.getText()+btnNewButton.getText();
				textField.setText(EnterNumber);
			}
		});	
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(24, 205, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(79, 205, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				String EnterNumber = textField.getText()+btnNewButton_1.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(134, 205, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				String EnterNumber = textField.getText()+btnNewButton_2.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(24, 149, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				String EnterNumber = textField.getText()+btnNewButton_3.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBounds(79, 149, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				String EnterNumber = textField.getText()+btnNewButton_4.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btnNewButton_5 = new JButton("6");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.setBounds(134, 149, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				String EnterNumber = textField.getText()+btnNewButton_5.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btnNewButton_6 = new JButton("7");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_6.setBounds(24, 93, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				String EnterNumber = textField.getText()+btnNewButton_6.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btnNewButton_7 = new JButton("8");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_7.setBounds(79, 93, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				String EnterNumber = textField.getText()+btnNewButton_7.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btnNewButton_8 = new JButton("9");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_8.setBounds(134, 93, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				String EnterNumber = textField.getText()+btnNewButton_8.getText();
				textField.setText(EnterNumber);
			}
		});
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_9.setBounds(189, 205, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				String EnterNumber = textField.getText()+btnNewButton_9.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btnNewButton_10 = new JButton("*");
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_10.setBounds(189, 149, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_10);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
				rezultat.setVisible(false);
			}
		});
		
		btnNewButton_11 = new JButton("+");
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_11.setBounds(189, 93, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_11);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
				rezultat.setVisible(false);
			}
		});
		
		btnNewButton_12 = new JButton("-");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_12.setBounds(244, 93, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
				rezultat.setVisible(false);
			}
		});
		
		btnNewButton_13 = new JButton("/");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_13.setBounds(244, 149, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_13);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
				rezultat.setVisible(false);
			}
		});
		
		btnNewButton_14 = new JButton("\t\u221A");
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_14.setBounds(24, 48, 100, 34);
		frmScientificCompanion.getContentPane().add(btnNewButton_14);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				
				if (textField.getText().isBlank() == false)
				msgbox("Pune radicalul inaintea variabilei!");
				textField.setText("");
				op="SQRT";
				rezultat.setVisible(false);
			}
		});
		
		btnNewButton_15 = new JButton("^");
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_15.setBounds(134, 48, 100, 34);
		frmScientificCompanion.getContentPane().add(btnNewButton_15);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="POW";
				rezultat.setVisible(false);
			}
		});
		
		btnNewButton_16 = new JButton(".");
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_16.setBounds(244, 205, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_16);
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				String EnterNumber = textField.getText()+btnNewButton_16.getText();
				textField.setText(EnterNumber);
				rezultat.setVisible(false);
			}
		});
		
		btnNewButton_17 = new JButton("C");
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_17.setBounds(299, 205, 45, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_17);
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				rezultat.setVisible(false);
				a=0;
				b=0;
				radical=0;
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
			}
		});
		
		btnNewButton_18 = new JButton("=");
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_18.setBounds(308, 149, 196, 45);
		frmScientificCompanion.getContentPane().add(btnNewButton_18);

		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Calculator de formule pentru geometrie");
		rdbtnNewRadioButton_1.setBounds(308, 74, 290, 23);
		frmScientificCompanion.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Calculator de formule pentru fizicã");
		rdbtnNewRadioButton_2.setBounds(308, 105, 297, 23);
		frmScientificCompanion.getContentPane().add(rdbtnNewRadioButton_2);
		
		lblNewLabel_3 = new JLabel("Latime");
		lblNewLabel_3.setBounds(225, 137, 46, 14);
		frmScientificCompanion.getContentPane().add(lblNewLabel_3);
		
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				String rasp;
				radical=Double.parseDouble(textField.getText());
				if(op=="SQRT") {
				
					r=Math.sqrt(radical);
					rasp=String.format("%f", r);
					rasp= rasp.replace(",", ".");
					textField.setText(rasp);
					rezultat.setVisible(true);
					
				}
				b=Double.parseDouble(textField.getText());
				if(op=="+") {
					r=a+b;
					rasp=String.format("%.2f", r);
					rasp= rasp.replace(",", ".");
					textField.setText(rasp);
					rezultat.setVisible(true);
				}
				if(op=="-") {
					r=a-b;
					rasp=String.format("%.2f", r);
					rasp= rasp.replace(",", ".");
					textField.setText(rasp);
					rezultat.setVisible(true);
				}
				if(op=="/") {
					r=a/b;
					rasp=String.format("%.2f", r);
					rasp= rasp.replace(",", ".");
					textField.setText(rasp);
					rezultat.setVisible(true);
				}
				if(op=="*") {
					r=a*b;
					rasp=String.format("%.2f", r);
					rasp= rasp.replace(",", ".");
					textField.setText(rasp);
					rezultat.setVisible(true);
				}

				if(op=="POW") {
					r=Math.pow(a,b);
					rasp=String.format("%.2f", r);
					textField.setText(rasp);
					rezultat.setVisible(true);
				}
			
			}
		});
	
		//lista obiecte invisibile	
		comboBox.setVisible(false);
		comboBox_1.setVisible(false);
		comboBox_2.setVisible(false);
		lblNewLabel.setVisible(false);
		lblNewLabel_1.setVisible(false);
		lblNewLabel_2.setVisible(false);
		lblNewLabel_3.setVisible(false);
		textField_1.setVisible(false);
		textField_2.setVisible(false);
		btnNewButton_18.setVisible(false);
		btnNewButton_10.setVisible(false);
		btnNewButton_11.setVisible(false);
		btnNewButton_12.setVisible(false);
		btnNewButton_13.setVisible(false);
		btnNewButton_14.setVisible(false);
		btnNewButton_15.setVisible(false);
		calcul.setVisible(false);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_6.setVisible(false);
		lblNewLabel_7.setVisible(false);
		lblNewLabel_8.setVisible(false);
		btnNewButton.setVisible(false);
		btnNewButton_1.setVisible(false);
		btnNewButton_2.setVisible(false);
		btnNewButton_3.setVisible(false);
		btnNewButton_4.setVisible(false);
		btnNewButton_5.setVisible(false);
		btnNewButton_6.setVisible(false);
		btnNewButton_7.setVisible(false);
		btnNewButton_8.setVisible(false);
		btnNewButton_9.setVisible(false);
		lblNewLabel_10.setVisible(false);
		btnNewButton_16.setVisible(false);
		lblNewLabel_9.setVisible(false);
		lblNewLabel_10.setVisible(false);
		textField_3.setVisible(false);
		textField_4.setVisible(false);
		lblNewLabel_11.setVisible(false);
		lblNewLabel_12.setVisible(false);
		lblNewLabel_13.setVisible(false);
		lblNewLabel_14.setVisible(false);
		//aici se termina
		
		//Calculator de baza
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Calculator de bazã");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setVisible(false);
				comboBox_1.setVisible(false);
				lblNewLabel.setVisible(false);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
				lblNewLabel_10.setVisible(false);
				lblNewLabel_8.setVisible(false);
				lblNewLabel_3.setVisible(false);
				textField_3.setVisible(false);
				textField_4.setVisible(false);
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				btnNewButton_18.setVisible(false);
				btnNewButton_10.setVisible(false);
				btnNewButton_11.setVisible(false);
				btnNewButton_12.setVisible(false);
				btnNewButton_13.setVisible(false);
				btnNewButton_14.setVisible(false);
				btnNewButton_15.setVisible(false);
				calcul.setVisible(false);
				lblNewLabel_4.setVisible(false);
				lblNewLabel_6.setVisible(false);
				lblNewLabel_7.setVisible(false);
				lblNewLabel_9.setVisible(false);
				btnNewButton.setVisible(false);
				btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false);
				btnNewButton_3.setVisible(false);
				btnNewButton_4.setVisible(false);
				btnNewButton_5.setVisible(false);
				btnNewButton_6.setVisible(false);
				btnNewButton_7.setVisible(false);
				btnNewButton_8.setVisible(false);
				btnNewButton_9.setVisible(false);
				btnNewButton_16.setVisible(false);
				lblNewLabel_11.setVisible(false);
				lblNewLabel_12.setVisible(false);
				lblNewLabel_13.setVisible(false);
				lblNewLabel_14.setVisible(false);
				comboBox_2.setVisible(false);
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				if(rdbtnNewRadioButton.isSelected()) {
				btnNewButton_10.setVisible(true);
				btnNewButton_11.setVisible(true);
				btnNewButton_12.setVisible(true);
				btnNewButton_13.setVisible(true);
				btnNewButton_14.setVisible(true);
				btnNewButton_15.setVisible(true);
				btnNewButton_18.setVisible(true);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				btnNewButton.setVisible(true);
				btnNewButton_1.setVisible(true);
				btnNewButton_2.setVisible(true);
				btnNewButton_3.setVisible(true);
				btnNewButton_4.setVisible(true);
				btnNewButton_5.setVisible(true);
				btnNewButton_6.setVisible(true);
				btnNewButton_7.setVisible(true);
				btnNewButton_8.setVisible(true);
				btnNewButton_9.setVisible(true);
				btnNewButton_16.setVisible(true);
				}
				else{
					btnNewButton_10.setVisible(false);
					btnNewButton_11.setVisible(false);
					btnNewButton_12.setVisible(false);
					btnNewButton_13.setVisible(false);
					btnNewButton_14.setVisible(false);
					btnNewButton_15.setVisible(false);
					btnNewButton_18.setVisible(false);
					btnNewButton.setVisible(false);
					btnNewButton_1.setVisible(false);
					btnNewButton_2.setVisible(false);
					btnNewButton_3.setVisible(false);
					btnNewButton_4.setVisible(false);
					btnNewButton_5.setVisible(false);
					btnNewButton_6.setVisible(false);
					btnNewButton_7.setVisible(false);
					btnNewButton_8.setVisible(false);
					btnNewButton_9.setVisible(false);
					btnNewButton_16.setVisible(false);
				}		
			}
		});
		rdbtnNewRadioButton.setBounds(308, 48, 172, 23);
		frmScientificCompanion.getContentPane().add(rdbtnNewRadioButton);

		//Geometrie
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setVisible(false);
				comboBox_1.setVisible(false);
				lblNewLabel_10.setVisible(false);
				lblNewLabel.setVisible(false);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
				lblNewLabel_3.setVisible(false);
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				btnNewButton_18.setVisible(false);
				btnNewButton_10.setVisible(false);
				btnNewButton_11.setVisible(false);
				btnNewButton_12.setVisible(false);
				btnNewButton_13.setVisible(false);
				btnNewButton_14.setVisible(false);
				btnNewButton_15.setVisible(false);
				calcul.setVisible(false);
				lblNewLabel_4.setVisible(false);
				lblNewLabel_6.setVisible(false);
				lblNewLabel_7.setVisible(false);
				btnNewButton.setVisible(false);
				btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false);
				btnNewButton_3.setVisible(false);
				btnNewButton_4.setVisible(false);
				btnNewButton_5.setVisible(false);
				btnNewButton_6.setVisible(false);
				btnNewButton_7.setVisible(false);
				btnNewButton_8.setVisible(false);
				btnNewButton_9.setVisible(false);
				btnNewButton_16.setVisible(false);
				lblNewLabel_9.setVisible(false);
				lblNewLabel_10.setVisible(false);
				lblNewLabel_11.setVisible(false);
				lblNewLabel_12.setVisible(false);
				lblNewLabel_13.setVisible(false);
				lblNewLabel_14.setVisible(false);
				textField_3.setVisible(false);
				textField_4.setVisible(false);
				comboBox_2.setSelectedIndex(0);
				comboBox_2.setVisible(false);
				if(rdbtnNewRadioButton_1.isSelected() == true) {
					comboBox.setVisible(true);
					comboBox_1.setVisible(true);
					lblNewLabel.setVisible(true);
					lblNewLabel_1.setVisible(true);
					lblNewLabel_8.setVisible(true);
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				}
				else{
					comboBox.setVisible(false);
					comboBox_1.setVisible(false);
					lblNewLabel.setVisible(false);
					lblNewLabel_1.setVisible(false);
					lblNewLabel_2.setVisible(false);
					lblNewLabel_3.setVisible(false);
					lblNewLabel_4.setVisible(false);
					lblNewLabel_6.setVisible(false);
					lblNewLabel_9.setVisible(false);
					textField_1.setVisible(false);
					textField_2.setVisible(false);
				}
				
			}
		});
		//Fizica
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setVisible(false);
				comboBox_1.setVisible(false);
				lblNewLabel.setVisible(false);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
				lblNewLabel_3.setVisible(false);
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				btnNewButton_18.setVisible(false);
				btnNewButton_10.setVisible(false);
				btnNewButton_11.setVisible(false);
				btnNewButton_12.setVisible(false);
				btnNewButton_13.setVisible(false);
				btnNewButton_14.setVisible(false);
				btnNewButton_15.setVisible(false);
				lblNewLabel_10.setVisible(false);
				lblNewLabel_11.setVisible(false);
				lblNewLabel_12.setVisible(false);
				lblNewLabel_13.setVisible(false);
				lblNewLabel_14.setVisible(false);
				calcul.setVisible(false);
				lblNewLabel_4.setVisible(false);
				lblNewLabel_6.setVisible(false);
				lblNewLabel_7.setVisible(false);
				lblNewLabel_8.setVisible(false);
				btnNewButton.setVisible(false);
				btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false);
				btnNewButton_3.setVisible(false);
				btnNewButton_4.setVisible(false);
				btnNewButton_5.setVisible(false);
				btnNewButton_6.setVisible(false);
				btnNewButton_7.setVisible(false);
				btnNewButton_8.setVisible(false);
				btnNewButton_9.setVisible(false);
				btnNewButton_16.setVisible(false);
				lblNewLabel_9.setVisible(false);
				textField_3.setVisible(false);
				textField_4.setVisible(false);
				lblNewLabel_10.setVisible(false);
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				if(rdbtnNewRadioButton_2.isSelected()) {
				comboBox_2.setVisible(true);
				lblNewLabel_10.setVisible(true);				
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				}
				else{
					comboBox_2.setVisible(false);
					textField_3.setVisible(false);
					textField_4.setVisible(false);
					lblNewLabel_10.setVisible(false);
				}				
			}
		});
	}
	protected void showMessageDialog(Object object, String string) {		
	}
}

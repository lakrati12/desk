package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JButton;

public class mainForm extends JFrame {
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainForm frame = new mainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainForm() {
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		this.setExtendedState(MAXIMIZED_BOTH);
		
		desktopPane = new JDesktopPane();
		desktopPane.setForeground(Color.GRAY);
		desktopPane.setBackground(new Color(173, 216, 230));
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(null);
		
		JButton user = new JButton("Gestion User");
		user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionUser s=new GestionUser();
				desktopPane.add(s);
				s.setVisible(true);
				Dimension d=desktopPane.getSize();
		        Dimension jIF=s.getSize();
		        s.setLocation((d.width-jIF.width)/2,(d.height-jIF.height)/2);
				
			}
		});
		user.setBounds(249, 43, 266, 46);
		desktopPane.add(user);
		
		JButton btnGestionSmartphone = new JButton("Gestion Smartphone");
		btnGestionSmartphone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionSmartPhone s=new GestionSmartPhone();
				desktopPane.add(s);
				s.setVisible(true);
				Dimension d=desktopPane.getSize();
		        Dimension jIF=s.getSize();
		        s.setLocation((d.width-jIF.width)/2,(d.height-jIF.height)/2);
			}
		});
		btnGestionSmartphone.setBounds(760, 43, 273, 46);
		desktopPane.add(btnGestionSmartphone);
		
		
	}
}






package GUI;

import hypermarket.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class login extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JPasswordField PasswordField;
	public JButton btnLogin;
	
	public Graphics g;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					login frame = new login();
					frame.setVisible(true);
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		
		Font f = new Font("SansSerif", Font.PLAIN, 18);
		Color slide = new Color(57, 38, 90);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblusername = new JLabel("User Name");
		lblusername.setFont(f);
		lblusername.setBounds(213, 137, 147, 40);
		contentPane.add(lblusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setFont(f);
		lblpassword.setBounds(213, 203, 133, 40);
		contentPane.add(lblpassword);
		
		textField = new JTextField();
		textField.setFont(f);
		textField.setBounds(400, 137, 210, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		PasswordField = new JPasswordField();
		PasswordField.setFont(f);
		PasswordField.setBounds(400, 205, 210, 40);
		contentPane.add(PasswordField);
		
		btnLogin = new JButton("Log In");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setFont(f);
		btnLogin.setBounds(306, 367, 163, 52);
		contentPane.add(btnLogin);
		
		hypermarket.Admin x = new hypermarket.Admin();
		Cashier y = new Cashier();
                Inventory z = new Inventory();
                Marketer w = new Marketer();
        
		btnLogin.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if (!textField.getText().equals("") && !PasswordField.getText().equals("")) {
				       
				    if (x.Login(textField.getText(),PasswordField.getText())) {
				    	
				    	new AdminFrame().setVisible(true);
				    	setVisible(false);
				                     
				    }
				    
				    else if (y.Login(textField.getText(),PasswordField.getText())) {
				        
				    	new CashierFrame().setVisible(true);
				    	setVisible(false);
				    	
				    }
                    else if (z.Login(textField.getText(),PasswordField.getText())) {
                    	
                        new StoreFrame().setVisible(true);
                        setVisible(false);
                        
                    }
                    
                    else if (w.Login(textField.getText(),PasswordField.getText())) {
                    	
                        new OfferFrame().setVisible(true);
                        setVisible(false);
                        
                    }
				    
				    else {
				    	   
				    	JOptionPane.showMessageDialog(null, "Wrong UserName or Password", "Error", JOptionPane.ERROR_MESSAGE);
				         
				    }
				    
				 }
				 else {
					 
				    	JOptionPane.showMessageDialog(null, "Required Field is Empty", "Error", JOptionPane.ERROR_MESSAGE);
				       
				 }
				
			}
		} );
		
	}
}


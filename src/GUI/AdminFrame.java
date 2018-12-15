package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import hypermarket.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnAddUser;
	private JButton btnSearch;
	private JButton btnDisplayAll;
	private JButton btnLogOut;
	private JTextField textFieldname;
	private JTextField textFieldusername;
	private JTextField textFieldage;
	private JTextField textFieldssn;
	private JTextField textFieldsalary;
	private JTextField textFieldpass;
	private JButton btnAdd;
	private JTextField textField;
	private JLabel lblSaalary;
	private JLabel lblDepartement;
	private JTextField nameSearch;
	private JTextField ageSearch;
	private JTextField salarySearch;
	private JLabel depSearch;
    private JLabel disNameAll;
    private JLabel disAgeAll;
    private JLabel disDepAll; 
    private JLabel disUserAll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					AdminFrame frame = new AdminFrame();
					frame.setVisible(true);
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminFrame() {
		
		Font f = new Font("SansSerif", Font.PLAIN, 18);
		Color slide = new Color(57, 38, 90);
		Color hover = new Color(86, 67, 117);
		
		int SlideButtonHeight = 50;
		int SkideButtonWidth = 200;
		
		// Frame Setting
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(slide);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		// Slide Buttons
		btnAddUser = new JButton("Add User");
		btnAddUser.setFont(f);
		btnAddUser.setBackground(slide);
		btnAddUser.setForeground(Color.WHITE);
		btnAddUser.setBounds(0, 150, SkideButtonWidth, SlideButtonHeight);
		btnAddUser.setBorder(null);
		btnAddUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAddUser.setBackground(hover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAddUser.setBackground(slide);
			}
		});
		
		contentPane.add(btnAddUser);
		
		btnSearch = new JButton("Search");
		btnSearch.setFont(f);
		btnSearch.setBackground(slide);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBounds(0, 200, SkideButtonWidth, SlideButtonHeight);
		btnSearch.setBorder(null);
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSearch.setBackground(hover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnSearch.setBackground(slide);
			}
		});
		
		contentPane.add(btnSearch);
		
		btnDisplayAll = new JButton("Display All");
		btnDisplayAll.setFont(f);
		btnDisplayAll.setBackground(slide);
		btnDisplayAll.setForeground(Color.WHITE);
		btnDisplayAll.setBounds(0, 250, SkideButtonWidth, SlideButtonHeight);
		btnDisplayAll.setBorder(null);
		btnDisplayAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDisplayAll.setBackground(hover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnDisplayAll.setBackground(slide);
			}
		});
		
		contentPane.add(btnDisplayAll);
		
		btnLogOut = new JButton("Log out");
		btnLogOut.setFont(f);
		btnLogOut.setBackground(slide);
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setBorder(null);
		btnLogOut.setBounds(0, 450, SkideButtonWidth, SlideButtonHeight);
		btnLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogOut.setBackground(hover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogOut.setBackground(slide);
			}
		});
		contentPane.add(btnLogOut);
		
		// Panels******
		
		// Add Panel
		JPanel addPanel = new JPanel();
		addPanel.setBounds(200, 0, 700, 600);
		addPanel.setBackground(Color.WHITE);
		contentPane.add(addPanel);
		addPanel.setLayout(null);
		addPanel.setVisible(false);
		
		//Search Panel
		JPanel searchPanel = new JPanel();
		searchPanel.setBackground(Color.WHITE);
		searchPanel.setBounds(200, 0, 700, 600);
		contentPane.add(searchPanel);
		searchPanel.setLayout(null);
		
		//Display Panel and Table
		JTable table = new JTable();
		table.setModel(new javax.swing.table.DefaultTableModel(
				 new Object [][] {

		            },
		            new String [] {
		                "Name", "UserName", "Age", "Salary", "Department" 
		            }
				));
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		Object rowData[] = new Object[5];  //Number Of Coluoms
		JScrollPane displayPanel = new JScrollPane();
		displayPanel.setBounds(200, 0, 700, 600);
		contentPane.add(displayPanel);
		displayPanel.setViewportView(table);
		
		
		// Panels Setting******
		
		// Add Panel
		JLabel lblName = new JLabel("Name");
		lblName.setFont(f);
		lblName.setBounds(153, 84, 85, 20);
		addPanel.add(lblName);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(365, 84, 182, 21);
		addPanel.add(textFieldname);
		textFieldname.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(f);
		lblUserName.setBounds(153, 134, 128, 20);
		addPanel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(f);
		lblPassword.setBounds(153, 184, 128, 20);
		addPanel.add(lblPassword);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(f);
		lblAge.setBounds(153, 234, 85, 20);
		addPanel.add(lblAge);
		
		JLabel lblSalary = new JLabel("SSN");
		lblSalary.setFont(f);
		lblSalary.setBounds(153, 284, 85, 20);
		addPanel.add(lblSalary);
		
		JLabel lblSalary_1 = new JLabel("Salary");
		lblSalary_1.setFont(f);
		lblSalary_1.setBounds(153, 334, 85, 20);
		addPanel.add(lblSalary_1);
		
		textFieldusername = new JTextField();
		textFieldusername.setColumns(10);
		textFieldusername.setBounds(365, 133, 182, 21);
		addPanel.add(textFieldusername);
		
		textFieldage = new JTextField();
		textFieldage.setColumns(10);
		textFieldage.setBounds(365, 233, 182, 21);
		addPanel.add(textFieldage);
		
		textFieldssn = new JTextField();
		textFieldssn.setColumns(10);
		textFieldssn.setBounds(365, 286, 182, 21);
		addPanel.add(textFieldssn);
		
		textFieldsalary = new JTextField();
		textFieldsalary.setColumns(10);
		textFieldsalary.setBounds(365, 336, 182, 21);
		addPanel.add(textFieldsalary);
		
		textFieldpass = new JTextField();
		textFieldpass.setColumns(10);
		textFieldpass.setBounds(365, 186, 182, 21);
		addPanel.add(textFieldpass);
		
		btnAdd = new JButton("ADD");
		btnAdd.setFont(f);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(225, 484, 163, 52);
		addPanel.add(btnAdd);
		
		JLabel lblDepartrment = new JLabel("Departrment");
		lblDepartrment.setFont(f);
		lblDepartrment.setBounds(153, 393, 143, 20);
		addPanel.add(lblDepartrment);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(365, 388, 182, 24);
		comboBox.addItem("Cashier");
		comboBox.addItem("Markter");
		comboBox.addItem("Inventory");
		addPanel.add(comboBox);
		
		//Add Button Clicked
		btnAdd.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					
//					Integer.parseInt(textFieldage.getText());
//					Double.parseDouble(textFieldssn.getText()); 
//					Double.parseDouble(textFieldsalary.getText());
					if (!textFieldname.getText().equals("")&&!textFieldusername.getText().equals("")&&!textFieldage.getText().equals("")&&!textFieldpass.getText().equals("")&&!textFieldsalary.getText().equals("")&&!textFieldssn.getText().equals("")) {
							
							if ("Cashier".equals((String)comboBox.getSelectedItem())) {
								Cashier x = new Cashier();
								x.setAge(Integer.parseInt(textFieldage.getText()));
								x.setName(textFieldname.getText());
								x.setPass(textFieldpass.getText());
								x.setSSN(Double.parseDouble(textFieldssn.getText()));
								x.setUserName(textFieldusername.getText());
								x.setsalary(Double.parseDouble(textFieldsalary.getText()));
								x.setdepartment((String) comboBox.getSelectedItem());
								if(x.AddCashier()){
								JOptionPane.showMessageDialog(null, "Add successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
								resetpanel();
								} else {
									JOptionPane.showMessageDialog(null, "Username is taken ", "Done", JOptionPane.ERROR_MESSAGE);
								}
							}
							else if ("Inventory".equals((String)comboBox.getSelectedItem())) {
								Inventory x = new Inventory();
								x.setAge(Integer.parseInt(textFieldage.getText()));
								x.setName(textFieldname.getText());
								x.setPass(textFieldpass.getText());
								x.setSSN(Double.parseDouble(textFieldssn.getText()));
								x.setUserName(textFieldusername.getText());
								x.setsalary(Double.parseDouble(textFieldsalary.getText()));
								x.setdepartment((String) comboBox.getSelectedItem());
								if(x.AddInventory()){
									JOptionPane.showMessageDialog(null, "Add successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
									resetpanel();
								} else {
									JOptionPane.showMessageDialog(null, "Username is taken", "ERROR", JOptionPane.ERROR_MESSAGE);
								}
							}
							else if ("Markter".equals((String)comboBox.getSelectedItem())){
								Marketer x = new Marketer();
								x.setAge(Integer.parseInt(textFieldage.getText()));
								x.setName(textFieldname.getText());
								x.setPass(textFieldpass.getText());
								x.setSSN(Double.parseDouble(textFieldssn.getText()));
								x.setUserName(textFieldusername.getText());
								x.setsalary(Double.parseDouble(textFieldsalary.getText()));
								x.setdepartment((String) comboBox.getSelectedItem());
								if(x.AddMrketer()){
									JOptionPane.showMessageDialog(null, "Add successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
                                    resetpanel();
								}
								else 
								{
									JOptionPane.showMessageDialog(null, "Username is taken", "ERROR", JOptionPane.ERROR_MESSAGE);
									
								}
                                                               
							}
							
					}
					else {
						JOptionPane.showMessageDialog(null, "Missing Require Faild ", "Numbers", JOptionPane.ERROR_MESSAGE);
					}
						
					
				} catch(NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Age and Salary and SSN must be Numbers", "Numbers", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		} );
		
		// Search Panel
		textField = new JTextField();
		textField.setBounds(259, 64, 182, 21);
		searchPanel.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("User Name");
		label.setBounds(60, 63, 128, 20);
		searchPanel.add(label);
		label.setFont(f);
		
		JButton btnSearch_1 = new JButton("Search");
		btnSearch_1.setFont(f);
		btnSearch_1.setBackground(Color.WHITE);
		btnSearch_1.setBounds(489, 47, 163, 52);
		searchPanel.add(btnSearch_1);
		
		JLabel lblName1 = new JLabel("Name");
		lblName1.setFont(f);
		lblName1.setBounds(60, 150, 128, 20);
		searchPanel.add(lblName1);
		
		JLabel lblAge1 = new JLabel("Age");
		lblAge1.setFont(f);
		lblAge1.setBounds(60, 200, 128, 20);
		searchPanel.add(lblAge1);
		
		lblSaalary = new JLabel("Salary");
		lblSaalary.setFont(f);
		lblSaalary.setBounds(60, 250, 128, 20);
		searchPanel.add(lblSaalary);
		
		lblDepartement = new JLabel("Department");
		lblDepartement.setFont(f);
		lblDepartement.setBounds(60, 300, 154, 20);
		searchPanel.add(lblDepartement);
		
		nameSearch = new JTextField("");
		nameSearch.setBounds(259, 150, 128, 20);
		searchPanel.add(nameSearch);
		
		ageSearch = new JTextField("");		
		ageSearch.setBounds(259, 200, 128, 20);
		searchPanel.add(ageSearch);
		
		salarySearch = new JTextField("");
		salarySearch.setBounds(259, 250, 128, 20);
		searchPanel.add(salarySearch);
		
		depSearch = new JLabel("");
		depSearch.setBounds(259, 300, 128, 20);
		searchPanel.add(depSearch);
		
		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.setFont(f);
		btnUpdate_1.setBackground(Color.WHITE);
		btnUpdate_1.setBounds(60, 459, 163, 52);
		searchPanel.add(btnUpdate_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(455, 459, 163, 52);
		searchPanel.add(btnDelete);
		
		// Search Button 
		btnSearch_1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Cashier x = new Cashier();
				Inventory y = new Inventory();
				Marketer z = new Marketer();
				
				if (new Cashier().searchCashier(textField.getText()).getAge() != 0.0) {
					
					x = new Cashier().searchCashier(textField.getText());
					salarySearch.setText(Double.toString(x.getSalary()));
					depSearch.setText(x.getDepartment());
					nameSearch.setText(x.getName());
					ageSearch.setText(Integer.toString(x.getAge()));
					
				}
				else if (new Inventory().searchInventory(textField.getText()).getAge() != 0.0) {
					
					y = new Inventory().searchInventory(textField.getText());
					salarySearch.setText(Double.toString(y.getSalary()));
					depSearch.setText(y.getDepartment());
					nameSearch.setText(y.getName());
					ageSearch.setText(Integer.toString(y.getAge()));
					
				}
				else if (new Marketer().searchMarkter(textField.getText()).getAge() != 0.0) {
					
					z = new Marketer().searchMarkter(textField.getText());
					salarySearch.setText(Double.toString(z.getSalary()));
					depSearch.setText(z.getDepartment());
					nameSearch.setText(z.getName());
					ageSearch.setText(Integer.toString(z.getAge()));
					
				}
				else {
					
					JOptionPane.showMessageDialog(null, "User Not Found", "Error", JOptionPane.ERROR_MESSAGE);
					
				}
				
				
			}
		} );
		// Update Button
		btnUpdate_1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Cashier x = new Cashier();
				Inventory y = new Inventory();
				Marketer z = new Marketer();
				
				if (new Cashier().searchCashier(textField.getText()).getAge() != 0.0) {
					
					try {
						
						x.setUserName(textField.getText());
						x.setName(nameSearch.getText());
						x.setAge(Integer.parseInt(ageSearch.getText()));
						x.setsalary(Double.parseDouble(salarySearch.getText()));
						x.setdepartment("Cashier");
						x.UpdateCashier(textField.getText());
						JOptionPane.showMessageDialog(null, "Updated", "Done", JOptionPane.INFORMATION_MESSAGE);
						
					} catch(NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Age and Salary and SSN must be Numbers", "Numbers", JOptionPane.ERROR_MESSAGE);
					}
					
				}
				else if (new Inventory().searchInventory(textField.getText()).getAge() != 0.0) {
					
					try {
						
						y.setUserName(textField.getText());
						y.setName(nameSearch.getText());
						y.setAge(Integer.parseInt(ageSearch.getText()));
						y.setsalary(Double.parseDouble(salarySearch.getText()));
						y.setdepartment("Inventory");
						y.UpdateInventory(textField.getText());
						JOptionPane.showMessageDialog(null, "Updated", "Done", JOptionPane.INFORMATION_MESSAGE);
						
					} catch(NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Age and Salary and SSN must be Numbers", "Numbers", JOptionPane.ERROR_MESSAGE);
					}
					
				}
				else if (new Marketer().searchMarkter(textField.getText()).getAge() != 0.0) {
					
					try {
						
						z.setUserName(textField.getText());
						z.setName(nameSearch.getText());
						z.setAge(Integer.parseInt(ageSearch.getText()));
						z.setsalary(Double.parseDouble(salarySearch.getText()));
						z.setdepartment("Inventory");
						z.Updatemarketer(textField.getText());
						JOptionPane.showMessageDialog(null, "Updated", "Done", JOptionPane.INFORMATION_MESSAGE);
						
					} catch(NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Age and Salary and SSN must be Numbers", "Numbers", JOptionPane.ERROR_MESSAGE);
					}
					
				}
				
			}
		} );
		
		// Delete Update
		btnDelete.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Cashier x = new Cashier();
				Inventory y = new Inventory();
				Marketer z = new Marketer();
				
				if (new Cashier().searchCashier(textField.getText()).getAge() != 0.0 ||new Inventory().searchInventory(textField.getText()).getAge() != 0.0 ) {
					
					x.DeleteCashier(textField.getText());
					y.DeleteInventory(textField.getText());
					z.DeleteMrketer(textField.getText());
					JOptionPane.showMessageDialog(null, "User Deleted successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
					resetpanel();
					
				}
				else {
					
					JOptionPane.showMessageDialog(null, "User Not Found", "Error", JOptionPane.ERROR_MESSAGE);
					
				}
				
			}
		} );
		
		//Slide Button Function
		btnAddUser.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				addPanel.setVisible(true);
				searchPanel.setVisible(false);
				displayPanel.setVisible(false);
				
			}
		} );
		
		btnSearch.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				addPanel.setVisible(false);
				searchPanel.setVisible(true);
				displayPanel.setVisible(false);
				
			}
		} );
		
		btnDisplayAll.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				addPanel.setVisible(false);
				searchPanel.setVisible(false);
				displayPanel.setVisible(true);
				
				model.setRowCount(0); // علشان ميزودش علي الي مكتوب و يخليه يبدا من الأول
				
				ArrayList<Cashier> cash = new Cashier().ListCashier();
				ArrayList<Inventory> inve = new Inventory().ListInventory();
				ArrayList<Marketer> market = new Marketer().ListMrketer(); // for markter
					
				
				for (int i = 0; i<cash.size(); i++ ) {
					
					rowData[0] = cash.get(i).getName();
					rowData[1] = cash.get(i).getUserName();
					rowData[2] = cash.get(i).getAge();
					rowData[3] = cash.get(i).getSalary();
					rowData[4] = cash.get(i).getDepartment();
					model.addRow(rowData);
					
				}
				
				for (int i = 0; i<inve.size(); i++ ) {
					
					rowData[0] = inve.get(i).getName();
					rowData[1] = inve.get(i).getUserName();
					rowData[2] = inve.get(i).getAge();
					rowData[3] = inve.get(i).getSalary();
					rowData[4] = inve.get(i).getDepartment();
					model.addRow(rowData);
					
				}
                     	for (int i = 0; i<market.size(); i++ ) {
					
					rowData[0] = market.get(i).getName();
					rowData[1] = market.get(i).getUserName();
					rowData[2] = market.get(i).getAge();
					rowData[3] = market.get(i).getSalary();
					rowData[4] = market.get(i).getDepartment();
					model.addRow(rowData);
					
				}
				
			}
		} );
		
		btnLogOut.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new login().setVisible(true);
				setVisible(false);
				
			}
		} );
		
		addPanel.setVisible(true);
		searchPanel.setVisible(false);
		displayPanel.setVisible(false);
		
	}
	
	//Slide Button Change Color
	
	
	
    public void resetpanel() {
    	
        textFieldname.setText("");
        textFieldage.setText("");
        textFieldpass.setText("");
        textFieldsalary.setText("");
        textFieldssn.setText("");
        textFieldusername.setText("");
        salarySearch.setText("");
		depSearch.setText("");
		nameSearch.setText("");
		ageSearch.setText("");
            
    }
        
}
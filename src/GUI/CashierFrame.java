package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import GUI_implementation.Selling;
import GUI_implementation.Store;
import hypermarket.Product;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CashierFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnOrder;
	private JButton btnSearch;
	private JButton btnDisplayAll;
	private JButton btnLogOut;
	private JComboBox<String> nameCombo;
	private JComboBox<String> numberCombo;
	private JTextField SearchField;
	private JLabel QueTextField;
	private JLabel PriceTextField;
	private JLabel CatTextField;
	private JLabel nametextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierFrame frame = new CashierFrame();
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
	public CashierFrame() {
		
		Font f = new Font("SansSerif", Font.PLAIN, 18);
		Color slide = new Color(57, 38, 90);
		Color hover = new Color(86, 67, 117);
		
		int SlideButtonHeight = 50;
		int SkideButtonWidth = 200;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(slide);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Slide Buttons
		btnOrder = new JButton("Order");
		btnOrder.setFont(f);
		btnOrder.setBackground(slide); 
		btnOrder.setForeground(Color.WHITE);
		btnOrder.setBounds(0, 150, SkideButtonWidth, SlideButtonHeight);
		btnOrder.setBorder(null);
		btnOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnOrder.setBackground(hover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnOrder.setBackground(slide);
			}
		});
		getContentPane().add(btnOrder);
		
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
		getContentPane().add(btnSearch);
				
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
		getContentPane().add(btnDisplayAll);
				
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
		getContentPane().add(btnLogOut);
		
		//Panels******
		//Order Panel*
		JPanel Orderpanel = new JPanel();
		Orderpanel.setBounds(200, 0, 700, 600);
		Orderpanel.setBackground(Color.WHITE);
		contentPane.add(Orderpanel);
		Orderpanel.setLayout(null);
		
		//Search Panel*
		JPanel Searchpanel = new JPanel();
		Searchpanel.setBounds(200, 0, 700, 600);
		Searchpanel.setBackground(Color.WHITE);
		contentPane.add(Searchpanel);
		Searchpanel.setLayout(null);
		
		//Display Panel*
		JTable table = new JTable();
		table.setModel(new javax.swing.table.DefaultTableModel(
				 new Object [][] {

		            },
		            new String [] {
		            		"Name", "Price", "Quantity", "Category" 
		            }
				));
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		Object rowData[] = new Object[4];  //Number Of Coluoms
		JScrollPane Displaypanel = new JScrollPane();
		Displaypanel.setBounds(200, 0, 700, 600);
		contentPane.add(Displaypanel);
		Displaypanel.setViewportView(table);
		
		
		//OnStart******
		Orderpanel.setVisible(true);
		Searchpanel.setVisible(false);
		Displaypanel.setVisible(false);
		
		// Panels Att******
		//Order Panel*
		JLabel lblProudect = new JLabel("Proudect");
		lblProudect.setFont(f);
		lblProudect.setBounds(85, 36, 136, 15);
		Orderpanel.add(lblProudect);
		
		JLabel lblQ = new JLabel("Quantity");
		lblQ.setBounds(87, 82, 134, 15);
		lblQ.setFont(f);
		
		Orderpanel.add(lblQ);
		
		nameCombo = new JComboBox<String>();
		nameCombo.setBounds(282, 34, 182, 21);
		nameCombo.setSelectedIndex(-1);
		Orderpanel.add(nameCombo);
		
		ArrayList<Product> xList = new Selling().GetArray();
		numberCombo = new JComboBox<String>();
		numberCombo.setBounds(282, 80, 182, 21);
		Orderpanel.add(numberCombo);
		// Put all proudect in the first comboBox
		for (Product x : xList) {
			nameCombo.addItem(x.getName().toString());
		}
		//For the first Proudect
		for (int i = 1; i<=new Selling().GetNumber(nameCombo.getSelectedItem().toString()); i++) {
			numberCombo.addItem(Integer.toString(i));
		}
		// Put the number in the second comboBox after Changing the 
		nameCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numberCombo.setSelectedItem(-1);/*************/
				numberCombo.removeAllItems();//Remove the old numbers and set the new
				for (int i = 1; i<=new Selling().GetNumber(nameCombo.getSelectedItem().toString()); i++) {
					numberCombo.addItem(Integer.toString(i));
				}
			}
		});
		
		//Add Proudect
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(525, 34, 163, 52);
		btnAdd.setFont(f);
		btnAdd.setBackground(Color.WHITE);
		Orderpanel.add(btnAdd);
		

		JTable table1 = new JTable();
		table1.setModel(new javax.swing.table.DefaultTableModel(
				 new Object [][] {

		            },
		            new String [] {
		                "Name", "Price", "Quantity", "Total" 
		            }
				));
		DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
		Object rowData1[] = new Object[4];  //Number Of Coluoms
		JScrollPane displayPanel = new JScrollPane();
		displayPanel.setBounds(0, 131, 688, 314);
		Orderpanel.add(displayPanel);
		displayPanel.setViewportView(table1);
		
		
		btnAdd.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = nameCombo.getSelectedItem().toString();
				double price = new Selling().GetPrice(name);
				int qua = Integer.parseInt(numberCombo.getSelectedItem().toString());
				String total = Double.toString(price*qua);
				String quaS = Double.toString(qua);
				String priceS = Double.toString(price);
				
				//Deleting the qua from the ArrayList
				new Selling().miniProudect(name, qua);
				
				//reset it
				numberCombo.setSelectedItem(-1);
				numberCombo.removeAllItems();
				for (int i = 1; i<=new Selling().GetNumber(nameCombo.getSelectedItem().toString()); i++) {
					numberCombo.addItem(Integer.toString(i));
				}
				
				//Adding to the Row
				rowData1[0] = name;
				rowData1[1] = priceS;
				rowData1[2] = quaS;
				rowData1[3] = total;
				model1.addRow(rowData1);
				
			}
		} );
		
		JButton btnOrderNow = new JButton("Order Now");
		btnOrderNow.setFont(f);
		btnOrderNow.setBackground(Color.WHITE);
		btnOrderNow.setBounds(449, 488, 163, 52);
		Orderpanel.add(btnOrderNow);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(77, 488, 163, 52);
		Orderpanel.add(btnCancel);
		
		btnOrderNow.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Double quess = 0.0;
				for (int i = 0; i < model1.getRowCount(); i++) {
					
					
					quess = quess + Double.parseDouble((String) model1.getValueAt(i, 3));
					
					
				}
				String out = "The Total is " + quess;
				JOptionPane.showMessageDialog(null, out, "Total", JOptionPane.INFORMATION_MESSAGE);
				model1.setRowCount(0);
				
			}
		} );
		
		btnCancel.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// return the old value
				for (int i = 0; i < model1.getRowCount(); i++) {
					
					String name = (String) model1.getValueAt(i, 0);
					Double que =  Double.parseDouble((String) model1.getValueAt(i, 2));
					int queS = que.intValue();
					System.out.println(que);
					new Selling().addProudect(name, queS);
					
					//reset it
					numberCombo.setSelectedItem(-1);
					numberCombo.removeAllItems();
					for (int i1 = 1; i1<=new Selling().GetNumber(name); i1++) {
						numberCombo.addItem(Integer.toString(i1));
					}
					
					model1.setRowCount(0);
					
				}
				
			}
		} );
		//Search Panel*
		JLabel label = new JLabel("Search");
		label.setFont(f);
		label.setBounds(126, 38, 70, 20);
		Searchpanel.add(label);
		
		SearchField = new JTextField();
		SearchField.setColumns(10);
		SearchField.setBounds(236, 38, 182, 20);
		Searchpanel.add(SearchField);
		
		JButton button = new JButton("Search");
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBackground(Color.WHITE);
		button.setBounds(445, 33, 132, 30);
		Searchpanel.add(button);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(f);
		label_1.setBounds(164, 102, 203, 20);
		Searchpanel.add(label_1);
		
		JLabel label_2 = new JLabel("Quantity");
		label_2.setFont(f);
		label_2.setBounds(164, 152, 203, 20);
		Searchpanel.add(label_2);
		
		JLabel label_3 = new JLabel("Price");
		label_3.setFont(f);
		label_3.setBounds(164, 202, 203, 20);
		Searchpanel.add(label_3);
		
		JLabel label_4 = new JLabel("Category");
		label_4.setFont(f);
		label_4.setBounds(164, 252, 203, 20);
		Searchpanel.add(label_4);
		
		QueTextField = new JLabel("");
		QueTextField.setFont(f);
		QueTextField.setBounds(451, 152, 203, 20);
		Searchpanel.add(QueTextField);
		
		PriceTextField = new JLabel("");
		PriceTextField.setFont(f);
		PriceTextField.setBounds(451, 202, 203, 20);
		Searchpanel.add(PriceTextField);
		
		CatTextField = new JLabel("");
		CatTextField.setFont(f);
		CatTextField.setBounds(419, 234, 203, 20);
		Searchpanel.add(CatTextField);
		
		nametextField = new JLabel("");
		nametextField.setFont(f);
		nametextField.setBounds(445, 88, 203, 20);
		Searchpanel.add(nametextField);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (!SearchField.getText().equals("")) {
					
					Store x = new Store(); 
	                Product returned = x.searchForProduct(SearchField.getText());
	                if (returned==null) {
	                	JOptionPane.showMessageDialog(null, "Not Found", "Error", JOptionPane.ERROR_MESSAGE);
	                } else {
	                	CatTextField.setText("" + returned.GetCategory());
	                    PriceTextField.setText("" + returned.getPrice());
	                    nametextField.setText("" + returned.getName());
	                    QueTextField.setText("" + returned.getQuantity());
	                }
					
				} else {
					JOptionPane.showMessageDialog(null, "Missing Require Field", "Error", JOptionPane.ERROR_MESSAGE);
					CatTextField.setText("");
                    PriceTextField.setText("");
                    nametextField.setText("");
                    QueTextField.setText("");
				}
				
			}
		});
		
		//Slide Button Action******
		//Order*
		btnOrder.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Orderpanel.setVisible(true);
				Searchpanel.setVisible(false);
				Displaypanel.setVisible(false);
				
			}
		} );
		//Search*
		btnSearch.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				Orderpanel.setVisible(false);
				Searchpanel.setVisible(true);
				Displaypanel.setVisible(false);
				
			}
		} );
		//Display*
		btnDisplayAll.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Orderpanel.setVisible(false);
				Searchpanel.setVisible(false);
				Displaypanel.setVisible(true);
				
				model.setRowCount(0);
				ArrayList<Product> x = new Selling().GetArray();
				for (int i = 0; i<x.size(); i++ ) {
					
					rowData[0] = x.get(i).getName();
					rowData[1] = x.get(i).getPrice();
					rowData[2] = x.get(i).getQuantity();
					rowData[3] = x.get(i).GetCategory();
					model.addRow(rowData);
				}
				
				
			}
		} );
		
		//Logout*
		btnLogOut.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new login().setVisible(true);
				setVisible(false);
				
			}
		} );
		
	}
}





//for (int i = 1; i<=new Selling().GetNumber(nameCombo.getSelectedItem().toString()); i++) {
//	numberCombo.addItem(Integer.toString(i));
//}

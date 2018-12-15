/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Muhammad
 */

import hypermarket.*;
import GUI_implementation.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StoreFrame extends JFrame{
	
    private JPanel contentPane;
    private JButton btnMenuProdect;
	private JButton btnAddProdect;
	private JButton btnUpdateProdect;
	private  JButton btnAdd;
	private JButton btnLogOut;
    private JTextField textFieldname;
    private JTextField textFieldnameUpdate;
    private  JTextField textFieldQuantity;
    private  JTextField textFieldQuantityUpdate;
    private JTextField textFieldPrice;
    private JTextField textFieldPriceUpdate;
    private JTextField textFieldCategory;
    private JTextField textFieldCategoryUpdate;
    private  JTextField textFieldSearch;
    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					StoreFrame frame = new StoreFrame();
					frame.setVisible(true);
				
			}
		});
    }
        
        
        public StoreFrame() {
        
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
		btnMenuProdect = new JButton("Menu Product");
		btnMenuProdect.setFont(f);
		btnMenuProdect.setBackground(slide);
		btnMenuProdect.setForeground(Color.WHITE);
		btnMenuProdect.setBounds(0, 200, SkideButtonWidth, SlideButtonHeight);
		btnMenuProdect.setBorder(null);
		btnMenuProdect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMenuProdect.setBackground(hover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnMenuProdect.setBackground(slide);
			}
		});
		getContentPane().add(btnMenuProdect);
                
        btnAddProdect = new JButton("Add Product");
        btnAddProdect.setFont(f);
		btnAddProdect.setBackground(slide);
		btnAddProdect.setForeground(Color.WHITE);
		btnAddProdect.setBounds(0, 150, SkideButtonWidth, SlideButtonHeight);
		btnAddProdect.setBorder(null);
		btnAddProdect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAddProdect.setBackground(hover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAddProdect.setBackground(slide);
			}
		});
		getContentPane().add(btnAddProdect);
                
                
        btnUpdateProdect = new JButton("Search");
        btnUpdateProdect.setFont(f);
		btnUpdateProdect.setBackground(slide);
		btnUpdateProdect.setForeground(Color.WHITE);
		btnUpdateProdect.setBounds(0, 250, SkideButtonWidth, SlideButtonHeight);
		btnUpdateProdect.setBorder(null);
		btnUpdateProdect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUpdateProdect.setBackground(hover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnUpdateProdect.setBackground(slide);
			}
		});
		getContentPane().add(btnUpdateProdect);
                
		btnLogOut = new JButton(" Log Out");
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
                
                // Panels
		
		// Add Panels
		JPanel addPanel = new JPanel();
		//addPanel.setBackground(Color.RED);
		addPanel.setBounds(200, 0, 700, 600);
		contentPane.add(addPanel);
		addPanel.setLayout(null);
		addPanel.setVisible(false);
                	
		// Add Panel Att
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(f);
		lblName.setBounds(153, 84, 85, 20);
		addPanel.add(lblName);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(365, 84, 182, 21);
		addPanel.add(textFieldname);
		textFieldname.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(f);
		lblQuantity.setBounds(153, 134, 128, 20);
                addPanel.add(lblQuantity);
	
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(f);
		lblPrice.setBounds(153, 184, 128, 20);
		addPanel.add(lblPrice);
		
		JLabel lblDepartment = new JLabel("Category");
		lblDepartment.setFont(f);
		lblDepartment.setBounds(153, 234, 85, 20);
		addPanel.add(lblDepartment);
		
                
		textFieldQuantity = new JTextField();
		textFieldQuantity.setColumns(10);
		textFieldQuantity.setBounds(365, 133, 182, 21);
		addPanel.add(textFieldQuantity);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(365, 180, 182, 21);
		addPanel.add(textFieldPrice);
		
		textFieldCategory = new JTextField();
		textFieldCategory.setColumns(10);
		textFieldCategory.setBounds(365, 235, 182, 21);
		addPanel.add(textFieldCategory);
		
                       btnAdd = new JButton(" ADD ");
		btnAdd.setFont(f);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(300, 300, 163, 52);
		addPanel.add(btnAdd);
                
                
                btnAdd.addActionListener((new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Store x  = new Store ();
                    try{
                        if (!textFieldPrice.getText().equals("")&& !textFieldCategory.getText().equals("") && !textFieldQuantity.getText().equals("") && !textFieldname.getText().equals(""))
                        {
                            x.setName(textFieldname.getText());
                            x.SetCategory(textFieldCategory.getText());
                            x.setPrice(Double.parseDouble(textFieldPrice.getText()));
                            x.setQuantity(Integer.parseInt(textFieldQuantity.getText()));
                            if(x.addProduct())
                            {
                          JOptionPane.showMessageDialog(null, "Add Successfully  ", "INFO", JOptionPane.INFORMATION_MESSAGE);

                                resetpanls_Add();
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Product is already added", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Missing Require Field", "Error", JOptionPane.ERROR_MESSAGE);
                            
                        }
                    }
                    catch(NumberFormatException nfe)
                    {
                        JOptionPane.showMessageDialog(null, "Quantity and price must be Numbers", "Numbers", JOptionPane.ERROR_MESSAGE);
                        
                    }
                }
            }));
                
                
                
                ///update 
                JPanel UpdatePanel = new JPanel();
		//addPanel.setBackground(Color.black);
		UpdatePanel.setBounds(200, 0, 700, 600);
		contentPane.add(UpdatePanel);
		UpdatePanel.setLayout(null);
		UpdatePanel.setVisible(false); 
                
                JLabel lblSearch = new JLabel("Search");
                lblSearch.setFont(new Font("Dialog",Font.BOLD,18));
                lblSearch.setBounds(40,20,70,20);
                UpdatePanel.add(lblSearch);
                
         textFieldSearch = new JTextField();
                    textFieldSearch.setBounds(150, 20, 182, 20);
		UpdatePanel.add(textFieldSearch);
		textFieldSearch.setColumns(10);
                
                
		JLabel lblNameUpdate = new JLabel("Name");
		lblNameUpdate.setFont(f);
		lblNameUpdate.setBounds(153, 84, 85, 20);
		UpdatePanel.add(lblNameUpdate);
		
                textFieldnameUpdate = new JTextField();
                textFieldnameUpdate.setEditable(false);
		textFieldnameUpdate.setBounds(365, 84, 182, 21);
		UpdatePanel.add(textFieldnameUpdate);
		textFieldnameUpdate.setColumns(10);
		
		JLabel lblQuantityUpdate = new JLabel("Quantity");
		lblQuantityUpdate.setFont(f);
		lblQuantityUpdate.setBounds(153, 134, 128, 20);
                UpdatePanel.add(lblQuantityUpdate);
	
		JLabel lblPriceUpdate = new JLabel("Price");
		lblPriceUpdate.setFont(f);
		lblPriceUpdate.setBounds(153, 184, 128, 20);
		UpdatePanel.add(lblPriceUpdate);
		
		JLabel lblDepartmentUpdate = new JLabel("Category");
		lblDepartmentUpdate.setFont(f);
		lblDepartmentUpdate.setBounds(153, 234, 85, 20);
		UpdatePanel.add(lblDepartmentUpdate);
		
                
         textFieldQuantityUpdate = new JTextField();
		textFieldQuantityUpdate.setColumns(10);
		textFieldQuantityUpdate.setBounds(365, 133, 182, 21);
		UpdatePanel.add(textFieldQuantityUpdate);
		
         textFieldPriceUpdate = new JTextField();
		textFieldPriceUpdate.setColumns(10);
		textFieldPriceUpdate.setBounds(365, 180, 182, 21);
		UpdatePanel.add(textFieldPriceUpdate);
		
         textFieldCategoryUpdate = new JTextField();
		textFieldCategoryUpdate.setColumns(10);
		textFieldCategoryUpdate.setBounds(365, 235, 182, 21);
		UpdatePanel.add(textFieldCategoryUpdate);
		
        JButton btnUpdate = new JButton(" Update ");
		btnUpdate.setFont(f);
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setBounds(350, 400, 163, 52);
               UpdatePanel.add(btnUpdate);  
                
                JButton btnDelte = new JButton(" Delete ");
		btnDelte.setFont(f);
		btnDelte.setBackground(Color.WHITE);
		btnDelte.setBounds(120, 400, 163, 52);
		UpdatePanel.add(btnDelte); 
                
                 JButton btnsearch = new JButton("Search");
                 btnsearch.setFont(new Font("Dialog", Font.BOLD, 15));
		btnsearch.setBackground(Color.WHITE);
		btnsearch.setBounds(359, 15, 163, 35);
               UpdatePanel.add(btnsearch);
                
              JButton btnDamage = new JButton("Damage Item");
               btnDamage.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDamage.setBackground(Color.WHITE);
		btnDamage.setBounds(150, 300, 163, 52);
               UpdatePanel.add(btnDamage);
                
                btnsearch.addActionListener(((ae)->
                {
                   if (!textFieldSearch.getText().equals(""))
                   {
                     Store x = new Store(); 
                  Product returned = x.searchForProduct(textFieldSearch.getText());
                  if (returned==null)
                  {
               JOptionPane.showMessageDialog(null, "Not Found", "Error", JOptionPane.ERROR_MESSAGE);

                  }
                  else{
                       setPanelData(returned);
                  }
                   }
                   else 
                   {
                    JOptionPane.showMessageDialog(null, "Missing Require Field", "Error", JOptionPane.ERROR_MESSAGE);
                   resetpanls_Update();
                   }
                    
                }));
                
                btnUpdate.addActionListener(((ae)->
                {
                    Store x = new Store();
                    try{
                    if(!textFieldCategoryUpdate.getText().equals("")&& !textFieldPriceUpdate.getText().equals("")&&!textFieldQuantityUpdate.getText().equals("")&&!textFieldnameUpdate.getText().equals(""))
                    {
                            x.setName(textFieldSearch.getText());
                            x.SetCategory(textFieldCategoryUpdate.getText());
                            x.setPrice(Double.parseDouble(textFieldPriceUpdate.getText()));
                            x.setQuantity(Integer.parseInt(textFieldQuantityUpdate.getText()));
                       if(x.updateProduct())
                        {
                             JOptionPane.showMessageDialog(null, "Updated Successfully  ", "INFO", JOptionPane.INFORMATION_MESSAGE);
                             resetpanls_Update();
                        }
                        else
                        {
                            
                        JOptionPane.showMessageDialog(null, "Updated Faild  ", "ERROR", JOptionPane.ERROR_MESSAGE);
                        resetpanls_Update();
                        }
                    }

                    else 
                    {
                     JOptionPane.showMessageDialog(null, "Missing Require Field", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                    }catch(NumberFormatException nfe)
                    {
                        JOptionPane.showMessageDialog(null, "Quantity and price must be Numbers", "Numbers", JOptionPane.ERROR_MESSAGE);
                        
                    }                       
                }));
                btnDelte.addActionListener(((ae)->
                {
                   Store x = new Store();
                   if(x.deleteProduct(textFieldnameUpdate.getText()))
                           {
                          JOptionPane.showMessageDialog(null, "Deleted ", "INFO", JOptionPane.INFORMATION_MESSAGE);
                            resetpanls_Update();
                           }
                   else 
                   {
                    JOptionPane.showMessageDialog(null, "Faild", "ERROR", JOptionPane.ERROR_MESSAGE);

                   }
                    
                }));
                
                 btnDamage.addActionListener(((ae)->
                {
                   Store x = new Store();
                   if(x.deleteProduct(textFieldnameUpdate.getText()))
                           {
                          JOptionPane.showMessageDialog(null, "Damage item,  ", "INFO", JOptionPane.INFORMATION_MESSAGE);
                            resetpanls_Update();
                           }
                   else 
                   {
                    JOptionPane.showMessageDialog(null, "Faild", "ERROR", JOptionPane.ERROR_MESSAGE);

                   }
                    
                }));
                
                
                
                
                // Dispaly Table
		JTable table = new JTable();
		table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Name", "Category", "Quantity", "Price" 
	            }
	        ));
		
			
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		Object rowData[] = new Object[4];  //Number Of Coluoms
		
		JScrollPane displayPanel = new JScrollPane();
		//displayPanel.setBackground(Color.MAGENTA);
		displayPanel.setBounds(200, 0, 700, 600);
		contentPane.add(displayPanel);
		//displayPanel.setLayout(null);
                //displayPanel.setVisible(false);
		displayPanel.setViewportView(table);
		
		
                    
                    
                
                btnMenuProdect.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        UpdatePanel.setVisible(false);
                    addPanel.setVisible(false);
                    displayPanel.setVisible(true);
                    model.setRowCount(0); // علشان ميزودش علي الي مكتوب و يخليه يبدا من الأول
				
				ArrayList<Product> pro = new Store().listAllProduct();
					
				for (int i = 0; i<pro.size(); i++ ) {
					
					rowData[0] = pro.get(i).getName();
					rowData[1] = pro.get(i).GetCategory();
					rowData[2] = pro.get(i).getQuantity();
					rowData[3] = pro.get(i).getPrice();
					
					model.addRow(rowData);
					
                                }	
                    }
                });
                
                //////////////////////////////////////////////////////////
                btnUpdateProdect.addActionListener(new ActionListener() {
                             
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    UpdatePanel.setVisible(true);
                    addPanel.setVisible(false);
                     displayPanel.setVisible(false);
                    }
                } );
                btnAddProdect.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    addPanel.setVisible(true);
                     UpdatePanel.setVisible(false);
                      displayPanel.setVisible(false);
                    }
	///flase for another panals
                } );
                btnLogOut.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new login().setVisible(true);
				setVisible(false);
				
			}
		} );
		
		addPanel.setVisible(true);
		UpdatePanel.setVisible(false);
		displayPanel.setVisible(false);
		
                
        }
     protected void setPanelData(Product returned) {
        textFieldCategoryUpdate.setText("" + returned.GetCategory());
        textFieldPriceUpdate.setText("" + returned.getPrice());
        textFieldnameUpdate.setText("" + returned.getName());
        textFieldQuantityUpdate.setText("" + returned.getQuantity());
      
    }
     protected  void resetpanls_Update()
     {
            textFieldCategoryUpdate.setText("");
        textFieldPriceUpdate.setText("" );
        textFieldnameUpdate.setText("");
        textFieldQuantityUpdate.setText("");
        textFieldSearch.setText("");
     }
       protected  void resetpanls_Add()
     {
            textFieldCategory.setText("");
        textFieldPrice.setText("" );
        textFieldname.setText("");
        textFieldQuantity.setText("");
     }
   
}

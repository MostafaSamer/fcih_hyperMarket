/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import hypermarket.*;
import GUI_implementation.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
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

import GUI_implementation.Offer;

/**
 *
 * @author Muhammad
 */
public class OfferFrame  extends JFrame{
    private  JButton btnSearch;
    private  JTextField textSearch;
    private  JButton btnAdd;
    private  JTextField textnewPrice;
    private  JTextField textoldprice;
    protected JLabel lblOld;
    private JLabel lblNew;
    private  JPanel contentPane;
    private  JButton btnLogOut;
    private  JButton btnMenuProdect;
        private  JButton btnSetofffer;

     String name , category;
                    int quantity;
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			
				OfferFrame frame = new OfferFrame();
				frame.setVisible(true);
			
		}
	});
	}
////////////////////////////////////////////////

    public OfferFrame() throws HeadlessException {
    	
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
                
                btnSetofffer = new JButton("Set Offer");
                btnSetofffer.setFont(f);
                btnSetofffer.setBackground(slide);
                btnSetofffer.setForeground(Color.WHITE);
                btnSetofffer.setBounds(0, 150, SkideButtonWidth, SlideButtonHeight);
                btnSetofffer.setBorder(null);
        		btnSetofffer.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseEntered(MouseEvent e) {
        				btnSetofffer.setBackground(hover);
        			}
        			@Override
        			public void mouseExited(MouseEvent e) {
        				btnSetofffer.setBackground(slide);
        			}
        		});
		getContentPane().add(btnSetofffer);
                
  
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
  
                
                //set offe panel
                JPanel setofferPanel = new JPanel();
		//addPanel.setBackground(Color.RED);
		setofferPanel.setBounds(200, 0, 700, 600);
		contentPane.add(setofferPanel);
		setofferPanel.setLayout(null);
		setofferPanel.setBackground(Color.WHITE);
		setofferPanel.setVisible(true);
                
                btnSearch=new JButton("Search");
                btnSearch.setFont(f);
		btnSearch.setBackground(Color.WHITE);
		btnSearch.setBounds(400, 12, 100, 25);
		setofferPanel.add(btnSearch);
                
                textSearch = new JTextField();
                textSearch.setBounds(170, 12, 182, 21);
                textSearch.setColumns(10);
                setofferPanel.add(textSearch);
                
                
                lblOld=new JLabel("Old Price");
                lblOld.setFont(new Font("Dialog",Font.BOLD,18));
               lblOld.setBounds(150,84,100,21);
               setofferPanel.add(lblOld);
               
               textoldprice = new JTextField();
               	textoldprice.setBounds(300, 84, 182, 21);
		textoldprice.setColumns(10);
                textoldprice.setEditable(false);
                setofferPanel.add(textoldprice);

                    
                lblNew=new JLabel("New Price");
                lblNew.setFont(new Font("Dialog",Font.BOLD,18));
               lblNew.setBounds(150,150,100,21);
               setofferPanel.add(lblNew);
               
               textnewPrice = new JTextField();
               	textnewPrice.setBounds(300, 150, 182, 21);
		textnewPrice.setColumns(10);
                setofferPanel.add(textnewPrice);
           
           btnAdd = new JButton(" ADD ");
		btnAdd.setFont(f);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(300, 230, 100, 30);
		setofferPanel.add(btnAdd);
                
                
                /// menu panel 
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
                displayPanel.setVisible(false);
		displayPanel.setViewportView(table);
		
                
//////////////////////////////////Actions

    btnSearch.addActionListener((new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {   
                if (!textSearch.getText().equals(""))
                {
                    Offer x = new Offer ();                   
                    Product returned = x.searchForProduct(textSearch.getText());
                    if (returned!=null)
                    {
                       textoldprice.setText(""+returned.getPrice());
                       name=returned.getName();
                       category=returned.GetCategory();
                       quantity=returned.getQuantity();
                    }
                    
                    else
                    {
              JOptionPane.showMessageDialog(null, "Not Found", "Error", JOptionPane.ERROR_MESSAGE);
    
                    }
                    
                }
                else 
                {
                  JOptionPane.showMessageDialog(null, "Search Text is Empty", "Error", JOptionPane.ERROR_MESSAGE);
                }
                    
                }   }));   
    
    
    btnAdd.addActionListener((new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Offer x = new Offer();
                    if (!textnewPrice.getText().equals("")&& quantity!=0 && !category.equals("") && !name.equals("") )
                    {
                        x.setName(name);
                        x.setPrice(Double.parseDouble(textnewPrice.getText()));
                        x.setQuantity(quantity);
                        x.SetCategory(category);
                    
                   if ( x.updateProduct())
                   {
                JOptionPane.showMessageDialog(null, "Successfully updated", "INFO", JOptionPane.INFORMATION_MESSAGE); 
                resetpanel();
                   }
                   else 
                   {
              JOptionPane.showMessageDialog(null, "Updated Faild", "Error", JOptionPane.ERROR_MESSAGE);
                   }
                    }
                    else
                    {
                 JOptionPane.showMessageDialog(null, "Missing Require Faild", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                    
                }
                }));
    
    /////////////////////////////
  btnLogOut.addActionListener((new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    setVisible(false);
                    new login().setVisible(true);
                }
  }));
  
  btnSetofffer.addActionListener((new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                
 setofferPanel.setVisible(true);
 displayPanel.setVisible(false);
  
}
  }));
    btnMenuProdect.addActionListener((new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                
 setofferPanel.setVisible(false);
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
  }));
    
    }
    void resetpanel()
    {
        textnewPrice.setText("");
        textSearch.setText("");
        textoldprice.setText("");
   }
}

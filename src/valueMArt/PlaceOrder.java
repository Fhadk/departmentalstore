/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PlaceOrder.java
 *
 * Created on Jan 5, 2012, 7:41:58 PM
 */

package valueMart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
/**
 *
 * @author FhAD khAn
 */
public class PlaceOrder extends javax.swing.JFrame {

    /** Creates new form PlaceOrder */
    public PlaceOrder() {
        initComponents();
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyyy");
        OrderDate.setText(simple.format(cal.getTime()));
                
        
        String url = "jdbc:mysql://localhost:3306/valuemart";
        String user = "root";
        String password = "";
        
        cb_Name.removeAllItems();
        cb_catalogID.removeAllItems();
        try {
            connection = (Connection) DriverManager.getConnection(url, user, password);
            statement = (Statement) connection.createStatement();
            resultset=statement.executeQuery("Select Sname from supplier ");
            
            while (resultset.next()) {
                String sname=resultset.getString(1);
                cb_Name.addItem(sname);
            }
            
         } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        try {
            resultset=statement.executeQuery("SELECT CatalogID,ProductName FROM product");
            while(resultset.next()){
            String catId=resultset.getString(1);
            cb_catalogID.addItem(catId);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
        
        check=true;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PlaceOrder = new javax.swing.JButton();
        ManageOrder = new javax.swing.JLabel();
        ManageOrder1 = new javax.swing.JLabel();
        OrderID = new javax.swing.JTextField();
        ManageOrder2 = new javax.swing.JLabel();
        ManageOrder3 = new javax.swing.JLabel();
        SID = new javax.swing.JTextField();
        ManageOrder4 = new javax.swing.JLabel();
        OrderDate = new javax.swing.JTextField();
        ManageOrder5 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        ManageOrder6 = new javax.swing.JLabel();
        ManageOrder7 = new javax.swing.JLabel();
        PName = new javax.swing.JTextField();
        ManageOrder8 = new javax.swing.JLabel();
        SDate = new javax.swing.JTextField();
        PayAble = new javax.swing.JTextField();
        ManageOrder9 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        ManageOrder10 = new javax.swing.JLabel();
        DevDate = new javax.swing.JTextField();
        ManageOrder11 = new javax.swing.JLabel();
        ManageOrder12 = new javax.swing.JLabel();
        GTotal = new javax.swing.JTextField();
        ManageOrder13 = new javax.swing.JLabel();
        PlaceOrder1 = new javax.swing.JButton();
        cb_Name = new javax.swing.JComboBox();
        cb_catalogID = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Place Order");

        PlaceOrder.setFont(new java.awt.Font("Forte", 1, 12));
        PlaceOrder.setText("Place Order");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });

        ManageOrder.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder.setText("Order Id");

        ManageOrder1.setFont(new java.awt.Font("Forte", 1, 14));
        ManageOrder1.setText("          Place Order");

        OrderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIDActionPerformed(evt);
            }
        });

        ManageOrder2.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder2.setText("Supplier Name");

        ManageOrder3.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder3.setText("Supplier Id");

        SID.setEditable(false);
        SID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDActionPerformed(evt);
            }
        });

        ManageOrder4.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder4.setText("Order Date");

        OrderDate.setEditable(false);
        OrderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderDateActionPerformed(evt);
            }
        });

        ManageOrder5.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder5.setText("Price");

        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        ManageOrder6.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder6.setText("Catalog Id");

        ManageOrder7.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder7.setText("Product Name");

        PName.setEditable(false);
        PName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNameActionPerformed(evt);
            }
        });

        ManageOrder8.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder8.setText("shipping Date");

        SDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDateActionPerformed(evt);
            }
        });

        PayAble.setEditable(false);
        PayAble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayAbleActionPerformed(evt);
            }
        });

        ManageOrder9.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder9.setText("PayAble");

        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });

        ManageOrder10.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder10.setText("Quantity");

        DevDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevDateActionPerformed(evt);
            }
        });

        ManageOrder11.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder11.setText("Delivery Date");

        ManageOrder12.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder12.setText("Grand Total");

        GTotal.setEditable(false);
        GTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GTotalActionPerformed(evt);
            }
        });

        ManageOrder13.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder13.setText("Pkr");

        PlaceOrder1.setFont(new java.awt.Font("Forte", 1, 12));
        PlaceOrder1.setText("Exit");
        PlaceOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrder1ActionPerformed(evt);
            }
        });

        cb_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_NameActionPerformed(evt);
            }
        });

        cb_catalogID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_catalogIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(ManageOrder9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PayAble, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(ManageOrder5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(ManageOrder4)
                                            .addGap(18, 18, 18)
                                            .addComponent(OrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(ManageOrder11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DevDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(ManageOrder)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                            .addComponent(OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(ManageOrder3)
                                            .addGap(18, 18, 18)
                                            .addComponent(SID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(73, Short.MAX_VALUE)
                                .addComponent(ManageOrder12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ManageOrder13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlaceOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(ManageOrder2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ManageOrder7)
                                    .addComponent(ManageOrder6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_catalogID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PName, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ManageOrder8)
                                    .addComponent(ManageOrder10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(ManageOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(PlaceOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManageOrder)
                            .addComponent(OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageOrder2)
                            .addComponent(cb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManageOrder3)
                            .addComponent(ManageOrder6)
                            .addComponent(SID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_catalogID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManageOrder4)
                            .addComponent(ManageOrder7)
                            .addComponent(PName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManageOrder5)
                            .addComponent(ManageOrder8)
                            .addComponent(SDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManageOrder9)
                            .addComponent(ManageOrder10)
                            .addComponent(PayAble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManageOrder11)
                            .addComponent(DevDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlaceOrder)
                            .addComponent(ManageOrder12)
                            .addComponent(GTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageOrder13)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(ManageOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(PlaceOrder1)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        try {
            String oID=OrderID.getText();
            String Sname=cb_Name.getSelectedItem().toString();
            String SupID=SID.getText();
            String CatID=cb_catalogID.getSelectedItem().toString();
            String OrDate=OrderDate.getText();
            String Pname=PName.getText();
            String Prize=Price.getText();
            String Sdate=SDate.getText();
            String Payable=PayAble.getText();
            String Quan=Quantity.getText();
            String Devdate=DevDate.getText();
            
            statement.executeUpdate("INSERT INTO PlaceOrder(OID,SName,SID,CID,OrderDate,ProductName,Price,ShippingDate,PayAble,Quantity,DeliveryDate) VALUES('"+oID+"','"+Sname+"','"+SupID+"','"+CatID+"','"+OrDate+"','"+Pname+"','"+Prize+"','"+Sdate+"','"+Payable+"','"+Quan+"','"+Devdate+"')");
       
           
               PayAble.setText(Integer.toString(Integer.parseInt(Prize) *Integer.parseInt(Quan)));
               GTotal.setText(Integer.toString(Integer.parseInt(Prize) *Integer.parseInt(Quan)));
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        }

}//GEN-LAST:event_PlaceOrderActionPerformed

    private void OrderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIDActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_OrderIDActionPerformed

    private void OrderDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderDateActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void PNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNameActionPerformed

    private void SDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SDateActionPerformed

    private void PayAbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayAbleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PayAbleActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void DevDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DevDateActionPerformed

    private void GTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GTotalActionPerformed

    private void PlaceOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrder1ActionPerformed
        //dspose();
    }//GEN-LAST:event_PlaceOrder1ActionPerformed

private void SIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDActionPerformed
    
}//GEN-LAST:event_SIDActionPerformed

private void cb_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_NameActionPerformed
String name=cb_Name.getSelectedItem().toString();
if(check==true){
        String Id=null;
            try {
                resultset=statement.executeQuery("SELECT SID FROM supplier WHERE SName='" + name + "' ");
                while(resultset.next()){
                     Id=resultset.getString(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
            }

            SID.setText(Id);
    }
}//GEN-LAST:event_cb_NameActionPerformed

private void cb_catalogIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_catalogIDActionPerformed
        String CID=cb_catalogID.getSelectedItem().toString();
        if(check==true){
                String pname=null;
            try {
                resultset=statement.executeQuery("SELECT ProductName FROM product WHERE CatalogID='"+CID+"' ");
                while(resultset.next()){
                    pname=resultset.getString(1);
                }
           } catch (SQLException ex) {
                Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
            PName.setText(pname);
        }
}//GEN-LAST:event_cb_catalogIDActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }
    private Connection connection;
    private Statement statement;
    private ResultSet resultset;
    private ResultSet resultset2;
    private boolean check=false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DevDate;
    private javax.swing.JTextField GTotal;
    private javax.swing.JLabel ManageOrder;
    private javax.swing.JLabel ManageOrder1;
    private javax.swing.JLabel ManageOrder10;
    private javax.swing.JLabel ManageOrder11;
    private javax.swing.JLabel ManageOrder12;
    private javax.swing.JLabel ManageOrder13;
    private javax.swing.JLabel ManageOrder2;
    private javax.swing.JLabel ManageOrder3;
    private javax.swing.JLabel ManageOrder4;
    private javax.swing.JLabel ManageOrder5;
    private javax.swing.JLabel ManageOrder6;
    private javax.swing.JLabel ManageOrder7;
    private javax.swing.JLabel ManageOrder8;
    private javax.swing.JLabel ManageOrder9;
    private javax.swing.JTextField OrderDate;
    private javax.swing.JTextField OrderID;
    private javax.swing.JTextField PName;
    private javax.swing.JTextField PayAble;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JButton PlaceOrder1;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField SDate;
    private javax.swing.JTextField SID;
    private javax.swing.JComboBox cb_Name;
    private javax.swing.JComboBox cb_catalogID;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
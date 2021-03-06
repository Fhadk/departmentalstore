/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateProduct.java
 *
 * Created on Jan 5, 2012, 5:26:55 PM
 */

package valueMart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FhAD khAn
 */
public class UpdateProduct extends javax.swing.JFrame {

    /** Creates new form UpdateProduct */
    public UpdateProduct() {
        String url = "jdbc:mysql://localhost:3306/valuemart";
        String user = "root";
        String password = "";

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();


        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        model=new javax.swing.table.DefaultTableModel(
                    new Object[][]{},new String[]{
                "Product ID","Product Name","Product Brand","Product Size","Manufacture","Var","Descrp"

            }){
                Class [] type=new Class[]{
                    java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class
                };
                boolean[] canEdit =new boolean []{
                    true,true,true,true,true,true,true
                };

                public Class getColmnClass(int columnIndex){
                    return type[columnIndex];

                }
            @Override
                public boolean isCellEditable(int rowindex,int columnIndex){
                    return canEdit[columnIndex];
                }
            };

        initComponents();
        UpdateTable=new JTable(model);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        UpdateTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        UpdateField = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        ManageOrder1 = new javax.swing.JLabel();
        update1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Product");
        setResizable(false);

        UpdateTable.setModel(model);
        jScrollPane2.setViewportView(UpdateTable);
        UpdateTable.getColumnModel().getColumn(0).setResizable(false);
        UpdateTable.getColumnModel().getColumn(2).setResizable(false);

        jLabel1.setFont(new java.awt.Font("Forte", 1, 12));
        jLabel1.setText("Product Id");

        search.setFont(new java.awt.Font("Forte", 1, 12)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        ManageOrder1.setFont(new java.awt.Font("Forte", 1, 14));
        ManageOrder1.setText("       Update Product");

        update1.setFont(new java.awt.Font("Forte", 1, 12)); // NOI18N
        update1.setText("Update ");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(UpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(ManageOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ManageOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(UpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        String PID=model.getValueAt(0,0).toString();
        String PName=model.getValueAt(0,1).toString();
        String PBrnd=model.getValueAt(0,2).toString();
        String PSize=model.getValueAt(0,3).toString();
        String Manf=model.getValueAt(0,4).toString();
        String Var=model.getValueAt(0,5).toString();
        String Descp=model.getValueAt(0,6).toString();
        try{
            statement.executeUpdate("UPDATE product set ProductID ='"+PID+"'  , ProductName ='"+PName+"' , ProductBrand ='"+PBrnd+"' , ProductSize='"+PSize+"' , Manufacture='"+Manf+"' , variety='"+Var+"' , ProductDescription='"+Descp+"' ");
        }catch(Exception e){
            System.out.println(e.getMessage());            
        }        
    }//GEN-LAST:event_update1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
            String Id=UpdateField.getText();
            if(count==0){
                String qry=("Select * FROM product where ProductID='"+Id+"'");
                try {
                    resultset = statement.executeQuery(qry);
                    while(resultset.next()){
                        String CatalogID=resultset.getString(1);
                        String ProductID=resultset.getString(2);
                        String ProductName=resultset.getString(3);
                        String ProductBrand=resultset.getString(4);
                        String ProductSize=resultset.getString(5);
                        String Manufacture=resultset.getString(6);
                        String variety=resultset.getString(7);
                        String ProductDescription=resultset.getString(8);
                        model.addRow(new Object[]{ProductID,ProductName,ProductBrand,ProductSize,Manufacture,variety,ProductDescription});
                        count++;
                    }

                } catch (Exception ex) {
                   ex.getMessage();

                }
            }else if(count!=0){
                int row=model.getRowCount()-1;
                String PID=(model.getValueAt(row,0)).toString();
                if(PID.equals(Id)){
                    JOptionPane.showMessageDialog(this,"Record AllReady printed");
                }else{
                        String qry=("Select * FROM product where ProductID='"+Id+"'");
                    try {
                        resultset = statement.executeQuery(qry);
                        while(resultset.next()){
                            String CatalogID=resultset.getString(1);
                            String ProductID=resultset.getString(2);
                            String ProductName=resultset.getString(3);
                            String ProductBrand=resultset.getString(4);
                            String ProductSize=resultset.getString(5);
                            String Manufacture=resultset.getString(6);
                            String variety=resultset.getString(7);
                            String ProductDescription=resultset.getString(8);
                            model.addRow(new Object[]{ProductID,ProductName,ProductBrand,ProductSize,Manufacture,variety,ProductDescription});
                        }
                    } catch (Exception ex) {
                       ex.getMessage();
                    }
                    
                }
            }
    }//GEN-LAST:event_searchActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProduct().setVisible(true);
            }
        });
    }
    private DefaultTableModel model;
    private Connection connection;
    private Statement statement;
    private ResultSet resultset;
    private static int count=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManageOrder1;
    private javax.swing.JTextField UpdateField;
    private javax.swing.JTable UpdateTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton search;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * searchSale.java
 *
 * Created on Jan 8, 2012, 4:15:56 AM
 */
package valueMArt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fhad khan
 */
public class searchSale extends javax.swing.JFrame {

    /** Creates new form searchSale */
    public searchSale() {
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
                "Invoice ID","Catalog ID","Product Name","Product Size","Net Total","Cash Paid"

            }){
                Class [] type=new Class[]{
                    java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class
                };
                boolean[] canEdit =new boolean []{
                    false,false,false,false,false,false
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
             tb_sale=new JTable(model);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        InvoiceID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_sale = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Sale");
        setResizable(false);

        jLabel9.setFont(new java.awt.Font("Forte", 1, 14)); // NOI18N
        jLabel9.setText("Add Sale");

        jLabel1.setFont(new java.awt.Font("Forte", 1, 12)); // NOI18N
        jLabel1.setText("InVoice ID");

        jButton1.setFont(new java.awt.Font("Forte", 1, 12)); // NOI18N
        jButton1.setText("Look up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tb_sale.setModel(model);
        jScrollPane1.setViewportView(tb_sale);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(245, 245, 245))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(InvoiceID, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(94, 94, 94))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvoiceID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String ID=InvoiceID.getText();
    if(count==0){
        try{
            resultset=statement.executeQuery("Select * from sale where InvoiceId='"+ID+"'");
            while(resultset.next()){
                String id=resultset.getString(1);
                String CID=resultset.getString(2);
                String Pname=resultset.getString(3);
                String Psize=resultset.getString(4);
                String total=resultset.getString(5);
                String cash=resultset.getString(6);
                model.addRow(new Object[]{id,CID,Pname,Psize,total,cash });
                count++;
            }

        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }else if(count!=0){
        int row=model.getRowCount()-1;
        String InvoiceId=(model.getValueAt(row,0)).toString();
        if(InvoiceId.equals(ID)){
            JOptionPane.showMessageDialog(this,"Record AllReady printed");
        }else{
            try{
            resultset=statement.executeQuery("Select * from sale where InvoiceId='"+ID+"'");
            while(resultset.next()){
                String id=resultset.getString(1);
                String CID=resultset.getString(2);
                String Pname=resultset.getString(3);
                String Psize=resultset.getString(4);
                String total=resultset.getString(5);
                String cash=resultset.getString(6);
                model.addRow(new Object[]{id,CID,Pname,Psize,total,cash });
            }

        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        }
    }
}//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(searchSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new searchSale().setVisible(true);
            }
        });
    }
    private DefaultTableModel model;
    private Connection connection;
    private Statement statement;
    private ResultSet resultset;
    private static int count=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InvoiceID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_sale;
    // End of variables declaration//GEN-END:variables
}

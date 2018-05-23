/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * orderStatus.java
 *
 * Created on Jan 5, 2012, 7:58:14 PM
 */

package valueMart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FhAD khAn
 */
public class orderStatus extends javax.swing.JFrame {

    /** Creates new form orderStatus */
    public orderStatus() {
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
                "Order ID","Sup Name","Sup Id","Cat Id","Order Date","Product Name","Price","Sipping Date","PayAble","Quantity","Delivery Date",

            }){
                Class [] type=new Class[]{
                    java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class
                };
                boolean[] canEdit =new boolean []{
                    false,false,false,false,false,false,false,false,false,false,false
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
        tb_order=new JTable(model);
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
        ManageOrder1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_order = new javax.swing.JTable();
        PlaceOrder1 = new javax.swing.JButton();
        fromDate = new javax.swing.JTextField();
        ManageOrder2 = new javax.swing.JLabel();
        endDate = new javax.swing.JTextField();
        ManageOrder3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PlaceOrder.setFont(new java.awt.Font("Forte", 1, 12));
        PlaceOrder.setText("Look Up");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });

        ManageOrder1.setFont(new java.awt.Font("Forte", 1, 14));
        ManageOrder1.setText("          Order Status");

        tb_order.setModel(model);
        jScrollPane1.setViewportView(tb_order);

        PlaceOrder1.setFont(new java.awt.Font("Forte", 1, 12));
        PlaceOrder1.setText("Exit");
        PlaceOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrder1ActionPerformed(evt);
            }
        });

        fromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromDateActionPerformed(evt);
            }
        });

        ManageOrder2.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder2.setText("From Date");

        endDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateActionPerformed(evt);
            }
        });

        ManageOrder3.setFont(new java.awt.Font("Forte", 1, 12));
        ManageOrder3.setText("End Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(PlaceOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(ManageOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ManageOrder2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageOrder3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(PlaceOrder)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ManageOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageOrder2)
                    .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageOrder3)
                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlaceOrder))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PlaceOrder1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
        String frmDate=fromDate.getText();
        String edDate=endDate.getText();
        
        String qry=("Select * FROM PlaceOrder where OrderDate BETWEEN '"+frmDate +"' AND '"+edDate +"'  ");
            try {
                resultset = statement.executeQuery(qry);
                while(resultset.next()){
                    String orderId=resultset.getString(1);
                    String supName=resultset.getString(2);
                    String supId=resultset.getString(3);
                    String catId=resultset.getString(4);
                    String orderDate=resultset.getString(5);
                    String productName=resultset.getString(6);
                    String prize=resultset.getString(7);
                    String shippingDate=resultset.getString(8);
                    String payAble=resultset.getString(9);
                    String quan=resultset.getString(10);
                    String devDate=resultset.getString(11);
                    model.addRow(new Object[]{orderId,supName,supId,catId,orderDate,productName,prize,shippingDate,payAble,quan,devDate});
                }

            } catch (Exception ex) {
               ex.getMessage();

            }
}//GEN-LAST:event_PlaceOrderActionPerformed

    private void PlaceOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrder1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_PlaceOrder1ActionPerformed

private void fromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromDateActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_fromDateActionPerformed

private void endDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_endDateActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderStatus().setVisible(true);
            }
        });
    }
    private DefaultTableModel model;
    private Connection connection;
    private Statement statement;
    private ResultSet resultset;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManageOrder1;
    private javax.swing.JLabel ManageOrder2;
    private javax.swing.JLabel ManageOrder3;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JButton PlaceOrder1;
    private javax.swing.JTextField endDate;
    private javax.swing.JTextField fromDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_order;
    // End of variables declaration//GEN-END:variables

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caffe;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author HP
 */
public class updateOrder extends javax.swing.JFrame {

    /**
     * Creates new form updateOrder
     */
    int kl =0;
    
    public updateOrder() {
        initComponents();
        this.setBounds(495, 270, 990, 540);
        viewc.setSelectedItem("View by current date");
        AutoCompleteDecorator.decorate(pn);
        setPN();
        view.doClick();
    }

    updateOrder(int j) {
        //To change body of generated methods, choose Tools | Templates.
        initComponents();
        kl=j;
        this.setBounds(495, 270, 990, 540);
        viewc.setSelectedItem("View by current date");
        AutoCompleteDecorator.decorate(pn);
        setPN();
        view.doClick();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        date_l = new javax.swing.JLabel();
        pn = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        status_l = new javax.swing.JLabel();
        view = new javax.swing.JButton();
        back = new javax.swing.JButton();
        del = new javax.swing.JButton();
        update = new javax.swing.JButton();
        pn_l = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        id_l = new javax.swing.JLabel();
        datec = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        viewc.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        viewc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "View by customer mobile no.", "View by orderID", "View by current date", "View by date" }));
        viewc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                viewcItemStateChanged(evt);
            }
        });
        getContentPane().add(viewc);
        viewc.setBounds(12, 13, 267, 50);

        table.setFont(new java.awt.Font("Malgun Gothic", 3, 16)); // NOI18N
        table.setForeground(new java.awt.Color(255, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "orderID", "Order_Date", "Mobile No.", "Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(30);
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 140, 970, 276);

        date_l.setFont(new java.awt.Font("Malgun Gothic", 1, 22)); // NOI18N
        date_l.setText("Date");
        getContentPane().add(date_l);
        date_l.setBounds(370, 70, 70, 33);

        pn.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        getContentPane().add(pn);
        pn.setBounds(450, 70, 194, 33);

        status.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Not Paid", "Paid" }));
        getContentPane().add(status);
        status.setBounds(760, 20, 107, 31);

        status_l.setFont(new java.awt.Font("Malgun Gothic", 1, 22)); // NOI18N
        status_l.setText("Status");
        getContentPane().add(status_l);
        status_l.setBounds(680, 20, 113, 28);

        view.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view);
        view.setBounds(850, 80, 110, 40);

        back.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        back.setText("<- Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(60, 440, 130, 40);

        del.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        getContentPane().add(del);
        del.setBounds(830, 440, 110, 40);

        update.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(450, 440, 130, 40);

        pn_l.setFont(new java.awt.Font("Malgun Gothic", 1, 22)); // NOI18N
        pn_l.setText("Phone No.");
        getContentPane().add(pn_l);
        pn_l.setBounds(330, 70, 130, 33);

        id.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        getContentPane().add(id);
        id.setBounds(450, 70, 100, 30);

        id_l.setFont(new java.awt.Font("Malgun Gothic", 1, 22)); // NOI18N
        id_l.setText("OrderID");
        getContentPane().add(id_l);
        id_l.setBounds(330, 70, 130, 33);

        datec.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        getContentPane().add(datec);
        datec.setBounds(450, 70, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewcItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_viewcItemStateChanged
        // TODO add your handling code here:
        String txt = viewc.getSelectedItem().toString();
        if(txt.equals("View by current date"))
        {
            pn_l.setVisible(false);
            pn.setVisible(false);
            id_l.setVisible(false);
            id.setVisible(false);
            date_l.setVisible(true);
            datec.setVisible(true);
            datec.setEnabled(false);
            status_l.setVisible(true);
            status.setVisible(true);
        }
        if(txt.equals("View by customer mobile no."))
        {
            pn_l.setVisible(true);
            pn.setVisible(true);
            id_l.setVisible(false);
            id.setVisible(false);
            date_l.setVisible(false);
            datec.setVisible(false);
            status_l.setVisible(true);
            status.setVisible(true);
        }
        if(txt.equals("View by date"))
        {
            pn_l.setVisible(false);
            pn.setVisible(false);
            id_l.setVisible(false);
            id.setVisible(false);
            date_l.setVisible(true);
            datec.setVisible(true);
            status_l.setVisible(true);
            status.setVisible(true);
            datec.setEnabled(true);
        }
        if(txt.equals("View by orderID"))
        {
            pn_l.setVisible(false);
            pn.setVisible(false);
            id_l.setVisible(true);
            id.setVisible(true);
            date_l.setVisible(false);
            datec.setVisible(false);
            status_l.setVisible(false);
            status.setVisible(false);
        }
    }//GEN-LAST:event_viewcItemStateChanged

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        String query = getQuery();
        Connection con = getConnection();
        if(con!=null)
        {
            try
            {
                Statement s=con.createStatement();
                ResultSet rs=s.executeQuery(query);
                //String ID = id.getText();
                
               // System.out.println(ID +"1"+PN+"2"+s_type);
                mymodel mm = new mymodel(rs);
                table.setModel(mm);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        
            
        }
    }//GEN-LAST:event_viewActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        try
        {
            TableModel model = (TableModel) table.getModel();
            int row = table.getSelectedRow();

            String oid = model.getValueAt(row, 0).toString();
            int resp = JOptionPane.showConfirmDialog(this, "Do you want to DELETE this ORDER","Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(resp == JOptionPane.YES_OPTION)
            {
                deleteOrder(oid);
                view.doClick();
            }
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,"Please select Order details from Table");
        }
    }//GEN-LAST:event_delActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        TableModel model = (TableModel) table.getModel();
         int row = table.getSelectedRow();

         String oid = model.getValueAt(row, 0).toString();
        if(kl==0)
        {
            addOrder ao = new addOrder(oid);
            ao.setVisible(true);
            this.dispose();
        }
        else
        {
            addOrder ao = new addOrder(oid,kl);
            ao.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        if(kl==0)
        {
            orders od = new orders();
            od.setVisible(true);
            this.dispose();
        }
        else
        {
            orders od = new orders(kl);
            od.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(updateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel date_l;
    private com.toedter.calendar.JDateChooser datec;
    private javax.swing.JButton del;
    private javax.swing.JTextField id;
    private javax.swing.JLabel id_l;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> pn;
    private javax.swing.JLabel pn_l;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JLabel status_l;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    private javax.swing.JComboBox<String> viewc;
    // End of variables declaration//GEN-END:variables

    private void setPN() {
         //To change body of generated methods, choose Tools | Templates.
         Connection con = getConnection();
         try
         {
             Statement s=con.createStatement();
             ResultSet rs=s.executeQuery("select phone_no from customers order by phone_no asc");
             pn.addItem("");
             while(rs.next())
                 pn.addItem(rs.getString(1));
             con.close();
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
    }

    private Connection getConnection() {
        //To change body of generated methods, choose Tools | Templates.
        try
         {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
             return con;
         }
         catch(Exception e)
         {
             System.out.println(e);
             Connection con = null;
             return con;
         }
    }

    private String getQuery() {
         //To change body of generated methods, choose Tools | Templates.
         String query = null;
         String tstatus = null;
         String dtstatus = null;
         tstatus = "' order by Order_Date desc";
         dtstatus = "' order by orderID desc";
         if(!status.getSelectedItem().toString().equals("All"))
         {
             tstatus = "' and status = '"+status.getSelectedItem().toString()+"' order by Order_Date desc";
             dtstatus = "' and status = '"+status.getSelectedItem().toString()+"' order by orderID desc";
         }
         
        String txt = viewc.getSelectedItem().toString();
        if(txt.equals("View by customer mobile no."))
            query = "select orderID,Order_Date,customers.name as 'Customer Name',Amount,Status from orders inner join customers on orders.customerID=customers.customerID where customers.phone_no = '"+pn.getSelectedItem().toString()+tstatus;
        if(txt.equals("View by orderID"))
            query = "select orderID,Order_Date,customers.name as 'Customer Name',Amount,Status from orders inner join customers on orders.customerID=customers.customerID where orderID = "+id.getText()+" order by Order_Date desc";;
        if(txt.equals("View by current date"))
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
            Date date1 = new Date();  
            String date2 = sdf.format(date1);
            query = "select orderID,Order_Date,customers.name as 'Customer Name',Amount,Status from orders inner join customers on orders.customerID=customers.customerID where Order_Date = '"+date2+dtstatus;
        }
        if(txt.equals("View by date"))
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");    
            String date2 = sdf.format(datec.getDate());
            query = "select orderID,Order_Date,customers.name as 'Customer Name',Amount,Status from orders inner join customers on orders.customerID=customers.customerID where Order_Date = '"+date2+dtstatus;
        }
        
        return query;
    }

    private void deleteOrder(String oid) {
        //To change body of generated methods, choose Tools | Templates.
        Connection con = getConnection();
         try
         {
             Statement s=con.createStatement();
             s.executeUpdate("delete from ord_pro_qu where orderID = "+oid);
             s.executeUpdate("delete from orders where orderID = "+oid);
             con.close();
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
    }
}
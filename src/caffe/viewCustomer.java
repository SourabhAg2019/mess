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
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author HP
 */


public class viewCustomer extends javax.swing.JFrame {

    /**
     * Creates new form viewCustomer
     */
    int i=21;

    public viewCustomer() {
        initComponents();
        this.setBounds(495, 270, 990, 540);
        AutoCompleteDecorator.decorate(pn);
        //select.setSelectedItem("Select All Staff");
        setPN();
        select.setSelectedItem("Select All Customer");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewAll = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        select = new javax.swing.JComboBox<>();
        viewps = new javax.swing.JComboBox<>();
        pn_l = new javax.swing.JLabel();
        pn = new javax.swing.JComboBox<>();
        ob = new javax.swing.JLabel();
        word = new javax.swing.JComboBox<>();
        ord = new javax.swing.JComboBox<>();
        from = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        to_dc = new com.toedter.calendar.JDateChooser();
        from_dc = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        viewAll.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        viewAll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "total order placed", "total order placed by date" }));
        viewAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                viewAllItemStateChanged(evt);
            }
        });
        getContentPane().add(viewAll);
        viewAll.setBounds(390, 110, 231, 38);

        table.setFont(new java.awt.Font("Malgun Gothic", 3, 16)); // NOI18N
        table.setForeground(new java.awt.Color(255, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        table.setRowHeight(30);
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 970, 240);

        jButton1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(840, 120, 110, 50);

        jButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton2.setText("<- Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 435, 150, 50);

        select.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Particualr Customer", "Select All Customer" }));
        select.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectItemStateChanged(evt);
            }
        });
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        getContentPane().add(select);
        select.setBounds(0, 0, 231, 38);

        viewps.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        viewps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "total order placed", "total order placed by date", "product like most", "product like most by date" }));
        viewps.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                viewpsItemStateChanged(evt);
            }
        });
        getContentPane().add(viewps);
        viewps.setBounds(390, 110, 231, 38);

        pn_l.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        pn_l.setText("Phone No.");
        getContentPane().add(pn_l);
        pn_l.setBounds(280, 0, 110, 30);

        pn.setFont(new java.awt.Font("Malgun Gothic", 0, 15)); // NOI18N
        pn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        pn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pnItemStateChanged(evt);
            }
        });
        getContentPane().add(pn);
        pn.setBounds(390, 0, 160, 30);

        ob.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        ob.setText("Order By");
        getContentPane().add(ob);
        ob.setBounds(710, 10, 90, 27);

        word.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        word.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Order_Date", "Amount" }));
        getContentPane().add(word);
        word.setBounds(810, 10, 130, 35);

        ord.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        ord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "asc", "desc" }));
        getContentPane().add(ord);
        ord.setBounds(870, 60, 64, 35);

        from.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        from.setText("From");
        getContentPane().add(from);
        from.setBounds(220, 60, 70, 30);

        to.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        to.setText("To");
        getContentPane().add(to);
        to.setBounds(460, 60, 70, 30);

        to_dc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(to_dc);
        to_dc.setBounds(490, 60, 160, 30);

        from_dc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(from_dc);
        from_dc.setBounds(280, 60, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pnItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_pnItemStateChanged

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectActionPerformed

    private void selectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectItemStateChanged
        // TODO add your handling code here:
        String s = select.getSelectedItem().toString();
        setFalse();
        if(s.equals("Select All Customer"))
        {
            viewAll.setVisible(true);
            //ord.setVisible(true);
            //ob.setVisible(true);
            //word.setVisible(true);
            viewAll.setSelectedItem("total order placed");
            i=21;
        }
        else
        {
            pn.setVisible(true);
            pn_l.setVisible(true);
            viewps.setVisible(true);
            viewps.setSelectedItem("product like most");
            i=13;
        }
    }//GEN-LAST:event_selectItemStateChanged

    private void viewpsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_viewpsItemStateChanged
        // TODO add your handling code here:
        String s = viewps.getSelectedItem().toString();
        setFalse();
        pn.setVisible(true);
        pn_l.setVisible(true);
        viewps.setVisible(true);
        if(s.equals("total order placed"))
        {
            i=11;
            ord.setVisible(true);
            ob.setVisible(true);
            word.setVisible(true);
        }
        if(s.equals("total order placed by date"))
        {
            i=12;
            ord.setVisible(true);
            ob.setVisible(true);
            word.setVisible(true);
            from.setVisible(true);
            to.setVisible(true);
            from_dc.setVisible(true);
            to_dc.setVisible(true);
        }
        if(s.equals("product like most"))
        {
            i=13;
        }
        if(s.equals("product like most by date"))
        {
            i=14;
            from.setVisible(true);
            to.setVisible(true);
            from_dc.setVisible(true);
            to_dc.setVisible(true);
        }
    }//GEN-LAST:event_viewpsItemStateChanged

    private void viewAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_viewAllItemStateChanged
        // TODO add your handling code here:
        String s = viewAll.getSelectedItem().toString();
        setFalse();
        viewAll.setVisible(true);
        //ord.setVisible(true);
        //ob.setVisible(true);
        //word.setVisible(true);
        if(s.equals("total order placed"))
        {
            i=21;
            //System.out.println(i++);
        }
        else
        {
            i=22;
            //System.out.println(i);
            from.setVisible(true);
            to.setVisible(true);
            from_dc.setVisible(true);
            to_dc.setVisible(true);
        }
    }//GEN-LAST:event_viewAllItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        customers ct = new customers();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String query = setQuery();
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
                //con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(this,"INCORRECT details entered");
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
            java.util.logging.Logger.getLogger(viewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel from;
    private com.toedter.calendar.JDateChooser from_dc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ob;
    private javax.swing.JComboBox<String> ord;
    private javax.swing.JComboBox<String> pn;
    private javax.swing.JLabel pn_l;
    private javax.swing.JComboBox<String> select;
    private javax.swing.JTable table;
    private javax.swing.JLabel to;
    private com.toedter.calendar.JDateChooser to_dc;
    private javax.swing.JComboBox<String> viewAll;
    private javax.swing.JComboBox<String> viewps;
    private javax.swing.JComboBox<String> word;
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

    private void setFalse() {
         //To change body of generated methods, choose Tools | Templates.
         viewAll.setVisible(false);
         viewps.setVisible(false);
         pn.setVisible(false);
         pn_l.setVisible(false);
         ord.setVisible(false);
         ob.setVisible(false);
         word.setVisible(false);
         from.setVisible(false);
         to.setVisible(false);
         from_dc.setVisible(false);
         to_dc.setVisible(false);
         
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

    private String setQuery() {
         //To change body of generated methods, choose Tools | Templates.
         String query = null;
         int j = i/10;
         if(j==2)
         {
             SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
             String fromd = "";
             String tod = "";
             try
            {
                
                fromd = sdf1.format(from_dc.getDate());
                tod = sdf1.format(to_dc.getDate());
                System.out.println(fromd);
                System.out.println(tod);
            }
            catch(Exception e)
            {
                //pn.setSelectedItem("");
                System.out.println(e);
            }
             if(i==21)
                 query = "select customerID , Customer_Name , count(amount) as 'No. of Orders' , sum(amount) as 'Total_Amount' from (select customers.customerID,customers.name as 'Customer_Name' , amount from orders inner join customers on orders.customerID = customers.customerID )ex group by customerID order by Total_Amount desc";
             if(i==22 &&!fromd.equals("") && !tod.equals(""))
                 query = "select customerID , Customer_Name , count(amount) as 'No. of Orders' , sum(amount) as 'Total_Amount' from (select customers.customerID,customers.name as 'Customer_Name' , amount from orders inner join customers on orders.customerID = customers.customerID where Order_date between '"+fromd+"' and '"+tod+"')ex group by customerID order by Total_Amount desc";
         
         }
         if(j==1)
         {
             SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String fromd = "";
            String tod = "";
            try
            {
                pn.getSelectedItem().toString();
            }
            catch(Exception e)
            {
                pn.setSelectedItem("");
                System.out.println(e);
            }
            try
            {
                
                fromd = sdf1.format(from_dc.getDate());
                tod = sdf1.format(to_dc.getDate());
                System.out.println(fromd);
                System.out.println(tod);
            }
            catch(Exception e)
            {
                //pn.setSelectedItem("");
                System.out.println(e);
            }
            if(i==11 &&  !pn.getSelectedItem().equals(""))
                query = "select orderID,staff.name as 'Staff_Name',customers.name as 'Customer_Name',order_date,amount,orders.status from orders inner join staff on orders.staffID = staff.staffID inner join customers on orders.customerID = customers.customerID where orders.customerID = (select customers.customerID from customers where customers.phone_no ='"+pn.getSelectedItem().toString()+"' ) order by "+word.getSelectedItem().toString()+" "+ord.getSelectedItem().toString();
            if(i==12 && !pn.getSelectedItem().equals("")&& !fromd.equals("") && !tod.equals(""))
                query = "select orderID,staff.name as 'Staff_Name',customers.name as 'Customer_Name',order_date,amount,orders.status from orders inner join staff on orders.staffID = staff.staffID inner join customers on orders.customerID = customers.customerID where orders.customerID = (select customers.customerID from customers where customers.phone_no ='"+pn.getSelectedItem().toString()+"' ) and Order_date between '"+fromd+"' and '"+tod+"' order by "+word.getSelectedItem().toString()+" "+ord.getSelectedItem().toString();
            if(i==13 && !pn.getSelectedItem().equals(""))
                query = "select customerID,Customer_Name,Product_Name,sum(quantity) as 'Quantity_Bought' from (select customers.customerID,customers.name as 'Customer_Name',products.name as 'Product_Name',ord_pro_qu.quantity from orders inner join ord_pro_qu on orders.orderID = ord_pro_qu.orderID inner join customers on orders.customerID = customers.customerID inner join products on products.productID=ord_pro_qu.productID where orders.orderID in (select orderID from orders where customerID = (select customers.customerID from customers where customers.phone_no ='"+pn.getSelectedItem().toString()+"') ))ex group by product_name order by quantity_bought desc";
            if(i==14 && !pn.getSelectedItem().equals("")&& !fromd.equals("") && !tod.equals("") )
                query = "select customerID,Customer_Name,Product_Name,sum(quantity) as 'Quantity_Bought' from (select customers.customerID,customers.name as 'Customer_Name',products.name as 'Product_Name',ord_pro_qu.quantity from orders inner join ord_pro_qu on orders.orderID = ord_pro_qu.orderID inner join customers on orders.customerID = customers.customerID inner join products on products.productID=ord_pro_qu.productID where orders.orderID in (select orderID from orders where customerID = (select customers.customerID from customers where customers.phone_no ='"+pn.getSelectedItem().toString()+"') and Order_date between '"+fromd+"' and '"+tod+"' ))ex group by product_name order by quantity_bought desc";
         }
         
         
         
         System.out.println(query);
         return query;
    }
}

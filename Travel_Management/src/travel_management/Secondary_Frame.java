/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_management;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Secondary_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Secondary_Frame
     */
    Trip trip;
    Client client;
    ArrayList<Trip> trips;
    
    display_Trip displaypanel;
    customized cus;
    Edit_trip edit_trip;
    GridBagLayout layout=new GridBagLayout();
    public Secondary_Frame(Trip trip,Client client,ArrayList<Trip> trips,int choice) {
        initComponents();
        call.setLayout(layout);
        this.trip=trip;
        this.trips=trips;
        this.client=client;
        ArrayList<Client> clients=new ArrayList<Client>();
        GridBagConstraints c=new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        if (choice==0) {
             PROFIT p = new PROFIT(0,trip.getProfit());
             call.add(p,c);
             p.setVisible(true);
        }
       else if (choice==1){
            try {
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                Date tripdate=sdf.parse(trip.getDate());
                for(Trip trip1:trips){
                    Date checkdate=sdf.parse(trip1.getDate());
                    if (trip1.getName().equals(trip.getName())&&tripdate.compareTo(checkdate)<0) {
                        cus = new customized(trip1,client,clients, trips,5);
                        call.add(cus,c);
                        cus.setVisible(true);
                    }
                    c.gridy+=10;
                }
            } catch (ParseException ex) {
                Logger.getLogger(Secondary_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (choice==2) {
            edit_trip=new Edit_trip(trip);
            call.add(edit_trip,c);
            edit_trip.setVisible(true);
        }
        else if (choice==3) {
            displaypanel=new display_Trip(trip);
            call.add(displaypanel,c);
            displaypanel.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        call = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout callLayout = new javax.swing.GroupLayout(call);
        call.setLayout(callLayout);
        callLayout.setHorizontalGroup(
            callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 959, Short.MAX_VALUE)
        );
        callLayout.setVerticalGroup(
            callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(call);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Secondary_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Secondary_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Secondary_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Secondary_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Secondary_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane call;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
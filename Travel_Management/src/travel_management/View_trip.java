/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_management;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class View_trip extends javax.swing.JPanel {

    /**
     * Creates new form View_trip
     */
    GridBagLayout layout=new GridBagLayout();
    customized viewtrip;
    ArrayList<Trip>trips;
    ArrayList<Client>clients;
    public View_trip(ArrayList<Trip>trips) {
        initComponents();
        this.trips=trips;
        safaripanel.setLayout(layout);
        adventurepanel.setLayout(layout);
        culturepanel.setLayout(layout);
        religiouspanel.setLayout(layout);
        
        GridBagConstraints c1=new GridBagConstraints();
        c1.gridx=0;
        c1.gridy=0;
        GridBagConstraints c2=new GridBagConstraints();
        c2.gridx=0;
        c2.gridy=0;
        GridBagConstraints c3=new GridBagConstraints();
        c3.gridx=0;
        c3.gridy=0;
        GridBagConstraints c4=new GridBagConstraints();
        c4.gridx=0;
        c4.gridy=0;
        for(Trip trip:trips){
            viewtrip=new customized(trip,clients,1);
            if ("Safari".equals(trip.getCategory())) {
                safaripanel.add(viewtrip,c1);
                c1.gridy+=10;
            }
            else if("Adventure".equals(trip.getCategory())){
                adventurepanel.add(viewtrip,c2);
                c2.gridy+=10;
            }
            else if ("Culture".equals(trip.getCategory())) {
                culturepanel.add(viewtrip,c3);
                c3.gridy+=10;
            }
            else if ("Religious".equals(trip.getCategory())) {
                religiouspanel.add(viewtrip,c4);
                c4.gridy+=10;
            }
           viewtrip.setVisible(true);
        }
    }
        
        public View_trip(ArrayList<Trip> trips,ArrayList<Client>clients,int choice)throws ParseException{
        initComponents();
        this.trips=trips;
        this.clients=clients;
        safaripanel.setLayout(layout);
        adventurepanel.setLayout(layout);
        culturepanel.setLayout(layout);
        religiouspanel.setLayout(layout);
        GridBagConstraints c1=new GridBagConstraints();
        c1.gridx=0;
        c1.gridy=0;
        GridBagConstraints c2=new GridBagConstraints();
        c2.gridx=0;
        c2.gridy=0;
        GridBagConstraints c3=new GridBagConstraints();
        c3.gridx=0;
        c3.gridy=0;
        GridBagConstraints c4=new GridBagConstraints();
        c4.gridx=0;
        c4.gridy=0;
        Client client=new Client();
         SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                 Date currentdate=sdf.parse(sdf.format(new Date()));
         for(Trip trip:trips){
            viewtrip=new customized(trip,client,clients ,trips, choice);
                  Date tripdate=sdf.parse(trip.getDate());
        if (currentdate.compareTo(tripdate)<0||currentdate.compareTo(tripdate)==0) {
            if ("Safari".equals(trip.getCategory())) {
                safaripanel.add(viewtrip,c1);
                c1.gridy+=10;
            }
            else if("Adventure".equals(trip.getCategory())){
                adventurepanel.add(viewtrip,c2);
                c2.gridy+=10;
            }
            else if ("Culture".equals(trip.getCategory())) {
                culturepanel.add(viewtrip,c3);
                c3.gridy+=10;
            }
            else if ("Religious".equals(trip.getCategory())) {
                religiouspanel.add(viewtrip,c4);
                c4.gridy+=10;
            }
           viewtrip.setVisible(true);
        }
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        safaripanel = new javax.swing.JPanel();
        adventurepanel = new javax.swing.JPanel();
        culturepanel = new javax.swing.JPanel();
        religiouspanel = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));
        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(685, 530));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(100, 100));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(961, 607));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(685, 530));
        jTabbedPane1.setName(""); // NOI18N

        safaripanel.setMaximumSize(new java.awt.Dimension(685, 530));

        javax.swing.GroupLayout safaripanelLayout = new javax.swing.GroupLayout(safaripanel);
        safaripanel.setLayout(safaripanelLayout);
        safaripanelLayout.setHorizontalGroup(
            safaripanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 974, Short.MAX_VALUE)
        );
        safaripanelLayout.setVerticalGroup(
            safaripanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Safari", safaripanel);

        adventurepanel.setMaximumSize(new java.awt.Dimension(685, 530));

        javax.swing.GroupLayout adventurepanelLayout = new javax.swing.GroupLayout(adventurepanel);
        adventurepanel.setLayout(adventurepanelLayout);
        adventurepanelLayout.setHorizontalGroup(
            adventurepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 974, Short.MAX_VALUE)
        );
        adventurepanelLayout.setVerticalGroup(
            adventurepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Adventure", adventurepanel);

        culturepanel.setMaximumSize(new java.awt.Dimension(685, 530));

        javax.swing.GroupLayout culturepanelLayout = new javax.swing.GroupLayout(culturepanel);
        culturepanel.setLayout(culturepanelLayout);
        culturepanelLayout.setHorizontalGroup(
            culturepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 974, Short.MAX_VALUE)
        );
        culturepanelLayout.setVerticalGroup(
            culturepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Culture", culturepanel);

        religiouspanel.setMaximumSize(new java.awt.Dimension(685, 530));

        javax.swing.GroupLayout religiouspanelLayout = new javax.swing.GroupLayout(religiouspanel);
        religiouspanel.setLayout(religiouspanelLayout);
        religiouspanelLayout.setHorizontalGroup(
            religiouspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 974, Short.MAX_VALUE)
        );
        religiouspanelLayout.setVerticalGroup(
            religiouspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Religious", religiouspanel);

        jScrollPane1.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adventurepanel;
    private javax.swing.JPanel culturepanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel religiouspanel;
    private javax.swing.JPanel safaripanel;
    // End of variables declaration//GEN-END:variables
}
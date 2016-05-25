package co.id.desktopui;

import co.id.desktopui.master.PatientList;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class Menu extends javax.swing.JFrame {

    public final PatientList patientList = new PatientList();
    
    public Menu() {
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);
        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(jTree1);

        jSplitPane1.setLeftComponent(jScrollPane1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Dashboard", jPanel6);

        jSplitPane1.setRightComponent(jTabbedPane1);

        jPanel5.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        jMenu3.setText("Master");

        jMenuItem1.setText("Patient");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Tahap Pengembangan");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Tahap Pengembangan");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Tahap Pengembangan");
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenu4.setText("Transaksi");

        jMenuItem5.setText("Tahap Pengembangan");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Tahap Pengembangan");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Tahap Pengembangan");
        jMenu4.add(jMenuItem7);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(jMenuItem1.getText().equals("Patient") == true){
            jTabbedPane1.addTab("Menu Patient", patientList);
            jTabbedPane1.setSelectedComponent(patientList);
        }else{
            jTabbedPane1.setSelectedComponent(patientList);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
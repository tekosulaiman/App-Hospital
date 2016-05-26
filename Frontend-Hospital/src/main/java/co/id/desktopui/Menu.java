package co.id.desktopui;

import co.id.desktopui.master.DocterList;
import co.id.desktopui.master.InpatientList;
import co.id.desktopui.master.OfficerList;
import co.id.desktopui.master.PatientList;
import co.id.desktopui.master.PaymentList;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class Menu extends javax.swing.JFrame {

    public final DocterList docterList = new DocterList();
    public final InpatientList inpatientList = new InpatientList();
    public final OfficerList officerList = new OfficerList();
    public final PatientList patientList = new PatientList();
    public final PaymentList paymentList = new PaymentList();
    
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
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);
        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setLayout(new java.awt.BorderLayout());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Menu Hospital");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Master");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Docter");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Inpatient");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Officer");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Patient");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Payment");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
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

        jMenuItem1.setText("Docter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Inpatient");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Officer");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Patient");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Payment");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenu1.add(jMenu3);

        jMenu4.setText("Transaksi");

        jMenuItem6.setText("Tahap Pengembangan");
        jMenu4.add(jMenuItem6);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(jMenuItem1.getText().equals("Docter") == true){
            jTabbedPane1.addTab("Menu Docter", docterList);
            jTabbedPane1.setSelectedComponent(docterList);
        }else{
            jTabbedPane1.setSelectedComponent(docterList);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(jMenuItem2.getText().equals("Inpatient") == true){
            jTabbedPane1.addTab("Menu Inpatient", inpatientList);
            jTabbedPane1.setSelectedComponent(inpatientList);
        }else{
            jTabbedPane1.setSelectedComponent(inpatientList);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(jMenuItem3.getText().equals("Officer") == true){
            jTabbedPane1.addTab("Menu Officer", officerList);
            jTabbedPane1.setSelectedComponent(officerList);
        }else{
            jTabbedPane1.setSelectedComponent(officerList);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(jMenuItem4.getText().equals("Patient") == true){
            jTabbedPane1.addTab("Menu Patient", patientList);
            jTabbedPane1.setSelectedComponent(patientList);
        }else{
            jTabbedPane1.setSelectedComponent(patientList);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if(jMenuItem5.getText().equals("Payment") == true){
            jTabbedPane1.addTab("Menu Payment", paymentList);
            jTabbedPane1.setSelectedComponent(paymentList);
        }else{
            jTabbedPane1.setSelectedComponent(paymentList);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        String nodePath = evt.getPath().toString();
   
        int index = jTabbedPane1.indexOfTab(jTree1.getSelectionPath().getLastPathComponent().toString());
    
        if(index == -1){
            displayProjectDetails(jTree1.getSelectionPath().getLastPathComponent().toString(),nodePath);
        }else{
            jTabbedPane1.setSelectedIndex(index);
        }
    }//GEN-LAST:event_jTree1ValueChanged

    private void displayProjectDetails(String projectName,String nodePath){
        if(nodePath.contains("Menu Hospital")) {
   
            if(nodePath.contains("Master")) { 
                if(projectName.equals("Docter")){
                    jTabbedPane1.addTab("Docter", docterList);
                    jTabbedPane1.setSelectedComponent(docterList);
                }else if(projectName.equals("Inpatient")){
                    jTabbedPane1.addTab("Inpatient", inpatientList);
                    jTabbedPane1.setSelectedComponent(inpatientList);
                }else if(projectName.equals("Officer")){
                    jTabbedPane1.addTab("Officer", officerList);
                    jTabbedPane1.setSelectedComponent(officerList);
                }else if(projectName.equals("Patient")){
                    jTabbedPane1.addTab("Patient", patientList);
                    jTabbedPane1.setSelectedComponent(patientList);
                }else if(projectName.equals("Payment")){
                    jTabbedPane1.addTab("Payment", paymentList);
                    jTabbedPane1.setSelectedComponent(paymentList);
                } 
            }
        }
    }
    
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
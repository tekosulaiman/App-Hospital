package co.id.desktopui.master;

import co.id.model.Officer;
import co.id.service.OfficerService;
import co.id.service.impl.OfficerServiceImpl;
import co.id.tm.OfficerTM;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class OfficerList extends javax.swing.JPanel {

    private Officer officer;
    private List<Officer> officers;
    private OfficerService officerService = new OfficerServiceImpl();
    private OfficerTM officerTM = new OfficerTM();

    private TableRowSorter tableRowSorter = new TableRowSorter<OfficerTM>(officerTM);
    
    public OfficerList() {
        initComponents();
        
        jTable1.setRowSorter(tableRowSorter);
        
        officerTM.setList(officerService.getAllOfficers());
        jTable1.setModel(officerTM);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("ID");
        jPanel6.add(jLabel1);

        jTextField1.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel6.add(jTextField1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_search.gif"))); // NOI18N
        jButton1.setToolTipText("Filter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        jPanel1.add(jPanel6);

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_new.gif"))); // NOI18N
        jButton2.setToolTipText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_edit.gif"))); // NOI18N
        jButton3.setToolTipText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_delete.gif"))); // NOI18N
        jButton4.setToolTipText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_refresh.gif"))); // NOI18N
        jButton5.setToolTipText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_print.gif"))); // NOI18N
        jButton6.setToolTipText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6);

        jPanel1.add(jPanel7);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
        add(jPanel2, java.awt.BorderLayout.LINE_END);
        add(jPanel3, java.awt.BorderLayout.PAGE_END);
        add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    //Filter
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String filter = jTextField1.getText();
       
        if(filter.length() == 0){
            tableRowSorter.setRowFilter(null);
        }else{
            try{
                tableRowSorter.setRowFilter(RowFilter.regexFilter(filter));
            }catch(PatternSyntaxException patternSyntaxException){
                System.out.println(">>>"+patternSyntaxException);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    //Add
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        officer = new Officer();
        System.out.println("ID Officer >>>"+officer.getIdofficer());
        
        int row = jTable1.getSelectedRow();
        
        if(row == -1){
//            PatientForm patientForm = new PatientForm(this);
//            patientForm.setVisible(true);
        }else{
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    //Edit
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int row = jTable1.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null,  "No Record Selected");
            return;
        }else{
//            PatientForm patientForm = new PatientForm(this);
// 
//            patient = patientTM.getList(row);
//            
//            System.out.println("Model >>>"+patient);
//            
//            patientForm.getjTextField3().setEnabled(false);
//            patientForm.getjTextField3().setText(patient.getIdpatient());
//            patientForm.getjTextField1().setText(patient.getNamepatient());
//            patientForm.getjSpinner1().setValue(patient.getAge());
//
//            if(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString().equals("Laki - laki") == true){
//                patientForm.getjRadioButton1().setSelected(true);
//            }else if(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString().equals("Perempuan") == true){
//                patientForm.getjRadioButton2().setSelected(true);
//            }
//            
//            patientForm.getjXDatePicker1().setDate(patient.getBod());
//            patientForm.getjTextField2().setText(patient.getAddres());
//            
//            patientForm.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    //Delete
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int row = jTable1.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null,  "No Record Selected");
            return;
        }else{
            try {
                Officer officer = officerTM.getList(row);
            
                officerService.delete(officer);
                
                //Refresh
                officerTM.refreshAfterDelete(row);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null,  "Data tidak bisa di Delete, karena sudah dipakai di table lain!","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    //Refresh
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        officerTM.setList(officerService.getAllOfficers());
        
        jTable1.clearSelection();
    }//GEN-LAST:event_jButton5ActionPerformed
    //Print
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {    
            JRBeanCollectionDataSource jRBeanCollectionDataSource = new JRBeanCollectionDataSource(officerService.getAllOfficers());
            String source = System.getProperty("user.dir") + "/src/report/PatientReport.jrxml";
            
            JasperReport jasperReport = JasperCompileManager.compileReport(source);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, jRBeanCollectionDataSource);
            JasperViewer.viewReport(jasperPrint, false);

            //JasperExportManager.exportReportToPdfFile(jasperPrint," File.pdf");
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "File Not Found" +ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }

    public List<Officer> getOfficers() {
        return officers;
    }

    public void setOfficers(List<Officer> officers) {
        this.officers = officers;
    }

    public OfficerService getOfficerService() {
        return officerService;
    }

    public void setOfficerService(OfficerService officerService) {
        this.officerService = officerService;
    }

    public OfficerTM getOfficerTM() {
        return officerTM;
    }

    public void setOfficerTM(OfficerTM officerTM) {
        this.officerTM = officerTM;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }
}
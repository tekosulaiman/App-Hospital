package co.id.tm;

import co.id.model.Patient;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class PatientTM extends AbstractTableModel{

    public List<Patient> list = new ArrayList<Patient>();
    
    public Patient getList(int i){
        return list.get(i);
    }
    
    public void refreshAfterSave(Patient p){
        list.add(p);
        fireTableDataChanged();
    }
    
    public void refreshAfterUpdate(int i, Patient p){
        list.set(i, p);
        fireTableDataChanged();
    }
    
    public void refreshAfterDelete(int i){
        list.remove(i);
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getIdpatient();
            case 1 : return list.get(rowIndex).getNamepatient();   
            case 2 : return list.get(rowIndex).getAge();
            case 3 : return list.get(rowIndex).getSex();
            case 4 : return list.get(rowIndex).getBod();   
            case 5 : return list.get(rowIndex).getAddres();  
            
            default:return null;
        }
    }
    
    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0 : return "Patient ID";
            case 1 : return "Name Patient";   
            case 2 : return "Age";
            case 3 : return "Sex";
            case 4 : return "Birth Of Day";   
            case 5 : return "Addres";
                
            default:return null;
        }    
    } 

    public List<Patient> getList() {
        return list;
    }

    public void setList(List<Patient> list) {
        this.list = list;
    }
}
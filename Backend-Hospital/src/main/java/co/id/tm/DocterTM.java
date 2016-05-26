package co.id.tm;

import co.id.model.Doctor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class DocterTM extends AbstractTableModel{

    public List<Doctor> list = new ArrayList<Doctor>();
    
    public Doctor getList(int i){
        return list.get(i);
    }
    
    public void refreshAfterSave(Doctor d){
        list.add(d);
        fireTableDataChanged();
    }
    
    public void refreshAfterUpdate(int i, Doctor d){
        list.set(i, d);
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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getIddocter();
            case 1 : return list.get(rowIndex).getDoctercode();   
            case 2 : return list.get(rowIndex).getDoctername();
            
            default:return null;
        }
    }
    
    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0 : return "Docter ID";
            case 1 : return "Docter Code";   
            case 2 : return "Name Docter";
                
            default:return null;
        }    
    } 

    public List<Doctor> getList() {
        return list;
    }

    public void setList(List<Doctor> list) {
        this.list = list;
    }
}
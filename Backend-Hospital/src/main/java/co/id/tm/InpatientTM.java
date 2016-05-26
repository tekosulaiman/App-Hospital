package co.id.tm;

import co.id.model.Inpatient;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class InpatientTM extends AbstractTableModel{

    public List<Inpatient> list = new ArrayList<Inpatient>();
    
    public Inpatient getList(int i){
        return list.get(i);
    }
    
    public void refreshAfterSave(Inpatient inpatient){
        list.add(inpatient);
        fireTableDataChanged();
    }
    
    public void refreshAfterUpdate(int i, Inpatient inpatient){
        list.set(i, inpatient);
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
            case 0 : return list.get(rowIndex).getIdinpatient();
            case 1 : return list.get(rowIndex).getIdpatient();   
            case 2 : return list.get(rowIndex).getNumberroom();
            
            default:return null;
        }
    }
    
    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0 : return "ID Inpatient";
            case 1 : return "ID Patient";   
            case 2 : return "Number Room";
                
            default:return null;
        }    
    } 

    public List<Inpatient> getList() {
        return list;
    }

    public void setList(List<Inpatient> list) {
        this.list = list;
    }
}
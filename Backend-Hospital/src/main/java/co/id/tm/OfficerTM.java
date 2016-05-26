package co.id.tm;

import co.id.model.Officer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class OfficerTM extends AbstractTableModel{

    public List<Officer> list = new ArrayList<Officer>();
    
    public Officer getList(int i){
        return list.get(i);
    }
    
    public void refreshAfterSave(Officer o){
        list.add(o);
        fireTableDataChanged();
    }
    
    public void refreshAfterUpdate(int i, Officer o){
        list.set(i, o);
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
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getIdofficer();
            case 1 : return list.get(rowIndex).getNameofficer();   
            
            default:return null;
        }
    }
    
    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0 : return "Officer ID";
            case 1 : return "Name Officer";   
                
            default:return null;
        }    
    } 

    public List<Officer> getList() {
        return list;
    }

    public void setList(List<Officer> list) {
        this.list = list;
    }
}
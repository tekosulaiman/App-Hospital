package co.id.tm;

import co.id.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class UserTM extends AbstractTableModel{

    public List<User> list = new ArrayList<User>();
    
    public User getList(int i){
        return list.get(i);
    }
    
    public void refreshAfterSave(User u){
        list.add(u);
        fireTableDataChanged();
    }
    
    public void refreshAfterUpdate(int i, User u){
        list.set(i, u);
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
            case 0 : return list.get(rowIndex).getIduser();
            case 1 : return list.get(rowIndex).getUsername();   
            case 2 : return list.get(rowIndex).getPassword();
            
            default:return null;
        }
    }
    
    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0 : return "User ID";
            case 1 : return "Username";   
            case 2 : return "Password";
                
            default:return null;
        }    
    } 

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }
}
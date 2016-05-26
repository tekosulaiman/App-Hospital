package co.id.tm;

import co.id.model.Payment;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class PaymentTM extends AbstractTableModel{

    public List<Payment> list = new ArrayList<Payment>();
    
    public Payment getList(int i){
        return list.get(i);
    }
    
    public void refreshAfterSave(Payment p){
        list.add(p);
        fireTableDataChanged();
    }
    
    public void refreshAfterUpdate(int i, Payment p){
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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getIdpayment();
            case 1 : return list.get(rowIndex).getPayment();   
            case 2 : return list.get(rowIndex).getDescriptionofpayment();
            
            default:return null;
        }
    }
    
    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0 : return "Payment ID";
            case 1 : return "Name Payment";   
            case 2 : return "Description";
                
            default:return null;
        }    
    } 

    public List<Payment> getList() {
        return list;
    }

    public void setList(List<Payment> list) {
        this.list = list;
    }
}
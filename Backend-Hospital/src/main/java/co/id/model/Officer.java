package co.id.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
@Entity
@Table(name = "officer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Officer.findAll", query = "SELECT o FROM Officer o"),
    @NamedQuery(name = "Officer.findByIdofficer", query = "SELECT o FROM Officer o WHERE o.idofficer = :idofficer"),
    @NamedQuery(name = "Officer.findByNameofficer", query = "SELECT o FROM Officer o WHERE o.nameofficer = :nameofficer")})
public class Officer implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "idofficer")
    private String idofficer;
    
    @Column(name = "nameofficer")
    private String nameofficer;
    
    @OneToMany(mappedBy = "idofficer", fetch = FetchType.LAZY)
    private List<Payment> paymentList;

    public Officer() {
        
    }

    public Officer(String idofficer) {
        this.idofficer = idofficer;
    }

    public String getIdofficer() {
        return idofficer;
    }

    public void setIdofficer(String idofficer) {
        this.idofficer = idofficer;
    }

    public String getNameofficer() {
        return nameofficer;
    }

    public void setNameofficer(String nameofficer) {
        this.nameofficer = nameofficer;
    }

    @XmlTransient
    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idofficer != null ? idofficer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Officer)) {
            return false;
        }
        Officer other = (Officer) object;
        if ((this.idofficer == null && other.idofficer != null) || (this.idofficer != null && !this.idofficer.equals(other.idofficer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.id.model.Officer[ idofficer=" + idofficer + " ]";
    }
}
package co.id.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
@Entity
@Table(name = "inpatient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inpatient.findAll", query = "SELECT i FROM Inpatient i"),
    @NamedQuery(name = "Inpatient.findByIdinpatient", query = "SELECT i FROM Inpatient i WHERE i.idinpatient = :idinpatient"),
    @NamedQuery(name = "Inpatient.findByNumberroom", query = "SELECT i FROM Inpatient i WHERE i.numberroom = :numberroom")})
public class Inpatient implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinpatient")
    private Integer idinpatient;
    
    @Column(name = "numberroom")
    private Integer numberroom;
    
    @JoinColumn(name = "idpatient", referencedColumnName = "idpatient")
    @OneToOne(fetch = FetchType.LAZY)
    private Patient idpatient;

    public Inpatient() {
        
    }

    public Inpatient(Integer idinpatient) {
        this.idinpatient = idinpatient;
    }

    public Integer getIdinpatient() {
        return idinpatient;
    }

    public void setIdinpatient(Integer idinpatient) {
        this.idinpatient = idinpatient;
    }

    public Integer getNumberroom() {
        return numberroom;
    }

    public void setNumberroom(Integer numberroom) {
        this.numberroom = numberroom;
    }

    public Patient getIdpatient() {
        return idpatient;
    }

    public void setIdpatient(Patient idpatient) {
        this.idpatient = idpatient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinpatient != null ? idinpatient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inpatient)) {
            return false;
        }
        Inpatient other = (Inpatient) object;
        if ((this.idinpatient == null && other.idinpatient != null) || (this.idinpatient != null && !this.idinpatient.equals(other.idinpatient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.id.model.Inpatient[ idinpatient=" + idinpatient + " ]";
    } 
}
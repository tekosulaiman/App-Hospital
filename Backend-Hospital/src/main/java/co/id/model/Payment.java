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
import javax.persistence.ManyToOne;
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
@Table(name = "payment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p"),
    @NamedQuery(name = "Payment.findByIdpayment", query = "SELECT p FROM Payment p WHERE p.idpayment = :idpayment"),
    @NamedQuery(name = "Payment.findByPayment", query = "SELECT p FROM Payment p WHERE p.payment = :payment"),
    @NamedQuery(name = "Payment.findByDescriptionofpayment", query = "SELECT p FROM Payment p WHERE p.descriptionofpayment = :descriptionofpayment")})
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpayment")
    private Integer idpayment;
    
    @Column(name = "payment")
    private Integer payment;
    
    @Column(name = "descriptionofpayment")
    private String descriptionofpayment;
    
    @JoinColumn(name = "idofficer", referencedColumnName = "idofficer")
    @ManyToOne(fetch = FetchType.LAZY)
    private Officer idofficer;
    
    @JoinColumn(name = "idpatient", referencedColumnName = "idpatient")
    @OneToOne(fetch = FetchType.LAZY)
    private Patient idpatient;

    public Payment() {
        
    }

    public Payment(Integer idpayment) {
        this.idpayment = idpayment;
    }

    public Integer getIdpayment() {
        return idpayment;
    }

    public void setIdpayment(Integer idpayment) {
        this.idpayment = idpayment;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getDescriptionofpayment() {
        return descriptionofpayment;
    }

    public void setDescriptionofpayment(String descriptionofpayment) {
        this.descriptionofpayment = descriptionofpayment;
    }

    public Officer getIdofficer() {
        return idofficer;
    }

    public void setIdofficer(Officer idofficer) {
        this.idofficer = idofficer;
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
        hash += (idpayment != null ? idpayment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.idpayment == null && other.idpayment != null) || (this.idpayment != null && !this.idpayment.equals(other.idpayment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.id.model.Payment[ idpayment=" + idpayment + " ]";
    } 
}
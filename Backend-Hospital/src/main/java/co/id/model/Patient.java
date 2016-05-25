package co.id.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
@Entity
@Table(name = "patient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p"),
    @NamedQuery(name = "Patient.findByIdpatient", query = "SELECT p FROM Patient p WHERE p.idpatient = :idpatient"),
    @NamedQuery(name = "Patient.findByNamepatient", query = "SELECT p FROM Patient p WHERE p.namepatient = :namepatient"),
    @NamedQuery(name = "Patient.findByAge", query = "SELECT p FROM Patient p WHERE p.age = :age"),
    @NamedQuery(name = "Patient.findBySex", query = "SELECT p FROM Patient p WHERE p.sex = :sex"),
    @NamedQuery(name = "Patient.findByBod", query = "SELECT p FROM Patient p WHERE p.bod = :bod"),
    @NamedQuery(name = "Patient.findByAddres", query = "SELECT p FROM Patient p WHERE p.addres = :addres")})
public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "idpatient")
    private String idpatient;
    
    @Column(name = "namepatient")
    private String namepatient;
    
    @Column(name = "age")
    private Integer age;
    
    @Column(name = "sex")
    private String sex;
    
    @Column(name = "bod")
    @Temporal(TemporalType.DATE)
    private Date bod;
    
    @Column(name = "addres")
    private String addres;
    
    @OneToOne(mappedBy = "idpatient", fetch = FetchType.LAZY)
    private Inpatient inpatient;
    
    @JoinColumn(name = "iddocter", referencedColumnName = "iddocter")
    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor iddocter;
    
    @OneToOne(mappedBy = "idpatient", fetch = FetchType.LAZY)
    private Payment payment;

    public Patient() {
        
    }

    public Patient(String idpatient) {
        this.idpatient = idpatient;
    }

    public String getIdpatient() {
        return idpatient;
    }

    public void setIdpatient(String idpatient) {
        this.idpatient = idpatient;
    }

    public String getNamepatient() {
        return namepatient;
    }

    public void setNamepatient(String namepatient) {
        this.namepatient = namepatient;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBod() {
        return bod;
    }

    public void setBod(Date bod) {
        this.bod = bod;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Inpatient getInpatient() {
        return inpatient;
    }

    public void setInpatient(Inpatient inpatient) {
        this.inpatient = inpatient;
    }

    public Doctor getIddocter() {
        return iddocter;
    }

    public void setIddocter(Doctor iddocter) {
        this.iddocter = iddocter;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpatient != null ? idpatient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.idpatient == null && other.idpatient != null) || (this.idpatient != null && !this.idpatient.equals(other.idpatient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.id.model.Patient[ idpatient=" + idpatient + " ]";
    }
}
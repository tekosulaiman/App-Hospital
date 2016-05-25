package co.id.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "doctor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d"),
    @NamedQuery(name = "Doctor.findByIddocter", query = "SELECT d FROM Doctor d WHERE d.iddocter = :iddocter"),
    @NamedQuery(name = "Doctor.findByDoctercode", query = "SELECT d FROM Doctor d WHERE d.doctercode = :doctercode"),
    @NamedQuery(name = "Doctor.findByDoctername", query = "SELECT d FROM Doctor d WHERE d.doctername = :doctername")})
public class Doctor implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddocter")
    private Integer iddocter;
    
    @Column(name = "doctercode")
    private String doctercode;
    
    @Column(name = "doctername")
    private String doctername;
    
    @OneToMany(mappedBy = "iddocter", fetch = FetchType.LAZY)
    private List<Patient> patientList;

    public Doctor() {
        
    }

    public Doctor(Integer iddocter) {
        this.iddocter = iddocter;
    }

    public Integer getIddocter() {
        return iddocter;
    }

    public void setIddocter(Integer iddocter) {
        this.iddocter = iddocter;
    }

    public String getDoctercode() {
        return doctercode;
    }

    public void setDoctercode(String doctercode) {
        this.doctercode = doctercode;
    }

    public String getDoctername() {
        return doctername;
    }

    public void setDoctername(String doctername) {
        this.doctername = doctername;
    }

    @XmlTransient
    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddocter != null ? iddocter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctor)) {
            return false;
        }
        Doctor other = (Doctor) object;
        if ((this.iddocter == null && other.iddocter != null) || (this.iddocter != null && !this.iddocter.equals(other.iddocter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.id.model.Doctor[ iddocter=" + iddocter + " ]";
    }
}
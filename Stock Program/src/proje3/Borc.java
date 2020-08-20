/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje3;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "BORC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Borc.findAll", query = "SELECT b FROM Borc b")
    , @NamedQuery(name = "Borc.findByAdi", query = "SELECT b FROM Borc b WHERE b.adi = :adi")
    , @NamedQuery(name = "Borc.findByBorcmiktar", query = "SELECT b FROM Borc b WHERE b.borcmiktar = :borcmiktar")
    , @NamedQuery(name = "Borc.findByOdemetarih", query = "SELECT b FROM Borc b WHERE b.odemetarih = :odemetarih")})
public class Borc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ADI")
    private String adi;
    @Id
    @Basic(optional = false)
    @Column(name = "BORCMIKTAR")
    private String borcmiktar;
    @Column(name = "ODEMETARIH")
    private String odemetarih;

    public Borc() {
    }

    public Borc(String borcmiktar) {
        this.borcmiktar = borcmiktar;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getBorcmiktar() {
        return borcmiktar;
    }

    public void setBorcmiktar(String borcmiktar) {
        this.borcmiktar = borcmiktar;
    }

    public String getOdemetarih() {
        return odemetarih;
    }

    public void setOdemetarih(String odemetarih) {
        this.odemetarih = odemetarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (borcmiktar != null ? borcmiktar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Borc)) {
            return false;
        }
        Borc other = (Borc) object;
        if ((this.borcmiktar == null && other.borcmiktar != null) || (this.borcmiktar != null && !this.borcmiktar.equals(other.borcmiktar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proje3.Borc[ borcmiktar=" + borcmiktar + " ]";
    }
    
}

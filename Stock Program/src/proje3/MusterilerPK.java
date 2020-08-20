/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje3;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author DELL
 */
@Embeddable
public class MusterilerPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ADI")
    private String adi;
    @Basic(optional = false)
    @Column(name = "SOYADI")
    private String soyadi;

    public MusterilerPK() {
    }

    public MusterilerPK(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adi != null ? adi.hashCode() : 0);
        hash += (soyadi != null ? soyadi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MusterilerPK)) {
            return false;
        }
        MusterilerPK other = (MusterilerPK) object;
        if ((this.adi == null && other.adi != null) || (this.adi != null && !this.adi.equals(other.adi))) {
            return false;
        }
        if ((this.soyadi == null && other.soyadi != null) || (this.soyadi != null && !this.soyadi.equals(other.soyadi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proje3.MusterilerPK[ adi=" + adi + ", soyadi=" + soyadi + " ]";
    }
    
}

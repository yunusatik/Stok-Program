/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje3;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "MUSTERILER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musteriler.findAll", query = "SELECT m FROM Musteriler m")
    , @NamedQuery(name = "Musteriler.findByAdi", query = "SELECT m FROM Musteriler m WHERE m.musterilerPK.adi = :adi")
    , @NamedQuery(name = "Musteriler.findBySoyadi", query = "SELECT m FROM Musteriler m WHERE m.musterilerPK.soyadi = :soyadi")})
public class Musteriler implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MusterilerPK musterilerPK;

    public Musteriler() {
    }

    public Musteriler(MusterilerPK musterilerPK) {
        this.musterilerPK = musterilerPK;
    }

    public Musteriler(String adi, String soyadi) {
        this.musterilerPK = new MusterilerPK(adi, soyadi);
    }

    public MusterilerPK getMusterilerPK() {
        return musterilerPK;
    }

    public void setMusterilerPK(MusterilerPK musterilerPK) {
        this.musterilerPK = musterilerPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (musterilerPK != null ? musterilerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musteriler)) {
            return false;
        }
        Musteriler other = (Musteriler) object;
        if ((this.musterilerPK == null && other.musterilerPK != null) || (this.musterilerPK != null && !this.musterilerPK.equals(other.musterilerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proje3.Musteriler[ musterilerPK=" + musterilerPK + " ]";
    }
    
}

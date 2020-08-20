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
@Table(name = "URUNLER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Urunler.findAll", query = "SELECT u FROM Urunler u")
    , @NamedQuery(name = "Urunler.findByUrunSeriNo", query = "SELECT u FROM Urunler u WHERE u.urunSeriNo = :urunSeriNo")
    , @NamedQuery(name = "Urunler.findByUrunAdi", query = "SELECT u FROM Urunler u WHERE u.urunAdi = :urunAdi")
    , @NamedQuery(name = "Urunler.findByUrunKategori", query = "SELECT u FROM Urunler u WHERE u.urunKategori = :urunKategori")
    , @NamedQuery(name = "Urunler.findByUrunMarka", query = "SELECT u FROM Urunler u WHERE u.urunMarka = :urunMarka")
    , @NamedQuery(name = "Urunler.findByUrunAdet", query = "SELECT u FROM Urunler u WHERE u.urunAdet = :urunAdet")
    , @NamedQuery(name = "Urunler.findByUrunAlisFiyati", query = "SELECT u FROM Urunler u WHERE u.urunAlisFiyati = :urunAlisFiyati")
    , @NamedQuery(name = "Urunler.findByUrunSatisFiyati", query = "SELECT u FROM Urunler u WHERE u.urunSatisFiyati = :urunSatisFiyati")})
public class Urunler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "URUN_SERI_NO")
    private Integer urunSeriNo;
    @Basic(optional = false)
    @Column(name = "URUN_ADI")
    private String urunAdi;
    @Basic(optional = false)
    @Column(name = "URUN_KATEGORI")
    private String urunKategori;
    @Basic(optional = false)
    @Column(name = "URUN_MARKA")
    private String urunMarka;
    @Basic(optional = false)
    @Column(name = "URUN_ADET")
    private int urunAdet;
    @Basic(optional = false)
    @Column(name = "URUN_ALIS_FIYATI")
    private int urunAlisFiyati;
    @Basic(optional = false)
    @Column(name = "URUN_SATIS_FIYATI")
    private int urunSatisFiyati;
    @Basic(optional = false)
    @Column(name = "URUN_EK_BILGI")
    private String urunEkBilgi;

    public Urunler() {
    }

    public Urunler(Integer urunSeriNo) {
        this.urunSeriNo = urunSeriNo;
    }

    public Urunler(Integer urunSeriNo, String urunAdi, String urunKategori, String urunMarka, int urunAdet, int urunAlisFiyati, int urunSatisFiyati) {
        this.urunSeriNo = urunSeriNo;
        this.urunAdi = urunAdi;
        this.urunKategori = urunKategori;
        this.urunMarka = urunMarka;
        this.urunAdet = urunAdet;
        this.urunAlisFiyati = urunAlisFiyati;
        this.urunSatisFiyati = urunSatisFiyati;
    }

    public Integer getUrunSeriNo() {
        return urunSeriNo;
    }

    public void setUrunSeriNo(Integer urunSeriNo) {
        this.urunSeriNo = urunSeriNo;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunKategori() {
        return urunKategori;
    }

    public void setUrunKategori(String urunKategori) {
        this.urunKategori = urunKategori;
    }

    public String getUrunMarka() {
        return urunMarka;
    }

    public void setUrunMarka(String urunMarka) {
        this.urunMarka = urunMarka;
    }

    public int getUrunAdet() {
        return urunAdet;
    }

    public void setUrunAdet(int urunAdet) {
        this.urunAdet = urunAdet;
    }

    public int getUrunAlisFiyati() {
        return urunAlisFiyati;
    }

    public void setUrunAlisFiyati(int urunAlisFiyati) {
        this.urunAlisFiyati = urunAlisFiyati;
    }

    public int getUrunSatisFiyati() {
        return urunSatisFiyati;
    }

    public void setUrunSatisFiyati(int urunSatisFiyati) {
        this.urunSatisFiyati = urunSatisFiyati;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (urunSeriNo != null ? urunSeriNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Urunler)) {
            return false;
        }
        Urunler other = (Urunler) object;
        if ((this.urunSeriNo == null && other.urunSeriNo != null) || (this.urunSeriNo != null && !this.urunSeriNo.equals(other.urunSeriNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proje3.Urunler[ urunSeriNo=" + urunSeriNo + " ]";
    }

    public String getUrunEkBilgi() {
        return urunEkBilgi;
    }

    public void setUrunEkBilgi(String urunEkBilgi) {
        this.urunEkBilgi = urunEkBilgi;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author a.sleimi
 */
@Entity
@Table(name = "site")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Site.findAll", query = "SELECT s FROM Site s"),
    @NamedQuery(name = "Site.findByIdSite", query = "SELECT s FROM Site s WHERE s.idSite = :idSite"),
    @NamedQuery(name = "Site.findByNomSite", query = "SELECT s FROM Site s WHERE s.nomSite = :nomSite"),
    @NamedQuery(name = "Site.findByPhotoSite", query = "SELECT s FROM Site s WHERE s.photoSite = :photoSite"),
    @NamedQuery(name = "Site.findByLatitudeSite", query = "SELECT s FROM Site s WHERE s.latitudeSite = :latitudeSite"),
    @NamedQuery(name = "Site.findByLongitudeSite", query = "SELECT s FROM Site s WHERE s.longitudeSite = :longitudeSite")})
public class Site implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSite")
    private Integer idSite;
    @Size(max = 30)
    @Column(name = "nomSite")
    private String nomSite;
    @Lob
    @Size(max = 65535)
    @Column(name = "descriptionSite")
    private String descriptionSite;
    @Size(max = 30)
    @Column(name = "photoSite")
    private String photoSite;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitudeSite")
    private Double latitudeSite;
    @Column(name = "longitudeSite")
    private Double longitudeSite;

    public Site() {
    }

    public Site(Integer idSite) {
        this.idSite = idSite;
    }

    public Integer getIdSite() {
        return idSite;
    }

    public void setIdSite(Integer idSite) {
        this.idSite = idSite;
    }

    public String getNomSite() {
        return nomSite;
    }

    public void setNomSite(String nomSite) {
        this.nomSite = nomSite;
    }

    public String getDescriptionSite() {
        return descriptionSite;
    }

    public void setDescriptionSite(String descriptionSite) {
        this.descriptionSite = descriptionSite;
    }

    public String getPhotoSite() {
        return photoSite;
    }

    public void setPhotoSite(String photoSite) {
        this.photoSite = photoSite;
    }

    public Double getLatitudeSite() {
        return latitudeSite;
    }

    public void setLatitudeSite(Double latitudeSite) {
        this.latitudeSite = latitudeSite;
    }

    public Double getLongitudeSite() {
        return longitudeSite;
    }

    public void setLongitudeSite(Double longitudeSite) {
        this.longitudeSite = longitudeSite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSite != null ? idSite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Site)) {
            return false;
        }
        Site other = (Site) object;
        if ((this.idSite == null && other.idSite != null) || (this.idSite != null && !this.idSite.equals(other.idSite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Site[ idSite=" + idSite + " ]";
    }
    
}

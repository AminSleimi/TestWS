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
@Table(name = "plat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plat.findAll", query = "SELECT p FROM Plat p"),
    @NamedQuery(name = "Plat.findByIdPlat", query = "SELECT p FROM Plat p WHERE p.idPlat = :idPlat"),
    @NamedQuery(name = "Plat.findByNomPlat", query = "SELECT p FROM Plat p WHERE p.nomPlat = :nomPlat"),
    @NamedQuery(name = "Plat.findByPhotoPlat", query = "SELECT p FROM Plat p WHERE p.photoPlat = :photoPlat")})
public class Plat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPlat")
    private Integer idPlat;
    @Size(max = 25)
    @Column(name = "nomPlat")
    private String nomPlat;
    @Size(max = 30)
    @Column(name = "photoPlat")
    private String photoPlat;
    @Lob
    @Size(max = 65535)
    @Column(name = "etapePlat")
    private String etapePlat;
    @Lob
    @Size(max = 65535)
    @Column(name = "ingredientPlat")
    private String ingredientPlat;

    public Plat() {
    }

    public Plat(Integer idPlat) {
        this.idPlat = idPlat;
    }

    public Integer getIdPlat() {
        return idPlat;
    }

    public void setIdPlat(Integer idPlat) {
        this.idPlat = idPlat;
    }

    public String getNomPlat() {
        return nomPlat;
    }

    public void setNomPlat(String nomPlat) {
        this.nomPlat = nomPlat;
    }

    public String getPhotoPlat() {
        return photoPlat;
    }

    public void setPhotoPlat(String photoPlat) {
        this.photoPlat = photoPlat;
    }

    public String getEtapePlat() {
        return etapePlat;
    }

    public void setEtapePlat(String etapePlat) {
        this.etapePlat = etapePlat;
    }

    public String getIngredientPlat() {
        return ingredientPlat;
    }

    public void setIngredientPlat(String ingredientPlat) {
        this.ingredientPlat = ingredientPlat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlat != null ? idPlat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plat)) {
            return false;
        }
        Plat other = (Plat) object;
        if ((this.idPlat == null && other.idPlat != null) || (this.idPlat != null && !this.idPlat.equals(other.idPlat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Plat[ idPlat=" + idPlat + " ]";
    }
    
}

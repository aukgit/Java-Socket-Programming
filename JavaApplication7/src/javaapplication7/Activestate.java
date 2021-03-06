/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alim
 */
@MappedSuperclass
@Table(name = "activestate")
@XmlRootElement
public class Activestate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ActiveStateID")
    private Short activeStateID;
    @Basic(optional = false)
    @Column(name = "State")
    private String state;
    @Basic(optional = false)
    @Column(name = "colorRed")
    private short colorRed;
    @Basic(optional = false)
    @Column(name = "colorGreen")
    private short colorGreen;
    @Basic(optional = false)
    @Column(name = "colorBlue")
    private short colorBlue;

    public Activestate() {
    }

    public Activestate(Short activeStateID) {
        this.activeStateID = activeStateID;
    }

    public Activestate(Short activeStateID, String state, short colorRed, short colorGreen, short colorBlue) {
        this.activeStateID = activeStateID;
        this.state = state;
        this.colorRed = colorRed;
        this.colorGreen = colorGreen;
        this.colorBlue = colorBlue;
    }

    public Short getActiveStateID() {
        return activeStateID;
    }

    public void setActiveStateID(Short activeStateID) {
        this.activeStateID = activeStateID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public short getColorRed() {
        return colorRed;
    }

    public void setColorRed(short colorRed) {
        this.colorRed = colorRed;
    }

    public short getColorGreen() {
        return colorGreen;
    }

    public void setColorGreen(short colorGreen) {
        this.colorGreen = colorGreen;
    }

    public short getColorBlue() {
        return colorBlue;
    }

    public void setColorBlue(short colorBlue) {
        this.colorBlue = colorBlue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activeStateID != null ? activeStateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activestate)) {
            return false;
        }
        Activestate other = (Activestate) object;
        if ((this.activeStateID == null && other.activeStateID != null) || (this.activeStateID != null && !this.activeStateID.equals(other.activeStateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.Activestate[ activeStateID=" + activeStateID + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alim
 */
@MappedSuperclass
@Table(name = "userstatus")
@XmlRootElement
public class Userstatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UserStatusID")
    private Integer userStatusID;
    @Basic(optional = false)
    @Column(name = "UserID")
    private int userID;
    @Basic(optional = false)
    @Column(name = "Status")
    private String status;
    @Basic(optional = false)
    @Column(name = "Dated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dated;

    public Userstatus() {
    }

    public Userstatus(Integer userStatusID) {
        this.userStatusID = userStatusID;
    }

    public Userstatus(Integer userStatusID, int userID, String status, Date dated) {
        this.userStatusID = userStatusID;
        this.userID = userID;
        this.status = status;
        this.dated = dated;
    }

    public Integer getUserStatusID() {
        return userStatusID;
    }

    public void setUserStatusID(Integer userStatusID) {
        this.userStatusID = userStatusID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDated() {
        return dated;
    }

    public void setDated(Date dated) {
        this.dated = dated;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userStatusID != null ? userStatusID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userstatus)) {
            return false;
        }
        Userstatus other = (Userstatus) object;
        if ((this.userStatusID == null && other.userStatusID != null) || (this.userStatusID != null && !this.userStatusID.equals(other.userStatusID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.Userstatus[ userStatusID=" + userStatusID + " ]";
    }
    
}

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
@Table(name = "userrecentstatus")
@XmlRootElement
public class Userrecentstatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "UserStatusID")
    private int userStatusID;
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

    public Userrecentstatus() {
    }

    public int getUserStatusID() {
        return userStatusID;
    }

    public void setUserStatusID(int userStatusID) {
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
    
}

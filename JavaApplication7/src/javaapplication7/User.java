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
@Table(name = "user")
@XmlRootElement
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UserID")
    private Integer userID;
    @Basic(optional = false)
    @Column(name = "Username")
    private String username;
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Column(name = "LastLogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    @Basic(optional = false)
    @Column(name = "IsBlocked")
    private boolean isBlocked;
    @Basic(optional = false)
    @Column(name = "IsActive")
    private boolean isActive;
    @Basic(optional = false)
    @Column(name = "IsAdmin")
    private boolean isAdmin;
    @Basic(optional = false)
    @Column(name = "IsOnline")
    private boolean isOnline;
    @Basic(optional = false)
    @Column(name = "CurrentActiveState")
    private short currentActiveState;
    @Basic(optional = false)
    @Column(name = "CurrentStatus")
    private String currentStatus;

    public User() {
    }

    public User(Integer userID) {
        this.userID = userID;
    }

    public User(Integer userID, String username, String email, String password, boolean isBlocked, boolean isActive, boolean isAdmin, boolean isOnline, short currentActiveState, String currentStatus) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.password = password;
        this.isBlocked = isBlocked;
        this.isActive = isActive;
        this.isAdmin = isAdmin;
        this.isOnline = isOnline;
        this.currentActiveState = currentActiveState;
        this.currentStatus = currentStatus;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public short getCurrentActiveState() {
        return currentActiveState;
    }

    public void setCurrentActiveState(short currentActiveState) {
        this.currentActiveState = currentActiveState;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userID != null ? userID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.User[ userID=" + userID + " ]";
    }
    
}

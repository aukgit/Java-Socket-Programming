/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alim
 */
@MappedSuperclass
@Table(name = "towhomaliaswhat")
@XmlRootElement
public class Towhomaliaswhat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "UserID")
    private int userID;
    @Column(name = "ToWhomUserID")
    private Integer toWhomUserID;
    @Basic(optional = false)
    @Column(name = "Username")
    private String username;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Column(name = "AliasAs")
    private String aliasAs;
    @Basic(optional = false)
    @Column(name = "CurrentStatus")
    private String currentStatus;

    public Towhomaliaswhat() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Integer getToWhomUserID() {
        return toWhomUserID;
    }

    public void setToWhomUserID(Integer toWhomUserID) {
        this.toWhomUserID = toWhomUserID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAliasAs() {
        return aliasAs;
    }

    public void setAliasAs(String aliasAs) {
        this.aliasAs = aliasAs;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
    
}

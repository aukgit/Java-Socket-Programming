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
@Table(name = "friendrequestdisplay")
@XmlRootElement
public class Friendrequestdisplay implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "FriendRequestID")
    private long friendRequestID;
    @Basic(optional = false)
    @Column(name = "SenderUserID")
    private int senderUserID;
    @Basic(optional = false)
    @Column(name = "ToWhomUserID")
    private int toWhomUserID;
    @Basic(optional = false)
    @Column(name = "IsAccept")
    private short isAccept;
    @Basic(optional = false)
    @Column(name = "Message")
    private String message;
    @Basic(optional = false)
    @Column(name = "IsSeen")
    private boolean isSeen;
    @Column(name = "SenderName")
    private String senderName;
    @Column(name = "ReceiverName")
    private String receiverName;

    public Friendrequestdisplay() {
    }

    public long getFriendRequestID() {
        return friendRequestID;
    }

    public void setFriendRequestID(long friendRequestID) {
        this.friendRequestID = friendRequestID;
    }

    public int getSenderUserID() {
        return senderUserID;
    }

    public void setSenderUserID(int senderUserID) {
        this.senderUserID = senderUserID;
    }

    public int getToWhomUserID() {
        return toWhomUserID;
    }

    public void setToWhomUserID(int toWhomUserID) {
        this.toWhomUserID = toWhomUserID;
    }

    public short getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(short isAccept) {
        this.isAccept = isAccept;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getIsSeen() {
        return isSeen;
    }

    public void setIsSeen(boolean isSeen) {
        this.isSeen = isSeen;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    
}

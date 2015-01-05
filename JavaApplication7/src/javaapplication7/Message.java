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
@Table(name = "message")
@XmlRootElement
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MessageID")
    private Long messageID;
    @Basic(optional = false)
    @Column(name = "SendFromUserID")
    private int sendFromUserID;
    @Basic(optional = false)
    @Column(name = "ChatSessionID")
    private int chatSessionID;
    @Basic(optional = false)
    @Column(name = "Message1")
    private String message1;
    @Basic(optional = false)
    @Column(name = "Message2")
    private String message2;
    @Basic(optional = false)
    @Column(name = "IsFileExit")
    private boolean isFileExit;

    public Message() {
    }

    public Message(Long messageID) {
        this.messageID = messageID;
    }

    public Message(Long messageID, int sendFromUserID, int chatSessionID, String message1, String message2, boolean isFileExit) {
        this.messageID = messageID;
        this.sendFromUserID = sendFromUserID;
        this.chatSessionID = chatSessionID;
        this.message1 = message1;
        this.message2 = message2;
        this.isFileExit = isFileExit;
    }

    public Long getMessageID() {
        return messageID;
    }

    public void setMessageID(Long messageID) {
        this.messageID = messageID;
    }

    public int getSendFromUserID() {
        return sendFromUserID;
    }

    public void setSendFromUserID(int sendFromUserID) {
        this.sendFromUserID = sendFromUserID;
    }

    public int getChatSessionID() {
        return chatSessionID;
    }

    public void setChatSessionID(int chatSessionID) {
        this.chatSessionID = chatSessionID;
    }

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public boolean getIsFileExit() {
        return isFileExit;
    }

    public void setIsFileExit(boolean isFileExit) {
        this.isFileExit = isFileExit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messageID != null ? messageID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.messageID == null && other.messageID != null) || (this.messageID != null && !this.messageID.equals(other.messageID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication7.Message[ messageID=" + messageID + " ]";
    }
    
}

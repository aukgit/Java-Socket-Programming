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
@Table(name = "messagerecent")
@XmlRootElement
public class Messagerecent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "MessageID")
    private long messageID;
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

    public Messagerecent() {
    }

    public long getMessageID() {
        return messageID;
    }

    public void setMessageID(long messageID) {
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
    
}

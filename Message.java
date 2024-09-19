package com.cjp.olc.common;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author CJP
 * @version 1.0
 * Message消息类，用于定义消息的发送方、接收方、消息内容和时间。
 */
public class Message implements Serializable, MessageState {
    @Serial
    private static final long serialVersionUID = 1L;

    private String MsgSender;
    private String MsgReceiver;
    private String MsgContent;
    private LocalDateTime MsgDate;
    private String MsgState;

    public Message() {
    }

    public Message(String msgSender, String msgReceiver, String msgContent, LocalDateTime msgDate, String msgState) {
        MsgSender = msgSender;
        MsgReceiver = msgReceiver;
        MsgContent = msgContent;
        MsgDate = msgDate;
        MsgState = msgState;
    }

    public String getMsgSender() {
        return MsgSender;
    }

    public void setMsgSender(String msgSender) {
        MsgSender = msgSender;
    }

    public String getMsgReceiver() {
        return MsgReceiver;
    }

    public void setMsgReceiver(String msgReceiver) {
        MsgReceiver = msgReceiver;
    }

    public String getMsgContent() {
        return MsgContent;
    }

    public void setMsgContent(String msgContent) {
        MsgContent = msgContent;
    }

    public LocalDateTime getMsgDate() {
        return MsgDate;
    }

    public void setMsgDate(LocalDateTime msgDate) {
        MsgDate = msgDate;
    }

    public String getMsgState() {
        return MsgState;
    }

    public void setMsgState(String msgState) {
        MsgState = msgState;
    }
}

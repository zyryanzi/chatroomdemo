package com.uray.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: ChatMessage
 * @Author: uray
 * @Date: 2021-04-27 11:23
 **/
@Data
@NoArgsConstructor
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

}

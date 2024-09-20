package com.kun.service;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    private MsgType type;

    private String content;

    private String sender;
}
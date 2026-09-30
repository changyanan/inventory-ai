package com.xuenan.inventoryai.service;

import dev.langchain4j.model.chat.ChatModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AiChatService {
    private final ChatModel chatModel;
    public String chat(String message) {
        return chatModel.chat(message);
    }
}

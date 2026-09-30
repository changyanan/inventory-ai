package com.xuenan.inventoryai.controller;

import com.xuenan.inventoryai.dto.ChatRequest;
import com.xuenan.inventoryai.service.AiChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ai")
@RequiredArgsConstructor
public class AiChatController {
    private final AiChatService aiChatService;
    @PostMapping("chat")
    public String chat(@RequestBody ChatRequest chatRequest) {
        return aiChatService.chat(chatRequest.getMessage());
    }
}

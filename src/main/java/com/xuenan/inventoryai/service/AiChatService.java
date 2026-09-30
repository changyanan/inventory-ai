package com.xuenan.inventoryai.service;

import com.xuenan.inventoryai.ai.assistant.IntentAssistant;
import com.xuenan.inventoryai.dto.InventoryIntent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AiChatService {
    private final IntentAssistant intentAssistant;

    public InventoryIntent chat(String message) {
        return intentAssistant.parse(message);
    }
}

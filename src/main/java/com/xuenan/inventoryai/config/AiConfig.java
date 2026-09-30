package com.xuenan.inventoryai.config;

import com.xuenan.inventoryai.ai.assistant.IntentAssistant;
import com.xuenan.inventoryai.ai.assistant.InventoryAssistant;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {
    @Bean
    ChatModel chatModel(@Value("${ai.api-key}") String apiKey,
                        @Value("${ai.base-url}") String baseUrl,
                        @Value("${ai.model-name}") String modelName) {
        return OpenAiChatModel.builder().apiKey(apiKey).baseUrl(baseUrl).modelName(modelName)
//                .temperature(0.0)
//                .temperature(0.7)
//                .temperature(1.0)
                .build();
    }
    @Bean
    InventoryAssistant inventoryAssistant(ChatModel  chatModel){
        return AiServices.builder(InventoryAssistant.class).chatModel(chatModel).build();
    }
    @Bean
    public IntentAssistant intentAssistant(ChatModel chatModel) {
        return AiServices.builder(IntentAssistant.class)
                .chatModel(chatModel)
                .build();
    }
}

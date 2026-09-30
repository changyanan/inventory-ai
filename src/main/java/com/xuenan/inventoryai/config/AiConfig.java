package com.xuenan.inventoryai.config;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {
    @Bean
    ChatModel chatModel(@Value("${ai.api-key}") String apiKey,
                        @Value("${ai.base-url}") String baseUrl,
                        @Value("${ai.model-name}") String modelName) {
        return OpenAiChatModel.builder().apiKey(apiKey).baseUrl(baseUrl).modelName(modelName).build();
    }
}

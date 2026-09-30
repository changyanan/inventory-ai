package com.xuenan.inventoryai.ai.assistant;

import com.xuenan.inventoryai.dto.InventoryIntent;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface  IntentAssistant {
    @SystemMessage("""
            从用户输入提取库存查询条件。
            用户未提供的字段保持 null，不允许猜测。
            """)
    InventoryIntent parse(@UserMessage String message);
}

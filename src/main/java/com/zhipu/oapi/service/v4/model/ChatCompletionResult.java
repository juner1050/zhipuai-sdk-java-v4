package com.zhipu.oapi.service.v4.model;

import lombok.Data;

import java.util.List;

/**
 * Object containing a response from the chat completions api.
 */
@Data
public class ChatCompletionResult {

    /**
     * Unique id assigned to this chat completion.
     */
    String id;

    /**
     * The type of object returned, should be "chat.completion"
     */
    String object;

    /**
     * The creation time in epoch seconds.
     */
    long created;
    
    /**
     * The GLM model used.
     */
    String model;

    /**
     * A list of all generated completions.
     */
    List<ChatCompletionChoice> choices;

    /**
     * The API usage for this request.
     */
    Usage usage;

    private String task_status;

    /**
     * 用户在客户端请求时提交的任务编号或者平台生成的任务编号
     */
    String request_id;

}

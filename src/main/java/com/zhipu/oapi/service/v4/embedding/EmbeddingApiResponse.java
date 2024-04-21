package com.zhipu.oapi.service.v4.embedding;

import com.zhipu.oapi.service.v4.image.ImageResult;

public class EmbeddingApiResponse {
    private int code;
    private String msg;
    private boolean success;

    private EmbeddingResult data;

    public EmbeddingApiResponse() {
    }

    public EmbeddingApiResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
        if (this.code == 200) {
            setSuccess(true);
        } else {
            setSuccess(false);
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public EmbeddingResult getData() {
        return data;
    }

    public void setData(EmbeddingResult data) {
        this.data = data;
    }
}

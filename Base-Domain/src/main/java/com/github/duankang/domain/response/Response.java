package com.github.duankang.domain.response;

import com.github.duankang.domain.bussiesenum.BussiesEnum;

import java.io.Serializable;

public class Response<T> implements Serializable {
    private BussiesEnum bussiesEnum;
    private T data;

    public BussiesEnum getBussiesEnum() {
        return bussiesEnum;
    }

    public Response(BussiesEnum bussiesEnum, T data) {
        this.bussiesEnum = bussiesEnum;
        this.data = data;
    }

    public void setBussiesEnum(BussiesEnum bussiesEnum) {
        this.bussiesEnum = bussiesEnum;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

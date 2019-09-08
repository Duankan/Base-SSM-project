package com.github.duankang.domain.bussiesenum;

/**
 * @author dunakang
 * @date 2019-09-08
 * @func 业务枚举
 */
public enum BussiesEnum {
    SUCCESS(200, "成功", ""),
    FAIL(-1, "失败", "");
    private Integer code;//状态码
    private String status;//显示的名称
    private String msg;//描述

    private BussiesEnum(Integer code, String status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

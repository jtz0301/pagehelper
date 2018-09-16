package com.jz.util;

import java.io.Serializable;

public class ResultUtil implements Serializable{

   
	private static final long serialVersionUID = 4330647462965001027L;
	/**
     * 返回消息说明
     */
    private String msg;
    /**
     * 需要返回的数据；可以为null
     */
    private Object data;
    /**
     * 响应码
     */
    private Integer status;
    /**
     * 分页
     */
    

    public ResultUtil() {
        initError();
    }

    public ResultUtil initError() {
        return this.init(2, "操作失败", null);
    }

    public ResultUtil initSuccess() {
        return this.initSuccess(null);
    }

    public ResultUtil initSuccess(Object data) {
        return init(1, "操作成功", data);
    }

    public ResultUtil init(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultUtil setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResultUtil setData(Object data) {
        this.data = data;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public ResultUtil setStatus(Integer status) {
        this.status = status;
        return this;
    }


    public ResultUtil set(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
        return this;
    }

	@Override
	public String toString() {
		return "ResultUtil [msg=" + msg + ", data=" + data + ", status=" + status + "]";
	}

	
    
}

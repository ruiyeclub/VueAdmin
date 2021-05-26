package com.markerhub.common.lang;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

	private Integer code;
	private String msg;
	private Object data;

	public static Result success(Object data) {
		return success(ResultCode.SUCCESS.getCode(), "操作成功", data);
	}

	public static Result success(int code, String msg, Object data) {
		Result r = new Result();
		r.setCode(code);
		r.setMsg(msg);
		r.setData(data);
		return r;
	}

	public static Result failed(String msg) {
		return failed(400, msg, null);
	}

	public static Result failed(int code, String msg, Object data) {
		Result r = new Result();
		r.setCode(code);
		r.setMsg(msg);
		r.setData(data);
		return r;
	}

}

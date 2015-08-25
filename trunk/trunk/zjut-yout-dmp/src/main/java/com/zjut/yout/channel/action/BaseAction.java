package com.zjut.yout.channel.action;

import com.opensymphony.xwork.ActionSupport;
import com.zjut.yout.channel.ajax.object.SubmitReturn;

/**
 * @author yout.linl
 * 
 */
public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 6751858887754604218L;

	public static final String JSON_RESULT_INFO = "JsonResultInfo";

	protected String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
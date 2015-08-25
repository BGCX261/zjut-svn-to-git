package com.zjut.yout.channel.ajax.object;

import java.util.Map;

public class SubmitReturn {

	private boolean success;

	@SuppressWarnings("unchecked")
	private Map errorMsg;

	public Map getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(Map errorMsg) {
		this.errorMsg = errorMsg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}

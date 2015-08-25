package com.zjut.yout.channel.exception;

/**
 * @description 各个服务中抛出的异常
 * @author yout.linl
 * @date 2009-2-28
 * @version 1.0
 */
public class ChannelServiceException extends Exception {

	private static final long serialVersionUID = -8445271525886899844L;

	private String errorCode;

	public String getErrorCode() {
		return errorCode;
	}

	public ChannelServiceException(String errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public ChannelServiceException(String errorCode, Throwable cause) {
		super(errorCode, cause);
		this.errorCode = errorCode;
	}

	public ChannelServiceException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public ChannelServiceException(Throwable cause) {
		super(cause);
	}

	public ChannelServiceException(String errorCode) {
		super(errorCode);
		this.errorCode = errorCode;
	}
}

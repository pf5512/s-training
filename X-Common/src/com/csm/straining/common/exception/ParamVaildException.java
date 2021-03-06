package com.csm.straining.common.exception;


/**
 * @author chensongming
 */
public class ParamVaildException extends Exception {

	private static final long serialVersionUID = 5929469788396601593L;
	
	private int code;
	private String msg;

	public ParamVaildException(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMsg() {
		return msg;
	}
	
	@Override
	public String toString() {
		return "[" + msg + "] " + code;
	}

}

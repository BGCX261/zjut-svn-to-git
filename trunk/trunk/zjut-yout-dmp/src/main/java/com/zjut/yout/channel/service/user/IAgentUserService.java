package com.zjut.yout.channel.service.user;

/**
 * @description 前台用户Service接口
 * @author yout.linl
 * @date 2009-1-20
 * @version 1.0
 */
public interface IAgentUserService {

	public static final String ERROR_AGENT_LOGIN = "ERROR_AGENT_LOGIN"; //前台经销商登录错误
	/**
	 * @description 经销商登录检查
	 * @param userName
	 * @param password
	 * @return true:成功 | false:失败
	 */
	public boolean checkAgentLogin(String userName, String password) throws Exception;

}

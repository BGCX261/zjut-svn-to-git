package com.zjut.yout.channel.action.login;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.webwork.ServletActionContext;
import com.zjut.yout.channel.action.BaseAction;
import com.zjut.yout.channel.ajax.object.SubmitReturn;
import com.zjut.yout.channel.exception.ChannelServiceException;
import com.zjut.yout.channel.service.user.IAgentUserService;
import com.zjut.yout.channel.support.MessageSupport;

/**
 * @description 前台客户登录Action
 * @author yout.linl
 * @date 2009-1-20
 * @version 1.0
 */

@SuppressWarnings("serial")
public class AgentLoginAction extends BaseAction {

	private static final Log log = LogFactory.getLog(AgentLoginAction.class);

	private IAgentUserService agentUserService;

	private String userName;

	private String password;

	/**
	 * 经销商登录页面初始化
	 * 
	 * @return
	 */
	public String agentLogin() {
		return SUCCESS;
	}

	/**
	 * 经销商登录验证
	 * 
	 * @return
	 */
	public String checkAgentLogin() {
		String msg = "";
		try {
			if (!agentUserService.checkAgentLogin(userName, password)) {
				msg = "{success:false,msg:\'用户名密码输入错误,请重新输入!\'}";
			} else {
				msg = "{success:true,msg:\'成功!\'}";
				// submitReturn.setSuccess(true);
			}
			HttpServletResponse response = ServletActionContext.getResponse();
			PrintWriter writer = response.getWriter();
			writer.write(msg);
		} catch (ChannelServiceException cse) {
			msg = "{success:false,msg:" + MessageSupport.getValue(cse.getErrorCode()) + "}";
			log.error(msg, cse);
		} catch (Exception e) {
			log.error("AgentLoginAction.checkAgentLogin", e);
			msg = "{success:false,msg:" + MessageSupport.getValue(MessageSupport.MSG_SYSTEM_ERROR) + "}";
		}
		return null;
	}

	public IAgentUserService getAgentUserService() {
		return agentUserService;
	}

	public void setAgentUserService(IAgentUserService agentUserService) {
		this.agentUserService = agentUserService;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

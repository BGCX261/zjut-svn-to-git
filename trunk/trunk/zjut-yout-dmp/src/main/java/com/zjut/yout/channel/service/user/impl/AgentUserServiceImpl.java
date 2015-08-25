package com.zjut.yout.channel.service.user.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.zjut.yout.channel.dao.user.IAgentUserDAO;
import com.zjut.yout.channel.exception.ChannelServiceException;
import com.zjut.yout.channel.model.AgentUser;
import com.zjut.yout.channel.service.user.IAgentUserService;
import com.zjut.yout.channel.support.MessageSupport;

/**
 * @description 前台用户Service实现
 * @author yout.linl
 * @date 2009-1-20
 * @version 1.0
 */
public class AgentUserServiceImpl implements IAgentUserService {

	private IAgentUserDAO agentUserDAO;

	public boolean checkAgentLogin(String userName, String password) throws Exception {
		if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
			throw new ChannelServiceException(MessageSupport.MSG_PARAM_ERROR);
		}

		AgentUser au = new AgentUser();
		au.setUserName(userName);
		au.setPassword(password);
		List<AgentUser> agentUserList = agentUserDAO.getAgentUserByCondition(au);
		if (agentUserList == null || agentUserList.size() <= 0) {
			//throw new ChannelServiceException(ERROR_AGENT_LOGIN);
			return false;
		}
		return true;
	}

	public IAgentUserDAO getAgentUserDAO() {
		return agentUserDAO;
	}

	public void setAgentUserDAO(IAgentUserDAO agentUserDAO) {
		this.agentUserDAO = agentUserDAO;
	}

}

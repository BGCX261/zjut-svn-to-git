package com.zjut.yout.channel.dao.user;

import java.util.List;

import com.zjut.yout.channel.model.AgentUser;

/**
 * @description ǰ̨�û�����DAO�ӿ�
 * @author yout.linl
 * @date 2009-1-20
 * @version 1.0
 */
public interface IAgentUserDAO {
	
	/**
	 * @description ͨ������ȡ�þ������û�
	 * @param condition
	 * @return
	 */
	public List<AgentUser> getAgentUserByCondition(AgentUser condition);
}

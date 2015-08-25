package com.zjut.yout.channel.dao.user;

import java.util.List;

import com.zjut.yout.channel.model.AgentUser;

/**
 * @description 前台用户操作DAO接口
 * @author yout.linl
 * @date 2009-1-20
 * @version 1.0
 */
public interface IAgentUserDAO {
	
	/**
	 * @description 通过条件取得经销商用户
	 * @param condition
	 * @return
	 */
	public List<AgentUser> getAgentUserByCondition(AgentUser condition);
}

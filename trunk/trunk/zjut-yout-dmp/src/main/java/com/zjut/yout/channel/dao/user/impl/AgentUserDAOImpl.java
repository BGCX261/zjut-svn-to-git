package com.zjut.yout.channel.dao.user.impl;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientOperations;

import com.zjut.yout.channel.dao.user.IAgentUserDAO;
import com.zjut.yout.channel.model.AgentUser;

/**
 * @description 前台用户操作DAO实现
 * @author yout.linl
 * @date 2009-1-20
 * @version 1.0
 */
public class AgentUserDAOImpl implements IAgentUserDAO {

	private SqlMapClientOperations ibatisTemplate;

	@SuppressWarnings("unchecked")
	public List<AgentUser> getAgentUserByCondition(AgentUser condition) {
		return ibatisTemplate.queryForList("dmp-agent-user.getAgentUserByCondition", condition);
	}

	public SqlMapClientOperations getIbatisTemplate() {
		return ibatisTemplate;
	}

	public void setIbatisTemplate(SqlMapClientOperations ibatisTemplate) {
		this.ibatisTemplate = ibatisTemplate;
	}
}

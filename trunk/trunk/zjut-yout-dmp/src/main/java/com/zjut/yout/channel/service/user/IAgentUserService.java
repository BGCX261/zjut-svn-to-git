package com.zjut.yout.channel.service.user;

/**
 * @description ǰ̨�û�Service�ӿ�
 * @author yout.linl
 * @date 2009-1-20
 * @version 1.0
 */
public interface IAgentUserService {

	public static final String ERROR_AGENT_LOGIN = "ERROR_AGENT_LOGIN"; //ǰ̨�����̵�¼����
	/**
	 * @description �����̵�¼���
	 * @param userName
	 * @param password
	 * @return true:�ɹ� | false:ʧ��
	 */
	public boolean checkAgentLogin(String userName, String password) throws Exception;

}

package com.zjut.yout.channel.support;

import java.util.HashMap;
import java.util.Map;

import com.zjut.yout.channel.exception.ChannelServiceException;
import com.zjut.yout.channel.service.user.IAgentUserService;

public class MessageSupport {
	public final static String MSG_SUCCESS = "1";// �ɹ�

	public final static String MSG_PARAM_ERROR = "MSG_PARAM_ERROR";// ������Ч

	public final static String MSG_SYSTEM_ERROR = "MSG_SYSTEM_ERROR";// ϵͳ����

	public static Map<String, String> messageMap = null;

	static {
		messageMap = new HashMap<String, String>();
		initMessageMap(messageMap);
	}

	private static void initMessageMap(Map<String, String> messageMap) {

		/** ȫ�� */
		messageMap.put(MSG_SUCCESS, "��ϲ���������ɹ���");
		messageMap.put(MSG_PARAM_ERROR, "�Բ��𣬴��ݵĲ�������򲻺Ϸ���");
		messageMap.put(MSG_SYSTEM_ERROR, "�Բ���ϵͳ��������ϵ����Ա��");
		
		/** ǰ̨�����̲��� */
		messageMap.put(IAgentUserService.ERROR_AGENT_LOGIN, "�Բ����û����������");
	}

	public static String getValue(String key) {
		if (messageMap == null) {
			initMessageMap(messageMap);
		}
		String result = (String) messageMap.get(key);
		if (result == null) {
			result = MSG_SYSTEM_ERROR;
		}
		return result;
	}

	public static String getValue(ChannelServiceException ces) {
		if (messageMap == null) {
			initMessageMap(messageMap);
		}
		if (ces == null) {
			return MSG_SYSTEM_ERROR;
		}
		String result = (String) messageMap.get(ces.getErrorCode());
		if (result == null) {
			result = ces.getMessage();
		}
		if (result == null) {
			result = MSG_SYSTEM_ERROR;
		}
		return result;
	}
}

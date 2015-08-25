package com.zjut.yout.channel.support;

import java.util.HashMap;
import java.util.Map;

import com.zjut.yout.channel.exception.ChannelServiceException;
import com.zjut.yout.channel.service.user.IAgentUserService;

public class MessageSupport {
	public final static String MSG_SUCCESS = "1";// 成功

	public final static String MSG_PARAM_ERROR = "MSG_PARAM_ERROR";// 参数无效

	public final static String MSG_SYSTEM_ERROR = "MSG_SYSTEM_ERROR";// 系统错误

	public static Map<String, String> messageMap = null;

	static {
		messageMap = new HashMap<String, String>();
		initMessageMap(messageMap);
	}

	private static void initMessageMap(Map<String, String> messageMap) {

		/** 全局 */
		messageMap.put(MSG_SUCCESS, "恭喜您，操作成功。");
		messageMap.put(MSG_PARAM_ERROR, "对不起，传递的参数错误或不合法。");
		messageMap.put(MSG_SYSTEM_ERROR, "对不起，系统错误，请联系管理员。");
		
		/** 前台经销商部分 */
		messageMap.put(IAgentUserService.ERROR_AGENT_LOGIN, "对不起，用户名密码错误。");
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

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk"/>
<title>信息提醒</title>
<style type="text/css" media="screen">
	@import url('/static/css/message.css');
	@import url('/static/css/layout.css');
</style>
</head>

<#--成功页面提示信息-->
<body>
<br /><br />
<table border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td id="outmessage_ok" height="60"><p class="boldtext"><#if message?exists>${message}<#else> 恭喜您，操作成功。 </#if></p>
	</td>
  </tr>
</table>
<div id="Content" align="center" style="width:100%"> <a href="#" class="Button02" onClick="window.opener=null;window.close();">关 闭 </a></div>
<br /><br /><br />
</body>
</html>
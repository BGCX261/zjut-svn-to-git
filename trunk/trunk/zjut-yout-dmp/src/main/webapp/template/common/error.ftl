<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>信息提醒</title>
<style type="text/css" media="screen">
	@import url('$env.imgUrl/css/message.css');
	@import url('$env.imgUrl/css/layout.css');
</style>
<script>
 
  function  refresh(backUrl){
    if(backUrl==""){
    	return;
  	}
    try{
    	 parent.opener.location = "${env.channelAppUrl}/"+backUrl;
  	}catch(e){
  	}
  }
</script>
</head>

<body onload="refresh('$!{backUrl}');">
<br /><br />
<table border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td id="outmessage_false"  height="60"><p class="boldtext" ><#if message?exists>${message} <#else> 对不起， 操作失败。 </#if> </p>
	</td>
  </tr>
</table>
<div id="Content" align="center" style="width:100%"> <a href="#" class="Button02" onClick="window.close();">关 闭 </a></div>
<br /><br /><br />
</body>
</html>


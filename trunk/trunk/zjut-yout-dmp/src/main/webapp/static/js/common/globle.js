
var checkIsNull = function (jQueryObject) {
	if (jQueryObject.val() == "") {
		showBox(jQueryObject.attr("showName") + "\u4e0d\u80fd\u4e3a\u7a7a\u3002");
		jQueryObject.focus();
		return false;
	}
	return true;
};


var showBox = function(msg){
		$.blockUI({message:msg,
					css:{
						borderColor:"white",
						fontSize:"100px",
						color:"white",
						backgroundColor:'gray',
						font:'caption',
						'-webkit-border-radius': '10px',
	    				'-moz-border-radius':    '10px',
	    				padding: '15px',
	    				width:'300px',
	    				opacity:'0.8'
						}
					});
		setTimeout($.unblockUI, 1000);
};
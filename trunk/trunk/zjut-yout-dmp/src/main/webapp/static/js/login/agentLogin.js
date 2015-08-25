/**
 * 前台登录页面
 */
Ext.QuickTips.init();
LoginWindow=Ext.extend(Ext.Window,{
        title : '登陆系统经销商自助平台',
        width : 265,
        height : 170,   
        collapsible : true,
        defaults : {
            border : false
        },   
        buttonAlign : 'center',
        createFormPanel :function() {
                return new Ext.form.FormPanel( {
                    bodyStyle : 'padding-top:6px',
                    defaultType : 'textfield',
                    labelAlign : 'right',
                    labelWidth : 55,
                    labelPad : 0,
                    frame : true,
                    defaults : {
                    allowBlank : false,
                    width : 158   
                    },   
                    items : [{   
                            cls : 'user',
                            name : 'userName',   
                            fieldLabel : '帐号',
                            blankText : '帐号不能为空'
                        }, {
                            cls : 'key',
                            name : 'password',   
                            fieldLabel : '密码',   
                            blankText : '密码不能为空',
                            inputType : 'password'
                        }]
                });   
        },   
        ///登录   
        login:function() {   
            this.fp.form.submit({
                waitMsg : '正在登录......',
                url : 'checkAgentLogin.action',
                method : 'POST',     
                success : function(form, action) {
                	//Ext.MessageBox.alert('Success:success方法',action.result.msg);
                    window.location.href = 'agentIndex.action';
                },   
                failure : function(form, action) {
                	Ext.MessageBox.alert('错误', action.result.msg);
                    form.reset();
                }   
            });   
        },   
           
        initComponent : function(){
            this.keys = {
                    key : Ext.EventObject.ENTER,
                    fn : this.login,
                    scope : this
            };
            LoginWindow.superclass.initComponent.call(this);          
            this.fp=this.createFormPanel();
            this.add(this.fp);   
            this.addButton('登陆',this.login,this);   
            this.addButton('重置', function(){this.fp.form.reset();},this);   
        }        
});

Ext.onReady(function(){                 
	var w = new LoginWindow();   
	w.show();   
});


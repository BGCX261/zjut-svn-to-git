/**
 * ǰ̨��¼ҳ��
 */
Ext.QuickTips.init();
LoginWindow=Ext.extend(Ext.Window,{
        title : '��½ϵͳ����������ƽ̨',
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
                            fieldLabel : '�ʺ�',
                            blankText : '�ʺŲ���Ϊ��'
                        }, {
                            cls : 'key',
                            name : 'password',   
                            fieldLabel : '����',   
                            blankText : '���벻��Ϊ��',
                            inputType : 'password'
                        }]
                });   
        },   
        ///��¼   
        login:function() {   
            this.fp.form.submit({
                waitMsg : '���ڵ�¼......',
                url : 'checkAgentLogin.action',
                method : 'POST',     
                success : function(form, action) {
                	//Ext.MessageBox.alert('Success:success����',action.result.msg);
                    window.location.href = 'agentIndex.action';
                },   
                failure : function(form, action) {
                	Ext.MessageBox.alert('����', action.result.msg);
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
            this.addButton('��½',this.login,this);   
            this.addButton('����', function(){this.fp.form.reset();},this);   
        }        
});

Ext.onReady(function(){                 
	var w = new LoginWindow();   
	w.show();   
});


function page_nav(frm,num){
		frm.pageIndex.value = num;
		frm.submit();
}


$(function(){
	$(".tuichu").on("click",function(){
	var boo=window.confirm("你确定要退出吗");
	if (boo) {
		window.location.href="invsys/login.html";
	} else {
        alert("取消退出");
        window.location.reload();
	}
		
		
	});
		
});

//页面加载事件
$(document).ready(function() {
		$("#submit").on("click",function(){//用户名文本框失去焦点
		var userName1=$("#userName").val();
		var password1=$("#password").val();
		if (userName1 =null || userName1=="") {
			alert("用户名不能为空");
		}else if (password1 =null || password1=="") {
			alert("密码不能为空");
		}else if (password1 !=null || userName1 !=null) {
			/*window.location.href="invsys/user.html?userName="+$("#userName").val()+
			"&&password="+$("#password").val();*/
			//异步验证
			$.ajax({
			     url: "invsys/user.json",    //servlet地址
			    type: "get",            //请求发送方式
			    data:"userName="+$("#userName").val()+"&password="+$("#password").val(), //提交给servlet的参数
			    datatype:"json",     //返回的数据格式类型
			   success: function(data) { //成功的方法      
				  // alert($.trim(data.delResult));
			    	if(data.delResult == "true"){
			    		window.location.href="invsys/usermodify.html";
					}else if(data.delResult == "false"){
						alert("登录失败，用户名或密码错误");
						 window.location.reload();
					}else if (data.delResult == "emm") {
						alert("登录失败,该账户以被冻结");
						 window.location.reload();
					}
				},
			    "error":function() {  //失败的方法
			    	alert("程序错误");
				}
				
			});
		}
	
	});
		
		$("#submit1").on("click",function(){//用户名文本框失去焦点
			alert("1");
			var password1=$("#password1").val();
			var password2=$("#password2").val();
			var password3=$("#password3").val();
			if (password1 =null || password1=="") {
				alert("用户名不能为空");
			}else if (password2 =null || password2=="") {
				alert("密码不能为空");
			}else if (password3 !=null || password3 !=null) {
				/*window.location.href="invsys/user.html?userName="+$("#userName").val()+
				"&&password="+$("#password").val();*/
				//异步验证
				$.ajax({
				     url: "invsys/updata.json",    //servlet地址
				    type: "get",            //请求发送方式
				    data:"password="+$("#password3").val(), //提交给servlet的参数
				    datatype:"json",     //返回的数据格式类型
				   success:function(data) { //成功的方法      
					  // alert($.trim(data.delResult));
				    	if(data.delResult == "true"){
				    		alert("修改成功");
				    		window.location.href="invsys/usermodify.html";
						}else if(data.delResult == "false"){
							alert("修改失败");
							 window.location.reload();
						}
					},
				    "error":function() {  //失败的方法
				    	alert("程序错误");
					}
					
				});
			}
		
		});
});


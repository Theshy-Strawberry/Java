<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.min.js"></script>
<script type="text/javascript">

   /*  function btn_click() {
        //创建XMLHttpRequest对象
        var xmlHttp = new XMLHttpRequest();

        //获取值
        var username = document.getElementById("txt_username").value;
        var age = document.getElementById("txt_age").value;

        //配置XMLHttpRequest对象
        xmlHttp.open("get", "Get.aspx?username=" + username
            + "&age=" + age);

        //设置回调函数
        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                document.getElementById("result").innerHTML = xmlHttp.responseText;
            }
        }

        //发送请求
        xmlHttp.send(null);
    } */
    $(function(){
    	$("#hello").click(function(){
    		//load
    		var url=this.href;
    		var args={"time":new Date()};
    		$("#resultHello").load(url);
    		return false;
    	})
    	$("#change").click(function(){
    		//load
    		var url=this.href;
    		var args={"time":new Date()};
    		$("#result").load(url);
    		return false;
    	})
    	$("#akl").click(function(){
    		//load
    		var url="ajaxData/akl.html";
    		var args={"time":new Date()};
    		$("#pageView").load(url,args);
    		return false;
    	})
    	$("#swift").click(function(){
    		//load
    		var url="ajaxData/swift.html"+" p";
    		var args={"time":new Date()};
    		$("#pageView").load(url,args);
    		return false;
    	})
    	$

    })
</script>
</head>

<body>
<form method="post" action="">
 <label for="number">号码:</label>
	<input type="text" id="number" /> <span>s</span><br>
 <label for="txt_username"> 姓名:</label>

	<input type="text" id="txt_username" />
	<br />
	<label for="txt_age"> 年龄:</label>
	<input type="text" id="txt_age" />
	<br />
	<input type="button" value="GET" id="btn" onclick="btn_click();" />
	</form>
	
	--------------------------------------------------<br/>
	<a id="change" href="ajaxData/test.txt">水晶是我女神</a>
	<a id="hello" href="ajaxData/hello.html">pi</a>
	<div id="result"></div>
	<div id="resultHello"></div>
	
	<button id="akl" value="akl">akl</button>
	<button id="swift" value="akl">swift</button>
	<div id="pageView"></div>
	
	
</body>
</html>
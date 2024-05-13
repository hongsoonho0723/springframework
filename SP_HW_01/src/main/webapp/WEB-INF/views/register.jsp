<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>IT's KB - register</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/navbar.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/footer.css">
  <!--  register.html문서에 적용할 CSS -->
  <style type="text/css">
  /*
    #register에 
    1) 상하패딩 20px, 좌우패딩 0 적용
  */
    #register{
      padding: 20px 0;
    }
    
    /*
      #register h1 에
      1)글자 가운데 정렬
      2) 상하좌우 패딩 5px
    */
     #register h1{
      text-align: center;
      padding: 5px;
    }
  
    /*
      #register form 에
      1) 가로길이 100%
      2) 높이길이 300px
      3) 외곽선 1px solid gray
      4) 상하좌우패딩 40px
    */
    #register form{
      width:100%;
      height:300px;
      border: 1px solid gray;
      padding: 40px;
    }
    
    /*
      #register form .form-item 에
      1) margin-bottom을 10px 적용
    */
    #register form .form-item{
       margin-bottom: 10px;
    }
    
    /*
      #register form .form-item 에
      1) display를 inline-block 적용
      2) 가로길이 150px
      3) 글자크기 18px 적용
    */
     #register form .form-item label{
      display: inline-block;
      width: 150px;
      font-size: 18px;
    }
    
     /*
      #register form .form-item input 에
      1) display를 inline-block 적용
      2) 가로길이 250px
      3) 글자크기 18px 적용
    */
    
    #register form .form-item input{
      display: inline-block;
      width: 250px;
      font-size: 18px;
    }
    
    
     /*
       #register button 에
      1) float를 오른쪽 설정
      2) 상하좌우패딩 5px
      3) 가로길이 100px
      4) 글자크기 18px 적용
      5) margin-top을 10px적용
    */
    #register button{
        float: right;
        padding: 5px;
        width: 100px;
        font-size: 18px;
        margin-top: 10px;
     }
  </style>
   <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/common.js"></script>
  <script type="text/javascript">
  
$(document).ready(function(){
	//banner가져오기 
	 //getBanner("${pageContext.request.contextPath}");
	
	
	 $("#btnRegister").on("click", function(){
    	let state=true; 
    	$("input").each(function( index , item){
    		if(state){
    		  if( validateCheck( item ) ){ //유효성체크에서 실패
    			  state=false; 
    		      console.log(1)
    		      return false; //each 빠져나간다.
    		  }
    		}/*else{
    			console.log(2);
    		}*/
    	});//반복문끝
    	
    
    	
   	if(state){ //유효성체크가 완료가 되었다면
   		let email = $("#email");
   	   if(email.val().indexOf("@")==-1){
 	    		alert("이메일형식이 아닙니다.")
 	    		email.val("");
 	    		email.focus();
 	    		return;
   	   }
   	
          
   	   if($("#password").val() != $("#password2").val()){
   		 alert("비밀번호가 일치하지 않습니다.");
   		
   		$("[type='password']").each(function(index,item){
   			  item.value=""; 
   		});
   		
   		$("#password").focus(); 
   		return;
   	  }
   	
   	   //$("#regForm").submit();//전송(form의 action으로 설정한 곳으로 이동)
   	$.ajax({
		url:"${pageContext.request.contextPath}/user?job=register",
		type:"post",
		dataType:"text",
		data :$("#regForm").serialize() , //폼전송
		success: function(result, status){
			console.log(result);
			if(result > 0){
				alert("가입되었습니다.")
    			 location.href="${pageContext.request.contextPath}/index.jsp";
        		
			}else{
    			alert("가입되지않았습니다.");
    			
			}
			
		},
		error : function(jqXHR, textStatus, errorThrown){
			alert("문제 발생 : " + jqXHR.status)
		}
	
		
	});
   	   
   	   
   	}//if문끝
	    	
	
	 });//click end
	 
	//유효성 체크 (input요소를 객체로 전달받아 값 입력 체크 없으면 커서 놓기 )
	function validateCheck(obj){ //obj = item전달
		if(obj.value===""){//obj가 이름, 이메일, 연락, 비번....
			alert("값을 입력해주세요.");
			obj.focus();
			return true;
		}else{
            return false;
		}
	}//유효성체크 끝
	 
});//readyEnd



  </script>
</head>
<body>
<div id="container">
  <!-- navbar -->
   <jsp:include page="navbar.jsp"/>
    
    <div id="banner">지금 당신의 행복! IT's KB Life!</div> 

    
  <div id="register">
	<h1>Register</h1>
	  <form  method="post" id="regForm">
	  <div class="form-item">
	    <label for="name">이름</label>
	    <input type="text" id="name" name="name">
	 </div>
	    
	   <div class="form-item">
	    <label for="email">이메일</label>
	    <input type="email" id="email" name="email">
	  </div>
	  
	   <div class="form-item">
	    <label for="phone">연락처</label>
	    <input type="text" id="phone" name="phone">
	   </div>
	   
	    <div class="form-item">
		    <label for="password">비밀번호</label>
		    <input type="password" id="password" name="password">
	    </div>
	    
	   <div class="form-item">
		    <label for="password2">비밀번호 확인</label>
		    <input type="password" id="password2" name="password2">
	    </div>
	    
	    <hr>
	    <button id="btnRegister" type="button">회원 가입</button>
	  </form>
	  
 </div> 
 
     <footer>
      <ul>
        <li>서울시 선릉역 We-Work</li>
        <li>02-0000-0000</li>
      </ul>
    </footer>
    </div>
 </body>
</html>
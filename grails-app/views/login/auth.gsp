<html>
<head>
	<meta name='layout' content='main'/>
	<title><g:message code="springSecurity.login.title"/></title>
	
	 
	
</head>

<body>

<div class="Overlay"></div>
<div class="LoginBackground"></div>

<div class="Header"> 
	<div class="row">
  		<div class="small-12 columns">
  			<asset:image src="logo.png"/>
  		</div>
	</div>
</div>

<div class="row">
  <div class="large-6 small-centered columns">
  	<div class="LoginBox">
  		<div class="LoginBoxHeader"><g:message code="springSecurity.login.header"/></div>
  
  		<g:if test='${flash.message}'>
			<div class="ErrorBox">${flash.message}</div>
		</g:if>
  
		<form action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off'>
			
			<div class="row">
				<div class="small-12 columns">
			      	<label for='username'><g:message code="springSecurity.login.username.label"/>:</label>
			      	<input type='text' class='text_' name='j_username' id='username'/>
			    </div>			
			</div>
			
			<div class="row">
				<div class="small-12 columns">
			    	<label for='password'><g:message code="springSecurity.login.password.label"/>:</label>
					<input type='password' class='text_' name='j_password' id='password'/>
			    </div>			
			</div>

 			<div class="row">
				<div class="small-12 columns">
			    	<input type='checkbox' class='chk' name='${rememberMeParameter}' id='remember_me' <g:if test='${hasCookie}'>checked='checked'</g:if>/>
					<label for='remember_me'><g:message code="springSecurity.login.remember.me.label"/></label>
			    </div>			
			</div>
 
	 		<div class="row">
			    <div class="small-3 columns">
					<g:submitButton name="create" class="button radius" value="${message(code: "springSecurity.login.button")}" />
				</div>
			</div>
			
		</form>   
  
  	</div>
  </div> 
</div>


<div id='login2'>
	<div class='inner2'>
		
		 


	</div>
</div>
<script type='text/javascript'>
 
	(function() {
		document.forms['loginForm'].elements['j_username'].focus();
	})(); 
</script>
</body>
</html>

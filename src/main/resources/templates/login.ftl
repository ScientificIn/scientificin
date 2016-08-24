	<div>
		<h2>Spring Security for Spring MVC 4 Application Simple Example</h2>
	</div>

	<form action="/login" method="post">

		<div>
			<div>
				<input type="text" name="username"
					placeholder="User Name" />
			</div>
			<div>
				<input type="password" name="password"
					placeholder="Password" />
			</div>
			<div>
				<input type="submit" value="Sign In"/>
			</div>
			
			<#if RequestParameters.error??>
				<div>Invalid username and password.</div>
			</#if>

			<#if RequestParameters.logout??>
				<div>You have been logged out.</div>
			</#if>
		</div>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
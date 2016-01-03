package dykim.example.config;


//@Configuration
public class SecurityConfig //extends WebSecurityConfigurerAdapter
{
	
	// 01. 인메모리 로그인
	/*@Override
	public void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.inMemoryAuthentication().withUser("admin").password("1234").roles("ADMIN");
	}*/
	
	/*@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		//일단 허용
		httpSecurity.authorizeRequests().antMatchers("/").permitAll();
		// static resources
		//httpSecurity.authorizeRequests()
		//.antMatchers("/css*//**", "/js*//**", "/images*//**", "/resources*//**", "/webjars*//**").permitAll();
		
		*//*httpSecurity.authorizeRequests()
						.antMatchers("/signin").anonymous()
						.anyRequest().authenticated()
						.and()
					.formLogin()
						.loginPage("/signin")
						.loginProcessingUrl("/sign-in-process.html")
						.failureUrl("/signin?error")
						.usernameParameter("username")
						.passwordParameter("password")
						.defaultSuccessUrl("/admin/dashboard.html", true)
						.and()
					.logout()
						.logoutSuccessUrl("/signin?logout");
		
		httpSecurity.exceptionHandling().accessDeniedPage("/admin/dashboard.html");
		httpSecurity.sessionManagement().invalidSessionUrl("/signin");*//*
		
	}*/
	
}

//package security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//@Configuration
//public class UserDetails {
//	@Bean 
//	public UserDetailsService userDetailsSerive (PasswordEncoder passwordEncoder) {
//		System.out.println(passwordEncoder.getClass());
//		
//		org.springframework.security.core.userdetails.UserDetails user = User.withUsername("user")
//				.password(passwordEncoder.encode("user"))
//				.roles("USER")
//				.build();
//		
//		org.springframework.security.core.userdetails.UserDetails admin = User.withUsername("admin")
//				.password(passwordEncoder.encode("admin"))
//				.roles("USER", "ADMIN")
//				.build();
//		
//		return new InMemoryUserDetailsManager(user, admin);
//	}
//	@Bean 
//	public PasswordEncoder passwordEncoder() {
//		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//		return encoder;
//	}
//}
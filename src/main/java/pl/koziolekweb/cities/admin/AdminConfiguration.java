package pl.koziolekweb.cities.admin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AdminConfiguration {

	@Bean
	AdminQuery adminQuery(AdminState adminState) {
		return new AdminQuery(adminState);
	}

	@Bean
	AdminMutation adminMutation(AdminState adminState) {
		return new AdminMutation(adminState);
	}

}

package metodosprodutores.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import notificador.Email;
import notificador.Notificador;

@Configuration
public class Configuracao {
	
	@Bean
	public Notificador email() {
		return new Email();
	}
}

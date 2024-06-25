package dio.iniciando;

import dio.iniciando.app.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IniciandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IniciandoApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
	}

}

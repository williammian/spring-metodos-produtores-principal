package metodosprodutores;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metodosprodutores.model.Usuario;
import metodosprodutores.servico.UsuarioServico;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Main.class.getPackage().getName());
		
		Usuario usuario = new Usuario("Alexandre");	
		
		UsuarioServico usuarioServico = applicationContext.getBean(UsuarioServico.class);		
		usuarioServico.cadastrar(usuario);		
		
		applicationContext.close();
		
		System.out.println("Fim!");
	}
	
}

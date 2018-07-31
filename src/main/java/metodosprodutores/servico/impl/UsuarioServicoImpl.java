package metodosprodutores.servico.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metodosprodutores.model.Usuario;
import metodosprodutores.servico.UsuarioServico;
import notificador.Mensagem;
import notificador.Notificador;

@Service
public class UsuarioServicoImpl implements UsuarioServico {
	
	@Autowired
	private Notificador notificador;
	
	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Novo usuário: " + usuario);
		
		notificador.notificar(new Mensagem("Bem vindo!", "Olá!"));
	}
}

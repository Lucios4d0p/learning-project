package com.adopiluv.api;

import com.adopiluv.model.Usuario;
import com.adopiluv.repository.IUsuarioRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class formerApplicationTests {

	@Autowired
	private IUsuarioRepository repository;

	@Autowired
	private BCryptPasswordEncoder ne;

	@Test
	public void createUserTest() {
		Usuario user=new Usuario();
		user.setId(3);
		user.setNome("mito");
		user.setClave(ne.encode("123"));
		Usuario retorno = repository.save(user);

		assertTrue(retorno.getClave().equalsIgnoreCase(user.getClave()));
	}

}

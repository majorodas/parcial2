package helados.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import helados.model.Usuario;



//import com.mitocode.model.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Integer> {

	Usuario findOneByUsername(String username);
}

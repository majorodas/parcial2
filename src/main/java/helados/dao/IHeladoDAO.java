package helados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import helados.model.Helado;

public interface IHeladoDAO extends JpaRepository<Helado , Integer> {

}

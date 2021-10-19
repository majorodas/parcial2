package helados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import helados.model.Marca;

public interface IMarcaDAO extends JpaRepository<Marca , Integer> {

}

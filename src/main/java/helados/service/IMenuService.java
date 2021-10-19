package helados.service;


import java.util.List;

import helados.model.Menu;



public interface IMenuService extends ICRUD<Menu>{
	
	List<Menu> listarMenuPorUsuario(String nombre);
}

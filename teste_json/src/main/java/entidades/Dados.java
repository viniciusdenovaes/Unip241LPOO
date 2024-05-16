package entidades;

import java.util.List;

public class Dados {
	
	private List<Cliente> clientes;

	
	
	
	public List<Cliente> getClientes() {
		return clientes;
	}




	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}




	@Override
	public String toString() {
		return "Dados [clientes=" + clientes + "]";
	}
	
	

}

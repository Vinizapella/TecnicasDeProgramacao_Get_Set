
public class Carro {

	private String marca;
	private String modelo;
	private int ano;
	
	public Carro() {
		this.marca = "";
		this.modelo = "";
		this.ano = 0;
		
	}
	
	public Carro(String marca, String modelo, int ano) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;	
	}
	
	public String getMarca() {
		return(marca);
	}
	public String getModelo() {
		return(modelo);
	}
	public int getAno() {
		return(ano);
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}

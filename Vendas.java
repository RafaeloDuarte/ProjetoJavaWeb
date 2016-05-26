public class Vendas {
    
    	private int id_mercadoria,
			quantidade;
	private String nome,
			tipo,
			tipoDoNegocio;

    
    
	public int getId(){
		return id_mercadoria;
	}

	public void setId(){
		this.id_mercadoria = id_mercadoria;
	}

	public int getquantidade(){
		return quantidade;
	}

	public void setquantidade(){
		this.quantidade = quantidade;
	}
	public String getnome(){
		return nome;
	}

	public void setnome(){
		this.nome = nome;
	}

	public String gettipo(){
		return tipo;
	}

	public void settipo(){
		this.tipo = tipo;
	}

	public String gettipoDoNegocio(){
		return tipoDoNegocio;
	}

	public void settipoDoNegocio(){
		this.tipoDoNegocio = tipoDoNegocio;
	}
}

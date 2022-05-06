package entity;



public class Documents {
	 private int documentDateDay;
	 private int documentDateMonth;
	 private int documentDateYear;
	 private String rg;
	 private String cpf;
	 private String uf;
	 private String title;
	 private String section;
	 private String zone;
	 private String emiter;
	 
	 
	public String getCPF() {
		return cpf;
	}


	public void setCPF(String CPF) {
		cpf = CPF;
	}


	public Documents(int documentDateDay, int documentDateMonth, int documentDateYear, String rg, String cpf, String uf,
			String title, String section, String zone, String emiter) {
		super();
		this.documentDateDay = documentDateDay;
		this.documentDateMonth = documentDateMonth;
		this.documentDateYear = documentDateYear;
		this.rg = rg;
		this.cpf = cpf;
		this.uf = uf;
		this.title = title;
		this.section = section;
		this.zone = zone;
		this.emiter = emiter;
	}


	
	
	
	
	

	 
	 
	 
	 
	 

}

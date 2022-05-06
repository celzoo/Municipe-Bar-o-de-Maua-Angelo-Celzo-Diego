package entity;

import java.util.*;

import control.Control;
public class Towncitizen extends Person implements Control{
	
		private String nameOfFather;
		private String nameOfMother;
		private String deficiency;
		private String ocupation;
		private String color;
	
		private String dependents;
		private String civilState;
		private String nacionality;
		private Afiliations afiliations;
		private Contacts contacts;
		private Education education;
		private Residency residency;
		private Documents documents;
		List<Towncitizen> list = new ArrayList<Towncitizen>();
		
		
		
        
		public Towncitizen(String firstName, String surname, int day, int month, int year, String naturality,
				String gender, String nameOfFather, String nameOfMother, String deficiency, String ocupation,
				String color,  String dependents, String civilState, String nacionality,
				Afiliations afiliations, Contacts contacts, Documents documents, Education education, Residency residency)
				{
			super(firstName, surname, day, month, year, naturality, gender);
			this.nameOfFather = nameOfFather;
			this.nameOfMother = nameOfMother;
			this.deficiency = deficiency;
			this.ocupation = ocupation;
			this.color = color;
			
			this.dependents = dependents;
			this.civilState = civilState;
			this.nacionality = nacionality;
			this.afiliations = afiliations;
			this.contacts = contacts;
			this.education = education;
			this.residency = residency;
			this.documents = documents;
			
		}


		@Override
		public int cadastro(Towncitizen citizen,int count) {
			
			list.add(citizen);
			return count++;
			
		}


		@Override
		public void show(int count) {
			int secondCounter=0;
			while(secondCounter<=count) {
				System.out.println(list.get(secondCounter)); 
				secondCounter++;
			}
			
			
			
			
		}


		@Override
		public void delete(String cpf , int count) {
			int secondCounter=0;
			try {
				while(secondCounter!=count) {
					if(list.get(secondCounter).documents.getCPF().equals(cpf)) {
						list.remove(secondCounter);
					
					}
	
					
					secondCounter++;
				}
			
			}catch(ArrayIndexOutOfBoundsException exception) {
				System.out.println("Erro na contagem da lista");
				
			}
		}
		
	
			
		
		
		
		public  String toString() {
			return " Nome: " + getFirstName() + " " + getSurname() + "| CPF:"+ documents.getCPF();
		}


	

	
	

	



	
	

	
	

}

package entity;

import java.util.*;

import control.Control;
public class Towncitizen extends Person {
	
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
			this.setDocuments(documents);
			
		}


	
		
	
			
		
		
		
		public  String toString() {
			return " Nome: " + getFirstName() + " " + getSurname() + "| CPF:"+ getDocuments().getCPF();
		}









		public Documents getDocuments() {
			return documents;
		}









		public void setDocuments(Documents documents) {
			this.documents = documents;
		}


	

	
	

	



	
	

	
	

}

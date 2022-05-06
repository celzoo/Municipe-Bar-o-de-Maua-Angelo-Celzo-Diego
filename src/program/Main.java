package program;
import java.util.*;
import java.util.Scanner;

import entity.Afiliations;
import entity.Contacts;
import entity.Documents;
import entity.Education;
import entity.Residency;
import entity.Towncitizen;
public class Main {

	public static void main(String[] args) {
		int count=-1,condition = 4;
		String firstName,surname,naturality,gender,degree,formation,school,intendToStudyAgain,intendedStudy,rg,cpf,uf,title,section,zone,emiter,cellphone,homeNumber,associations,syndicate,club,religion,
		adress,houseNumber,neighborhood,nameOfFather,nameOfMother,deficiency,ocupation,color,arriveDate,dependents,civilState,nacionality;
		int day,month,year,arriveDay,arriveMonth,arriveYear;
		
		Towncitizen citizen = new Towncitizen(null, null, 0, 0,0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		Scanner sc = new Scanner(System.in);
		while(condition!=0) {
		System.out.println("Welcome to our citizenship system to register type in 1 | to see how many registered there is type in 2 | to delete a citizen record type in 3 | to close the application type in 0");
		condition = sc.nextInt();
		
		switch(condition) {
			case 1:
				try{ 
				System.out.println("Type in First name ");
				firstName = sc.next();
				System.out.println("Type in Surname ");
				surname = sc.next();
				System.out.println("Type in day of birth ");
				day = sc.nextInt();
				System.out.println("Type in month of birth ");
				month = sc.nextInt();
				System.out.println("Type in year of birth ");
				year = sc.nextInt();
				System.out.println("Type in naturality ");
				naturality = sc.next();
				System.out.println("Type in gender ");
				gender = sc.next();
				System.out.println("Type in degree ");
				degree = sc.next();
				System.out.println("Type in Formation ");
				formation = sc.next();
				System.out.println("Type in school ");
				school = sc.next();
				System.out.println("Type in where you intend to study again  ");
				intendToStudyAgain= sc.next();
				System.out.println("Type in where you intend to study ");
				intendedStudy= sc.next();
				System.out.println("Type in RG ");
				rg = sc.next();
				System.out.println("Type in CPF");
				cpf = sc.next();
				System.out.println("Type in UF ");
				uf = sc.next();
				System.out.println("Type in title ");
				title = sc.next();
				System.out.println("Type in section ");
				section = sc.next();
				System.out.println("Type in zone ");
				zone = sc.next();
				System.out.println("Type  in emiter ");
				emiter= sc.next();
				System.out.println("Type in cellphone ");
				cellphone = sc.next();
				System.out.println("Type in home number ");
				homeNumber = sc.next();
				System.out.println("Type in associations ");
				associations = sc.next();
				System.out.println("Type in syndicate ");
				syndicate = sc.next();
				System.out.println("Type in club ");
				club = sc.next();
				System.out.println("Type in religion ");
				religion = sc.next();
				System.out.println("Type adress ");
				adress = sc.next();
				System.out.println("Type house number ");
				houseNumber = sc.next();
				System.out.println("Type in name of father ");
				nameOfFather = sc.next();
				System.out.println("Type in name of mother ");
				nameOfMother= sc.next();
				System.out.println("Type in deficiency ");
				deficiency = sc.next();
				System.out.println("Type in ocupation ");
				ocupation= sc.next();
				System.out.println("Type in color ");
				color = sc.next();
				System.out.println("Type in arrive date day");
				arriveDay = sc.nextInt();
				System.out.println("Type in arrive date month");
				arriveMonth = sc.nextInt();
				System.out.println("Type in arrive date year");
				arriveYear = sc.nextInt();
				System.out.println("Type in dependents ");
			    dependents = sc.next();
				System.out.println("Type in civil state ");
				civilState = sc.next();
				System.out.println("Type in nacionality ");
				nacionality = sc.next();
				System.out.println("Type in neighborhood ");
				neighborhood = sc.next();
				
				
				Afiliations afiliations = new Afiliations(nacionality, syndicate, club, religion);
				Contacts contacts = new Contacts(cellphone, homeNumber);
				Documents documents = new Documents(arriveDay, arriveMonth, arriveYear, rg, cpf, uf, title, section, zone, emiter);
				Education education = new Education(degree, formation, school, intendToStudyAgain, intendedStudy);
				Residency residency = new Residency(adress, houseNumber, neighborhood);
				Towncitizen citizen1 = new Towncitizen(firstName, surname, day, month, year, naturality, gender, nameOfFather, nameOfMother, deficiency, ocupation, color,  dependents, civilState, nacionality, afiliations, contacts, documents, education, residency);
				citizen.cadastro(citizen1,count);
				
				}catch(InputMismatchException exception) {
					System.out.println("Restart the programa and type in a number during the date register  ");
					condition = 0;
					
				}
				
				count++;
				
				 break;
				 
			case 2:
				citizen.show(count);
				break;
				
			case 3:
				System.out.println("Digite o cpf do usuario que deseja excluir");
				cpf = sc.next();
				citizen.delete(cpf, count);
				count--;
				break;
		

			}
		
		
		}
		
		System.out.println("Thank you for using the program");
		
			
		
		
		

		
		
		
	}

}

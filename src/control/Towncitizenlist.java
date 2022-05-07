package control;

import java.util.ArrayList;
import java.util.List;

import entity.Towncitizen;
import entity.Documents;

public class Towncitizenlist implements Control{
	
	List<Towncitizen> list = new ArrayList<Towncitizen>();

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
				if(list.get(secondCounter).getDocuments().getCPF().equals(cpf)) {
					list.remove(secondCounter);
				
				}

				
				secondCounter++;
			}
		
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Erro na contagem da lista");
			
		}
	}
	
	
	

}

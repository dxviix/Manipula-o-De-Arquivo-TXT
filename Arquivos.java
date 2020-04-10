import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Arquivos {

	private static final Reader Reader = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		File arquivo = new File("arquivo.txt");
		
		int escolha;
		
		System.out.println("\nSEU ARQUIVO JÁ FOI CRIADO!");

		do { 
			System.out.println("\nESCOLHA UMA DAS OPÇÕES:"
							  +"\n\nTECLE 1 PARA INSERIR NOMES NO ARQUIVO;"
					  		  +"\nTECLE 2 PARA EXIBIR OS NOMES DO ARQUIVO;"
					          +"\nTECLE 3 PARA EXCLUIR TODOO O ARQUIVO.");
		    escolha = teclado.nextInt();
		    
		    String nome;
		    
		    switch(escolha) {
			 case 1:
				 teclado.nextLine();
				 
				try {
					
					System.out.println("\nDigite o que você deseja inserir no arquivo:");
					nome = teclado.nextLine();
					
					FileWriter fileWriter = new FileWriter(nome);
					BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				
					bufferedWriter.write(nome);
					System.out.println("\nNome inserido com sucesso!");
					
					bufferedWriter.close();
					fileWriter.close();
					
				} catch (Exception e) {
					System.out.println("\nTente novamente");
				}
		     break;
			 case 2:
			     
			     try {
			    	 System.out.printf("\nMostrando o que foi inserido:\n");
			    	 nome = teclado.nextLine();
			    	 
			    	 FileReader fileReader = new FileReader(nome);
			    	 BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			    	 bufferedReader.read();
					 System.out.println("DEU CERTO");
			 
			    	 fileReader.close();
			    	 bufferedReader.close();
			    	 
			     } catch (Exception e) {
			    	 System.out.printf("Erro na abertura do arquivo.\n");
			    }
			 
			break;
		 }
		    
			} while (escolha < 4 && escolha > 0);
 }
}




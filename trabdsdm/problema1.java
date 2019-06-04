
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class problema1{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Casa> imoveis = new ArrayList<Casa>();

		
		
		
		boolean tudo = true;


		while (tudo == true) {

			System.out.println("1 - cadastrar");
			System.out.println("2 - excluir");
			System.out.println("3 - listar imoveis");
			System.out.println("4 - listar iptu");
			System.out.println("5 - sair");


			int menuPrinc = input.nextInt();
			boolean confere = true;


			//contra erros no menu
			while(confere == true){

				if ((menuPrinc <= 5) && (menuPrinc >= 1)) {

					confere = false;

				}
				else{

				System.out.println("Essa opcao não existe! Por Favor digite o numero conrrespondente a opcao desejada");
				menuPrinc = input.nextInt();

				}
		
			}	


			switch(menuPrinc){
			// add propriedade
				case 1:
					System.out.println("Escolha o tipo do imovel");
					System.out.println(" 1 - casa\n 2 - apartamento\n 3 - imovel comercial");

					int menu = input.nextInt();
					input.nextLine();

					switch(menu){ 

						case 1:
						
							System.out.println("Nome do proprietario: ");
							String proprietario = input.nextLine();



							System.out.println("Digite seu endereco: ");
							String endereco = input.nextLine();

							System.out.println("Digite os metros quadrados da propriedade: ");
							double metros = input.nextDouble();


							System.out.println("Ano de construcao: ");
							int ano = input.nextInt();
						

							System.out.println("A propriedade esta em um condominio?\n 1 - sim \n 2 - não ");
							int cond = input.nextInt();
								if (cond == 1){ 
									imoveis.add(new Condominio(proprietario,endereco,metros,ano));
								}
								else if (cond == 2) {
									imoveis.add(new Casa(proprietario,endereco,metros,ano));
								}
								else{
									System.out.println("opcao inexistente");
								}
							break;
					
						case 2:
						
							System.out.println("Nome do proprietario: ");
							proprietario = input.nextLine();


							System.out.println("Digite seu endereco: ");
							endereco = input.nextLine();

							System.out.println("Digite o numero do seu andar: ");
							int andar = input.nextInt();

							System.out.println("Digite os metros quadrados da propriedade: ");
							metros = input.nextDouble();


							System.out.println("Ano de construcao: ");
							ano = input.nextInt();

							imoveis.add(new Apartamento(proprietario,endereco,metros,ano));

							break;
						
						case 3:
						
							System.out.println("Nome do proprietario: ");
							proprietario = input.nextLine();


							System.out.println("Digite seu endereco: ");
							endereco = input.nextLine();

							System.out.println("Digite os metros quadrados da propriedade: ");
							metros = input.nextDouble();


							System.out.println("Ano de construcao: ");
							ano = input.nextInt();

							imoveis.add(new Comercial(proprietario,endereco,metros,ano));

							break;
					}
					break;
				//excluir	
				case 2:
				
					if (!imoveis.isEmpty()) {
						System.out.println("Qual imovel voce deseja excluir?"); 
						for (int i = 0; i < imoveis.size(); i++) {
							System.out.println(i + "- proprietario: " + imoveis.get(i).getProprietario());
						}
						System.out.println("Digite o numero do proprietario: ");
						int excluir = input.nextInt();
						imoveis.remove(excluir);
						
					}else{
						System.out.println("Nao ha propriedade cadastrada");
						confere = false;
					}
					break;
					
				// listar todas as propriedades 
				case 3:

					Collections.sort(imoveis);
					if (!imoveis.isEmpty()) {
						for (int i = 0; i < imoveis.size(); i++) {

							System.out.println("proprietario: " + imoveis.get(i).getProprietario());
							System.out.println("endereco: " + imoveis.get(i).getEndereco());
							System.out.println("tamanho: " + imoveis.get(i).getMetros());
							System.out.println("\n");

						}
					}else{
						System.out.println("Nao ha propriedade cadastrada!");
						confere = false;
					}
					break;

				//listar iptu	
				case 4:
					if (!imoveis.isEmpty()) {

						for (int i = 0; i < imoveis.size(); i++) {
							System.out.println("proprietario" + imoveis.get(i).getProprietario());
							System.out.println("IPTU: " + imoveis.get(i).getiptu());
							System.out.println("\n");
			
						}						
					}
					else{
						System.out.println("Nao ha proprietario cadastrada!");
						confere = false;
					}
					
				
					break;	


				//sair
				case 5:
				
					confere = false;
					tudo = false;
					break;
			}
		}
	}
}
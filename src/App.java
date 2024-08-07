import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String caminhoArquivo = "data.txt";
        
        User usuario = new User();
        boolean loop = true;

        while(loop == true){

            System.out.println("REGISTRO POPULACIONAL");
            System.out.println("1- Para Registrar");
            System.out.println("2- Para Consultar");
    
            if (input.nextLine().equalsIgnoreCase("1")) {
    
                
                System.out.println("Digite o seu primeiro nome:");
                usuario.primeiroNome = input.nextLine();
                System.out.println("Digite o seu segundo nome:");
                usuario.segundoNome = input.nextLine();
                System.out.println("Digite a sua idade:");
                usuario.idade = input.nextInt();
                input.nextLine();
                System.out.println("Digite o seu endereço:");
                usuario.endereco = input.nextLine();
    
                System.out.println("Olá " + usuario.primeiroNome + " " + usuario.segundoNome + ", sua idade é: " + usuario.idade + ", e seu endereço é: " + usuario.endereco + "?");
                System.out.println("Esta correto? (s/n)");
    
                if(input.nextLine().equalsIgnoreCase("s")){

                    try(PrintWriter gravador = new PrintWriter(new FileWriter(caminhoArquivo, true))) {

                    //Grava os dados no arquivo.
                    gravador.println("Nome: " + usuario.primeiroNome + " Sobrenome: " + usuario.segundoNome + ", Idade: " + usuario.idade + ", Endereço: " + usuario.endereco);
                    gravador.close(); //Fecha o gravador para que os dados sejam gravados imediatamente assim ficando disponiveis para a consulta

                    System.out.println("Deseja registrar outro usuário? (s/n)");

                    if(input.nextLine().equalsIgnoreCase("n")){
                        loop = false; // Encerra o Loop
                    }
                        
                    } catch (Exception e) {
                        System.out.println("Erro na gravação " + e.getMessage());
                    }
                }
                
            } else {
    
                try(BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))){
    
                    String linha;
    
                    while((linha = leitor.readLine()) != null){ //Utiliza um loop para ler cada linha do arquivo
                        System.out.println(linha);
                    }

                    loop = false; //Encerra o loop
    
    
                } catch(IOException e){
                    System.out.println("Erro na leitura do arquivo: " + e.getMessage());
                }
    
            }

        }


        input.close();

    }
}
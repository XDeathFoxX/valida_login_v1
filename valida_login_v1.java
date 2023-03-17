package valida_login_v1;

import java.util.Scanner;

public class valida_login_v1 {

    public static void main(String[] args){
        login(); // Aqui chamamos a função da validação do login
        
    }

    static void login(){
        Scanner input = new Scanner(System.in); // Aqui iniciamos o método Scanner
        var usuario ="adm"; // Aqui definimos os valores de usuário e login para a validação
        var senha = "4dm1n";

        System.out.println("Deseja entrar no sistema? (sim ou não) : ");
        String entrada = input.nextLine(); // Aqui recebemos se o usuário quer ou não entrar no sistema
        entrada = entrada.toLowerCase(); // Aqui formatamos a string para minúsculo para evitar erro de entrada
        entrada = entrada.trim(); // Aqui retiramos os espaços desnecessários para evitar erro de entrada
        
        if (entrada.equals("sim")){ // Aqui verificamos se o usuário digitou sim para entrar no sistema,se sim o código segue a execução
            while (entrada != "sair"){ // Aqui temos uma condição para o sistema continuar rodando até ele ser encerrado com sucesso
            System.out.println("");
            System.out.println("Digite seu usuário: "); // Aqui pedimos a informação do nome do usuário
            String user = input.nextLine();

            if (user.equals(usuario)){ // Aqui verificamos se o nome do usuário inserido combina com o definido como correto para entrar no sistema,se sim segue
                System.out.println(""); // para a senha,se não dá mensagem de erro e pede novamente o nome do usuário
                System.out.println("Digite sua senha: ");
                String password = input.nextLine();
                    
                if (password.equals(senha)){ // Se o nome de usuário foi inserido corretamente ele continua a execução e aqui pedimos a senha do usuário para
                    System.out.println("Olá Admin,seja bem vindo ao sistema!"); // entrar no sistema
                    System.out.println("");
                    System.exit(0);  // Depois de confirmarmos os dados e ter dado a mensagem de sucesso o sistema fecha
                }else {
                    System.out.println("Senha incorreta!"); // Se a senha inserida for incorreta ele continua pedindo a senha até a senha corresponder
                    System.out.println("");
                }
            }else{
                System.out.println("Usuário inválido!"); // Se o usuário inserido for incorreto ele continua pedindo até o usuário corresponder 
                System.out.println("");
            }
        }
        }else{
            input.close(); // Aqui encerramos a execução do Scanner
            System.exit(0); // Aqui encerramos a execução caso o usuário não quiser entrar no sistema
        }
    }
    }
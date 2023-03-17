package valida_login_v1;

import java.util.Scanner;

public class valida_login_v1 {

    public static void main(String[] args){
        login();
        
    }

    static void login(){
        Scanner input = new Scanner(System.in);
        var usuario ="adm";
        var senha = "4dm1n";

        System.out.println("Deseja entrar no sistema? (sim ou não) : ");
        String entrada = input.nextLine();
        entrada = entrada.toLowerCase();
        
        if (entrada.equals("sim")){
            while (entrada != "sair"){
            System.out.println("");
            System.out.println("Digite seu usuário: ");
            String user = input.nextLine();

            if (user.equals(usuario)){
                System.out.println("");
                System.out.println("Digite sua senha: ");
                String password = input.nextLine();
                    
                if (password.equals(senha)){
                    System.out.println("Olá Admin,seja bem vindo ao sistema!");
                    System.out.println("");
                    System.exit(0);     
                }else {
                    System.out.println("Senha incorreta!");
                    System.out.println("");
                }
            }else{
                System.out.println("Usuário inválido!");
                System.out.println("");
            }
        }
        }else{
            input.close();
            System.exit(0);
        }
    }
    }
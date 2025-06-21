package Repeticao;

import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 - Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

        System.out.println("Digite Sua Senha: ");
        int senha = scanner.nextInt();

        while(senha != 2002){
            System.out.println("Senha incorreta, tente novamente");
            senha = scanner.nextInt();
        }
        System.out.println("Senha correta");



        // 2 - Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        //cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        //menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        System.out.println("Digite o numero Y e X para saber a coordenada: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Primeira coordenada");
            } else if(x > 0 && y < 0){
                System.out.println("Quarta coordenada");
            } else if(x < 0 && y < 0){
                System.out.println("Terceira coordenada");
            }else{
                System.out.println("Segunda Coordenada");
            }

            x = scanner.nextInt();
            y = scanner.nextInt();
        }

        // 3 - Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        //um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        //exemplo.

        System.out.println("Escolha o codigo de 1 até 4");
        int codigo = scanner.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int disel = 0;

        while (codigo != 4){
            if(codigo == 1){
                alcool += 1;
            } else if(codigo == 2) {
                gasolina += 1;
            } else if(codigo == 3) {
                disel += 1;
            }else{
                System.out.println("Codigo está incorrento, tente novamente");
            }

            codigo = scanner.nextInt();
        }
        System.out.printf("MUITO OBRIGADO%nAlcool: %d%ngasolina: %d%ndisel: %d", alcool, gasolina, disel);

        scanner.close();
    }
}

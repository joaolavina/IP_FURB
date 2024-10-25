/*Em uma eleição para presidência, existem 4 candidatos. Os votos são informados através de código. 
Os dados utilizados para votação obedecem a seguinte codificação:

1, 2, 3, 4 = voto para o respectivo candidato;
5 = voto nulo;
6 = voto em branco.
Elabore um programa que calcule e escreva:

total de votos para cada candidato;
total de votos nulos;
total de votos em branco;
percentual dos votos em branco e nulos sobre o total.
Se o usuário informar um número de operação incorreto, emitir a mensagem “Opção incorreta” e persistir solicitando um número de opção correto. 
Para interromper a operação, o usuário poderá fornecer o número 0.

 */

import java.util.Scanner;

public class Exe33Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0, votos5 = 0, votos6 = 0, qntVotos = 0, voto = 0;
    

        do {
            System.out.println("Digite seu voto:");
            voto = input.nextInt();

            switch (voto) {
                case 0:
                    break;
                case 1:
                    votos1++;
                    qntVotos++;
                    break;
                case 2:
                    votos2++;
                    qntVotos++;
                    break;
                case 3:
                    votos3++;
                    qntVotos++;
                    break;
                case 4:
                    votos4++;
                    qntVotos++;
                    break;
                case 5:
                    votos5++;
                    qntVotos++;
                    break;
                case 6:
                    votos6++;
                    qntVotos++;
                    break;
                default:
                    System.out.println("Opção incorreta.");
                    break;
            }
        } while (voto != 0);
        
        input.close();

        System.out.println("Total de votos para o candidato 1: "+votos1+" ("+((votos1*100)/qntVotos)+"%).");
        System.out.println("Total de votos para o candidato 2: "+votos2+" ("+((votos2*100)/qntVotos)+"%).");
        System.out.println("Total de votos para o candidato 3: "+votos3+" ("+((votos3*100)/qntVotos)+"%).");
        System.out.println("Total de votos para o candidato 4: "+votos4+" ("+((votos4*100)/qntVotos)+"%).");
        System.out.println("Total de votos nulos: "+votos5+" ("+((votos5*100)/qntVotos)+"%).");
        System.out.println("Total de votos em branco: "+votos6+" ("+((votos6*100)/qntVotos)+"%).");

    }
}

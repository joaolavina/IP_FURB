/*Uma fábrica resolveu, no mês de Abril, pagar seus funcionários um valor diário 
conforme as regras descritas abaixo. 
Escreva um programa para ler o dia do mês de abril que será calculado o valor diário. 
O programa deve validar a leitura do dia deforma a aceitar 
apenas valores válidos para o mês de Abril (1 a 30). 
Caso o dia seja inválido, escrever a mensagem "Dia inválido"
 e repetir a leitura até que seja válido. 
 A seguir deve ser lido o total de peças produzidas pelo funcionário no turno da manhã
  e o total de peças produzidas no turno da tarde. 
  Escrever o valor que o respectivo funcionário receberá no dia. 
  Logo após exibir a mensagem "Novo funcionário (1.sim 2.não)?". 
  Caso a resposta seja 1 o programa deve ser repetido solicitando novamente o dia do mês
   e a produção de peças do funcionário em cada turno, caso contrário deve ser encerrado.

Regras:

para a primeira quinzena do mês (1 a 15) 
o funcionário recebe R$ 0,80 por peça 
caso tenha produzido mais de 100 no dia (considerando manhã e tarde), 
desde que a produção em cada um dos turnos não seja inferior a 30. 
Caso contrário recebe R$ 0,50 por peça.

para a segunda quinzena do mês (16 a 30) 
o funcionário recebe R$ 0,40 por peça produzida no turno da manhã
 e R$ 0,30 por peça produzida no turno da tarde.
Considere que a produção em cada turno nunca será a mesma (não é necessário validar) 
Responda também:

qual dia ocorreu a maior produção;
em qual período o funcionário mais produz (manhã ou tarde e a quantidade produzida).
Exemplo de entrada / saída:

Dia	Manhã	Tarde	Saída
-1			        Dia inválido
32			        Dia inválido
10	50	     60	    R$ 88,00 (valor recebido)

Novo funcionário: (1.sim 2.não)?
1 (sim)	

14	110  	20	    R$ 65,00 (valor recebido)
Novo funcionário: (1.sim 2.não)?
1 (sim)	

12	20	     90	     R$ 55,00 (valor recebido)
Novo funcionário: (1.sim 2.não)?
1 (sim)

16	40	      90	R$ 43,00 (valor recebido)

Novo funcionário: (1.sim 2.não)?
1 (sim)			

13	20	      22	R$ 21,00 (valor recebido)

Novo funcionário: (1.sim 2.não)?
1 (sim)			

9	40	      42	R$ 41,00 (valor recebido)
Novo funcionário: (1.sim 2.não)?
2 (não)			 */

import java.util.Scanner;

public class Exe27Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPeças = 0;
        int totalPeçasManhã = 0;
        int totalPeçasTarde = 0;
        int diaMaiorProdução = 0;
        double valor = 0;
        int resposta = 0;

        while (resposta != 2) {
            System.out.println("Digite o dia do mês de abril: ");
            int dia = input.nextInt();

            if (dia >= 31 || dia <= 0) {
                System.out.println("Dia inválido.");
            } else {
                System.out.println("Digite o total de peças produzidas no turno da manhã e da tarde:");
                int peçasManhã = input.nextInt();
                int peçasTarde = input.nextInt();
                if (totalPeças < (peçasManhã + peçasTarde)) {
                    diaMaiorProdução = dia;
                }
                totalPeças = peçasManhã + peçasTarde;
                totalPeçasManhã += peçasManhã;
                totalPeçasTarde += peçasTarde;
                if (dia <= 15) {
                    if ((totalPeças >= 100) && peçasManhã >= 30 && peçasTarde >= 30) {
                        valor = totalPeças * 0.8;
                    } else {
                        valor = totalPeças * 0.5;
                    }
                } else {
                    valor = (peçasManhã * 0.4) + (peçasTarde * 0.3);
                }
                System.out.println("R$ " + valor);
                System.out.println("Novo funcionário: (1.sim 2.não)?");
                resposta = input.nextInt();

            }
        }
        System.out.println("Dia de maior produção: " + diaMaiorProdução);
        System.out.println("Quantidade produzida no turno da manhã: " + totalPeçasManhã);
        System.out.println("Quantidade produzida no turno da tarde: " + totalPeçasTarde);
        if (totalPeçasManhã > totalPeçasTarde) {
            System.out.println("O funcionário produz mais no turno da manhã");
        } else {
            System.out.println("O funcionário produz mais no turno da tarde");
        }
        input.close();
    }
}
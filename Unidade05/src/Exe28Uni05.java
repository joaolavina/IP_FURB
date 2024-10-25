/*Uma emissora de rádio decidiu promover uma eleição para determinar 
o melhor conjunto do ano segundo a opinião dos ouvintes. 
Entraram na disputa apenas os quatro conjuntos mais solicitados durante o ano. 
Os votos são informados através de códigos:

código	conjunto
1	Nenhum de Nós
2	CPM22
3	Skank
4	Jota Quest
Descreva um algoritmo que:

informe o total de votos para cada grupo;
informe o percentual dos votos para cada grupo;
informe o grupo vencedor.
O algoritmo deve apresentar ao usuário a seguinte mensagem: 
mais um voto: s (SIM) / n (NÃO)? antes de prosseguir com a entrada de dados. */

import java.util.Scanner;

public class Exe28Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int votosNenhumDeNós = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;
        int votos = 0;
        String bandaVencedora = "";
        char resposta = ' ';
        
        System.out.println("Vote na banda:");
        int codigoBanda = input.nextInt();
        while(resposta != 'n'){
            
            votos++;
            switch (codigoBanda) {
                case 1:
                    votosNenhumDeNós++;            
                    break;
                case 2:
                    votosCPM22++;            
                    break;
                case 3:
                    votosSkank++;            
                    break;
                case 4:
                    votosJotaQuest++;            
                    break;
            }
            System.out.println("Mais um voto: s (SIM) / n (NÃO)?");
            resposta = input.next().trim().toLowerCase().charAt(0);
        }

        input.close();

        if (votosJotaQuest>votosNenhumDeNós && votosJotaQuest>votosCPM22 && votosJotaQuest>votosSkank){
            bandaVencedora = "Jota Quest";
        }
        if (votosNenhumDeNós>votosJotaQuest && votosNenhumDeNós>votosCPM22 && votosNenhumDeNós>votosSkank){
            bandaVencedora = "Nenhum de Nós";
        }
        if (votosCPM22>votosJotaQuest && votosCPM22>votosNenhumDeNós && votosCPM22>votosSkank){
            bandaVencedora = "CPM 22";
        }
        if (votosSkank>votosJotaQuest && votosSkank>votosNenhumDeNós && votosSkank>votosCPM22){
            bandaVencedora = "Skank";
        }


        System.out.println("Votos Jota Quest: "+votosJotaQuest+" "+"("+((votosJotaQuest*100)/votos)+"%)");
        System.out.println("Votos Nenhum de Nós: "+votosNenhumDeNós+" "+"("+((votosNenhumDeNós*100)/votos)+"%)");
        System.out.println("Votos CPM 22: "+votosCPM22+" "+"("+((votosCPM22*100)/votos)+"%)");
        System.out.println("Votos Skank: "+votosSkank+" "+"("+((votosSkank*100)/votos)+"%)");
        System.out.println("Banda vencedora: "+bandaVencedora);
    }
}
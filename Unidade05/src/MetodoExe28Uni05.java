import java.util.Scanner;

public class MetodoExe28Uni05 {
    public static void main(String[] args) {
        new MetodoExe28Uni05();
    }

    MetodoExe28Uni05(){
        Scanner input = new Scanner(System.in);
        
        int votosNenhumDeNós = 0, votosCPM22 = 0, votosSkank = 0, votosJotaQuest = 0, votos = 0;
        String bandaVencedora = "";
        char resposta = ' ';

        while(resposta != 'n'){
            int codigoBanda = readVote(input);
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
            resposta = oneMoreVote(input);
        }
        input.close();
        bandaVencedora = compareWinner(votosCPM22, votosJotaQuest, votosNenhumDeNós, votosSkank, bandaVencedora);
        writeValues(votosJotaQuest, votos, votosCPM22, votosNenhumDeNós, votosSkank, bandaVencedora);
    }

    private int readVote(Scanner input){
        System.out.println("Vote na banda:");
        return input.nextInt();
    } 

    private char oneMoreVote(Scanner input){
        System.out.println("Mais um voto: s (SIM) / n (NÃO)?");
        return input.next().trim().toLowerCase().charAt(0);
    }

    private String compareWinner(int votosCPM22, int votosJotaQuest, int votosNenhumDeNós, int votosSkank, String bandaVencedora){
        if (votosJotaQuest>votosNenhumDeNós && votosJotaQuest>votosCPM22 && votosJotaQuest>votosSkank){
            bandaVencedora = "Jota Quest";
        }
        else if (votosNenhumDeNós>votosJotaQuest && votosNenhumDeNós>votosCPM22 && votosNenhumDeNós>votosSkank){
            bandaVencedora = "Nenhum de Nós";
        }
        else if (votosCPM22>votosJotaQuest && votosCPM22>votosNenhumDeNós && votosCPM22>votosSkank){
            bandaVencedora = "CPM 22";
        }
        else if (votosSkank>votosJotaQuest && votosSkank>votosNenhumDeNós && votosSkank>votosCPM22){
            bandaVencedora = "Skank";
        }
        else{
            bandaVencedora = "Empate";
        }

        return bandaVencedora;
    }

    private void writeValues(int votosJotaQuest, int votos, int votosCPM22, int votosNenhumDeNós, int votosSkank, String bandaVencedora){
        System.out.println("Votos Jota Quest: "+votosJotaQuest+" "+"("+((votosJotaQuest*100)/votos)+"%)");
        System.out.println("Votos Nenhum de Nós: "+votosNenhumDeNós+" "+"("+((votosNenhumDeNós*100)/votos)+"%)");
        System.out.println("Votos CPM 22: "+votosCPM22+" "+"("+((votosCPM22*100)/votos)+"%)");
        System.out.println("Votos Skank: "+votosSkank+" "+"("+((votosSkank*100)/votos)+"%)");
        System.out.println("Banda vencedora: "+bandaVencedora);
    }
}

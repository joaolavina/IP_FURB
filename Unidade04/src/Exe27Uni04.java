/* As tarifas de um estacionamento são as seguintes:

1° e 2° hora - R$ 5,00 cada
3° e 4° hora - R$ 7,50 cada
5° hora e seguintes - R$ 10,00 cada

O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo. 
Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos arredonda-se para cima. 


Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por 1 hora 
e quem estacionar por 1 hora e 35 minutos pagará por duas horas. 
Entretanto, se a pessoa permaneceu menos de 30 minutos, também pagará por uma hora. 


Os horários de chegada e partida são apresentados na forma de pares de inteiros, representando horas e minutos. 
Por exemplo, o par 12 50 representará meio dia e cinquenta.

 Assim, faça um algoritmo que leia os horários de chegada e de partida
  e escreva na tela o tempo que ficou estacionado, e o preço a ser cobrado. 
  Deverá haver validação de dados. 
  Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas, 
  e sempre chegam e saem no mesmo dia. */

import java.util.Scanner;

public class Exe27Uni04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Horário de Chegada: ");
    int horasChegada = input.nextInt(); int minChegada = input.nextInt();

    if (horasChegada < 0 || horasChegada >= 24 || minChegada < 0 || minChegada > 59) {
      System.out.println("Tempo inválido.");
    } else {
      System.out.println("Horário de Saída: ");
      int horasSaida = input.nextInt(); int minSaida = input.nextInt();
      if (horasSaida < 0 || horasSaida >= 24 || minSaida < 0 || minSaida > 59) {
        System.out.println("Tempo inválido.");
      } else {
        input.close();

        int tempoChegada = (horasChegada * 60) + minChegada;
        int tempoSaida = (horasSaida * 60) + minSaida;
        int tempoPermanencia = tempoSaida - tempoChegada;

        int horasPermanencia = tempoPermanencia / 60;
        int minPermanencia = tempoPermanencia % 60;

        System.out.println("Tempo estacionado: " + horasPermanencia + "h" + minPermanencia + "h");

        if (minPermanencia <= 29) {
          minPermanencia = 0;
        } else if (minPermanencia >= 30) {
          minPermanencia = 0;
          horasPermanencia++;
        }

        switch (horasPermanencia) {
          case 0:
            System.out.println("Valor a pagar: R$ 5");
          case 1:
          case 2:
            System.out.println("Valor a pagar: R$" + horasPermanencia * 5);
            break;
          case 3:
          case 4:
            horasPermanencia = horasPermanencia - 2;
            System.out.println("Valoar a pagar: R$" + (horasPermanencia * 7.5 + 10));
            break;
          default:
            horasPermanencia = horasPermanencia - 4;
            System.out.println("Valor a pagar: " + (horasPermanencia * 10 + 25));
        }
      }
    }
  }
}
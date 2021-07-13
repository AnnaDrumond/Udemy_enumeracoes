package application;

import java.util.Date;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// aula 115 sobre Enumera��es

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		// Na hora de imprimir, o programa vai transformar o enum para String exibindo o
		// mesmo nome
		// definido no enum, neste exemplo "PENDING_PAYMENT".
		System.out.println(order);

		/*
		 * Convers�o de String para enum - neste exemplo, quando o usu�rio da app for
		 * digitar o status, essa informa��o digitada � em formato STRING, e eu preciso
		 * a converter para ENUM, para isso vou usar o comando "valueof" :
		 */

		// vou criar um objeto do tipo OrderStatus e vou instanciar o mesmo com um
		// valor, neste caso "DELIVERED":
		OrderStatus os1 = OrderStatus.DELIVERED;

		// vou criar um segundo objeto, e usando o valueof eu informo na forma de
		// string, o valor que eu quero
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(os1);
		System.out.println(os2);

		/*
		 * Na pr�tica o primeiro status � �til enquanto "vari�vel" isso porque o
		 * texto "DELIVERED" n�o existe de verdade, � apenas o nome da vari�vel. No
		 * segundo exemplo, os2, � �til porque a fun��o valueOf recebe um texto e
		 * procura o valor desse texto.
		 */
	}

}

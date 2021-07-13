package application;

import java.util.Date;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// aula 115 sobre Enumerações

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		// Na hora de imprimir, o programa vai transformar o enum para String exibindo o
		// mesmo nome
		// definido no enum, neste exemplo "PENDING_PAYMENT".
		System.out.println(order);

		/*
		 * Conversão de String para enum - neste exemplo, quando o usuário da app for
		 * digitar o status, essa informação digitada é em formato STRING, e eu preciso
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
		 * Na prática o primeiro status é útil enquanto "variável" isso porque o
		 * texto "DELIVERED" não existe de verdade, é apenas o nome da variável. No
		 * segundo exemplo, os2, é útil porque a função valueOf recebe um texto e
		 * procura o valor desse texto.
		 */
	}

}

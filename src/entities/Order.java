package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	// atributos:

	private Integer id;
	private Date moment;
	private OrderStatus status;

	// construtores:
	public Order() {

	}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	// métodos Get e Set:

	// get para imprimir/exibir - acessa e retorna o atributo:
	public Integer getId() {
		return id;
	}

	// set para modificar/alterar valor do atributo:
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public String toString () {
		return "Order [id =" +id + ", moment =" + moment + ", status =" + status + "]";
	}

}

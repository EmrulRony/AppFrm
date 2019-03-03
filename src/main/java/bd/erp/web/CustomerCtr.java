package bd.erp.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import bd.erp.model.Customer;
import bd.erp.service.ICustomerService;

@Named
@ViewScoped
public class CustomerCtr implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private ICustomerService iCustomerService;

	@Inject
	private Customer customer;

	private List<Customer> customers;

	@PostConstruct
	public void init() {

		System.out.println("-------------user------------->>>");
		customers = iCustomerService.getCustomerList();

		System.out.println("-------------user- end------------>>>");
	}

	public void saveData() {

		System.out.println("data " + customer);

		try {
			iCustomerService.save(customer);
			//iCustomerService.getCustomer(customer);
			//System.out.println("-----------last customer is : " + customer.getId());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		customers = iCustomerService.getCustomerList();

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}

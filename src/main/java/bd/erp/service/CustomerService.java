package bd.erp.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import bd.erp.model.Customer;

@Stateless
public class CustomerService implements ICustomerService {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Customer customer) throws Exception {

		em.persist(customer);
		em.flush();

		System.out.println("------------save ok -------------------");
	}

	public Customer getCustomer(Customer customer) {

		// Query query = em.createNativeQuery("select * from customer where id = :id", Customer.class);
		// Query query =em.createQuery("SELECT c FROM Customer c WHERE c.id = :id")
		Query query = em.createNamedQuery("Customer.findById");
		query.setParameter("id", customer.getId());
		Customer customerRs = (Customer) query.getSingleResult();
		return customerRs;
	}

	public List<Customer> getCustomerList() {
		
		Query query =em.createQuery("SELECT c FROM Customer c");
	    List<Customer> customerRss= (List<Customer>) query.getResultList();
		return customerRss;
}

}

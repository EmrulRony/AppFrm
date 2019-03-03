package bd.erp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name = "customer")
@NamedQueries({
	    @NamedQuery(name = "Customer.findById", query = "SELECT c FROM Customer c WHERE c.id = :id")
    })
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")    
    private Integer id;
    
    @Column(name = "name")
    @NotNull
    //@NotBlank(message="Field cannot be blank!")
    @Size(min = 3, message="Name size must be above 2 letters!")
    @Pattern(regexp="^[\\p{L} .'-]+$")
    private String name;
    
    @NotNull
    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    @Past
    private Date birthdate;
    
    
    @NotNull
    @DecimalMin(value="1.00")
    @DecimalMax(value="100000.00")
    @Digits(integer=6, fraction=2)
    @Column(name = "balance")
    private BigDecimal balance;
    
    
    @NotNull
    @Column(name = "age")
    @Min(value = 18, message="Age cannot be less than 18")
	@Max(value = 120, message="Age cannot be greater than 120")
    private int age;
    
    
    @NotNull
    @Column(name = "isActive")
    @AssertTrue(message="Field must be selected!")
    private Boolean isActive;
    
    @NotNull
    //@NotBlank
    @Size(min=1, max=20, message="Country name cannot exceed 20 letters!")
    @Pattern(regexp="^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$", message="Please enter valid country name!")
    @Column(name = "country")
    private String country;
    
    
    @NotNull
    @Column(name = "postalcode")
    private int postalcode;
    
    //char

    public Customer() {
    }

    public Customer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appfrm.Customer[ id=" + id + " ]";
    }
    
}

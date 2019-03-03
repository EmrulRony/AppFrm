/*package bd.erp.model;

import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.mfsbd.common.persistence.BaseEntity;
import com.mfsbd.common.persistence.PrimaryKey;
import com.mfsbd.common.persistence.SearchField;

@Entity
@Audited
@Cacheable(value = true)
@PrimaryKey(length = 5)
@Table(schema = "ACC", name = "CHARTOFACCOUNT")
@AuditOverride(forClass = BaseEntity.class)
@AuditTable(schema = "AUD", value = "CHARTOFACCOUNT_AUD")
public class SubsidiaryGl extends BaseEntity {

	private static final long serialVersionUID = 5142294929500614558L;

	@Id
	@NotNull
	@Size(min = 5, max = 12)
	@SearchField(name = "ACCOUNTNO")
	@Basic(optional = false)
	@Column(name = "ACCOUNTNO")
	private String accountNo;

	@Basic(optional = false)
	@Column(name = "BRANCHCODE")
	private String branchCode;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(max = 100)
	@SearchField(name = "ACCOUNTNAME")
	@Basic(optional = false)
	@Column(name = "ACCOUNTNAME")
	private String accountName;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 2, max = 2)
	@Basic(optional = false)
	@Column(name = "ACCOUNTTYPEID")
	private String accountTypeId;

	@Basic(optional = false)
	@Column(name = "GLTYPEID")
	private String glTypeId;

	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 6, max = 6)
	@Basic(optional = false)
	@Column(name = "PARENTGL")
	private String parentGl;

	@Version
	@NotAudited
	@Basic(optional = false)
	@Column(name = "VERSION")
	private Long version;

	@NotAudited
	@OneToOne(mappedBy = "subsidiaryGl", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private Balance balance;

	public SubsidiaryGl() {
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountTypeId() {
		return accountTypeId;
	}

	public void setAccountTypeId(String accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public String getGlTypeId() {
		return glTypeId;
	}

	public void setGlTypeId(String glTypeId) {
		this.glTypeId = glTypeId;
	}

	public String getParentGl() {
		return parentGl;
	}

	public void setParentGl(String parentGl) {
		this.parentGl = parentGl;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Balance getBalance() {
		return balance;
	}

	public void setBalance(Balance balance) {
		this.balance = balance;
	}

}
*/
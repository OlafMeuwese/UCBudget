package org.olaf.ucbudget.server.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mutations", schema = "ucbudget")
public class Mutation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "account_id", foreignKey = @ForeignKey(name = "fk_mutations_account_id"))
    private Account account;

    @Column(length = 2)
    private String drCr;

    @Column(length = 10)
    private String type;

    @Column
    private BigDecimal amount;

    @Column
    @Temporal(TemporalType.DATE)
    private Date recordDate;

    @Column(length = 200)
    private String counterName;

    @Column(length = 200)
    private String counterAccountNumber;

    @Column
    private String description;

    public Mutation() {
    }

    public Mutation(Account account, String drCr, String type, BigDecimal amount, Date recordDate, String counterName,
                    String counterAccountNumber, String description) {
        this.account = account;
        this.drCr = drCr;
        this.type = type;
        this.amount = amount;
        this.recordDate = recordDate;
        this.counterName = counterName;
        this.counterAccountNumber = counterAccountNumber;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getDrCr() {
        return drCr;
    }

    public void setDrCr(String drCr) {
        this.drCr = drCr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getCounterName() {
        return counterName;
    }

    public void setCounterName(String counterName) {
        this.counterName = counterName;
    }

    public String getCounterAccountNumber() {
        return counterAccountNumber;
    }

    public void setCounterAccountNumber(String counterAccountNumber) {
        this.counterAccountNumber = counterAccountNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

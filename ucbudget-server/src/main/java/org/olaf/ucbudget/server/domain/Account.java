package org.olaf.ucbudget.server.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accounts", schema = "ucbudget")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_accounts_users_id"))
    private User user;

    @ManyToOne
    @JoinColumn(name="bank_id", foreignKey = @ForeignKey(name="FK_accounts_banks_id"))
    private Bank bank;

    @Column(length = 100)
    private String number;

    @Column(length = 50)
    private String type;

    @Column
    private BigDecimal balance;

    public Account() {
    }

    public Account(User user, Bank bank, String number, String type) {
        this(user, bank, number, type, new BigDecimal(0));
    }

    public Account(User user, Bank bank, String number, String type, BigDecimal balance) {
        this.user = user;
        this.bank = bank;
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}

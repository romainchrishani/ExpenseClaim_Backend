package com.ems.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;


@Entity
@Table(name =  "usersoo", uniqueConstraints = @UniqueConstraint(columnNames = "userName"))
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private String phoneNumber;

    @Column
    private String type;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))

    private Collection<Role> roles;

    @OneToMany(mappedBy = "employee")
    private Set<Rr> rrs;

    @OneToMany(mappedBy = "employee")
    private Set<Expense> expenses;

    @OneToMany(mappedBy = "employee")
    private Set<Opd> opds;

    @OneToMany(mappedBy = "employee")
    private Set<Reward> rewards;

    @OneToMany(mappedBy = "employee")
    private Set<OpdAmount> opdAmounts;

    //    @Enumerated
//    private CommonStatus status;
//
//    @OneToMany
//    private Set<EmployeeExpense> employeeExpenses;
//
//
//    @OneToMany
//    private Set<Reward> rewards;
//
//
//    @OneToMany
//    private Set<OpdAmount> opdAmounts;
//
//
//    @OneToMany
//    private Set<EmployeeOpd> employeeOpds;
//
//    @OneToMany
//    private Set<EmployeeRr> employeeRrs;


    public  Employee(){

    }

    public Employee( String firstName, String lastName,String email,  String userName, String password, String phoneNumber) {
        super();


        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    public Set<Rr> getRrs() {
        return rrs;
    }

    public void setRrs(Set<Rr> rrs) {
        this.rrs = rrs;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}

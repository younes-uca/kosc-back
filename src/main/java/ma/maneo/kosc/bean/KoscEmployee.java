package ma.maneo.kosc.bean;

import java.util.Objects;


import javax.persistence.*;


@Entity
@Table(name = "kosc_employee")
public class KoscEmployee {

    @Id
    @SequenceGenerator(name = "kosc_employee_seq", sequenceName = "kosc_employee_seq",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kosc_employee_seq")
    private Long id;

    @Column(length = 500)
    private String firstName;
    @Column(length = 500)
    private String lastName;
    @Column(length = 500)
    private String phone;
    @Column(length = 500)
    private String cellPhone;
    @Column(length = 500)
    private String email1;
    @Column(length = 500)
    private String email2;
    @Column(length = 500)
    private String email3;


    public KoscEmployee() {
        super();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellPhone() {
        return this.cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail1() {
        return this.email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return this.email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmail3() {
        return this.email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KoscEmployee koscEmployee = (KoscEmployee) o;
        return id != null && id.equals(koscEmployee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}


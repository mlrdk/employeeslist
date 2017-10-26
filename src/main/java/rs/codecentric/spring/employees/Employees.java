package rs.codecentric.spring.employees;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
    @Id
    private Long id;
    @Column
    private String name;

    @Column(name="user_id")
    private Long userId;

    @Column(name="first_name")
    private String first_name;

    public String getFirstName(){
        return first_name;
    }

    public void setFirstName(String first_name){
        this.first_name = first_name;
    }
}

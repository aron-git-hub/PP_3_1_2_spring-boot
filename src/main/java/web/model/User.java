package web.model;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Min(value = 1, message = "Should be greater than 0")
    @Column(name = "age")
    private byte age;

    @NotEmpty(message = "Shouldn't be empty")
    @Pattern(regexp = "^[a-zA-ZЁёА-я]{3,12}$",
            message = "3 to 12 length with no numbers and special characters")
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty(message = "Shouldn't be empty")
    @Pattern(regexp = "^[a-zA-ZЁёА-я]{3,12}$",
            message = "3 to 12 length with no numbers and special characters")
    @Column(name = "second_name")
    private String secondName;

    public User() {
    }

    public User(long id, byte age, String firstName, String secondName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}


import util.ParseCode;

public class Person implements People {

    private Long id;
    private String firstname;
    private String lastname;
    private String code;
    private Integer age;
    private String birthday;
    private String gender;
    private ParseCode parseCode;

    public Person(Long id, String firstname, String lastname, String code, Integer age, String birthday, String gender, ParseCode parseCode) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.code = code;
        this.parseCode = new ParseCode(this.code);
        this.setAge(this.parseCode);
        this.setBirthday(this.parseCode);
        this.setGender(this.parseCode);
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ParseCode getParseCode() {
        return parseCode;
    }

    public void setParseCode(ParseCode parseCode) {
        this.parseCode = parseCode;
    }

    private void setAge(ParseCode parseCode) {
        this.age=parseCode.getAge();
    }

    private void setBirthday(ParseCode parseCode) {
        this.birthday=parseCode.getBirthdey();
    }

    private void setGender(ParseCode parseCode) {
        this.gender=parseCode.getGender();
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", code=" + code + ", age=" + age + ", birthday=" + birthday + ", gender=" + gender + ", parseCode=" + parseCode + '}';
    }
    
}

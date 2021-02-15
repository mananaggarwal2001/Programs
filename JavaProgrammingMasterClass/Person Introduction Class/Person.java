public class Person {
    private String firstName;
    private String lastname;
    private int age;

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastname() {
        return this.lastname;
    }

    public int getAge() {
        return this.age;
    }
    public boolean isTeen(){
        if(age>12 && age<20){
            return true;
        }else{
            return false;
        }
    }
    public String getFullName() {
        boolean ValidFirsName = firstName.isEmpty();
        boolean ValidSecondName = lastname.isEmpty();
        if (ValidFirsName) {
            return getLastname();
        } else if (ValidSecondName) {
            return getFirstName();
        }
        return (getFirstName() +" "+ getLastname());
    }
}

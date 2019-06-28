public class Person {
    String firstName;
    String lastName;
    int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isTeen(){
        if(this.age < 13 && this.age < 20){
            return true;
        }
        return false;
    }
}

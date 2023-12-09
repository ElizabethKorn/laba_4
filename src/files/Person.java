package files;

/**
 * Класс человека.
 */
public class Person{

    /**
     * Персональный идентификатор человека.
     */
    private int ID;
    /**
     * Имя человека.
     */
    private String name;
    /**
     * Пол человека.
     */
    private String gender;
    /**
     * Подразделение в котором человек числится.
     */
    private Department department;
    /**
     * Зарплата человека.
     */
    private int salary;
    /**
     * Дата рождения человека.
     */
    private String date;

    /**
     * Конструктор по умолчанию.
     * Заполняет поля заглушками.
     */
    public Person(){
        ID = 0;
        name = "";
        gender = "";
        department = null;
        salary = 0;
        date = "";
    }

    /**
     * Конструктор по атрибутам класса.
     * @param ID целочисленный уникальный идентификатор человека.
     * @param name имя человека.
     * @param gender пол человека.
     * @param department подразделение.
     * @param salary зарплата.
     * @param date день рождения.
     */
    public Person(int ID,
                  String name,
                  String gender,
                  Department department,
                  int salary,
                  String date){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date;
    }

    public void setBirthday(String date) {
        this.date = date;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString(){
        return "ID: " + getID() + '\n' +
                "Имя: " + getName() + '\n' +
                "Пол: " + getGender() + '\n' +
                "Подразделение: " + getDepartment().toString() + '\n' +
                "Зарплата: " + getSalary() + '\n' +
                "Дата рождения: " + getDate();
    }
}
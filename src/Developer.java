public class Developer extends Employee{
    private final String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    public String toString() {
        return "Developer: " +
                ", id: '" + id + '\'' +
                ", name: '" + name + '\'' +
                ", salary: " + salary +
                ", programmingLanguage: '" + programmingLanguage + '\'' ;



    }
}

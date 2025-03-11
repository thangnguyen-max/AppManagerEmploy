public class Manager extends Employee {
    private final double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return super.getSalary() + super.getSalary() / 100 * bonus;
    }


    @Override
    public String toString() {
        return "Manager: " +
                ", id: '" + id + '\'' +
                ", name: '" + name + '\'' +
                ", salary: " + salary + '\'' +
                ", bonus: " + bonus;


    }
}

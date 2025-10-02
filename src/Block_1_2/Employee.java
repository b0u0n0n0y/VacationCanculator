package Block_1_2;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if (department == null || department.getName() == null) {
            return name + " не работает в отделе";
        }

        Employee head = department.getHead();

        if (head != null && head.getName() != null && head.getName().equals(this.name)) {
            return name + " начальник отдела " + department.getName();
        }

        if (head == null || head.getName() == null) {
            return name + " работает в отделе " + department.getName() + ", начальник которого не указан";
        }

        return name + " работает в отделе " + department.getName() + ", начальник которого " + head.getName();
    }

}

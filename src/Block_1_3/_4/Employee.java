package Block_1_3._4;

class Employee {
    String name;
    Department department;
    Employee nextInDepartment;

    Employee(String name) {
        this.name = name;
    }

    void setDepartment(Department department) {
        this.department = department;
        if (department != null) {
            department.addEmployee(this);
        }
    }

    @Override
    public String toString() {
        if (department == null || department.name == null) {
            return name + " не имеет отдела";
        }
        if (department.manager == null) {
            return name + " работает в отделе " + department.name + ", начальник не назначен";
        }
        if (department.manager == this) {
            return name + " начальник отдела " + department.name;
        }
        return name + " работает в отделе " + department.name + ", начальник которого " + department.manager.name;
    }


    String getDepartmentEmployeesInfo() {
        if (department == null || department.getFirstEmployee() == null) {
            return "Отдел не назначен или пустой";
        }
        StringBuilder sb = new StringBuilder();
        Employee current = department.getFirstEmployee();
        sb.append("Сотрудники отдела ").append(department.name).append(":\n");
        while (current != null) {
            sb.append("- ").append(current.name).append("\n");
            current = current.nextInDepartment;
        }
        return sb.toString();
    }
}
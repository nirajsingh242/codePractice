package hashmapExamples;

import java.math.BigDecimal;
import java.util.Date;

public  final class EmployeeBuilder {
        private long id;
        private String name;
        private Date dateOfBirth;
        private BigDecimal salary;

        private EmployeeBuilder() {
        }

        public static EmployeeBuilder anEmployee() {
            return new EmployeeBuilder();
        }

        public static EmployeeBuilder anEmployee(Employee employee) {
            return anEmployee().withId(employee.getId()).withName(employee.getName()).withDateOfBirth(employee.getDateOfBirth()).withSalary(employee.getSalary());
        }

        public EmployeeBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder withDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public EmployeeBuilder withSalary(BigDecimal salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

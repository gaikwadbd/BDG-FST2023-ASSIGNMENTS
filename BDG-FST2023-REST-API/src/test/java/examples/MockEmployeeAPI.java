package examples;

public class MockEmployeeAPI {
        private String firstname;
        private String lastname;
        private String gender;
        private int age;
        private double salary;
        private MockAddressAPI address;
        public String getFirstname() {
            return firstname;
        }
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }
        public String getLastname() {
            return lastname;
        }
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public double getSalary() {
            return salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
        @Override
        public String toString() {
            return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", age=" + age
                    + ", salary=" + salary + "]";
        }
        public MockAddressAPI getAddress() {
            return address;
        }
        public void setAddress(MockAddressAPI address) {
            this.address = address;
        }
    }


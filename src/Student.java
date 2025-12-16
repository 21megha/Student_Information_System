public class Student {
        private String name;
        private int grade;
        private int age;
        private int studentId;
        private String contact;

        public Student(String name , int grade, int age , int studentId , String contact){
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.studentId = studentId;
            this.contact = contact;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade){
            this.grade = grade;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) throws ArithmeticException {
            if(age >0) this.age = age;
            else throw new ArithmeticException("Age must be positive");
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;

        }

        public void display_stu_info(){
            System.out.printf("%-8d %-15s %-5d %-7d %-15s\n",
                    studentId, name, age, grade, contact);
        }

}

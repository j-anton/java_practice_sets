public class Encapsulation {
    
    public class Student{
        private int studentId;
        private String studentName;
        private String collegeName;
        private String address;
    

        public void setStudentId(int id){ 
            this.studentId = id; 
        }

        public void setStudentName(String name){ 
            this.studentName = name; 
        }

        public void setCollegeName(String name){
            this.collegeName = name;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public int getStudentId(){
            return this.studentId;
        }

        public String getStudentName(){
            return this.studentName;
        }

        public String getCollegeName(){
            return this.collegeName;
        }

        public String getAddress(){
            return this.address;
        }

    }

    public static void main(String[] args){
        Encapsulation example = new Encapsulation();
        example.run();
    }

    public void run(){
        Student student = new Student();
        student.setStudentName("j-anton");
        student.setStudentId(1337);
        student.setCollegeName("University of Antarctica");
        student.setAddress("1600 Pennsylvania Ave NW, Washington, DC");
        
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentId());
        System.out.println(student.getCollegeName());
        System.out.println(student.getAddress());
    
    }
}

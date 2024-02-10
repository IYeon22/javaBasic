package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = crateStudent("학생1", 15,90);
        Student student2 = crateStudent("학생2", 15,90);

        printStudent(student1);
        printStudent(student2);
    }

    //학생 만들기
    static Student  crateStudent (String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student; //student의 참조값을 리턴 -> 리턴을 해주니까 밖에가서 쓸 수 있음
    }
    static  void printStudent(Student student1){
        System.out.println("이름: " + student1.name + "나이: "+ student1.age + "성적: "+ student1.grade);
    }
}

package ClassStart1;

public class ClassStart5 {
    public static void main(String[] args) {
        Studennt studennt1 = new Studennt();
        studennt1.name = "학생1";
        studennt1.age = 15;
        studennt1.grade = 90;

        Studennt studennt2 = new Studennt();
        studennt2.name = "학생2";
        studennt2.age = 16;
        studennt2.grade= 80;

        Studennt[] student = new Studennt[]{studennt1,studennt2};   //배열 생성과 동시에 선언

        for(int i =0; i<student.length; i++){
            System.out.println("이름: " + student[i].name + "나이: "+ student[i].age + "성적: "+ student[i].grade);
        }

        //요렇게 객테를 s라는 변수에 담아서 간단하게 사용가능!
        for(Studennt s :  student){
            System.out.println("이름: " + s.name + "나이: "+ s.age + "성적: "+ s.grade);
        }

    }
}

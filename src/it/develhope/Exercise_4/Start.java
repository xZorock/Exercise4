package it.develhope.Exercise_4;

public class Start {

    public static void main(String[] args) {

        Student student1 = new Student("Jason");
        Student student2 = new Student("Marco");

        Teacher teacher = new Teacher();

        teacher.setTeacherName("Giovanni Paolo");


        teacher.assignGrade(student1, 8);
        teacher.assignGrade(student2, 7);

        student1.getStudentDetails();
        student2.getStudentDetails();

    }
}

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher aida = new Teacher(1,"Aida",500);
        Teacher aiperi = new Teacher(2,"Aiperi",700);
        Teacher erkinai = new Teacher(3,"Erkinai",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(aida);
        teacherList.add(aiperi);
        teacherList.add(erkinai);


        Student aigul = new Student(1,"Aigul",4);
        Student aizhan = new Student(2,"Aizhan",12);
        Student daniel = new Student(3,"Daniel",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(aigul);
        studentList.add(aizhan);
        studentList.add(daniel);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        aigul.payFees(5000);
        aizhan.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        aida.receiveSalary(aida.getSalary());
        System.out.println("GHS has spent for salary to " + aida.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        erkinai.receiveSalary(erkinai.getSalary());
        System.out.println("GHS has spent for salary to " + erkinai.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(daniel);

        aiperi.receiveSalary(.getSalary());

        System.out.println(aiperi);


    }
}

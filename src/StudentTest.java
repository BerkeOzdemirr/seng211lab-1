 public class StudentTest {
        public static void main(String[] args){
            Student s1 = new Student();
            System.out.println("Name: " + s1.name);
            System.out.println("Age: " + s1.age);
            System.out.println("Gender: " + s1.gender);
            System.out.println("Junior: " + s1.isJunior);

            s1.age = 21;
            s1.name = "Berke";
            s1.isJunior = true;
            s1.gender = 'm';

            s1.info();

        }
}


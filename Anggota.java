public class Anggota extends Manusia {
   float salary = 4000f;
   String name = "duppi";
   int age = 16;

   public void showInfo(){
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + super.age);
        System.out.println("Salary: $" + salary);
    }
}
   



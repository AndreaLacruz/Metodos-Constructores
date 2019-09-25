import ar.com.ada.opp.instatiation.Person;
import ar.com.ada.opp.overloading.Arithmetics;


public class App {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setAge(33);
        Person person2 = new Person("Andrea");
        person2.setName("Andrea");

        Person person3 = new Person("Andrea" ,"Lacruz");
        person3.setName("Andrea");
        person3.setLastName("Lacruz");


        Person person4 = new Person("Andrea", "Lacruz", 26);
        person4.setName("Andrea");
        person4.setLastName("Lacruz");
        person4.setAge(26);

        System.out.println("El usuario es: " + person1.getAge() );
        System.out.println("El usuario es: " + person2.getName() );
        System.out.println("El usuario es: " + person3.getName() + " " + person3.getLastName() );
        System.out.println("El usuario es: " + person4.getName() +" " + person4.getLastName() +" " +  person4.getAge() );


        Arithmetics suma = new Arithmetics();

        int result1 = suma.sum(2 , 4);
        System.out.println("El resultado de la suma de 2 y 4 es: " + result1);

        double result2 = suma.sum(3.2 ,8);
        System.out.println("El resultado de la suma de 3,2 y 8 es: " + result2);

        Double result3 = suma.sum(5.2 , 9.4);
        System.out.println("El resultado de la suma de 5,2 y 9,4 es: " + result3);

        Integer n1 = 1, n2 = 1;
        Integer result4 = suma.sum(1 , 1);
        System.out.println("El resultado de la suma de " + n1+ " y " + n2 + " es: " + result4);

    }
}
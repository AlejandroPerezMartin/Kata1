package kata1;

import java.util.Date;

public class Kata1 {

    public static void main( String[] args ) {
        Student student = new Student( "Ale", new Date(92,2,25) );
        System.out.println( student.getAge() );
        System.out.println( student.getName() );
        System.out.println( student.getBirthDate() );
    }
}

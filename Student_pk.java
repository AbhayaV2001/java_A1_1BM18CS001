
package CIE;



import java.util.*;



public class Student_pk {

    String name, usn;

    int sem;

    

    Student_pk() {

        System.out.println("Enter Name, USN, Sem");

        Scanner sc = new Scanner(System.in);

        name = sc.next();

        usn = sc.next();

        sem = sc.nextInt();

    }

}

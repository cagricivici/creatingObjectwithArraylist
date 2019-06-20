import java.util.ArrayList;
import java.util.List;

public class mainClass {

    public static void main(String[] args){
        studentClass s1 = new studentClass();
        s1.setName("cagri");
        s1.setSurname("civici");
        s1.setAge(25);

        //creating multiobject using for loop
        List<studentClass> std = new ArrayList<studentClass>();
        for(int i=0;i<4;i++){
             std.add(new studentClass());
        }

        std.get(0).setName("cagri");
        std.get(0).setSurname("civici");
        std.get(0).setAge(30);

        std.get(1).setName("cagri1");
        std.get(1).setSurname("civici1");
        std.get(1).setAge(301);

        std.get(2).setName("cagri2");
        std.get(2).setSurname("civici2");
        std.get(2).setAge(302);

        std.get(3).setName("cagri3");
        std.get(3).setSurname("civici3");
        std.get(3).setAge(303);

        System.out.println(s1.getName());
        System.out.println(s1.getSurname());
        System.out.println(s1.getAge());

        System.out.println("\n");

        System.out.println(std.get(0).getName());
        System.out.println(std.get(0).getSurname());
        System.out.println(std.get(0).getAge());

        System.out.println("\n");

        ArrayList <String> names = new ArrayList <String>();
        for(int i=0;i<std.size();i++){
            names.add(std.get(i).getName());
        }

        ArrayList <String> surnames = new ArrayList <String>();
        for(int i=0;i<std.size();i++){
            surnames.add(std.get(i).getSurname());
        }

        ArrayList <Integer> ages = new ArrayList<Integer>();
        for(int i=0;i<std.size();i++){
            ages.add(std.get(i).getAge());
        }

        System.out.println(names);
        System.out.println(surnames);
        System.out.println(ages);










    }
}

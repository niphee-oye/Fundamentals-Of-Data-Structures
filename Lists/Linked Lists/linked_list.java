import java.util.Iterator;
import java.util.LinkedList;

public class linked_list{
    public static void main(String[] args){
        LinkedList<String> Subjects = new LinkedList<String>();
        Subjects.add("Mathematics");
        Subjects.add("English");
        Subjects.add("Physics");
        Subjects.add("Biology");
        Subjects.add("Chemistry");

        Iterator<String> itr = Subjects.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(Subjects);

        Subjects.add(2, "Philosophy");
        System.out.println(Subjects);

        Subjects.remove( "Biology");
        System.out.println(Subjects);
    }
}
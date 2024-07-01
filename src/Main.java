import java.util.HashSet;
import java.util.Iterator;

/*
Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(makeHashSet());
        HashSet<String> students = makeHashSet();
        String a = "Eva";
        students.add(a);
        System.out.println(students);

        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            if(element.equals(a)){
                iterator.remove();
            }
        }

        students.clear();
        System.out.println(students);

    }

    public static HashSet<String> makeHashSet(){
        HashSet<String> student = new HashSet<>();
        student.add("Luca");
        student.add("Mario");
        student.add("Olivia");

        return student;
    }
}
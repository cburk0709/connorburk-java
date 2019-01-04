import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        names.add("Billy");
        names.add("Johns");
        names.add("Tims");
        names.add("Sally");
        System.out.print("add a name: ");
        names.add(input.next());
        System.out.println(names);
        removePlural(names);
    }
    public static void removePlural(ArrayList<String> nameList){
        for(int i = 0; i < nameList.size(); i++){
            String access = nameList.get(i);
            if(access.endsWith("s")){
                nameList.remove(i);
                i--;
            }
        }
        System.out.println(nameList);
    }
}

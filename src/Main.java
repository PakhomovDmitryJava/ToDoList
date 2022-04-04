import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

// The main method must be in a class named "Main".
class Main {

    public static void main(String[] args)
    {
        ArrayList<String> toDoList = new ArrayList<>(){{
            add("To learn JAVA");
            add("To cook dinner");
            add("To clean the apartment");
            add("To play with daughter");
            add("To meet with friends");
        }};

        System.out.println("If you want to see your toDo list - input LIST. " + "\nIf you want to add a case, please, input ADD and then number of urgency if you want."
                + "\nIf you want to edit cases - input EDIT and number of case. "  + "\nIf you want to delete - input DELETE and number of case.");

        Scanner scanner = new Scanner(System.in);
        String command1 = new String();
        String command2 = new String();
        String command3 = new String();

        command1 = scanner.nextLine();
        command2 = scanner.nextLine();
        command3 = scanner.nextLine();

        if (command1.equals("LIST"))
        {
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println("# " + (i + 1) + " " + toDoList.get(i));
                
            }
        }
        else if (command1.equals("ADD") && command2 == "")
        {
            toDoList.add(command3);

        }
        else if (command1.equals("ADD") && command2 != "")
        {
            int i = Integer.parseInt(command2);
            toDoList.add(i - 1, command3);
        }
        else if (command1.equals("EDIT") && command2 != "")
        {
            int i = Integer.parseInt(command2);
            toDoList.remove(i - 1);
            toDoList.add(i - 1, command3);
        }
        else if (command1.equals("EDIT") && command2 != "")
        {
            int i = Integer.parseInt(command2);
            toDoList.remove(i - 1);
            toDoList.add(i - 1, command3);
        }
        else if (command1.equals("DELETE"))
        {
            int i = Integer.parseInt(command2);
            toDoList.remove(i - 1);
        }

        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("# " + (i + 1) + " " + toDoList.get(i));

        }
     }
}
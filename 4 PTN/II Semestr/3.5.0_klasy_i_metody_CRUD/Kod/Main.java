import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new UserData());

        
        menu.menu();
    }
}

class UserData {
    ArrayList<String> userDataList = new ArrayList<String>();
    
}

class Menu {
    private UserData userData;

    public Menu(UserData userData) {
        this.userData = userData;
    }

    public void add() {
        System.out.println("\n\tadd");
        System.out.println("\n\tadd");
        // Assuming you want to add a new string to the userDataList
        userData.userDataList.add("New data");
    }

    public void output() {
        System.out.println("\n\toutput");
    }

    public void edit() {
        System.out.println("\n\tedit");
    }

    public void delete() {
        System.out.println("\n\tdelete");
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("\n\nMenu" + "\n\t1 - Add\n\t2 - Output\n\t3 - Edit\n\t4 - Delete\n\t5 - Exit\n\n\tChoice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                add();
            } else if (choice == 2) {
                output();
            } else if (choice == 3) {
                edit();
            } else if (choice == 4) {
                delete();
            } else if (choice == 5) {
                System.out.println("\n\tbye bye 👋");
            } else {
                System.out.println("\n\tInvalid choice");
            }
        } while (choice != 5);
    }
}

class SaveReadFile {
    public void saveFile() {
        System.out.println("\n\tsave file");
    }

    public void readFile() {
        System.out.println("\n\tread File");
    }
}

class OutputData {
    public void outputSpecificData() {
        System.out.println("\n\toutput specific data");
    }

    public void outputAllData() {
        System.out.println("\n\toutput all data");
    }

}

class EditData {
    public void addData() {
        System.out.println("\n\tadd data");
    }

    public void editData() {
        System.out.println("\n\tedit data");
    }

    public void deleteData() {
        System.out.println("\n\tdelete data");
    }
}
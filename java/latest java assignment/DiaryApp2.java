import java.util.Scanner;

public class DiaryApp2 {

    static String password = ""; 
    static String[] entries = new String[10]; 
    static String[] titles = new String[10]; 
    static int entryCount = 0;
    static boolean isLocked = false; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to💜AZSecret💜 DiaryApp📑!");
        System.out.println("This diary will keep your secrets safe.");
        System.out.println("No Casting .....dont panic 😎");

    
       
        		System.out.print("Set your diary password🔐: ");
       			 password = scanner.nextLine(); 

        
        while (true) {
            if (isLocked) {
                System.out.print("Enter password to unlock🔑: ");
                String enteredPassword = scanner.nextLine();
                if (enteredPassword.equals(password)) {
                    isLocked = false;
                    System.out.println("Diary unlocked!");
                } else {
                    System.out.println("Wrong password.");
                    continue;
                }
            }

           
            System.out.println("\nDiary Menu:");
            System.out.println("1. Add Entry");
            System.out.println("2. Save Entry with Title");
            System.out.println("3. Edit Entry");
            System.out.println("4. Change Password");
            System.out.println("5. Update Entry");
            System.out.println("6. Delete Entry");
            System.out.println("7. Find Entry by Title");
            System.out.println("8. Lock Diary");
            System.out.println("9. Exit");

           
            System.out.print("Choose an option (1-9): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            
            if (choice == 1) {
                addEntry(scanner);
            } else if (choice == 2) {
                saveEntry(scanner);
            } else if (choice == 3) {
                editEntry(scanner);
            } else if (choice == 4) {
                changePassword(scanner);
            } else if (choice == 5) {
                updateEntry(scanner);
            } else if (choice == 6) {
                deleteEntry(scanner);
            } else if (choice == 7) {
                findEntry(scanner);
            } else if (choice == 8) {
                lockDiary();
            } else if (choice == 9) {
                System.out.println("Mekue!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

      
    }

   
    public static void addEntry(Scanner scanner) {
        if (entryCount < 10) {
            System.out.print("Write your diary entry💭: ");
            entries[entryCount] = scanner.nextLine(); 
            entryCount++;
            System.out.println("Entry added!✅");
        } else {
            System.out.println("Diary is full.💀");
        }
    }

   
    public static void saveEntry(Scanner scanner) {
        if (entryCount == 0) {
            System.out.println("No entries to save.");
        } else {
            System.out.print("Enter a title for your entry😊: ");
            titles[entryCount - 1] = scanner.nextLine(); 
            System.out.println("Entry saved with title: " + titles[entryCount - 1]);
        }
    }

   
    public static void editEntry(Scanner scanner) {
        if (entryCount == 0) {
            System.out.println("No entries to edit.");
        } else {
            System.out.print("Enter the title of the entry to edit: ");
            String title = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < entryCount; i++) {
                if (titles[i].equals(title)) {
                    System.out.print("Edit your entry: ");
                    entries[i] = scanner.nextLine(); 
                    found = true;
                    System.out.println("Entry updated!");
                    break;
                }
            }
            if (!found) {
                System.out.println("No entry found with that title.");
            }
        }
    }

    public static void changePassword(Scanner scanner) {
        System.out.print("Enter a new password: ");
        password = scanner.nextLine();
        System.out.println("Password changed!");
    }

    
    public static void updateEntry(Scanner scanner) {
        if (entryCount == 0) {
            System.out.println("No entries to update.");
        } else {
            System.out.print("Enter the title of the entry to update: ");
            String title = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < entryCount; i++) {
                if (titles[i].equals(title)) {
                    System.out.print("Update your entry: ");
                    entries[i] = scanner.nextLine(); 
                    found = true;
                    System.out.println("Entry updated!");
                    break;
                }
            }
            if (!found) {
                System.out.println("No entry found with that title.");
            }
        }
    }

    
    public static void deleteEntry(Scanner scanner) {
        if (entryCount == 0) {
            System.out.println("No entries to delete.");
        } else {
            System.out.print("Enter the title of the entry to delete: ");
            String title = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < entryCount; i++) {
                if (titles[i].equals(title)) {
                    entries[i] = null; 
                    titles[i] = null;
                    entryCount--; 
                    found = true;
                    System.out.println("Entry deleted!");
                    break;
                }
            }
            if (!found) {
                System.out.println("No entry found with that title.");
            }
        }
    }

    
    public static void findEntry(Scanner scanner) {
        if (entryCount == 0) {
            System.out.println("No entries to search.");
        } else {
            System.out.print("Enter the title of the entry to find: ");
            String title = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < entryCount; i++) {
                if (titles[i].equals(title)) {
                    System.out.println("Entry found: " + entries[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No entry found with that title.");
            }
        }
    }

   
    public static void lockDiary() {
        isLocked = true;
        System.out.println("Diary locked!🔐");
    }
}

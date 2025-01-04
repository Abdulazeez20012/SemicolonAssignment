import java.util.Scanner;

public class DiaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       			 String[] diaryIds = new String[10]; 
       			 String[] diaryContents = new String[10];  

        boolean isLocked = false;
        String password = "password123"; 
        int entryCount = 0;


        while (true) {
            if (isLocked) {
                System.out.print("Enter password to unlock the diary: ");
                String inputPassword = scanner.nextLine();
                if (inputPassword.equals(password)) {
                    isLocked = false;
                    System.out.println("Diary unlocked!");
                } else {
                    System.out.println("Incorrect password.");
                    continue;
                }
            }

           			 System.out.println("\nDiary Menu:");
          			 System.out.println("1. Add Entry");
          			 System.out.println("2. Update Entry");
          			 System.out.println("3. Delete Entry");
          			 System.out.println("4. Find Entry by ID");
          			  System.out.println("5. Lock Diary");
          			  System.out.println("6. Exit");

            					System.out.print("Choose an option: ");
           					int choice = scanner.nextInt();
            					scanner.nextLine(); 

            if (choice == 1) {
               
                if (entryCount < 10) {
                    System.out.print("Enter ID for new entry: ");
                    diaryIds[entryCount] = scanner.nextLine();
                    System.out.print("Enter content for new entry: ");

                    diaryContents[entryCount] = scanner.nextLine();
                    entryCount++;

                    System.out.println("Entry added successfully!");
                } else {
                    System.out.println("Diary is full.");
                }
            } else if (choice == 2) {
               
                System.out.print("Enter ID of the entry to update: ");
                String updateId = scanner.nextLine();


                boolean found = false;
                for (int i = 0; i < entryCount; i++) {
                    if (diaryIds[i].equals(updateId)) {
                        System.out.print("Enter new content for the entry: ");


                        diaryContents[i] = scanner.nextLine();
                        found = true;
                        System.out.println("Entry updated successfully!");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Entry not found.");


                }
            } else if (choice == 3) {
                
                System.out.print("Enter ID of the entry to delete: ");
                String deleteId = scanner.nextLine();
                boolean found = false;
                for (int i = 0; i < entryCount; i++) {
                    if (diaryIds[i].equals(deleteId)) {
                       

                      		  for (int j = i; j < entryCount - 1; j++) {
                           		 diaryIds[j] = diaryIds[j + 1];
                           		 diaryContents[j] = diaryContents[j + 1];

				 }
                       		diaryIds[entryCount - 1] = null;
                       		diaryContents[entryCount - 1] = null;
                        	entryCount--;
                        	found = true;
                        	System.out.println("Entry deleted successfully!");
                        	break;
                    }
                }
                if (!found) {
                    System.out.println("Entry not found.");
                }
            } else if (choice == 4) {
               
                System.out.print("Enter ID of the entry to find: ");
                String findId = scanner.nextLine();
                boolean found = false;
                for (int i = 0; i < entryCount; i++) {
                    if (diaryIds[i].equals(findId)) {
                        System.out.println("Entry found:");
                        System.out.println("ID: " + diaryIds[i]);
                        System.out.println("Content: " + diaryContents[i]);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Entry not found.");
                }
            } else if (choice == 5) {
               
                isLocked = true;
                System.out.println("Diary locked!");
            } else if (choice == 6) {
              
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        
    }
}

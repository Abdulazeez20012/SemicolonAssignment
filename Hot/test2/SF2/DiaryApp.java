package SF2;

import java.util.Scanner;

public class DiaryApp {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        if (userName.isBlank()) {
            System.out.println("Name cannot be empty. Please enter your name.");
            return;
        }

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (password.isBlank()) {
            System.out.println("Password cannot be empty. Please enter your password.");
            return;
        }

        Diary diary = new Diary(userName, password);

        if (!diary.unLockDiary(password)) {
            System.out.println("Diary unlocked successfully!");

            String menu = """
                    Select an option:
                    1. Create a new entry
                    2. Update an existing entry
                    3. Delete an entry
                    4. View an entry
                    5. Lock diary
                    6. Unlock diary
                    7. Exit""";

            while (true) {
                System.out.println(menu);
                String choice = scanner.nextLine();
                if (choice.isBlank()) break;

                switch (choice) {
                    case "1":
                        System.out.print("Enter entry title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter entry content: ");
                        String content = scanner.nextLine();
                        diary.createEntry(title, content);
                        System.out.println("Entry created successfully.");
                        break;

                    case "2":
                        System.out.print("Enter the ID of the entry to update: ");
                        int updateId = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter new title: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("Enter new content: ");
                        String newContent = scanner.nextLine();
                        diary.updateEntry(updateId, newTitle, newContent);
                        System.out.println("Entry updated successfully.");
                        break;

                    case "3":
                        System.out.print("Enter the ID of the entry to delete: ");
                        int deleteId = Integer.parseInt(scanner.nextLine());
                        diary.deleteEntry(deleteId);
                        System.out.println("Entry deleted.");
                        break;

                    case "4":
                        System.out.print("Enter the ID of the entry to view: ");
                        int viewId = Integer.parseInt(scanner.nextLine());
                        Entry entry = diary.findEntryById(viewId);
                        if (entry != null) {
                            String details = "ID: " + entry.getId() + "\n"
                                    + "Title: " + entry.getTitle() + "\n"
                                    + "Content: " + entry.getContent() + "\n"
                                    + "Created On: " + entry.getDateCreated();
                            System.out.println(details);
                        } else {
                            System.out.println("No entry found with that ID.");
                        }
                        break;

                    case "5":
                        diary.isLocked();
                        System.out.println("Diary has been locked.");
                        break;

                    case "6":
                        System.out.print("Enter the password to unlock your diary: ");
                        String unlockPass = scanner.nextLine();
                        if (diary.unLockDiary(unlockPass)) {
                            System.out.println("Diary unlocked successfully!");
                        } else {
                            System.out.println("Incorrect password. Diary remains locked.");
                        }
                        break;

                    case "7":
                        System.out.println("Exiting the Diary App. Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                        break;
                }
            }
        } else {
            System.out.println("Unable to unlock your diary.");
            return;
        }

    }
}


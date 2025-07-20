import java.util.Arrays;
import java.util.Scanner;

class Library {
    String[] bookNames = {
            "The Catcher in the Rye",
            "To Kill a Mockingbird",
            "1984",
            "The Great Gatsby",
            "Harry Potter and the Sorcerer's Stone",
            "The Hobbit",
            "Pride and Prejudice",
            "The Lord of the Rings",
            "The Hunger Games",
            "The Da Vinci Code",
            "The Chronicles of Narnia",
            "Brave New World",
            "Fahrenheit 451",
            "Moby-Dick",
            "War and Peace",
            "One Hundred Years of Solitude",
            "The Shining",
            "The Hitchhiker's Guide to the Galaxy",
            "The Grapes of Wrath",
            "Sapiens: A Brief History of Humankind"
    };

    public String[] arrayBookAdd(String[] arr, String book) {
        String[] newArray = new String[arr.length + 1];
        for (int index = 0; index < arr.length; index++) {
            newArray[index] = arr[index];
        }
        newArray[arr.length] = book;
        Arrays.sort(newArray);
        return newArray;
    }

    public String[] arrayBookIssue(String[] arr, int book) {
        String[] newArray = new String[arr.length - 1];
        int i = 0;
        for (int index = 0; index < arr.length - 1; index++) {
            if (book == index + 1) {
                newArray[index] = arr[i + 1];
                i += 2;
            } else {
                newArray[index] = arr[i];
                i += 1;
            }
        }
        return newArray;
    }

    public void addBook() {
        System.out.print("Enter the book name :  ");
        Scanner sc = new Scanner(System.in);
        String bookAdd = sc.nextLine();
        sc.close();
        Arrays.sort(bookNames);
        bookNames = arrayBookAdd(bookNames, bookAdd);
    }

    public void issueBook() {
        System.out.print("Enter the book serial no. :  ");
        Scanner sc = new Scanner(System.in);
        int bookIssue = sc.nextInt();
        sc.close();
        Arrays.sort(bookNames);
        bookNames = arrayBookIssue(bookNames, bookIssue);
    }

    public void returnBook() {
        System.out.print("Enter the book name :  ");
        Scanner sc = new Scanner(System.in);
        String bookReturn = sc.nextLine();
        sc.close();
        Arrays.sort(bookNames);
        bookNames = arrayBookAdd(bookNames, bookReturn);
    }

    public void showAvailableBooks() {
        System.out.println("Available Books :");
        Arrays.sort(bookNames);
        int i = 1;
        for (String book : bookNames) {
            System.out.println("\t" + i + ". " + book);
            i += 1;
        }
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        System.out.println("\n\t: Welcome to Sourav's Online Library :");
        Library lib = new Library();
        while (true) {
            System.out.println("\n1. Add new books");
            System.out.println("2. Issue books");
            System.out.println("3. Return books");
            System.out.println("4. See available books");
            System.out.println("5. Exit the library");
            System.out.print("\tYou want to (Press No.) :  ");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            sc.close();
            switch (userInput) {
                case 1:
                    lib.addBook();
                    break;
                case 2:
                    lib.issueBook();
                    break;
                case 3:
                    lib.returnBook();
                    break;
                case 4:
                    lib.showAvailableBooks();
                    break;
                case 5:
                    System.out.println("Exiting the Library...");
                    System.exit(0);
                default:
                    System.out.println("INVALID OPTION");
            }
        }
    }
}

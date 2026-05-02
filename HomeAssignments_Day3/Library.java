package HomeAssignments_Day3;

public class Library {
    public String addBook(String bookTitle){
        System.out.println("Book added successfully");
        return(bookTitle);

    }
        public void issueBook(){
            System.out.println("Book issued successfully");
        }

        public static void main(String[] args) {
            Library lib=new Library();
             lib.addBook( "Java Basics");
             lib.issueBook();


        }
    
    }



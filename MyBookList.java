// MyBookList.java

public class MyBookList {

    public static void main(String[] args) { 
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book book2 = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018);
        Book book4 = new Book("Java Programming", "John Doe", 2020);
        Book book5 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979);

        System.out.println("--- Initial Book Details ---");

        // 2.) Display the initial details of each book
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();

        System.out.println("\n--- Updating Pages and Author ---");

        // 3.) Change the current page
        book1.changePage(50); 
        book3.changePage(100); 
        
        // 4.) Change the current page for your favorite book
        book5.changePage(42); 

        // 5.) Change the author
        book4.changeAuthor("Jane Smith"); 

        System.out.println("\n--- Updated Details for Changed Books ---");
        book1.displayDetails();
        book3.displayDetails();
        book5.displayDetails();
        book4.displayDetails();

        // 6.) Array and loop to display titles published after 2010.
        Book[] myBooks = {book1, book2, book3, book4, book5};
        System.out.println("\n--- Books Published After 2010 📅 ---");
        for (Book book : myBooks) {
            if (book.getYearPublished() > 2010) {
                System.out.println(book.getTitle()); 
            }
        }
    }

} // <-- Closing brace for MyBookList class added here

// ----------------------------------------------------------------------
// The Book class is defined below. The 'public' keyword is removed
// so it can coexist with the public MyBookList class in the same file.
// ----------------------------------------------------------------------



// AI THA USE - ChatGPT-5 
// Conversation with AI link
// https://chatgpt.com/share/68e22c7f-8754-8005-a420-8bb634473d52






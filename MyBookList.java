/**
 * MyBookList.java
 *
 * Demonstrates creating and manipulating Book objects.
 */
public class MyBookList {
    public static void main(String[] args) {
        // 1.) Create the following books that contain the title, author, year published.
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book book2 = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018);
        Book book4 = new Book("Java Programming", "John Doe", 2020);
        Book book5 = new Book("The Pragmatic Programmer", "Andrew Hunt", 1999); // my favorite book

        // 2.) Display the details of each book using the displayDetails method.
        System.out.println("=== Initial Book Details ===");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();

        // 3.) Change the current page of "Rich Dad Poor Dad" to 50
        //     and "Atomic Habits" to 100 using the changePage method.
        book1.changePage(50);
        book3.changePage(100);

        System.out.println("\n=== After Changing Pages (Rich Dad Poor Dad & Atomic Habits) ===");
        book1.displayDetails();
        book3.displayDetails();

        // 4.) Change the current page of your favorite book to any page number you like.
        book5.changePage(75);
        System.out.println("\n=== After Changing Favorite Book Page ===");
        book5.displayDetails();

        // 5.) Change the author of "Java Programming" to "Jane Smith".
        book4.setAuthor("Jane Smith");
        System.out.println("\n=== After Changing Java Programming Author ===");
        book4.displayDetails();

        // 6.) Create an array of Book objects to store all the books you created.
        Book[] books = { book1, book2, book3, book4, book5 };

        System.out.println("\n=== Books Published After 2010 ===");
        for (Book b : books) {
            if (b.getYearPublished() > 2010) {
                System.out.println(b.getTitle());
            }
        }
    }
}

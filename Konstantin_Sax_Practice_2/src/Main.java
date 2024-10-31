public class Main {
    public static void main(String[] args) {
        Author author = new Author(
                "Test Person",
                "TestPreson@TestMail.com",
                'U'
        );
        System.out.println(author.getString());
    }
}
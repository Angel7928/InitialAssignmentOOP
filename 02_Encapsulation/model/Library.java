package model;
public class Library {
    private String title;
    private String author;
    private int availableCopies;

    public Library(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getAvailableCopies(int x) {
        availableCopies = availableCopies - x;
        return availableCopies;
    }

    public void borrowCopy() {
        if (availableCopies > 0) {
            availableCopies--;
        } else {
            System.out.println("Error: No copies available to borrow.");
        }
    }
    public void returnCopy() {
        availableCopies++;
        System.out.println("You have returned a copy of " + title);
    }
}

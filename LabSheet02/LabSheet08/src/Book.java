
public class Book {
	 	private String title;
	    private Author author;
	    private int pages;

	    public Book(String title, Author author, int pages) {
	        this.title = title;
	        this.author = author;
	        this.pages = pages;
	    }

	    public String getTitle() {
	        return this.title;
	    }

	    public Author getAuthor() {
	        return this.author;
	    }

	    public int getPages() {
	        return this.pages;
	    }

	    public void setPages(int page) {
	        this.pages = page;
	    }

	    public String toString() {
	        return getTitle() + " has " + getPages() + " pages write by " + author.toString();
	    }
}

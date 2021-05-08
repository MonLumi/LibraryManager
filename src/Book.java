public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed = false;

    public Book (String id, String  title, String author, boolean borrowStatus) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = borrowStatus;
    }

    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public boolean getIsBorrowed(){
        return isBorrowed;
    }
    public void setBorrowed(boolean isBorrowed){
        this.isBorrowed = isBorrowed;
    }

}

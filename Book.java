public class Book {
    private String author;
    private String name;
    private String postDate;

    private String DEFAULT_VALUE = "Not indicated";

    public Book(String author, String name, String postDate){
        this.author = author;
        this.name = name;
        this.postDate = postDate;
    }

    public Book(String author, String name){
        this.author = author;
        this.name = name;
        this.postDate = DEFAULT_VALUE;
    }

    public void SetAuthor(String author){
        this.author = author;
    }

    public void SetName(String name){
        this.name = name;
    }

    public void SetPostDate(String date){
        this.postDate= date;
    }

    public String GetAuthor(){
        return this.author;
    }

    public String GetName(){
        return this.name;
    }

    public String GetPostDate(){
        return this.postDate;
    }

    public String toString(){
        return "author " + this.author + ", name " + this.name + " post date  " + postDate;
    }
}

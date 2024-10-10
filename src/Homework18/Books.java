package Homework18;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Books {
    public static void main(String... args){
        List<Book> books = Arrays.asList(
                new Book("Harry Potter","J.K.Rowling",1997),
                new Book("De veghe in lanul de secara","J.D.Salinger",1951),
                new Book("After","Anna Todd",2013)
        );
        Map<String,List<String>> authors = books.stream()
                . filter(book -> book.getYear()<2000)
                .collect(Collectors.groupingBy(Book::getAuthor,Collectors.mapping(Book::getTitle,Collectors.toList())));

        authors.forEach((author, title) -> {
            System.out.println("author: " + author + ", title: " + title);
        });

    }
}
class Book{
    private String title;
    private String author;
    private int year;

    public Book(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

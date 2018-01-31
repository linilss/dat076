package chl.hajo.library.core;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * A book written by some author(s)
 * This is an JPA Entity class, see annotation
 * @author hajo
 */

@NoArgsConstructor
@EqualsAndHashCode(of = {"isbn"})
@Entity
@Table(name = "book")
public class Book implements Serializable {
    
    @Id
    @Getter
    @Setter
    @Column(nullable=false)
    private String isbn;
    @Getter
    @Setter
    private String genre;
    @Getter
    @Setter
    @Size(min = 2, max = 20, message = "title must be between 2 and 20 characters")
    private String title;
    @Getter
    @Setter
    private Double price;   // Should be verified with external service
    
    public Book(String isbn, String title, String genre, Double price) {
        this.isbn = isbn;
        this.genre = genre;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", genre=" + genre
                + ", title=" + title
                + ", price=" + price + '}';
    }

  
}

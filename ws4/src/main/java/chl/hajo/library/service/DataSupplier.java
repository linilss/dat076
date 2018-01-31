package chl.hajo.library.service;

import chl.hajo.library.core.Address;
import chl.hajo.library.core.Author;
import chl.hajo.library.core.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Just to get some data
 *
 * @author hajo
 */
public class DataSupplier {

    private final static Address[] ADDRS = {new Address("Vägen", 1, "Bruksorten"),
        new Address("Stigen", 2, "Centralorten"), new Address("Allen", 3, "Storstaden")};
    private static final Random RAND = new Random();

    public static Address getRandomAddress() {
        return ADDRS[RAND.nextInt(ADDRS.length)];
    }

    public static List<Author> getAuthors() {
        List<Author> authors = new ArrayList<>();
        String[] auths = {
            "FF;Fia;Fiasson;fia@mail",
            "NN;Nisse;Nissesson;nisse@mail",
            "PP;Pelle;Pellesson;pelle@mail",
            "SN;Siv;Nissesson;siv@mail",
            "PE;Pelle;Eriksson;eriksson@mail",
            "RU;Ruben;Eriksson;ruben@mail"
        };
        for (String s : auths) {
            String[] d = s.split(";");
            Author a = new Author(d[0], d[1], d[2], d[3], getRandomAddress());
            authors.add(a);
        }
        return authors;
    }
    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        String[] bos = {
            "777;En svensk Historia;Action;20",
            "888;Himmelen;Drama;10",
            "999;En Kall Natt;Skräck;100"
            };
        for (String s : bos) {
            String[] d = s.split(";");
            Book b = new Book(d[0], d[1],d[2], Double.parseDouble(d[3]));
            books.add(b);
        }
        return books;
    }


}

package chl.hajo.library.dao;

import chl.hajo.library.core.Book;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import chl.hajo.library.core.QBook;
import com.querydsl.jpa.impl.JPAQueryFactory;

/**
 * All orders Responsible for putting new PurchaseOrders objects into the model
 * DAO for Books, an stateless EJB session bean
 * @author hajo
 */
@Stateless
public class BookCatalogue  extends AbstractQuery<Book, String>  {

    @PersistenceContext(unitName = "library_pu")
    private EntityManager em;
    
    public BookCatalogue() {
        super(Book.class, QBook.book);
    }
        @Override
    public EntityManager getEntityManager() {
        return em;
    }
    
    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    public List<Book> findByIsbn(String isbn) {
        QBook book = QBook.book;
        JPAQueryFactory qf = new JPAQueryFactory(em);
        List<Book> found = qf.select(book)
                .from(book)
                .where(book.isbn.eq(isbn))
                .fetch();
        out.println(found);
        return found;
    }
    
}

package chl.hajo.library.dao;

import chl.hajo.library.core.Book;
import chl.hajo.library.service.DataSupplier;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *  This uses RESOURCE_LOCAL testing i.e NO container involved
 *  this is like Java SE (for simplicity)
 *  - Must create instances manually
 *  - Must handle transactions manually
 * 
 *
 * @author hajo
 */
public class BookCatalogueIT {

    static BookCatalogue bcat;
    static EntityManager em;

    @BeforeClass
    public static void setUpClass() throws NamingException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("library_pu_test");
        em = emf.createEntityManager();
        bcat = new BookCatalogue();
        bcat.setEntityManager(em);
    }

    @AfterClass
    public static void tearDownClass() {
        em.close();
    }

    @Test
    public void testCreateCountDelete() throws Exception {
        em.getTransaction().begin();    // Handle transaction

        int count = bcat.count();
        // NOTE: Possible exception if DONTUSE exists, CHECK!
        Book a1 = new Book("DONTUSE", "xxx", "xxx", 10.5);
        bcat.create(a1);

        Book a2 = bcat.find("DONTUSE");
        assertTrue(a2 != null);
        assertTrue(count + 1 == bcat.count());

        Book a3 = bcat.find("DONTUSE");
        assertTrue(a2.equals(a3));
        //assertTrue(a2 == a3);   // Hmm should work?!

        bcat.delete("DONTUSE");
        Book a4 = bcat.find("DONTUSE");
        assertTrue(a4 == null);
        assertTrue(count == bcat.count());
        
        em.getTransaction().commit();
    }

    public void testSelctFromTo() throws Exception {

    }

    //@Test
    public void testUpdate() throws Exception {

    }

    //@Test
    public void testFindByName() throws Exception {

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chl.hajo.library.control;

import chl.hajo.library.core.Book;
import java.util.List;
import net.bootsfaces.component.form.Form;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lns
 */
public class BookBeanTest {
    
    public BookBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of post method, of class BookBean.
     */
    @Test
    public void testPost() {
        System.out.println("post");
        BookBean instance = new BookBean();
        instance.post();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of page method, of class BookBean.
     */
    @Test
    public void testPage() {
        System.out.println("page");
        BookBean instance = new BookBean();
        instance.page();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancel method, of class BookBean.
     */
    @Test
    public void testCancel() {
        System.out.println("cancel");
        BookBean instance = new BookBean();
        instance.cancel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBook method, of class BookBean.
     */
    @Test
    public void testSetBook() {
        System.out.println("setBook");
        BookBean instance = new BookBean();
        instance.setBook();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class BookBean.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        BookBean instance = new BookBean();
        List<Book> expResult = null;
        List<Book> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class BookBean.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        BookBean instance = new BookBean();
        instance.add();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class BookBean.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        BookBean instance = new BookBean();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class BookBean.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        BookBean instance = new BookBean();
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTmp method, of class BookBean.
     */
    @Test
    public void testGetTmp() {
        System.out.println("getTmp");
        BookBean instance = new BookBean();
        Book expResult = null;
        Book result = instance.getTmp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTmp method, of class BookBean.
     */
    @Test
    public void testSetTmp() {
        System.out.println("setTmp");
        Book tmp = null;
        BookBean instance = new BookBean();
        instance.setTmp(tmp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForm method, of class BookBean.
     */
    @Test
    public void testGetForm() {
        System.out.println("getForm");
        BookBean instance = new BookBean();
        Form expResult = null;
        Form result = instance.getForm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setForm method, of class BookBean.
     */
    @Test
    public void testSetForm() {
        System.out.println("setForm");
        Form form = null;
        BookBean instance = new BookBean();
        instance.setForm(form);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

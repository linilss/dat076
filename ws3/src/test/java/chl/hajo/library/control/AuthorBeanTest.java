/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chl.hajo.library.control;

import chl.hajo.library.core.Author;
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
public class AuthorBeanTest {
    
    public AuthorBeanTest() {
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
     * Test of post method, of class AuthorBean.
     */
    @Test
    public void testPost() {
        System.out.println("post");
        AuthorBean instance = new AuthorBean();
        instance.post();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of page method, of class AuthorBean.
     */
    @Test
    public void testPage() {
        System.out.println("page");
        AuthorBean instance = new AuthorBean();
        instance.page();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancel method, of class AuthorBean.
     */
    @Test
    public void testCancel() {
        System.out.println("cancel");
        AuthorBean instance = new AuthorBean();
        instance.cancel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class AuthorBean.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        AuthorBean instance = new AuthorBean();
        instance.setAuthor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AuthorBean.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        AuthorBean instance = new AuthorBean();
        List<Author> expResult = null;
        List<Author> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class AuthorBean.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        AuthorBean instance = new AuthorBean();
        instance.add();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AuthorBean.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        AuthorBean instance = new AuthorBean();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AuthorBean.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        AuthorBean instance = new AuthorBean();
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTmp method, of class AuthorBean.
     */
    @Test
    public void testGetTmp() {
        System.out.println("getTmp");
        AuthorBean instance = new AuthorBean();
        Author expResult = null;
        Author result = instance.getTmp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTmp method, of class AuthorBean.
     */
    @Test
    public void testSetTmp() {
        System.out.println("setTmp");
        Author tmp = null;
        AuthorBean instance = new AuthorBean();
        instance.setTmp(tmp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForm method, of class AuthorBean.
     */
    @Test
    public void testGetForm() {
        System.out.println("getForm");
        AuthorBean instance = new AuthorBean();
        Form expResult = null;
        Form result = instance.getForm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setForm method, of class AuthorBean.
     */
    @Test
    public void testSetForm() {
        System.out.println("setForm");
        Form form = null;
        AuthorBean instance = new AuthorBean();
        instance.setForm(form);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

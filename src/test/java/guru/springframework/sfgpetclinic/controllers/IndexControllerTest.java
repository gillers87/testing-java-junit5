package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.controllers.IndexController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    public void setUp() {
        controller = new IndexController();
    }

    @Test
    public void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong View Returned");
        assertEquals("index", controller.index(), () -> "Another expensive message, " +
                "make me only if you have to");
    }

    @Test
    public void oupsHandler() {
        assertTrue("notimplemented".equals(controller.oupsHandler()), () -> "This is some expensive "
                + "message to build " +
                "for my test");
    }

}

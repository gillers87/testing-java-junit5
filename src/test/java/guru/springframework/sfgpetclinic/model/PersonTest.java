package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void groupedAssertions() {
        //given
        Person person = new Person(1l, "Chris", "Gilroy");

        //then
        assertAll("Test Props set",
                () -> assertEquals("Chris", person.getFirstName()),
                () -> assertEquals("Gilroy", person.getLastName()));
    }

    @Test
    public void groupedAssertionsMsgs() {
        //given
        Person person = new Person(1l, "Chris", "Gilroy");

        //then
        assertAll("Test Props set",
                () -> assertEquals("Chris", person.getFirstName(), "First name failed"),
                () -> assertEquals("Gilroy", person.getLastName(), "Last name failed"));
    }

}
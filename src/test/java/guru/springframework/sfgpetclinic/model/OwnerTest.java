package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OwnerTest {

    @Test
    public void dependentAssertions() {

        Owner owner = new Owner(1l, "Chris", "Gilroy");
        owner.setCity("Belfast");
        owner.setTelephone("123456789");

        assertAll("Properties test",
                () -> assertAll("Person properties",
                    () -> assertEquals("Chris", owner.getFirstName(), "First name did not match"),
                    () -> assertEquals("Gilroy", owner.getLastName(), "Last name did not match")),
                () -> assertAll("Owner properties",
                        () -> assertEquals("Belfast", owner.getCity(), "City did not match"),
                        () -> assertEquals("123456789", owner.getTelephone(), "Telephone did not match"))
                );
    }

}
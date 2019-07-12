package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled(value = "Disabled until we learn Mocking")
public class OwnerSDJpaServiceTest {

    OwnerSDJpaService service;

    @BeforeEach
    public void setUp() {
        service = new OwnerSDJpaService(null, null, null);
    }

    @Disabled
    @Test
    void findByLastName() {
        Owner foundOwner = service.findByLastName("Gilroy");
    }

    @Test
    void findAllByLastNameLike() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}
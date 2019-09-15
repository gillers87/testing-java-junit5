package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.ControllerTests;
import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.fauxspring.ModelMapImpl;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.SpecialityMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class VetControllerTest implements ControllerTests {

    VetController vetController;
    VetService vetService;
    SpecialtyService specialtyService;

    @BeforeEach
    void setUp() {
        specialtyService = new SpecialityMapService();
        vetService = new VetMapService(specialtyService);
        vetController = new VetController(vetService);

        Vet vet1 = new Vet(1l, "Chris", "Gilroy", null);
        Vet vet2 = new Vet(2l, "Sinead", "Gilroy", null);
        vetService.save(vet1);
        vetService.save(vet2);
    }

    @Test
    public void testListVets() {
        Model model = new ModelMapImpl();

        String view = vetController.listVets(model);

        Set modelAttribute = (Set) ((ModelMapImpl) model).getMap().get("vets");

        assertThat("vets/index").isEqualTo(view);
        assertThat(modelAttribute.size()).isEqualTo(2);
    }

}

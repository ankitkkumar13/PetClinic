package com.diro.sfgpetclicnic.bootstrap;

import com.diro.sfgpetclicnic.model.*;
import com.diro.sfgpetclicnic.services.PetTypeService;
import com.diro.sfgpetclicnic.services.SpecialtiesService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.diro.sfgpetclicnic.services.OwnerService;
import com.diro.sfgpetclicnic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtiesService specialtiesService;

	@Override
	public void run(String... args) throws Exception {
		int count = petTypeService.findAll().size();
		if (count == 0)
			loadData();
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("dog");
		PetType saveDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		dog.setName("dog");
		PetType saveCatPetType = petTypeService.save(dog);

		Owner owner = new Owner();
		owner.setFirstName("ankit");
		owner.setLastName("Pawar");
		owner.setAddress("123, govindpuri");
		owner.setCity("Jaspur");
		owner.setTelephone("6397012389");
		Pet ankitsPet = new Pet();
		ankitsPet.setPetType(saveDogPetType);
		ankitsPet.setOwner(owner);
		ankitsPet.setBirthDate(LocalDate.now());
		ankitsPet.setName("jakkie");
		owner.getPetSet().add(ankitsPet);
		ownerService.save(owner);
		Owner owner2 = new Owner();
		owner2.setFirstName("Saurabh");
		owner2.setLastName("mishra");
		owner2.setAddress("123, kalkaji");
		owner2.setCity("Gorakhpur");
		owner2.setTelephone("639701238900");
		Pet saurabhsSpet = new Pet();
		saurabhsSpet.setPetType(saveDogPetType);
		saurabhsSpet.setOwner(owner);
		saurabhsSpet.setBirthDate(LocalDate.now());
		saurabhsSpet.setName("pussy");
		owner2.getPetSet().add(saurabhsSpet);
		ownerService.save(owner2);
		System.out.println("Loaded owners");

		Vet vet = new Vet();
//		vet.setId(1L);
		vet.setFirstName("Kanujdddd");
		vet.setLastName("Vishnoi");
		Speciality specialityRadiology = new Speciality();
		specialityRadiology.setDescription("radiology");
		vet.getSpecialitySet().add(specialityRadiology);


		vetService.save(vet);

		Vet vet1 = new Vet();
//		vet1.setId(2L);
		vet1.setFirstName("Himanshu");
		vet1.setLastName("Vishnoi");

		Speciality specialityDentist = new Speciality();
		specialityRadiology.setDescription("dentistry");
		vet1.getSpecialitySet().add(specialityDentist);
		vetService.save(vet1);
		System.out.println("Vet loaded");
	}


	public DataLoader(VetService vetService, OwnerService ownerService, PetTypeService petTypeService, SpecialtiesService specialtiesService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtiesService = specialtiesService;
	}

}

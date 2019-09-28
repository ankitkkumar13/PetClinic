package com.diro.sfgpetclicnic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.diro.sfgpetclicnic.map.OwnereServiceMap;
import com.diro.sfgpetclicnic.map.VetServiceMap;
import com.diro.sfgpetclicnic.model.Owner;
import com.diro.sfgpetclicnic.model.Vet;
import com.diro.sfgpetclicnic.services.OwnerService;
import com.diro.sfgpetclicnic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	private OwnerService ownerService;
	private VetService vetService;

	

	@Override
	public void run(String... args) throws Exception {
		Owner owner = new Owner();
//		owner.setId(1L);
		owner.setFirstName("ankit");
		owner.setLastName("Pawar");
		ownerService.save(owner);
		Owner owner2 = new Owner();
//		owner2.setId(2L);
		owner2.setFirstName("Saurabh");
		owner2.setLastName("mishra");
		ownerService.save(owner2);
		System.out.println("Loaded owners");

		Vet vet = new Vet();
//		vet.setId(1L);
		vet.setFirstName("Kanujdddd");
		vet.setLastName("Vishnoi");
		vetService.save(vet);

		Vet vet1 = new Vet();
//		vet1.setId(2L);
		vet1.setFirstName("Himanshu");
		vet1.setLastName("Vishnoi");
		vetService.save(vet1);
		System.out.println("Vet loaded");
	}



	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

}

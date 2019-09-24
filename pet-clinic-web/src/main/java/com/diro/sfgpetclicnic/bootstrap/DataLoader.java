package com.diro.sfgpetclicnic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.diro.sfgpetclcnic.map.OwnereServiceMap;
import com.diro.sfgpetclcnic.map.VetServiceMap;
import com.diro.sfgpetclcnic.model.Owner;
import com.diro.sfgpetclcnic.model.Vet;
import com.diro.sfgpetclcnic.services.OwnerService;
import com.diro.sfgpetclcnic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	private OwnerService ownerService;
	private VetService vetService;

	public DataLoader() {
		this.ownerService = new OwnereServiceMap();
		this.vetService = new VetServiceMap();
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner = new Owner();
		owner.setId(1L);
		owner.setFirstName("ankit");
		owner.setLastName("Pawar");
		ownerService.save(owner);
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner.setFirstName("Saurabh");
		owner.setLastName("mishra");
		ownerService.save(owner2);
		System.out.println("Loaded owners");

		Vet vet = new Vet();
		vet.setId(1L);
		vet.setFirstName("Kanuj");
		vet.setLastName("Vishnoi");
		vetService.save(vet);

		Vet vet1 = new Vet();
		vet1.setId(2L);
		vet1.setFirstName("Himanshu");
		vet1.setLastName("Vishnoi");
		vetService.save(vet1);
		System.out.println("Vet loaded");
	}

}

package guru.springframework.service;


import guru.springframework.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    String findAll();
}

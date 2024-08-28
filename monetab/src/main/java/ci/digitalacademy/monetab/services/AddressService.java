package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.services.dto.AddressDTO;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    AddressDTO save(AddressDTO address);
    AddressDTO update(AddressDTO address);

    Optional<AddressDTO> findOne(Long id);

    List<AddressDTO> findAll();
    void delete(Long id);
}

package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Address;
import ci.digitalacademy.monetab.repositories.AddressRepository;
import ci.digitalacademy.monetab.services.AddressService;
import ci.digitalacademy.monetab.services.dto.AddressDTO;
import ci.digitalacademy.monetab.services.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service

@RequiredArgsConstructor
public class AdressServiceImpl implements AddressService{

    private final AddressRepository adressRepository;
    @Override
    public AddressDTO save(AddressDTO addressDTO) {
        log.debug("Request to save: {}", addressDTO);
        Address address = AddressMapper.toEntity(addressDTO);
        address= adressRepository.save(address);
        return AddressMapper.toDto(address);
    }

    @Override
    public Optional<AddressDTO> findOne(Long id){
        return adressRepository.findById(id).map(AddressMapper::toDto);
    }

    @Override
    public AddressDTO update(AddressDTO addressDTO) {
      return findOne(addressDTO.getId()).map(existingAddress -> {
          existingAddress.setCountry(addressDTO.getCountry());
            existingAddress.setCity(addressDTO.getCity());
            return save(existingAddress);
        }).orElseThrow(() -> new IllegalArgumentException());
    }



    @Override
    public List<AddressDTO> findAll() {
       // log.debug("Request on address {}");
        return adressRepository.findAll().stream().map(address -> {
            return AddressMapper.toDto(address);
        }).toList();
    }

    @Override
    public void delete(Long id) {
      //  log.debug("Request to delete address {}",id);
        adressRepository.deleteById(id);
}
}

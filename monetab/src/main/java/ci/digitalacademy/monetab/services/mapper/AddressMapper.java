package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Address;
import ci.digitalacademy.monetab.services.dto.AddressDTO;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

public class AddressMapper {

    private AddressMapper() {}

    public static AddressDTO toDto(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(address.getId());
        addressDTO.setCity(address.getCity());
        addressDTO.setStreet(address.getStreet());
        addressDTO.setCountry(address.getCountry());
        return addressDTO;
    }

    public static Address toEntity(AddressDTO addressDTO) {
        Address address = new Address();
        address.setId(addressDTO.getId());
        address.setCity(addressDTO.getCity());
            address.setStreet(addressDTO.getStreet());
            address.setCountry(addressDTO.getCountry());
        return address;
    }
}

package in.avinash.springbootcrud.springbootcrudapi.dao;

import in.avinash.springbootcrud.springbootcrudapi.model.Country;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ICountryDao {
    Page<Country> findAll(int pageNo, int pageSize);

    List<Country> findAll();

    List<Country> findByName(String countryName);

    Country getCountryByName(String countryName);


}

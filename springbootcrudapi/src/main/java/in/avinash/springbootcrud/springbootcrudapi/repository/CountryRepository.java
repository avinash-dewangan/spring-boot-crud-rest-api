package in.avinash.springbootcrud.springbootcrudapi.repository;

import in.avinash.springbootcrud.springbootcrudapi.dao.CountryDao;
import in.avinash.springbootcrud.springbootcrudapi.model.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

    List<Country> findByName(String countryName);

    @Query("select c from Country c where c.name = ?1")
    Country getCountryName(String countryName);

    Country countryListByName(String countryName);

}
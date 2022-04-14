package in.avinash.springbootcrud.springbootcrudapi.repository;

import in.avinash.springbootcrud.springbootcrudapi.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

}
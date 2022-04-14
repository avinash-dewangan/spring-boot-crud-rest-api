package in.avinash.springbootcrud.springbootcrudapi.dao;

import in.avinash.springbootcrud.springbootcrudapi.model.Country;
import in.avinash.springbootcrud.springbootcrudapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDao implements ICountryDao{

    @Autowired
    private CountryRepository repository;

    @Override
    public Page<Country> findAll(int pageNo, int pageSize) {
        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Country> pagedResult = repository.findAll(paging);
        return pagedResult;
    }
}

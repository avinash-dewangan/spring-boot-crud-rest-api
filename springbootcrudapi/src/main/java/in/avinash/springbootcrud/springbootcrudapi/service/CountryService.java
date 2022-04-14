package in.avinash.springbootcrud.springbootcrudapi.service;

import in.avinash.springbootcrud.springbootcrudapi.dao.CountryDao;
import in.avinash.springbootcrud.springbootcrudapi.dao.ICountryDao;
import in.avinash.springbootcrud.springbootcrudapi.model.Country;
import in.avinash.springbootcrud.springbootcrudapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private ICountryDao iCountryDao;

    @Override
    public Page<Country> findAll(int pageNo, int pageSize) {
        return iCountryDao.findAll(pageNo, pageSize);
    }

}

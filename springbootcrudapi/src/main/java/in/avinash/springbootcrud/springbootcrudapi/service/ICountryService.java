package in.avinash.springbootcrud.springbootcrudapi.service;


import in.avinash.springbootcrud.springbootcrudapi.model.Country;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ICountryService {
    Page<Country> findAll(int pageNo, int pageSize);
}

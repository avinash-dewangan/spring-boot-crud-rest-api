package in.avinash.springbootcrud.springbootcrudapi.dao;

import in.avinash.springbootcrud.springbootcrudapi.model.Country;
import org.springframework.data.domain.Page;

public interface ICountryDao {
    Page<Country> findAll(int pageNo, int pageSize);
}

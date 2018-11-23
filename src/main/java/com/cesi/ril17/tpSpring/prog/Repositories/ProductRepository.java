package com.cesi.ril17.tpSpring.prog.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cesi.ril17.tpSpring.prog.Entities.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

}

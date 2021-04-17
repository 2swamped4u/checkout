package com.hatanaka.ecommerce.checkout.repository;


import com.hatanaka.ecommerce.checkout.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {

}

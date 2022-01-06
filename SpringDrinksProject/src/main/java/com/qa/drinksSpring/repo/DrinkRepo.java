package com.qa.drinksSpring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.drinksSpring.domain.Drink;

public interface DrinkRepo extends JpaRepository<Drink, Long> {

}

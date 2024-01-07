package com.example.springproject.REPOSITORY;

import com.example.springproject.ENTITY.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}

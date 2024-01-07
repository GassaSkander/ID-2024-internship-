package com.example.springproject.SERVICE;

import com.example.springproject.ENTITY.Contact;
import com.example.springproject.REPOSITORY.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContactServiceImp implements ContactService{
    ContactRepository contactRepository;

    @Override
    public List<Contact> retrieveAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact AddContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public void DeleteContact(Integer idContact) {
        contactRepository.deleteById(idContact);
    }

    @Override
    public Contact UpdateContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact retrieveContact(Integer idContact) {
        return contactRepository.findById(idContact).get();
    }
}

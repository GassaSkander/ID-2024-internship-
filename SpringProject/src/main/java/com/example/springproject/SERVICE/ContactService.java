package com.example.springproject.SERVICE;

import com.example.springproject.ENTITY.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> retrieveAllContacts();

    Contact AddContact(Contact contact);

    void DeleteContact(Integer idContact);

    Contact UpdateContact(Contact contact);

    Contact retrieveContact(Integer idContact);
}

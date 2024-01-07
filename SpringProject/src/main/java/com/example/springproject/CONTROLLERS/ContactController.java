package com.example.springproject.CONTROLLERS;

import com.example.springproject.ENTITY.Contact;
import com.example.springproject.ENTITY.User;
import com.example.springproject.SERVICE.ContactService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("ContactManagement")
@RestController
@AllArgsConstructor
public class ContactController {
    ContactService contactService;

    @PostMapping("/addContact")
    Contact AddContact(@RequestBody Contact contact){
        return contactService.AddContact(contact);
    }

    @PutMapping("/modifyContact")
    Contact updateContact(@RequestBody Contact contact){
        return contactService.UpdateContact(contact);
    }

    @GetMapping("/showAllContacts")
    List<Contact> retreiveAll(){return contactService.retrieveAllContacts();}

    @GetMapping("/showContact/{contactId}")
    Contact retreiveContact(@PathVariable Integer idContact){
        return contactService.retrieveContact(idContact);
    }

    @DeleteMapping("/deleteContact/{idContact}")
    void deleteContact(@PathVariable Integer idContact){
        contactService.DeleteContact(idContact);
    }
}

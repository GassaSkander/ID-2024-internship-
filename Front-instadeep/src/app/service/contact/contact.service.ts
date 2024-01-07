import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse, HttpHeaders } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ContactService {
  private url = 'http://localhost:8081/api/ContactManagement';
  constructor(private http: HttpClient) { }

  getAllContacts(){
    return this.http.get(this.url + '/showAllContacts');
  }

  addContact(contact: any){
    return this.http.post(this.url + '/addContact', contact);
  }

  updateContact(contact: any){
    return this.http.put(this.url + '/modifyContact', contact);
  }

  showContact(id: string){
    return this.http.get(this.url + '/showContact/' +  id);
  }

  deleteContact(id : string){
    return this.http.delete(this.url + '/deleteContact' + id);
  }
}

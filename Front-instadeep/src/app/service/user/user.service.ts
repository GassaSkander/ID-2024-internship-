import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root',
})
export class UserService {
  private url = 'http://localhost:8081/api/UserManagement';

  constructor(private http: HttpClient) {}

  getAllUsers() {
    return this.http.get(this.url + '/showAllUsers');
  }

  addUser(user: any) {
    return this.http.post<HttpResponse<any>>(this.url + '/addUser', user);
  }

  updateUser(user: any) {
    return this.http.put<HttpResponse<any>>(this.url + '/modifyUser', user);
  }

  showUser(id: string) {
    return this.http.get(this.url + '/showUser/' + id);
  }

  deleteUser(id: string) {
    return this.http.delete<HttpResponse<any>>(this.url + '/deleteUser/' + id);
  }
}

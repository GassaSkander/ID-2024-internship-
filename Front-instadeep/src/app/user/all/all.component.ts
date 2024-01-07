import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from 'src/app/service/user/user.service';

@Component({
  selector: 'app-all',
  templateUrl: './all.component.html',
  styleUrls: ['./all.component.css']
})
export class AllComponentUser implements OnInit{
users: any;
  constructor(private userService: UserService, private router: Router) {}

  ngOnInit(): void {
    this.getAllUsers();
    console.log(this.users);
  }

  
  getAllUsers() {
    this.userService.getAllUsers().subscribe((data) => {
      this.users = data;
    });
  }
}

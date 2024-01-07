import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../service/user/user.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';


@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css'],
})
export class UserComponent implements OnInit {
  form!: FormGroup;
  formSubmitted: boolean = false; //
  users: any;


  constructor(private userService: UserService, private router: Router) {}

  ngOnInit(): void {
    this.form = new FormGroup({
      full_name: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required, Validators.email]),
      phone_number: new FormControl('', [Validators.required]),
    });
  }


  addUser(){
    if (this.form.valid) {
      this.userService.addUser(this.form.value).subscribe(
        (res) => {
          console.log(res);
          this.router.navigate(['/home']);
        },
        (err) => console.error(err)
      );
    } else {
      this.formSubmitted = true;
    }
  }
}

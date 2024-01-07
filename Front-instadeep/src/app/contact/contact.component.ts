import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ContactService } from '../service/contact/contact.service';
@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit{
  form!: FormGroup;
  formSubmitted: boolean = false; //
  contacts: any;

  constructor(private contactService: ContactService, private router: Router) {}

  ngOnInit(): void {
    this.form = new FormGroup({
      full_name: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required, Validators.email]),
      phone_numbers: new FormControl('', [Validators.required]),
    });
  }

  addContact(){
    if (this.form.valid) {
      this.contactService.addContact(this.form.value).subscribe(
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

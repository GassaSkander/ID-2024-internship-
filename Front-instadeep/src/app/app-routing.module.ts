import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserComponent } from './user/user.component';
import {AllComponent } from './contact/all/all.component';
import { ContactComponent } from './contact/contact.component';
import { AllComponentUser } from './user/all/all.component';

const routes: Routes = [
  {path : 'addUser' , component: UserComponent},
  {path : 'showAllUsers', component : AllComponentUser},
  {path : 'addContact', component : ContactComponent},
  {path : 'showAllContacts', component : AllComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

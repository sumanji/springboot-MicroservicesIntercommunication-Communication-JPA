import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { PatientComponent } from './patient/patient/patient.component';
import { PatientsComponent } from './patients/patients/patients.component';

const routes: Routes = [
  {
    path: 'home',
    component: PatientsComponent,
  },
  {
    path: 'patient/:id',
    component: PatientComponent,
  },
  { path: '',
   redirectTo: '/home', 
   pathMatch: 'full'
   }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

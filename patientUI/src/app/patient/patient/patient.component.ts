import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, RouterLinkActive } from '@angular/router';
import { HttpService } from 'src/app/httpService/http-service';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.css']
})
export class PatientComponent implements OnInit {


 private patient:any={};
  private route:ActivatedRoute;
 private httpService:HttpService;
 constructor(httpService:HttpService,route:ActivatedRoute){
 this.httpService=httpService;
 this.route=route;
 }
  ngOnInit(): void {
    this.getPatient();
  }
  
  getPatient(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.httpService.getPatientById(id)
      .subscribe(data => this.patient = data);
  }
}

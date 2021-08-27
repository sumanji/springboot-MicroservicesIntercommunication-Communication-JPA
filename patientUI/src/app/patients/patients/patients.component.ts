import { Component, OnInit } from '@angular/core';
import { HttpService } from 'src/app/httpService/http-service';

@Component({
  selector: 'app-patients',
  templateUrl: './patients.component.html',
  styleUrls: ['./patients.component.css']
})
export class PatientsComponent implements OnInit {

  public patientList:any[]=[
  ];
   private httpService:HttpService;
constructor( httpService:HttpService){
this.httpService=httpService;
}

ngOnInit(){
this.httpService.getPatientList().subscribe(data=>{
  this.patientList=Object.values(data);
});
}
 
}

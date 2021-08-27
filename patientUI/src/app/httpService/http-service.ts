import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  private httpCient:HttpClient;

  constructor(httpCient:HttpClient) {
    this.httpCient=httpCient;
   }

  public getPatientList(){
    return this.httpCient.get("http://laptop-n70ksq25:8090/patients");
  }

  public getPatientById(patinetId:number){
    return this.httpCient.get("http://laptop-n70ksq25:8090/patient/"+patinetId);
  }
}

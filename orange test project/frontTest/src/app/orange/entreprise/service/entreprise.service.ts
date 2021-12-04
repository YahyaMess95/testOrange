import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
const baseUrl = 'http://localhost:4070/entreprise/';
const baseUrlParticulier = 'http://localhost:4070/particulier/';
@Injectable({
  providedIn: 'root'
})
export class EntrepriseService {

  constructor(private http: HttpClient) { }

  create(data: any): Observable<any> {
    return this.http.post(baseUrl+'add', data);
  }

  loginEnt(nom : any , prenom : any)
  {
   return  this.http.get<any>(baseUrl + 'login/'+nom+'/'+prenom) ;
  }

  fetchCv( )
  {return this.http.get<any>(baseUrlParticulier + 'all/') ;}




}

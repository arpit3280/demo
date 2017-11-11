import {Injectable} from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import {Observable} from 'rxjs/Rx';
import { Team } from './team';

@Injectable()
export class AppService {

	private url = 'http://192.168.1.5:8080/PIPlanning/Team/';
	private headers = new Headers({ 'Content-Type': 'application/json' });
	private options = new RequestOptions({ 'headers': this.headers });

	constructor (private http: Http) {}

	getTeam(id:string) : Observable<object[]>{
		let getTeamURL: string = this.url+'getTeam?teamId='+id;
        return this.http.get(getTeamURL)
                .map((res:Response) => res.json())
                .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
        
    }

    addTeam(team:Team):Observable<object[]>{
    	let addTeamURL: string = this.url+'addTeam';
    	return this.http.post(addTeamURL, team, this.options)
                .map((res:Response) => res.json())
                .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
    }

}


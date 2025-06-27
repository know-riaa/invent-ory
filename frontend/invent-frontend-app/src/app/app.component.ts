import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SearchBarComponent } from './search-bar/search-bar.component';
import { HttpClient, HttpClientModule, provideHttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, SearchBarComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'invent-frontend-app';

  constructor(private http: HttpClient){}

  response: any[] = [];

  userData(query:string){
    console.log('User Input is :', query);

    this.http.get<any[]>(`https://eobsobsos${query}`)
    .subscribe({
      next: (res) =>  {
        this.response = res;
        console.log('Response from API:', res);
      },
      error:(err) => {
        console.error("error noticed!!");
      }
    });
  }

  
}

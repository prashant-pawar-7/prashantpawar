import { Component } from '@angular/core';
import { CollegeserviceService } from 'src/app/collegeservice.service';
import { Course } from 'src/app/course';

@Component({
  selector: 'app-view-course',
  templateUrl: './view-course.component.html',
  styleUrls: ['./view-course.component.css']
})
export class ViewCourseComponent {
  course:Course[]=[];
  
  displayedColumns1: string[] = ['cid','cname','cduration','cfees','actions'];

  constructor(private serv:CollegeserviceService)
  {}
  
 
  ngOnInit(): void {
    this.getAllCourses();
  }
 

  getAllCourses()
  {

    this.serv.getAllCourse().subscribe(data=>
      {
          this.course=data;

      });
      console.log(this.course)
  }



  openDeleteModal(id:number)
  {
    
    if(window.confirm("Do you want to delete this record?"))
    {
            this.serv.deleteCourse(id).subscribe(() => {
              this.getAllCourses();
              //this.router.navigate(['/']);
         
            });
          }

  }

}

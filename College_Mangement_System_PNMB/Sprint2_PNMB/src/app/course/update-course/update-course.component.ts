import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CollegeserviceService } from 'src/app/collegeservice.service';
import { Course } from 'src/app/course';

@Component({
  selector: 'app-update-course',
  templateUrl: './update-course.component.html',
  styleUrls: ['./update-course.component.css']
})
export class UpdateCourseComponent {
  id:number=0;
 course:Course=new Course();
  constructor(
    private studentService: CollegeserviceService,
    private router: Router,
    private route: ActivatedRoute
    ) {}
    ngOnInit(): void {
      this.route.paramMap.subscribe((param) => {
         this.id = Number(param.get('id'));
        this.getById(this.id);
      });
    }

    getById(id:number) {
      this.studentService.getCourse(id).subscribe((data) => {
        this.course=data;
      });
    }

  update(){
    this.studentService.updateCourse(this.course,this.id).subscribe(() => {
      this.router.navigate(['/courses'])
    });
 
  }
}

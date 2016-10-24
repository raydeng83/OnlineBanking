import {Component} from '@angular/core';
import {AppointmentService} from '../services/appointment.service';

@Component({
  selector: 'appointment',
  templateUrl: './appointment.component.html'
})
export class AppointmentComponent{

	appointmentList: Object[];

	constructor(private appointmentService: AppointmentService) {
		this.getAppointmentList();
	}

	getAppointmentList() {
		this.appointmentService.getAppointmentList().subscribe(
			res => {
        		this.appointmentList = JSON.parse(JSON.parse(JSON.stringify(res))._body);
      		},
      		error => console.log(error)
		)
	}	

	confirmAppointment(id: number) {
  		this.appointmentService.confirmAppointment(id).subscribe();
  		location.reload();
  	}

}
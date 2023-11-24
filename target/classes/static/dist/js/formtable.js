


let studentDetails={
	
	getAllStudentDetails: function(){
		
		let xhr = new 	XMLHttpRequest();
		xhr.open('GET','http://localhost:8080/makeattendance',true)
		xhr.onload = function(){
			if(this.status == 200){
				let student = JSON.parse(this.responseText);
				console.log(student)
				let output='';
				for(let i in student){
					output +=
					`<tr>
                            <td>${student[i].studentName}</td>
                            <td>${guests[i].Grade}</td>
                            
                         </tr>`
					
				}
				document.getElementById('studentsDetails');
			}
		}
		xhr.send();
	}
}
studentDetails.getAllStudentDetails();
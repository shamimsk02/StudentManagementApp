import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {
	public static void main(String args[]) throws IOException {
		System.out.println("hello");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to exit");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				
				System.out.println("Enter user name");
				String name=br.readLine();
				
				System.out.println("Enter user phone : ");
				String phone=br.readLine();
				
				System.out.println("Enter user city: ");
				String city=br.readLine();
				
				Student st=new Student(name, phone,city);
				boolean ans=StudentDao.insertStudentToDb(st);
				if(ans) {
					System.out.println("Student added Successfully!!!");
				}
				else {
					System.out.println("Someting went wrong!!!");
				}
				System.out.println(st);
				
			}
			
			else if(c==2){
				System.out.println("Enter user id: ");
				int id=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(id);
				if(f) {
					System.out.println("Deleted !!!");
					
				}
				else {
					System.out.println("Something went wrong");
				}
			}
			else if(c==3) {
				StudentDao.showAllStudents();
					
				
			}
			else if(c==4) {
				
				break;
			}
			else {
				
				
			}
						
		}
		System.out.println("Thank You!!!!");
	
	}
}

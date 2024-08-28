package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.*;
import ci.digitalacademy.monetab.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.time.Instant;
import java.util.*;

@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private FicheNoteService ficheNoteService;
	@Autowired
	private AddressService addressService;
	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {





//		Teacher prof = new Teacher(null,"Informatique",true);
//		Teacher prof2 = new Teacher(null,"Mathematique",true);
//		teacherService.save(prof);
//		teacherService.save(prof2);
//
//		;
//
//		prof2.setMatiere("Chimie");
//		teacherService.save(prof2);
//		teacherService.delete((user.getId()));
//		Student student = new Student(null,"123","6eme");
//		Student student2 = new Student(null,"123E","3eme");
//		studentService.save(student);
//		studentService.save(student2);

/*
		FicheNote ficheNote = new FicheNote(null,20,Instant.now());
		FicheNote ficheNote2 = new FicheNote(null,15,Instant.now());
		ficheNoteService.save(ficheNote);
		ficheNoteService.save(ficheNote2);

		Adress add = new Adress();
		add.setCity("Abidjan");
		//add.setCompany("Atos");
		add.setStreet("Rue 12");
		addressService.save(add);
		//addressService.save(add2);
		User user = new User(null,"mau","12345678", Instant.now(),add);
		//User user2 = new User(null,"ricette","12345678",Instant.now(),add2);
		userService.save(user);
		//userService.save(user2);
		List<User> users= userService.findAll();
		System.out.println(users);
		*/


//		Teacher teacher = new Teacher();
//		//teacher.setVacant(true);
//		teacher.setMatiere("java");
//
//		teacherService.save(teacher);
//
//	FicheNote ficheNote1 = new FicheNote();
//         ficheNote1.setNote("12");
//         ficheNote1.setAnnee("2023");
//		 ficheNote1.setTeacher(teacher);
//	FicheNote ficheNote2 = new  FicheNote();
//        ficheNote2.setNote("16");
//        ficheNote2.setAnnee("2024");
//		ficheNote2.setTeacher(teacher);
//
//        ficheNoteService.save( ficheNote1);
//         ficheNoteService.save( ficheNote2);
//
//	Set<FicheNote> ficheNote = new HashSet<>();
//         ficheNote.add(ficheNote1);
//        ficheNote.add( ficheNote2);
//		teacher.setFicheNotes(ficheNote);
//
//
//List<Teacher> teachers= teacherService.findAll();
//		System.out.println(teachers);

//
//		List<FicheNote> ficheNotes= ficheNoteService.findAll();
//		System.out.println(ficheNotes);
//

//		Student student = new Student();
//		student.setMatricule("AB-001");
//		student.setEmail("demo@gmail.com");
//		student.setFirst_name("Jonathan");
//		student.setLast_name("Nohn");
//		student.setVille("Abidjan");
//		student.setClasse("CM2");
//
//		student.setDate_naissance(Instant.now());
//
//		Student student1 = new Student();
//		student1.setMatricule("AB-002");
//		student1.setEmail("demo1@gmail.com");
//		student1.setFirst_name("Israel");
//		student1.setLast_name("Essoh");
//		student1.setVille("Bouaké");
//		student1.setClasse("CM2");
//		student1.setGenre("M");
//		student1.setDate_naissance(Instant.now());
//
//		Student student2 = new Student();
//		student2.setMatricule("AB-003");
//		student2.setEmail("demo21@gmail.com");
//		student2.setFirst_name("Abou");
//		student2.setLast_name("Soum");
//		student2.setVille("Abidjan");
//		student2.setClasse("CM2");
//		student2.setDate_naissance(Instant.now());
//
//		studentService.save(student);
//		studentService.save(student1);
//		studentService.save(student2);
//
//		Teacher teacher = new Teacher();
//		teacher.setMatiere("Python");
//		teacher.setEmail("Prof@gmail.com");
//		teacher.setFirst_name("Yehohanane");
//		teacher.setLast_name("Konan");
//		teacher.setVille("Sinfra");
//		teacher.setVacant(true);
//
//		Teacher teacher1 = new Teacher();
//		teacher1.setMatiere("Java");
//		teacher1.setEmail("Prof1@gmail.com");
//		teacher1.setFirst_name("Keliane");
//		teacher1.setLast_name("Adon");
//		teacher1.setVille("Dimbokro");
//		teacher1.setVacant(true);
//
//
//		teacherService.save(teacher);
//		teacherService.save(teacher1);
//
//
//		User user = new User();
//		user.setPseudo("admin");
//		user.setPassword("");
//		user.setCreationDate(Instant.now());
//
//		User user1 = new User();
//		user1.setPseudo("rec");
//		user1.setPassword("uu");
//		user1.setCreationDate(Instant.now());
//
//
//		userService.save(user);
//		userService.save(user1);

	}

}

package vnuk.huong170205.assignment2.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import vnuk.huong170205.assignment2.define.Define;
import vnuk.huong170205.assignment2.model.Lecturer;

public class LecturerTest {

	Lecturer lecturer;
	private final double delta = 0.00001;
	
	@Before
	public void setUp() throws Exception {
		lecturer = new  Lecturer.LecturerBuilder( Define.TYPE_OF_LECTURER,Define.latestId)
				.setYearOfBirth(1980)
				.setName("Gia Han")
				.setHomeTown("Quang Tri")
				.setDepartment("CSE")
				.setYearsOfWork(10)
				.setSalaryRatio((float) 2.0)
				.setQualification(Define.QUALIFICATION_OF_BACHELOR)
				.setPeriodsInMonth(25)
				.setBasicSalary(Define.DEFAULT_BASIC_SALARY)
				.setAllowance(Define.QUALIFICATION_OF_BACHELOR)
				.build();

	}

//	@Test
//	public void testInput() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testBuilderSetAllowanceWithMaster() {
		lecturer = new  Lecturer.LecturerBuilder( Define.TYPE_OF_LECTURER,Define.latestId)
				.setQualification(Define.QUALIFICATION_OF_MASTER)
				.setAllowance(Define.QUALIFICATION_OF_MASTER)
				.build();
		assertEquals(Define.ALLOWANCE_OF_MASTER, lecturer.getAllowance());
	}
	
	@Test
	public void testBuilderSetAllowanceWithDoctor() {
		lecturer = new  Lecturer.LecturerBuilder( Define.TYPE_OF_LECTURER,Define.latestId)			
				.setQualification(Define.QUALIFICATION_OF_DOCTOR)			
				.setAllowance(Define.QUALIFICATION_OF_DOCTOR)
				.build();
		
		assertEquals(Define.ALLOWANCE_OF_DOCTOR, lecturer.getAllowance());
	}
	
	
	@Test
	public void testToString() {
		 assertEquals("Lecturer [homeTown=Quang Tri, department=CSE, qualification=Bachelor, allowance=300, periodsInMonth=25, salaryRatio=2.0, yearsOfWork=10, basicSalary=730.0, id=0, name=Gia Han, yearOfBirth=1980, type=1]", lecturer.toString());
	}

	@Test
	public void testLecturer() {
		lecturer = new Lecturer();
		assertNotNull(lecturer);
	}

	@Test
	public void testSetHomeTown() {
		lecturer.setHomeTown("Da Nang");
		assertEquals("Da Nang", lecturer.getHomeTown());
	}

	@Test
	public void testSetDepartment() {
		lecturer.setDepartment("IBM");
		assertEquals("IBM", lecturer.getDepartment());
	}

	@Test
	public void testSetQualificationWithDoctor() {
		lecturer.setQualification(Define.QUALIFICATION_OF_DOCTOR);
		assertEquals("Doctor", lecturer.getQualification());
	}
	
	@Test
	public void testSetQualificationWithBachelor() {
		lecturer.setQualification(Define.QUALIFICATION_OF_BACHELOR);
		assertEquals("Bachelor", lecturer.getQualification());
	}
	
	@Test
	public void testSetQualificationWithMaster() {
		lecturer.setQualification(Define.QUALIFICATION_OF_MASTER);
		assertEquals("Master", lecturer.getQualification());
	}

	@Test
	public void testSetAllowanceWithDoctor() {
		lecturer.setAllowance(Define.ALLOWANCE_OF_DOCTOR);
		assertEquals(2000, lecturer.getAllowance());
	}
	
	@Test
	public void testSetAllowanceWithMaster() {
		lecturer.setAllowance(Define.ALLOWANCE_OF_MASTER);
		assertEquals(900, lecturer.getAllowance());
	}
	
	@Test
	public void testSetAllowanceWithBachelor() {
		lecturer.setAllowance(Define.ALLOWANCE_OF_BACHELOR);
		assertEquals(300, lecturer.getAllowance());
	}

	@Test
	public void testSetPeriodsInMonth() {
		lecturer.setPeriodsInMonth(20);
		assertEquals(20, lecturer.getPeriodsInMonth());
	}

	@Test
	public void testSetSalaryRatio() {
		lecturer.setSalaryRatio((float) 2.3);
		assertEquals(2.3, lecturer.getSalaryRatio(),delta);
	}

	@Test
	public void testSetYearsOfWork() {
		lecturer.setYearsOfWork(12);
		assertEquals(12, lecturer.getYearsOfWork());
	}

	@Test
	public void testUpdate() {
		lecturer.update(800);
		assertEquals(800, lecturer.getBasicSalary(), delta);
	}

	@Test
	public void testGetSalary() {
		assertEquals(2885, lecturer.getSalary(), delta);
	}
	
	@Test
	public void testGetId() {
		assertEquals(0, lecturer.getId());
	}

	@Test
	public void testSetName() {
		lecturer.setName("Thu Huong");
		assertEquals("Thu Huong", lecturer.getName());
	}

	@Test
	public void testSetYearOfBirth() {
		lecturer.setYearOfBirth(1995);
		assertEquals(1995, lecturer.getYearOfBirth());
	}

	@Test
	public void testGetType() {
		assertEquals(1, lecturer.getType());
	}

}

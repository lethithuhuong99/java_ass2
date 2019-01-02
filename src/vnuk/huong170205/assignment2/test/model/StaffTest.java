package vnuk.huong170205.assignment2.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import vnuk.huong170205.assignment2.define.Define;
import vnuk.huong170205.assignment2.model.Staff;

public class StaffTest {

	Staff staff;
	private final double delta = 0.00001;
	
	@Before
	public void setUp() {
		staff = new Staff.StaffBuilder(Define.TYPE_OF_STAFF,Define.latestId)
				.setYearOfBirth(1991)
				.setName("Binh Minh")
				.setHomeTown("Da Nang")
				.setDepartment("Training")
				.setYearsOfWork(6)
				.setSalaryRatio((float) 1.2)
				.setPosition(Define.POSITION_OF_CHIEF)
				.setWorkDays(15)
				.setBasicSalary(Define.DEFAULT_BASIC_SALARY)
				.setAllowance(Define.POSITION_OF_CHIEF)
				.build();
	}
	
	@Test
	public void testBuilderSetAllowanceWithDebuty() {
		staff = new Staff.StaffBuilder(Define.TYPE_OF_STAFF,Define.latestId)
				.setPosition(Define.POSITION_OF_DEBUTY)
				.setAllowance(Define.POSITION_OF_DEBUTY).build();
		assertEquals(Define.ALLOWANCE_OF_DEBUTY, staff.getAllowance());
	}
	
	@Test
	public void testBuilderSetAllowanceWithEmployee() {
		staff = new Staff.StaffBuilder(Define.TYPE_OF_STAFF,Define.latestId)
				.setPosition(Define.POSITION_OF_EMPLOYEE)
				.setAllowance(Define.POSITION_OF_EMPLOYEE).build();
		assertEquals(Define.ALLOWANCE_OF_EMPLOYEE, staff.getAllowance());
	}
//
//	@Test
//	public void testInput() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testToString() {
		assertEquals("Staff [homeTown=Da Nang, department=Training, workDays=15, salaryRatio=1.2, allowance=1000, position=Chief, yearsOfWork=6, basicSalary=730.0, id=0, name=Binh Minh, yearOfBirth=1991, type=2]", staff.toString());
	}

	@Test
	public void testGetSalary() {
		assertEquals(2326, staff.getSalary(), delta);
	}

	@Test
	public void testStaff() {
		staff = new Staff();
		assertNotNull(staff);
	}

	@Test
	public void testSetHomeTown() {
		staff.setHomeTown("Ha Noi");
		assertEquals("Ha Noi", staff.getHomeTown());
	}

	@Test
	public void testSetDepartment() {
		staff.setDepartment("Clerical");
		assertEquals("Clerical", staff.getDepartment());
	}

	@Test
	public void testSetWorkDays() {
		staff.setWorkDays(25);
		assertEquals(25, staff.getWorkDays());
	}

	@Test
	public void testSetSalaryRatio() {
		staff.setSalaryRatio((float) 2.0);
		assertEquals(2.0, staff.getSalaryRatio(), delta);
	}

	@Test
	public void testSetAllowanceWithDebuty() {
		staff.setAllowance(Define.ALLOWANCE_OF_DEBUTY);
		assertEquals(600, staff.getAllowance());
	}
	
	@Test
	public void testSetAllowanceWithEmployee() {
		staff.setAllowance(Define.ALLOWANCE_OF_EMPLOYEE);
		assertEquals(400, staff.getAllowance());
	}
	
	@Test
	public void testSetAllowanceWithChief() {
		staff.setAllowance(Define.ALLOWANCE_OF_CHIEF);
		assertEquals(1000, staff.getAllowance());
	}

	@Test
	public void testSetPositionWithChief() {
		staff.setPosition(Define.POSITION_OF_CHIEF);
		assertEquals("Chief", staff.getPosition());
	}
	
	@Test
	public void testSetPositionWithDebuty() {
		staff.setPosition(Define.POSITION_OF_DEBUTY);
		assertEquals("Debuty", staff.getPosition());
	}
	
	@Test
	public void testSetPositionWithEmployee() {
		staff.setPosition(Define.POSITION_OF_EMPLOYEE);
		assertEquals("Employee", staff.getPosition());
	}

	@Test
	public void testSetYearsOfWork() {
		staff.setYearsOfWork(5);
		assertEquals(5, staff.getYearsOfWork());
	}

	@Test
	public void testUpdate() {
		staff.update(750);
		assertEquals(750, staff.getBasicSalary(), delta);
	}

	@Test
	public void testGetId() {
		assertEquals(0, staff.getId());
	}

	@Test
	public void testSetName() {
		staff.setName("Thu Huong");
		assertEquals("Thu Huong", staff.getName());
	}

	@Test
	public void testSetYearOfBirth() {
		staff.setYearOfBirth(1995);
		assertEquals(1995, staff.getYearOfBirth());
	}

	@Test
	public void testGetType() {
		assertEquals(2, staff.getType());
	}

}

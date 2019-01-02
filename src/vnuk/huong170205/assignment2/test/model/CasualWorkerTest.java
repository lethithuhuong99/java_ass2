package vnuk.huong170205.assignment2.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

import vnuk.huong170205.assignment2.define.Define;
import vnuk.huong170205.assignment2.model.CasualWorker;

public class CasualWorkerTest {

	CasualWorker casualWorker;
	private final double delta = 0.00001;
	
	@Before
	public void setUp(){
		casualWorker = new CasualWorker.CasualWorkerBuilder(Define.TYPE_OF_CASUALWORKER,Define.latestId)
				.setName("Nhat Anh")
				.setWorkDays(30)
				.setYearOfBirth(1980)
				.setPriceOfWorkDay(200)
				.build();

	}

//	@Test
//	public void testInput() {
//		casualWorker = new CasualWorker();
//	}

	@Test
	public void testCasualWorker() {
		casualWorker = new CasualWorker();
		assertNotNull(casualWorker);
	}
	
	@Test
	public void testToString() {
		assertEquals("CasualWorker [workDays=30, priceOfWorkDay=200, id=0, name=Nhat Anh, yearOfBirth=1980, type=3]",casualWorker.toString());
	}

	@Test
	public void testGetSalary() {
		assertEquals(6000, casualWorker.getSalary(), delta);
	}

	@Test
	public void testSetWorkDays() {
		casualWorker.setWorkDays(28);
		assertEquals(28, casualWorker.getWorkDays());
	}

	@Test
	public void testSetPriceOfWorkDay() {
		casualWorker.setPriceOfWorkDay(150);
		assertEquals(150, casualWorker.getPriceOfWorkDay());
	}

	@Test
	public void testGetId() {
		assertEquals(0, casualWorker.getId());
	}

	@Test
	public void testSetName() {
		casualWorker.setName("Thu Huong");
		assertEquals("Thu Huong", casualWorker.getName());
	}

	@Test
	public void testSetYearOfBirth() {
		casualWorker.setYearOfBirth(1995);
		assertEquals(1995, casualWorker.getYearOfBirth());
	}

	@Test
	public void testGetType() {
		assertEquals(3, casualWorker.getType());
	}

}

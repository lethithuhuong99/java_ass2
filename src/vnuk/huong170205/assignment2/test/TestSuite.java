package vnuk.huong170205.assignment2.test;
	import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import vnuk.huong170205.assignment2.test.model.CasualWorkerTest;
import vnuk.huong170205.assignment2.test.model.LecturerTest;
import vnuk.huong170205.assignment2.test.model.StaffTest;

	@RunWith(Suite.class)
	@Suite.SuiteClasses({
		LecturerTest.class,
		StaffTest.class,
		CasualWorkerTest.class 
	})

	public class TestSuite {   
		
	} 

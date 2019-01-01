package test;
	import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import vnuk.huong170205.assignment2.model.test.CasualWorkerTest;
import vnuk.huong170205.assignment2.model.test.LecturerTest;
import vnuk.huong170205.assignment2.model.test.StaffTest;

	@RunWith(Suite.class)
	@Suite.SuiteClasses({
		LecturerTest.class,
		StaffTest.class,
		CasualWorkerTest.class 
	})

	public class TestSuite {   
		
	} 

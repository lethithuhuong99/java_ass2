package vnuk.huong170205.assignment2.controller;
import vnuk.huong170205.assignment2.define.Define;
import vnuk.huong170205.assignment2.model.CasualWorker;
import vnuk.huong170205.assignment2.model.Lecturer;
import vnuk.huong170205.assignment2.model.Person;
import vnuk.huong170205.assignment2.model.Staff;
public class PersonFactory {
	public static Person getPerson(int type) {
		Define.latestId ++;
		switch (type) {
		case Define.TYPE_OF_LECTURER: return new Lecturer.LecturerBuilder(type, Define.latestId).build();
		case Define.TYPE_OF_STAFF: return new Staff.StaffBuilder(type, Define.latestId).build();
		case Define.TYPE_OF_CASUALWORKER: return new CasualWorker.CasualWorkerBuilder(type, Define.latestId).build();
		}
		return null;
	}
}























 

package student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StudentService {

	// dao 객체가 필요 -> 필드로 선언
	// @Qualifier("test") 이름을 지정
	@Autowired
	private StudentDAO studentDao;
	
//	public StudentService(StudentDAO studentDao) {
//		this.studentDao = studentDao;
//	}
	
	// 학생정보 등록
	// 학생번호 중복체크, 아이디 중복체크, 등록
	public int insert(StudentVO vo) {
		if (studentDao.isDuplicateStudno(vo.getStudno())) {
			System.out.println("학생번호 중복");
			return 0;
		}
		if (studentDao.isDuplicateId(vo.getId())) {
			System.out.println("아이디 중복");
			return -1;
		}
		int r = studentDao.insert(vo);
		return r;
		
	}
}

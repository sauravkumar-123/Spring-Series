package com.springMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.Dao.StudentDetailDao;
import com.springMVC.Model.StudentDetail;

@Service
public class StudentDetailService {

	@Autowired
	private StudentDetailDao studentdetaildao;
	
    public int createStudentDetail(StudentDetail sd) {
		
		return this.studentdetaildao.saveStudentDetail(sd);
	}
}

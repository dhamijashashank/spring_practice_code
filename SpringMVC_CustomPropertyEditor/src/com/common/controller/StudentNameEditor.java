package com.common.controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor  extends PropertyEditorSupport{
	

	// when you will submit the admission form 
	//spring mvc will run setAsText function of this class
	//before performing  data binding task for studentName property of student object s
	
	@Override
	public void setAsText(String studentName) throws java.lang.IllegalArgumentException {
		
		if (studentName.contains("Mr.")|| studentName.contains("Ms.")){
			setValue(studentName);
		}else{
			studentName = "Ms."+studentName;
			setValue(studentName);
			
			//what ever value you will provide to setValue -- Spring MVC will use the same value to perform 
			//data binding task for studentName property
		}
		
	}

}

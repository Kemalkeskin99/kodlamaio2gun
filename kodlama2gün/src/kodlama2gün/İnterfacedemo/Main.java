package kodlama2gün.İnterfacedemo;

public class Main {

	public static void main(String[] args) {
		TeacherCredit teacherCredit=new TeacherCredit();
		teacherCredit.calculate();
		
		CreditUI creditUI=new CreditUI();
		creditUI.calucate(new AgricultureCredit());
	}

}

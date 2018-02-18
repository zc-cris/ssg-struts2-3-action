package cn.zc.cris.test.result;

public class TestResultAction {
	
	private Integer num;
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public String execute() {
		String result = null;
		if(this.num % 4 == 0) {
			result = "1";
		}else if(this.num % 4 == 1) {
			result = "2";
		}else if(this.num % 4 == 2) {
			result = "3";
		}else {
			result = "4";
		}
		return result;
	}
}

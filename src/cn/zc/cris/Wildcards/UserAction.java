package cn.zc.cris.Wildcards;

public class UserAction {

	public String update() {
		System.out.println("update");
		return "update-success";
	}
	public String add() {
		System.out.println("add");
		return "add-success";
	}
	public String delete() {
		System.out.println("delete1");
		return "delete-success";
	}
	public String query() {
		System.out.println("query");
		return "query-success";
	}
}

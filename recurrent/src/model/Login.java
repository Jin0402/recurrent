package model;

public class Login {
	//フィールド
	private String Id;
	private String pass;

	//コンストラクタ
	public Login(String Id, String pass) {
		this.Id = Id;
		this.pass = pass;
	}

	//ゲッター
	public String getId() {return Id;}
	public String getPass() {return pass;}

}

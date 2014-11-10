package co.edu.eafit.nocomasolo.application.to;

public class UserTO {

	private String name;
	private String email;
	private String language;
	private String major;
	
	public UserTO() {
		
	}
	
	public UserTO(String name, String email, String language, String major) {
		this.name = name;
		this.email = email;
		this.language = language;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}

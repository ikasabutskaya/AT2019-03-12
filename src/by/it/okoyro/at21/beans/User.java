package by.it.okoyro.at21.beans;

import java.util.Date;

public class User {
	private long id;
	private String username;
	private String password;
	private String email;
	private Date create_time;

	public User() {
	}

	public User(long id, String username, String password, String email, Date create_time) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.create_time = create_time;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}

	public Date getDate() {
		return create_time;
	}

	public void setDate(Date date) {
		this.create_time = date;
	}

	@Override
	public String toString() {
		return "User{" +
			   "id=" + id +
			   ", username='" + username + '\'' +
			   ", password='" + password + '\'' +
			   ", email='" + email + '\'' +
			   ", create_time=" + create_time +
			   '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

		if (username != null ? !username.equals(user.username) : user.username != null) return false;
		if (password != null ? !password.equals(user.password) : user.password != null) return false;
		if (email != null ? !email.equals(user.email) : user.email != null) return false;
		return create_time != null ? create_time.equals(user.create_time) : user.create_time == null;
	}
}

package com.utter.mongo.api.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="users")
public class UserObj {
	
	@Id
	private ObjectId id;
	private String firstname;
	private String lastname;
	private String handlename;
	private String bio;
	private String location;
	private String profilepic;
	private String joinedDt;
	private String incircles;
	private long utterCount;
	
	
	public UserObj(ObjectId id, String firstname, String lastname, String handlename, String bio, String location,
			String profilepic, String joinedDt, String incircles, long utterCount) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.handlename = handlename;
		this.bio = bio;
		this.location = location;
		this.profilepic = profilepic;
		this.joinedDt = joinedDt;
		this.incircles = incircles;
		this.utterCount = utterCount;
	}
	
	
	public String getId() {
		return id.toHexString();
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getHandlename() {
		return handlename;
	}
	public void setHandlename(String handlename) {
		this.handlename = handlename;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getProfilepic() {
		return profilepic;
	}
	public void setProfilepic(String profilepic) {
		this.profilepic = profilepic;
	}
	public String getJoinedDt() {
		return joinedDt;
	}
	public void setJoinedDt(String joinedDt) {
		this.joinedDt = joinedDt;
	}
	public String getIncircles() {
		return incircles;
	}
	public void setIncircles(String incircles) {
		this.incircles = incircles;
	}
	public long getUtterCount() {
		return utterCount;
	}
	public void setUtterCount(long utterCount) {
		this.utterCount = utterCount;
	}


	@Override
	public String toString() {
		return "UserObj [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", handlename="
				+ handlename + ", bio=" + bio + ", location=" + location + ", profilepic=" + profilepic + ", joinedDt="
				+ joinedDt + ", incircles=" + incircles + ", utterCount=" + utterCount + "]";
	}
	
	
	
	
}

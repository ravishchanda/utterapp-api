package com.utter.mongo.api.model;


 
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="utter")
public class UtterObj {
	
	@Id
	private ObjectId _id;
	private String utterref;
	private String authorname;
	

	public UtterObj(ObjectId _id, String utterref, String authorname) {
 		this._id = _id;
		this.utterref = utterref;
		this.authorname = authorname;
	}
	
	
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	
	public String getUtterref() {
		return utterref;
	}
	public void setUtterref(String utterref) {
		this.utterref = utterref;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	
	
}

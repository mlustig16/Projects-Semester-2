package finance;
import java.io.Serializable;
import java.util.UUID;

import finance.appData.IAppObject;

public class AccountInfo implements IAppObject, Serializable {
		
	private static final long serialVersionUID = 6882575160362464416L;
	
	public static final String TableName = "ACCOUNTINFO";
	
	protected Long id;
	protected String type;
	protected int savings;
	protected int checking;
	private String dueDate;
	private boolean completed;
	
	public AccountInfo() {
		this.id = UUID.randomUUID().getMostSignificantBits();
	}
	
	public Long getId() { return this.id; }
	public void setId(Long id) { this.id = id; }

//	public String getName() { return this.name; }
//	public void setName(String name) { this.name = name; }
	
	public String getType() { return this.type; }
	public void setType(String type) { this.type = type; }
	
	public String getDueDate(){return dueDate;}
	public void setDueDate(String d){this.dueDate = d;}
	
	public boolean getCompleted(){return completed;}
	public void setCompleted(Boolean b){this.completed = b;}
	
	
	public String toHTMLElement() {
		// TODO fill out this method to include all the relevant information
		return "<h4>" + 
					this.savings + 
				"</h4>" + 
				"<h5>Type: " + this.type + "</h5>" +
				"<h5>Due Date: " + this.dueDate + "</h5>" +
				"<h5>Completed: " + this.completed + "</h5>" +
				"<hr>";
	}
}
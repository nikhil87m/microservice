package com.ibm.poc.req;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("JobList")
public class LearningReqObj {
	@Id
	private String order_number;
	
	@Indexed(name = "job_id")
	private String job_id;
	private String job_type;
	private String priority;
	private String profile;
	private String cluster_class;
	
	private Action action;
	public String getOrder_number() {
		return order_number;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getJob_type() {
		return job_type;
	}
	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getCluster_class() {
		return cluster_class;
	}
	public void setCluster_class(String cluster_class) {
		this.cluster_class = cluster_class;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "LearningReqObj [order_number=" + order_number + ", job_id=" + job_id + ", job_type=" + job_type
				+ ", priority=" + priority + ", profile=" + profile + ", cluster_class=" + cluster_class + ", action="
				+ action + "]";
	}
	
	

}

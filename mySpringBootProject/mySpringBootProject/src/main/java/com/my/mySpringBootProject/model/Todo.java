package com.my.mySpringBootProject.model;

import java.util.Date;

public class Todo {
		private int id;
		private String description;
		private String name;
		private Date targetDate;
		private boolean isCompleted;
		
		public Todo(int id, String name, String description, Date targetDate, boolean isCompleted) {
			super();
			this.id = id;
			this.description = description;
			this.name = name;
			this.targetDate = targetDate;
			this.isCompleted = isCompleted;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getTargetDate() {
			return targetDate;
		}

		public void setTargetDate(Date targetDate) {
			this.targetDate = targetDate;
		}

		public boolean isCompleted() {
			return isCompleted;
		}

		public void setCompleted(boolean isCompleted) {
			this.isCompleted = isCompleted;
		}

		@Override
		public String toString() {
			return "Todo [id=" + id + ", description=" + description + ", name=" + name + ", targetDate=" + targetDate
					+ ", isCompleted=" + isCompleted + "]";
		}

	 
	
		
		
}

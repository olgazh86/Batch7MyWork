package com.syntax.class23;
	public class subInfo extends userClass {
		
		String userAdress;
		
		public subInfo(String name,String mobileNumber,String userAdress){
			super(name,mobileNumber);
			this.userAdress = userAdress;
		}
		
		public void userDetails() {
				System.out.println(name+ " "+mobileNumber+ ""+userAdress);
			}

	}

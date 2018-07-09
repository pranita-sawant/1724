package pojo;

public class Player {
	
		private String name;
		private int age;
		private String team;
		
		public Player(){
			name="";
			age=0;
		}
		
		public Player(String name,int age){
			this.name=name;
			this.age=age;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}
		
		public void kick(){
			System.out.println("Kick");
		}
		
		public void team_details(){
			System.out.println("Team Details:");
			System.out.println("1. Pranita");
			System.out.println("2. Lloyd");
			System.out.println("3. Afsar");
		}
		
	}

package testDemo;

public class Testing {
		int age;
		String name;
		String province;
		
		Testing(int age, String name, String province) {
			this.age = age;
			this.name = name;
			this.province = province;
		}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProvince() {
			return province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String toString() {
		
			return this.name + " " + this.age + " " + this.province;
		}
		
		
}

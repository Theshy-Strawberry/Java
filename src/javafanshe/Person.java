package javafanshe;

public class Person {

		private  String name;
		private  int age;
		public String getName() {
			return name;
		}
		public void setName(String name,Integer age) {
			System.out.println(name+"he"+age);
		}
		public int getAge() {
			return age;
		}
		@Validator(min=15,max=35)
		public void setAge(int age) {
			this.age = age;
		}
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (age != other.age)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
			
}

package inheretance;

class apples{
	public static void main(String[] args){
		
		Animal[] thelist = new Animal[2];//main aspect of polymorphsim is putting objects into an array and loop through it 
		dog d = new dog();
		fish f = new fish();
		
		thelist[0] =d;
		thelist[1] =f;
		
		for (Animal x: thelist){
			x.noise();
			
		}
	}
}

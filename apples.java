package inheretance;

class apples {
	public static void main(String[] args){
		food ehsun[] = new food[2]; //food type
		ehsun[0] = new potpie();
		ehsun[1] = new tuna();
		
		for(int x=0;x<2;++x){
			ehsun[x].eat(); //loop through every object and call eat method 
		}
 	}
}

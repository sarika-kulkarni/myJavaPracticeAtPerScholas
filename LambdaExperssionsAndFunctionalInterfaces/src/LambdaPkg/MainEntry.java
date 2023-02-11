package LambdaPkg;

class MainEntry{
  Calc <Integer> add =new Calc<Integer>() {
	  private int addition =0;
	@Override
	public void compute(int[] array) {
		for(int i =0; i<array.length;i++) {
			addition =addition+array[i];
			System.out.println("Addition of numbers is:" + addition);
		}
		
	}
  };
}


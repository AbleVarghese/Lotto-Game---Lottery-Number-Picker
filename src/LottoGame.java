import java.util.Scanner;
import java.util.Random;

public  class LottoGame {

	//Instance Variables
	
	private int[] _elementArray; //6 (store final numbers)elements
	private int _elementNum;  //number of final elements so total 6 numbers 
	private int  []_numberArray; //(set 1-49)
	private Random _rnd;
	private int setSize;



//Getters and Setters
	public int[] get_elementArray() {
		return _elementArray;
	}



	public void set_elementArray(int[] _elementArray) {
		

	}



	public int get_elementNum() {
		return _elementNum;
	}



	public void set_elementNum(int _elementNum) {
		this._elementNum = _elementNum;
	}



	public int[] get_numberArray() {
		return _numberArray;
	}



	public void set_numberArray(int[] _numberArray) {
	
	}



	public Random get_rnd() {
		return _rnd;
	}



	public void set_rnd(Random _rnd) {
		this._rnd = _rnd;
	}



	public int getSetSize() {
		return setSize;
	}



	public void setSetSize(int setSize) {
		this.setSize = setSize;
	}
	


	
//Methods
	
	
	//Constructor	
		public LottoGame(int elementNum, int setSize) {
			// TODO Auto-generated constructor stub
		}
		
	
	// initialize array btwn 1 to set size
	public void initialize(){
		
		//Number array initialize
		int []_numberArray= new int[50];
		for(int i=0;i<=getSetSize();i++){
		_numberArray[i]=i;
	}
		
	//elementArrayInitialize	
		int size= getSetSize();
		int []_elementArray= new int[size];
		for(int k=0;k<=getSetSize();k++){
		System.out.println(_numberArray[k]);
		}
		
		
	 
		for(int i=0;i<=size;i++){
		_elementArray[i]=i;
	}
}

	
	
	//picking elements from the number array
	public void pickElements(){
		int elementSize = get_elementNum();
		
		
		int []_elementArray= new int[elementSize];
		for(int i=0;i<=elementSize;i++){
			random_numberArray
		_elementArray[i]= 
	}		
		
		
	
	
	}	
	
	
}

package oops;

public class ComplexNum {
   int real;
   int img;
   
	 ComplexNum(int real, int img) {
		// TODO Auto-generated constructor stub
		this.real=real;
		this.img=img;
	}

	public void add(ComplexNum c2) {
		// TODO Auto-generated method stub
		this.real=this.real+c2.real;
		this.img=this.img+c2.img;
		
		
		
		
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(real+"+"+img+"i");
		
	}

	public void multiply(ComplexNum c2) {
		// TODO Auto-generated method stub
		 this.real= this.real*c2.real-this.img*c2.img;          
	      this.img=this.real*c2.img+this.img*c2.real;
	     
		
	}

}

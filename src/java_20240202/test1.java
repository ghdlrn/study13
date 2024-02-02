package java_20240202;

public class test1 {

	   public static void main(String[] args) {

	      new Sample();
	      new Sample();
	      new Sample();
	      new Sample();
	      new Sample();
	   
	      System.out.println(Sample.count);
	      
	   }

	}


	class Sample{
	   static int count;
	   
	   public Sample() {
	      count++;
	   }
	}


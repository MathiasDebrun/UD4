
public class Partecinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int A=1;
		int B=2;
		int C=3;
		int D=4;
		
		System.out.println("Valores iniciales son: A=" +A +" B=" +B +" C=" +C +" D=" +D);
		B=C;
		C=A;
		A=D;
		D=B;
		System.out.println("Valores finales son: A=" +A +" B=" +B +" C=" +C +" D=" +D);
	}

}

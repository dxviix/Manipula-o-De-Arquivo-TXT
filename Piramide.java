
public class Piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valores[]= "67  34 25    03 91 11      33 89 29 01".split("  ");
		int ProxLinha = 1, ContLinha= 0;
			
			for (int i= 0; i < valores.length; i++) {
				ContLinha++;
				System.out.print(valores[i]);
				
				if (ContLinha == ProxLinha) {
					ContLinha= 0;
					ProxLinha++;
					System.out.println();
				}
			}
			System.out.println();
				
}
}
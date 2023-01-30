import java.util.Scanner;

public class main {
    	public static void main(String[] args){
    		System.out.println("Ryabovol Ilya");
    		System.out.println(main2( 210,195));
    		main3();
    		main4();
		}
		public static int main2(int a, int b ){
    		return(a-b);
		}
		public static void main3(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первое число");
		int a = scanner.nextInt();
		System.out.println("Введите второе число");
		int b = scanner.nextInt();
		System.out.println("Введите третье число");
		int c = scanner.nextInt();
		mainsum(a,b,c);
	}
	public static  int mainsum(int a, int b, int c){
    		int sum = a+b+c;
    		System.out.println("Сумма=" +sum);
    		return sum;
	}
	public static void main4(){
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("Введите радиус окружности");
    		int x = scanner.nextInt();
    		double pi = 3.14;
    		mainpl(x,pi);
    		mainok(x,pi);
	}
	public static double mainpl(int x, double pi){
    		double pl = x*x*pi;
    		System.out.println("Площадь круга="+pl);
    		return pl;
	}
	public static double mainok(int x, double pi){
		double ok = 2*pi*x;
		System.out.println("Длинна окружности="+ok);
		return ok;
	}


}



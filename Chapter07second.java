
public class Chapter07second {
	public static void main(String[] args) {
		String color = "red";
		switch(color) {
		case "red":
			System.out.println("赤信号");
			break;
		case "yellow":
			System.out.println("黄信号");
			break;
		case "bule":
			System.out.println("青信号");
			break;
		default:
			System.out.println("信号の色ではありません");
		} 
	}
}

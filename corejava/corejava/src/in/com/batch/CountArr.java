package in.com.batch;

public class CountArr {
public static void main (String[]args) {
	int number = 15719;
	int [] note = {500,200,100,50,20,10,5,2,1};
	int count =0;
	for (int i =0;i<note.length;i++) {
		count = number/note[i];
		if (count>0) {
			System.out.println(note[i]+ " =" + count);
		}
		number = number%note[i];
	}
	}
}

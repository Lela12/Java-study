
import java.io.IOException;


public class Main21 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
	}

	public static String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++) {
        	if(seoul[i].equals("Kim") == true) {
        		answer = "�輭����" + i +"�� �ִ�";
        	}
        }
        
        return answer;
    }
}

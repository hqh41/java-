import java.util.*;
public class Card{
	public String poker(int num){
		String a = "";
		String[] type = {"♥","♠","♣","♦"};
		String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
		        "J", "Q", "K"};
		a += type[num % 4] + number[num % 13];
		return a;
	}
	
	public static void main(String[] args){
		int num = 52;
		Card card = new Card();
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < 52; i++){
			list.add(card.poker(i));
		}
		for(int i = 0; i < list.size(); i++){
			System.out.printf("%s\t", list.get(i));
			if((i+1) % 13 == 0)
				System.out.println();
		}
		System.out.println("洗牌后");
		Collections.shuffle(list);
		for(int i = 0; i < list.size(); i++){
			System.out.printf("%s\t", list.get(i));
			if((i+1) % 13 == 0)
				System.out.println();
		}
	}
}
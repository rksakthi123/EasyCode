import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class DynamicProgramsString {

	
	//checkVowelsInString
	//reverseWordsInString
	//checkAnagram
	//removeDuplicateInString
	//checkBalancedString
	
	public static void main(String[] args) {
		DynamicProgramsString obj=new DynamicProgramsString();
		obj.checkAnagram();
		obj.reverseWordsInString();
		obj.checkVowelsInString();
		obj.wordsCount();

	}
	
	public void wordsCount() {
		System.out.println("checkVowelsInString:");
		System.out.println("-----------------------");
		String words[]= {"india","sakthi","tamil","sakthi","tamil","india","sakthi"};
		Map<String, Integer> mapCount=new HashMap<String, Integer>();
		for(String word:words) {
			if(!mapCount.containsKey(word)) {
				mapCount.put(word, 1);
			}
			else {
				mapCount.put(word, mapCount.get(word)+1);
			}
		}
		System.out.println(mapCount);
		System.out.println("==============================================\n\n");
	}
	
	public void checkVowelsInString() {
		System.out.println("checkVowelsInString:");
		System.out.println("-----------------------");
		String input="sssss";
		if(input.matches(".*[aeiou].*")) {
			System.out.println("Vowels present in string");
		}
		else {
			System.out.println("Vowels not present in string");
		}
		System.out.println("==============================================\n\n");
	}
	
	public void reverseWordsInString() {
		System.out.println("reverseWordsInString:");
		System.out.println("-----------------------");
		String input="India is my country",output="";
		String[] inputArray=input.split(" ");
		for(String str:inputArray) {
			output=str+" "+output;
		}
		System.out.println(output);
		System.out.println("==============================================\n\n");
	}
	
	public void checkAnagram() {
		System.out.println("checkAnagram:");
		System.out.println("-------------");
		String input1="aba",input2="baa";
		Map<Character, Integer> map1=new HashMap<Character, Integer>();
		Map<Character, Integer> map2=new HashMap<Character, Integer>();
		if(input1.length()==input2.length()) {
			for(int i=0;i<input1.length();i++) {
				if(!map1.containsKey(input1.charAt(i))) {
					map1.put(input1.charAt(i), 1);
				}
				else {
					map1.put(input1.charAt(i), map1.get(input1.charAt(i))+1);
				}
				if(!map2.containsKey(input2.charAt(i))) {
					map2.put(input2.charAt(i), 1);
				}
				else {
					map2.put(input2.charAt(i), map2.get(input2.charAt(i))+1);
				}
			}
			if(map1.equals(map2)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
		else {
			System.out.println("Not Anagram");
		}
		System.out.println("==============================================\n\n");
		
	}
	
	public void removeDuplicateInString() {
		String input="Helle";
		String output="";
		for(char ch:input.toCharArray()) {
			if(!output.contains(String.valueOf(ch))) {
				output+=ch;
			}
		}
		System.out.println(output);
	}
	
	public void checkBalancedString() {
		String input="";
		Stack<Character> st=new Stack<Character>();
		if(input.length()==0) {
			System.out.println("Empty String");
			return;
		}
		for(char ch:input.toCharArray()) {
			if(ch=='{'||ch=='['||ch=='(') {
				st.push(ch);
			}
			else {
				if(st.empty()) {
					System.out.println("Not balanced String");
					return;
				}
				char latestCharacter=st.pop();
				if(latestCharacter=='{'&&ch!='}') {
					System.out.println("Not balanced String");
					return;
				}
				else if(latestCharacter=='['&&ch!=']') {
					System.out.println("Not balanced String");
					return;
				}
				else if(latestCharacter=='('&&ch!=')') {
					System.out.println("Not balanced String");
					return;
				}
				
			}
		}
		if(st.size()>0) {
			System.out.println("Not balanced String");
		}
		else {
			System.out.println("Balanced String");
		}
		
	}

}

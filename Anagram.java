import java.util.Arrays;

public class Anagram {

    public static Boolean checkAnagram(String str, String str1){

        if(str.length()!=str1.length()){
            return false;
        }

        char[] arr1 = str.toLowerCase().toCharArray();
        char[] arr2 = str1.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static Boolean checkAnagram1(String str, String str1){

        if(str.length()!=str1.length()){
            return false;
        }

        char[] arr1 = str.toLowerCase().toCharArray();
        char[] arr2 = str1.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
	
	public static Boolean checkAnagram2(String str, String str1){

        if(str.length()!=str1.length()){
            return false;
        }

        char[] arr1 = str.toLowerCase().toCharArray();
        char[] arr2 = str1.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args){

        String s2= "Silent";
		String s1= "listen";
        abc;
		bcd;
		zzz;
		rrr;
		ftg;
		mmm;
		
		im local branch of develope;

		im local branch of develope user 2 frt der;

    }
}

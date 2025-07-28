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

        String s1= "listen";
        String s2= "Silent";
        checkAnagram(s1, s2);
        System.out.println("Demo");
        System.out.println("Git");
		System.out.println("Demo");
        System.out.println("Git");
		System.out.println("Demo");
        System.out.println("Git");

    }
}

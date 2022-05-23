package Assessment;

public class problem6 {
	
	 static void convert(StringBuffer str)
	    {
	        int ln = str.length();
	 
	        for (int i = 0; i < ln; i++) {
	            Character c = str.charAt(i);
	            if (Character.isLowerCase(c))
	                str.replace(i, i + 1,
	                            Character.toUpperCase(c) + "");
	            else
	                str.replace(i, i + 1,
	                            Character.toLowerCase(c) + "");
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        StringBuffer str= new StringBuffer("Hello world!");
	        StringBuffer str1= new StringBuffer("JavaScript language 1.8");
	        StringBuffer str2= new StringBuffer("A letter");
	        convert(str);
	        System.out.println(str);
	        convert(str1);
	        System.out.println(str1);
	        convert(str2);
	        System.out.println(str2);
	    }
	}


				



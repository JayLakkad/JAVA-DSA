public class Stringcomparation{
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i =0;i<str.length();i++)
        {
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;

            }
            sb.append(str.charAt(i));
            if(count >1)
            {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
       String str = "aaabbbcc";
        System.out.println(compress(str));
    }
}

// String Intern:
// We know that creating an object is a costly operation
//in Java. Therefore, to save time, Java developers came up
//with the concept of String Constant Pool (SCP). The SCP is an area inside the heap memory. It contains the unique strings. 
//In order to put the strings in the string pool, one needs to call the intern() method.
// Before creating an object in the string pool, the JVM checks whether the string is already present in the pool or not.
//If the string is present, its reference is returned.


//  String str = new String("Welcome to JavaTpoint").intern(); // statement - 1  
// String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2  
// System.out.println(str1 == str); // prints true  
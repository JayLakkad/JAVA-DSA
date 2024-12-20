public class RemoveDuplicatesfromString {
    public static void main(String[] args) {
        String s = "appnnacollege";
        StringBuilder sb = new StringBuilder();
        boolean map[] = new boolean[26];
        RemoveDuplicates(s,0,sb,map);
    }
    public static void RemoveDuplicates(String s ,int i,StringBuilder sb,boolean map[]){
        if(i==s.length()){
            System.out.println(sb);
            return;
        }
        char currChar = s.charAt(i);
        if(map[currChar-'a']==true){
            RemoveDuplicates(s,i+1,sb,map);
        }
        else{
            map[currChar-'a']=true;
            RemoveDuplicates(s,i+1,sb.append(currChar),map);
        }
    }
}

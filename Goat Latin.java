class Solution {
    public String toGoatLatin(String S) {
        String[] s = S.split(" ");
        for(int i=0;i<s.length;i++){
            StringBuilder sb = new StringBuilder(s[i]);
            char c = sb.charAt(0);
            int len=i+1;
            if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')){
                sb.deleteCharAt(0);
                sb.append(c);
            }
            sb.append("ma");
            while(len-->0){
                sb.append("a");
            }
            s[i]=sb.toString();
        }
        return String.join(" ", s);

    }
}

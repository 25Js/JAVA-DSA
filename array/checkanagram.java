package array;
class checkanagram {
    public static void main(String[] args) {
        String a="hello";
        String b="olieh";
        int one[]= new int[26];

        a = a.toLowerCase();
        b = b.toLowerCase();

        for(int i=0;i<a.length();i++){
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                one[a.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<b.length();i++){
            if(b.charAt(i) >= 'a' && b.charAt(i) <= 'z') {
                one[b.charAt(i)-'a']--;
            }
        }
        boolean isAnagram = true;
        for(int i=0;i<26;i++){
            if(one[i]!=0){
                System.out.println("not anagram");
                isAnagram = false;
                break;
            }
        }
        if(isAnagram) {
            System.out.println("String are anagram");
        }
    }
}

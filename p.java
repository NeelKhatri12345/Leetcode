class p{
    public static void main(String[] args) {
        String s = "Hello World";
        s.toLowerCase();
        int vowel = 0;
        int consonant = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            }
            else{
                consonant++;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
    }
   
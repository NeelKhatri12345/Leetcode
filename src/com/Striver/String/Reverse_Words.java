package com.Striver.String;

class Solution {
    public static void reverseWords(String s) {

        String s1 = s.trim().replaceAll("\\s+", " ");

        String[] word = s1.split(" ");

        int left = 0;
        int right = word.length - 1;
        while (left < right) {
            String temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }

        System.out.println( String.join(" ", word));
    }

    public static void main(String[] args) {
        reverseWords("the sky is blue");
    }

}


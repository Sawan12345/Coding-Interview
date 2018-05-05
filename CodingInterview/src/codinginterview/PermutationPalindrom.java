/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codinginterview;

/**
 *
 * @author Komal
 */
public class PermutationPalindrom {
//Coding Interview que2
    //function for palindrom
    public boolean Palindrom(String str) {
        int n = str.length();

        //if length is even
        if (n % 2 == 0) {
            for (int i = 0; i < (n / 2) - 1; i++) {
                if (str.charAt(i) != str.charAt(n - i - 1)) {
                    // System.out.println("not palindrom");
                    return false;
                }
            }
            System.out.println("even palindrom");
            return true;

        }

        for (int i = 0; i < (n - 1 / 2) - 1; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                //System.out.println("not palindrom");
                return false;
            }
        }
        System.out.println("odd palindrom");
        return true;

    }

    public void Permute(String str, int l, int r) {
        //comparing string with palindrom value
        if (l == r && Palindrom(str)) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                Permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}

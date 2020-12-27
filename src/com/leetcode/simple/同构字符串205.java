package com.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串s和t，判断它们是否是同构的。
 * <p>
 * 如果s中的字符可以被替换得到t，那么这两个字符串是同构的。
 * <p>
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "egg", t = "add"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: s = "paper", t = "title"
 * 输出: true
 * 说明:
 * 你可以假设s和 t 具有相同的长度。
 */
public class 同构字符串205 {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> hashMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                if(hashMap.containsValue(t.charAt(i)))return false;
                hashMap.put(s.charAt(i),t.charAt(i));
            }else {
               if(hashMap.get(s.charAt(i))!=t.charAt(i)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isomorphic = isIsomorphic("abc", "cba");
        System.out.println("isomorphic = " + isomorphic);
    }
}

package com.venki.playground.tensa.zangetsu.misc;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by vm023561 on 4/24/15.
 */
public class Miscellaneous {

    public static boolean isValidNumber(final String input){
        assert input!=null;
        boolean isDotFound = false;
        boolean isSignFound = false;
        boolean isNumberStarted = false;

        for(final Character character: input.toCharArray()){
            switch(character){
                case '+': if(isDotFound||isSignFound||isNumberStarted) {
                    return false;
                } else{
                    isSignFound=true;
                }
                case '-': if(isDotFound||isSignFound||isNumberStarted) {
                    return false;
                } else{
                    isSignFound=true;
                }
                case '0':isNumberStarted=true;
                    break;
                case '1':isNumberStarted=true;
                    break;
                case '2':isNumberStarted=true;
                    break;
                case '3':isNumberStarted=true;
                    break;
                case '4':isNumberStarted=true;
                    break;
                case '5':isNumberStarted=true;
                    break;
                case '6':isNumberStarted=true;
                    break;
                case '7':isNumberStarted=true;
                    break;
                case '8':isNumberStarted=true;
                    break;
                case '9':isNumberStarted=true;
                    break;
                case '.': if(isDotFound) {
                    return false;
                } else{
                    isDotFound=true;
                }
                default: return false;



            }

            
        }
        
        return true;
    }

    public static Set<Character> findCommonCharacter(final List<String> input) {

        assert input !=null;

        final HashMap<Character,Integer> characterCountMap = Maps.newHashMap();
        final Set<Character> output = Sets.newHashSet();

        for(final String string: input){
            Set<Character> charSet = Sets.newHashSet();
            for(final Character character: string.toCharArray()){
                charSet.add(character);
            }
            for(final Character ch: charSet){
                if(!characterCountMap.containsKey(ch)){
                    characterCountMap.put(ch,1);
                } else{
                    int value = characterCountMap.get(ch);
                    characterCountMap.put(ch,++value);
                }
            }
        }

        for(final Map.Entry<Character,Integer> entry: characterCountMap.entrySet()){
            if(entry.getValue()==input.size()){
                output.add(entry.getKey());
            }
        }


        return output;
    }

    public static class CustomCache<K, V> {

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {
            return "CustomCache [map=" + map.toString() + "]";
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((map == null) ? 0 : map.hashCode());
            return result;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            CustomCache other = (CustomCache) obj;
            if (map == null) {
                if (other.map != null)
                    return false;
            } else if (!map.equals(other.map))
                return false;
            return true;
        }

        private final Map<K, V> map;

        public CustomCache(final int cacheSize) {

            this.map = new LinkedHashMap<K, V>(cacheSize, 0.75f, false) {
                /**
                 * The serialVersionUID.
                 */
                private static final long serialVersionUID = -7191845141466668312L;

                @Override
                protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                    return size() > cacheSize;
                }
            };
        }

        public synchronized void put(K key, V elem) {
            map.put(key, elem);
        }

        public synchronized V get(K key) {
            return map.get(key);
        }

        public synchronized V atomicGetAndSet(K key, V elem) {
            V result = get(key);
            put(key, elem);
            return result;
        }
    }

    public static class Student{
        int id;
        int marks;
        String name;

        public Student(final int id, final int marks, final String name){
            this.id=id;
            this.marks=marks;
            this.name=name;
        }

        public int getMarks ()
        {
            return marks;
        }

        public void setMarks (int marks)
        {
            this.marks = marks;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public int getId ()
        {
            return id;
        }

        public void setId (int id)
        {
            this.id = id;
        }

        @Override public String toString ()
        {
            return "Student{" +
                    "id=" + id +
                    ", marks=" + marks +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static class StudentComparator implements Comparator<Student>{

        @Override public int compare (Student o1, Student o2)
        {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static int distance(String str,String a,String b){
        int aIndex=-1;
        int bIndex=-1;
        int minDistance=Integer.MAX_VALUE;
        String[] aS=str.toLowerCase().split("[ \t]+");
        int i=0;
        for(String t:aS){
            if(t.equals(a)){
                aIndex=i;
            }
            if(t.equals(b)){
                bIndex=i;
            }
            if(aIndex!=-1 && bIndex!=-1){
                minDistance= minDistance > Math.abs(bIndex-aIndex) ? bIndex-aIndex : minDistance;
            }
            i++;
        }

        if(aIndex ==-1 || bIndex==-1)
            return -1;
        else
            return minDistance;
    }

    public static double power(double base, int exponent){

        double intermediateValue;
        double cachedAnswer;
        if( exponent == 0)
            return 1;
        intermediateValue = power(base, exponent/2);
        cachedAnswer=intermediateValue*intermediateValue;
        if (exponent%2 == 0)
            return cachedAnswer;
        else
        {
            if(exponent> 0)
                return base*cachedAnswer;
            else
                return cachedAnswer/base;
        }
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i=0;i<(n / 2) + 1;++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isWordsPalindrome(final List<String> words){

        if(words.size()%2==0){
            int start = 0;
            int end = words.size()-1;

            final String startWord = words.get(start);
            final String endWord = words.get(end);



        } else{

        }

        return false;
    }



}

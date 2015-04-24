package com.venki.playground.tensa.zangetsu.misc;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.HashMap;
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
}

package zipcode;

public class Hamming {
   int hammingDistance;
    public Hamming(String s, String s1) throws IllegalArgumentException{
        if (s.length() != s1.length()){throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");}
        hammingDistance = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s1.charAt(i)){
                    hammingDistance++;
                }
        }
    }

    public int getHammingDistance() {
        return hammingDistance;
    }


    }

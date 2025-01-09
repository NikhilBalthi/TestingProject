package org.example;

class HelloWorld {
    public static void main(String[] args) {
        String strs[] = {"flowers","fly","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs1){
        if(strs1.length==0) return "";
        String prefix = strs1[1];
        for(int i=1;i<strs1.length;i++){
            while (strs1[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0) return "";
            }

        }
        return prefix;
    }
}

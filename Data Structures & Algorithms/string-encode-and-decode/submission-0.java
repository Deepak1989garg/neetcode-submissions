class Solution {

    public String encode(List<String> strs) {

        StringBuilder builder = new StringBuilder();

        for(String str : strs){
            int length = str.length();
            builder.append(length);
            builder.append("#");
            builder.append(str);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;

            //find length 4#test5#check
            while(str.charAt(j) != '#'){
                j++;
            }

            //find out 4 and converted into integer
            int len = Integer.parseInt(str.substring(i,j));  
            //point j at string
            j++;

            list.add(str.substring(j,j+len));

            //update i
            i = j + len;
        }

        return list;
    }
}

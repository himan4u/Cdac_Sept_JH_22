 class String2 {
    public static void main(String[] args) {
        String string1 = "java";
        int count;
		
        char string[] = string1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    
                }
            }  
            if(count > 1 )
                System.out.println(string[i]);
        }
    }
} 
public class series {
    
    public static void main(String args[]){
        int ln = 4;//Number of lines/rows
        
        for (int i=1; i<ln; i++){
            //Spacing logic 
            
            for (int s=i; s<=ln; s++ ){
                System.out.print (" ");

            }

            for (int j=1, p=i; j<=i; j++, p++){
                System.out.print(p+" ");
                
                if (j==i){
                    p--;
                    for (int k=1; k<i; k++,--p){
                        System.out.print(p+" ");
                    }
                }
            }
         System.out.println();
        }  

    }
     
}

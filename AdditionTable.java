class AdditionTable{
    public static void main (String args[]){
        int [][] numbers =new int [10][10];
        for (int i=0; i<=numbers.length;i++){
        for(int j=0;j<=numbers.length;j++){ 
            System.out.print(j+i+"\t");
        }
        System.out.println("\n");
    } 
        
    }
} 
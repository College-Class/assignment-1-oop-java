class Question1{ 

    public static void main(String[] args)  { 
    

int chickenCount = 3;
int eggsPerChicken = 5;  
int totalEggs = 0 ;  
int eggsPerDay =0 ; 

String[] days = {"Monday", "Tuesday", "Wednesday"}; 

for (int i =0; i<days.length; i++) { 

if(days[i]=="Monday") {    
    eggsPerDay =  chickenCount * eggsPerChicken ; 
    totalEggs = totalEggs +eggsPerDay ; 

    System.out.println("Total Eggs on Monday : "+ eggsPerDay + " ");

}
if(days[i]=="Tuesday") {   

    chickenCount = chickenCount +1 ;  
    eggsPerDay = chickenCount * eggsPerChicken ; 
    totalEggs = totalEggs + eggsPerDay ; 
    System.out.println("Total Eggs on Tuesday : "+ eggsPerDay + " ");

}
if(days[i]=="Wednesday") {  

    chickenCount = chickenCount/2 ;  
    eggsPerDay = chickenCount * eggsPerChicken ; 
    totalEggs = totalEggs + eggsPerDay ;
        System.out.println("Total Eggs on Wednesday : "+ eggsPerDay + " ");
}


} 

  System.out.println("Total Eggs: "+ totalEggs + " ");
 



    }
}
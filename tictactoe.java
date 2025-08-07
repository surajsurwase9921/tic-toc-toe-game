import java.util.Scanner;
class tictactoe 
{ 
 static String X[][]; 
 public static void main(String a[]) 
 { 
  X=new String[3][3]; 
  for(int i=0;i<3;i++) 
  { 
   for(int j=0;j<3;j++) 
   { 
    X[i][j]=" "; 
   } 
  } 
  Scanner sc=new Scanner(System.in); 
  System.out.println("\n\nEnter name of two players: "); 
  String p1=sc.next(); 
  String p2=sc.next(); 
   
  int turn=0; 
  String result=""; 
  int im=0; 
  while(turn<(9+im)) 
  { 
   if(turn%2==0) 
   System.out.println("\n\n"+p1+" "); 
   else 
   System.out.println("\n\n"+p2+" "); 
   int pos_r=sc.nextInt(); 
   int pos_c=sc.nextInt(); 
    
   int player=turn%2; 
   im=design(pos_r,pos_c,player); 
   if(im!=1) 
   turn++; 
    
   if(turn>=5) 
   { 
    result=findWinner(); 
    if(result.equals("X")) 
    { 
     System.out.println("\n\n"+p1+" Won\n\n"); 
     break; 
    } 
    else if(result.equals("O")) 
    { 
     System.out.println("\n\n"+p2+" Won\n\n"); 
     break;  
    } 
   } 
    
    
  } 
 
   
  if(result.equals("DRAW")) 
  System.out.println("\n\nMatch Draw\n\n"); 
 
   
 } 
 
 static int design(int row, int column,int player) 
 { 
  int im=0; 
  if(player%2==0) 
  { 
   if(X[row][column].equals("X") || X[row][column].equals("O")) 
   { 
    System.out.println("\n\nInvalid Move...\n\n"); 
    im++; 
   } 
   else 
   X[row][column]="X"; 
  } 
  else 
  { 
   if(X[row][column].equals("X") || X[row][column].equals("O")) 
   { 
    System.out.println("\n\nInvalid Move...\n\n"); 
    im++; 
   } 
   else 
   X[row][column]="O"; 
  } 
  System.out.println("-------------------"); 
  System.out.println("|     |     |     |"); 
  System.out.println("|  "+  X[0][0]+"  |  "+X[0][1]  +"  |  "+X[0][2]  +"  |"); 
  System.out.println("|     |     |     |"); 
  System.out.println("-------------------"); 
  System.out.println("|     |     |     |"); 
  System.out.println("|  "+  X[1][0]+"  |  "+X[1][1]  +"  |  "+X[1][2]  +"  |"); 
  System.out.println("|     |     |     |"); 
  System.out.println("-------------------"); 
  System.out.println("|     |     |     |"); 
  System.out.println("|  "+  X[2][0]+"  |  "+X[2][1]  +"  |  "+X[2][2]  +"  |"); 
  System.out.println("|     |     |     |"); 
  System.out.println("-------------------"); 
  return im; 
 } 
 static String findWinner() 
 { 
  for(int i=0;i<3;i++)//row wise check 
  { 
   int j=0; 
   if(X[i][j].equals(X[i][j+1]) && X[i][j+1].equals(X[i][j+2])) 
   { 
    return X[i][j]; 
   } 
  } 
  for(int i=0;i<3;i++)//column wise check 
  { 
   int j=0; 
   if(X[j][i].equals(X[j+1][i]) && X[j+1][i].equals(X[j+2][i])) 
   { 
    return X[j][i]; 
   } 
  } 
   
  if(X[0][0].equals(X[1][1]) && X[1][1].equals(X[2][2])) 
  { 
   return X[0][0]; 
  } 
  else if(X[0][2].equals(X[1][1]) && X[1][1].equals(X[2][0])) 
  { 
   return X[2][0]; 
  } 
  return "DRAW"; 
  
 } 
}   
 

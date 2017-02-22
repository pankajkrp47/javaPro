  
  
  class Demo234
 {
public static void main(String[] args) throws Exception {



String data="java is Prime 29996224275833";

for(String tmp :data.split(" ")){

if(tmp.matches("^[0-9]*$")){
if(checkPrime(tmp))
System.out.println(tmp +" is a prime number.");
else
System.out.println(tmp+" is not a prime number.");

break;
}
}
}

public static boolean checkPrime(String temp){

long data = Long.parseLong(temp);

   int i;

   if (data==2)
       return true;

   if (data%2==0)
       return false;

   for (i=3;i<=Math.sqrt(data);i+=2)
       if (data%i==0)
           return false;

  return true;
}
}
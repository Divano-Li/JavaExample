class huiwen{
 public static void main(String[] args){
     int k = args[0].length();
     String n = args[0];
     if(ishw(n,k))
        System.out.println("\""+n+"\""+"是回文");
  else 
  System.out.println("\""+n+"\""+"不是回文");
  }
static boolean ishw(String n,int x){
 int t=0;
 for(int i=0;i<x/2;i++){
  if(n.charAt(i)!=n.charAt(x-(i+1)))
  t++;
 }
  if(t==0)
  return true;
  else
  return false;
 } }
public String without2(String str) 
{
  if(str.length() < 2) return str;
  return str.substring(0,2).equals(str.substring(str.length() - 2, str.length())) ?
  str.substring(2,str.length()) : str;
}
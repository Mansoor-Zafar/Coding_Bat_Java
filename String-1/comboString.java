public String comboString(String a, String b) 
{
  return a.length() < b.length() ? a + b + a : b + a + b;  
}
